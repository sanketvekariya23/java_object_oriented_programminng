import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class client{
    public static void main(String[] args) {
        try{
            Socket s = new Socket("localhost",888);
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String receivedmessage = br.readLine(); 
            System.out.println(receivedmessage);
            s.close();
            br.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}