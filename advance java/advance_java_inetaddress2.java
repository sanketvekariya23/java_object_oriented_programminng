import java.net.InetAddress;
import java.net.UnknownHostException;

public class advance_java_inetaddress2 {

    public static void main(String[] args) {
        try {
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println(localHost);
        } 
        catch(UnknownHostException e) {
            System.out.println(e);
        }
    }
}
