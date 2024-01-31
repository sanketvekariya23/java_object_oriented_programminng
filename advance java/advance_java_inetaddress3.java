import java.net.InetAddress;
import java.net.UnknownHostException;

public class advance_java_inetaddress3 {
    public static void main(String[] args) {
        try {
          InetAddress addressList[] = InetAddress.getAllByName("wixnets.com");  
          for(int i=0; i<addressList.length; i++){
            System.out.println(addressList[i]);
          }
        } catch (UnknownHostException e) {
            System.out.println(e);
        }
    }
}
