
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import javax.swing.JOptionPane;

public class DBUtil {

    public static String DB_USERNAME;
    public static String DB_PASSWORD;
    public static String DB_URL;
    public static String TABLE_NAME;

    private static Connection connection = null;

    static {
        try (InputStream input = new FileInputStream("config.properties")) {
            Properties prop = new Properties();
            prop.load(input);

            DB_USERNAME = prop.getProperty("DB_USERNAME");
            DB_PASSWORD = prop.getProperty("DB_PASSWORD");
            DB_URL = prop.getProperty("DB_URL");
            TABLE_NAME = prop.getProperty("TABLE_NAME");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static Connection getConnection() {
        return connection;
    }
//Hàm thêm từ

    public static boolean addWord(String word, String mean, String spell, String suggest, String hasgtag, String type, String image, String sound) {

        try {
            PreparedStatement ps = getConnection().prepareCall("insert into " + DBUtil.TABLE_NAME + " (word,mean,spell,suggest,hasgtag,type,image,sound,pass,time) values(?,?,?,?,?,?,?,?,?,CURDATE())");
            InputStream im = new FileInputStream(new File(image));
            ps.setString(1, word);
            ps.setString(2, mean);
            ps.setString(3, spell);
            ps.setString(4, suggest);
            ps.setString(5, hasgtag + ",");
            ps.setString(6, type);
            ps.setBlob(7, im);
            if (sound.equals("")) {
                ps.setString(8, null);
            } else {
                ps.setString(8, sound);
            }
            ps.setInt(9, 0);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Successed");
            return true;
        } catch (Exception e) {
            System.out.println(e.toString());
            JOptionPane.showMessageDialog(null, "Failsed");
            return false;
        }
    }
//Hàm xóa từ

    public static void deleteWord() {
        try {
            String query = "delete from " + DBUtil.TABLE_NAME + " where id = " + SearchPanel.currentId;
            PreparedStatement preparedStmt = getConnection().prepareStatement(query);
            preparedStmt.execute();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
//Hàm sửa từ

    public static void editWord(String word, String mean, String spell, String suggest, String hasgtag, String type, String image, String sound) {
        if (image.equals("") == false && sound.equals("") == false) {
            try {
                Connection conn = DBUtil.getConnection();
                String query = "UPDATE " + DBUtil.TABLE_NAME + " SET word= ?, mean= ?, spell= ?,suggest= ?,hasgtag= ?,type= ?,image= ?,sound= ?  WHERE id = " + SearchPanel.currentId;
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, word);
                ps.setString(2, mean);
                ps.setString(3, spell);
                ps.setString(4, suggest);
                ps.setString(5, hasgtag + ",");
                ps.setString(6, type);
                InputStream im = new FileInputStream(new File(image));
                ps.setBlob(7, im);
//                        InputStream so = new FileInputStream(new File(soundPath));
                ps.setString(8, sound);
                ps.executeUpdate();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else if (image.equals("") && sound.equals("") == false) {
            try {
                Connection conn = DBUtil.getConnection();
                String query = "UPDATE " + DBUtil.TABLE_NAME + " SET word= ?, mean= ?, spell= ?,suggest= ?,hasgtag= ?,type= ?,sound= ?  WHERE id = " + SearchPanel.currentId;
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, word);
                ps.setString(2, mean);
                ps.setString(3, spell);
                ps.setString(4, suggest);
                ps.setString(5, hasgtag + ",");
                ps.setString(6, type);
//                        InputStream so = new FileInputStream(new File(soundPath));
                ps.setString(7, sound);
                ps.executeUpdate();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else if (image.equals("") == false && sound.equals("")) {
            try {
                Connection conn = DBUtil.getConnection();
                String query = "UPDATE " + DBUtil.TABLE_NAME + " SET word= ?, mean= ?, spell= ?,suggest= ?,hasgtag= ?,type= ?,image= ?  WHERE id = " + SearchPanel.currentId;
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, word);
                ps.setString(2, mean);
                ps.setString(3, spell);
                ps.setString(4, suggest);
                ps.setString(5, hasgtag + ",");
                ps.setString(6, type);
                InputStream im = new FileInputStream(new File(image));
                ps.setBlob(7, im);
                ps.executeUpdate();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else if (image.equals("") && sound.equals("")) {
            try {
                Connection conn = DBUtil.getConnection();
                String query = "UPDATE " + DBUtil.TABLE_NAME + " SET word= ?, mean= ?, spell= ?,suggest= ?,hasgtag= ?,type= ?  WHERE id = " + SearchPanel.currentId;
                PreparedStatement ps = conn.prepareStatement(query);
                ps.setString(1, word);
                ps.setString(2, mean);
                ps.setString(3, spell);
                ps.setString(4, suggest);
                ps.setString(5, hasgtag + ",");
                ps.setString(6, type);
                ps.executeUpdate();
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }

    public static void incWord(Integer id) {
        try {
            PreparedStatement ps = getConnection().prepareStatement("UPDATE " + DBUtil.TABLE_NAME + " SET pass = pass + 1  WHERE id = " + id);
            ps.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Word pass inc eror");
            e.printStackTrace();
        }
    }
}
