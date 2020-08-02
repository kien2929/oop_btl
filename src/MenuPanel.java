
import java.awt.event.ItemEvent;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class MenuPanel extends javax.swing.JPanel {

    public static Integer level = 1;
    public static Integer eval = 1;
    public static ArrayList<Integer> id;
    String hashtag;
    Integer time = 0;
    boolean AI = false;
    String queryAI, hashtagQuery;

    Statement st;
    ResultSet rs;

    private void createData(String query) {
        id = new ArrayList<>();

        Connection con = DBUtil.getConnection();
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);

            while (rs.next()) {
                Integer i = rs.getInt(1);
                id.add(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MenuPanel() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hashtagText = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        checkAI = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Chọn mức độ kiểm tra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Độ khó");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Hình thức chấm bài");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jButton1.setText("Thêm từ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tìm kiếm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Theo hashtag");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Theo thời gian");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Trong ngày", "Trong tháng", "Trong năm" }));
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Sử dụng AI");

        checkAI.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkAIItemStateChanged(evt);
            }
        });

        jButton3.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledShadow"));
        jButton3.setText("Bắt đầu");
        jButton3.setToolTipText("");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(146, 146, 146)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox1, 0, 84, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, 84, Short.MAX_VALUE)
                            .addComponent(hashtagText, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(checkAI, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(139, 139, 139)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {hashtagText, jComboBox1, jComboBox2, jComboBox3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hashtagText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(checkAI, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {hashtagText, jComboBox1, jComboBox2});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2, jLabel3, jLabel4, jLabel5});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFrame parent = Utitilities.findJFrameOf(this);
        if (parent != null) {
            parent.getContentPane().removeAll();
            parent.setContentPane(new AddWordpanel());
            parent.pack();
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrame parent = Utitilities.findJFrameOf(this);
        if (parent != null) {
            parent.getContentPane().removeAll();
            parent.setContentPane(new SearchPanel());
            parent.pack();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        Object item = evt.getItem();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            level = parseInt(item.toString());
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        Object item = evt.getItem();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            eval = parseInt(item.toString());
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        Object item = evt.getItem();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            switch (item.toString()) {
                case "Mặc định":
                    this.time = 0;
                    break;
                case "Trong ngày":
                    this.time = 1;
                    break;
                case "Trong tháng":
                    this.time = 2;
                    break;
                case "Trong năm":
                    this.time = 3;
                    break;
            }
        }
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        LocalDate now = LocalDate.now();
        Connection con = DBUtil.getConnection();
        //Xác định có sắp xếp theo AI không
        if (AI == true) {
            queryAI = " ORDER BY pass";
        } else {
            queryAI = "";
        }
        //Xác định có tìm theo hashtag không
        this.hashtag = hashtagText.getText();
        if (hashtag.equals("")) {
            hashtagQuery = "";
        } else {
            if (time == 0) {
                hashtagQuery = " WHERE hasgtag like '%" + hashtag + ",%'";
            } else {
                System.out.println(hashtag);
                hashtagQuery = " AND hasgtag like '%" + hashtag + ",%'";
            }
        }
        if (hashtag.equals("") == false) {

            ArrayList<Integer> wordList = new ArrayList<>();
            try {
                Integer i;
                st = con.createStatement();
                rs = st.executeQuery("SELECT * FROM " + DBUtil.TABLE_NAME + " WHERE hasgtag LIKE '%" + hashtag + ",%'");
                while (rs.next()) {
                    i = rs.getInt("id");
                    wordList.add(i);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            Integer length = wordList.size();
            if (length == 0) {
                //Không tồn tại hashtag
                JOptionPane.showMessageDialog(null, "Không tồn tại hashtag");
                hashtagText.setText("");
            } else {
                //Tồn tại hashtag
                switch (time) {
                    //trong ngày
                    case 1: {
                        createData("SELECT id FROM " + DBUtil.TABLE_NAME + " WHERE time like '" + now + "%'" + hashtagQuery + queryAI);
                        break;
                    }
                    //trong tháng
                    case 2: {
                        createData("SELECT id FROM " + DBUtil.TABLE_NAME + " WHERE  MONTH(time) = " + now.getMonthValue() + " AND YEAR(time) = YEAR(NOW())" + hashtagQuery + queryAI);
                        break;
                    }
                    //trong năm
                    case 3: {
                        createData("SELECT id FROM " + DBUtil.TABLE_NAME + " WHERE YEAR(time) = YEAR(NOW())" + hashtagQuery + queryAI);
                        break;
                    }
                    //mặc định
                    default: {
                        createData("SELECT id FROM " + DBUtil.TABLE_NAME + hashtagQuery + queryAI);
                        break;
                    }
                }
                if (id.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Danh sách từ học trống");
                } else {
//                    System.out.println("hoho");
                    JFrame parent = Utitilities.findJFrameOf(this);
                    if (parent != null) {
                        parent.getContentPane().removeAll();
                        parent.setContentPane(new AnswerPanel());
                        parent.pack();
                    }
                }
            }
        } else {
            // không có hashtag đc nhập
            switch (time) {
                //trong ngày
                case 1: {
                    createData("SELECT id FROM " + DBUtil.TABLE_NAME + " WHERE time like '" + now + "%'" + queryAI);
                    break;
                }
                //trong tháng
                case 2: {
                    createData("SELECT id FROM " + DBUtil.TABLE_NAME + " WHERE  MONTH(time) = " + now.getMonthValue() + " AND YEAR(time) = YEAR(NOW())" + queryAI);
                    break;
                }
                //trong năm
                case 3: {
                    createData("SELECT id FROM " + DBUtil.TABLE_NAME + " WHERE YEAR(time) = YEAR(NOW())" + queryAI);
                    break;
                }
                //mặc định
                default: {
//                    System.out.println("1");
                    createData("SELECT id FROM " + DBUtil.TABLE_NAME + queryAI);
                    break;
                }

            }
            if (id.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Danh sách từ học trống");
            } else {
                JFrame parent = Utitilities.findJFrameOf(this);
                if (parent != null) {
                    parent.getContentPane().removeAll();
                    parent.setContentPane(new AnswerPanel());
                    parent.pack();
                }
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void checkAIItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkAIItemStateChanged
        AI = checkAI.isSelected();
    }//GEN-LAST:event_checkAIItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkAI;
    private javax.swing.JTextField hashtagText;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
