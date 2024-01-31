import java.net.*;

public class advance_java_inetaddress {
    public static void main(String[] args){
        try {
            InetAddress ip = InetAddress.getByName("www.darshan.ac.in");
            System.out.println(ip.getHostName());
            System.out.println(ip.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}
