import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URL_connection {
    public static void main(String[] args) {
        try {
            URL u1 = new URL("https://www.w3schools.com/html/default.asp");
            URLConnection u2 = u1.openConnection();
            InputStream in = u2.getInputStream();
            int i;
            while ((i = in.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (MalformedURLException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
