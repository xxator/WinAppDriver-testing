import io.appium.java_client.windows.WindowsDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Apppautomation {

    private static WindowsDriver AppSession = null;

    public static void main() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("name","Avesha");
            capabilities.setCapability("app","\"C:\\Program Files (x86)\\Internet Download Manager\\IDMan.exe\"");
            AppSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            AppSession.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            System.out.println(AppSession.getAutomationName());
            AppSession.close();
        }catch(Exception e){
            e.printStackTrace();
        } finally {
        }
    }
}
