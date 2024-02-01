import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args){
        try{
            ServerSocket ss = new ServerSocket(888);
            Socket s = ss.accept();
            OutputStream os = s.getOutputStream();
            PrintStream ps = new PrintStream(os);
            ps.println("hello sanket this message from server...!");
            ss.close();
            s.close();
            ps.close();
        }catch(IOException e)
        {
            System.out.println(e);
        }
    }
}
