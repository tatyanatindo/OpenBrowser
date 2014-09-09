import com.sun.deploy.net.protocol.chrome.ChromeURLConnection;
import sun.plugin.services.BrowserService;
import java.net.*;
import java.awt.*;

/**
 * Created by pc3 on 04.09.2014.
 */


public class OpenBrowser {

    public static void main(String[] args) throws Exception
    {
        Desktop.getDesktop().browse(new URI ("http://google.com"));

    }
}

