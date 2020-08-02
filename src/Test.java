
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author admin
 */
public class Test {

    private static final String USER_AGENT = "Mozilla/5.0";

    private static final String POST_URL = "http://localhost:3000/update";

    private static String[] ARRAY={"00","FF" ,"FF" ,"00" ,"42" ,"0A" ,"00", "01", "0F" ,"CC" ,"1D", "3F", "02", "27", "00" ,"BD" ,"01" ,"6D"};
            
    private static final String POST_PARAMS = "userName=Pankaj";

    public static void main(String[] args) throws IOException {
        sendPOST();
        System.out.println("POST DONE");
    }

    private static void sendPOST() throws IOException {
        URL obj = new URL(POST_URL);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        con.setRequestMethod("POST");
        con.setRequestProperty("User-Agent", USER_AGENT);

        // For POST only - START
        con.setDoOutput(true);
        String Params="Temperature="+ARRAY[10]+ARRAY[11]+"&Humidity="+ARRAY[12]+ARRAY[13]+"&Light="+ARRAY[14]+ARRAY[15];
        OutputStream os = con.getOutputStream();
        os.write(Params.getBytes());
        os.flush();
        os.close();
        // For POST only - END

        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) { 
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    con.getInputStream()));
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                response.append(inputLine);
            }
            in.close();
            System.out.println(response.toString());
        } else {
            System.out.println("POST request not worked");
        }
    }
}
