import java.net.MalformedURLException;
import java.net.URL;

public class URL_class {
    public static void main(String[] args) {
        try{
        // url class
        URL url= new URL("http://www.darshan.ac.in/DIET");
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getFile());
            System.out.println(url.getAuthority());
            System.out.println(url.getProtocol());
            // System.out.println();
        }catch(MalformedURLException e)
        {
            System.out.println(e);
        }
    }
}