import io.appium.java_client.windows.WindowsDriver;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Itag {

    private static WindowsDriver AppSession = null;

    @Test
    public void setup() {
        try {


            /*
            // LeftClick on MenuItem "Tasks" at (26,16)
            Console.WriteLine("LeftClick on MenuItem \"Tasks\" at (26,16)");
            string xpath_LeftClickMenuItemTasks_26_16 = "/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@ClassName=\"#32770\"][@Name=\"Internet Download Manager 6.35\"]/MenuBar[@Name=\"Application\"][@AutomationId=\"MenuBar\"]/MenuItem[@Name=\"Tasks\"]";
            var winElem_LeftClickMenuItemTasks_26_16 = desktopSession.FindElementByAbsoluteXPath(xpath_LeftClickMenuItemTasks_26_16);
            if (winElem_LeftClickMenuItemTasks_26_16 != null)
            {
                winElem_LeftClickMenuItemTasks_26_16.Click();
            }
            else
            {
                Console.WriteLine($"Failed to find element using xpath: {xpath_LeftClickMenuItemTasks_26_16}");
                return;
            }


             */


            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("name","Avesha");
            capabilities.setCapability("app","\"C:\\Program Files (x86)\\Internet Download Manager\\IDMan.exe\"");
            AppSession = new WindowsDriver(new URL("http://127.0.0.1:4723"), capabilities);
            AppSession.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            String xpath_tasks = "/Pane[@ClassName=\"#32769\"][@Name=\"Desktop 1\"]/Window[@ClassName=\"#32770\"][@Name=\"Internet Download Manager 6.35\"]/MenuBar[@Name=\"Application\"][@AutomationId=\"MenuBar\"]/MenuItem[@Name=\"Tasks\"]";
            String Test = AppSession.findElementByXPath(xpath_tasks).getText();
            System.out.println("-----------------------------" + Test);
            AppSession.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
            AppSession.close();
        }catch(Exception e){
            e.printStackTrace();
        } finally {
        }
    }
}