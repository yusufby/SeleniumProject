import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day02_FirefoxBrowserDemo {
    /*https://www.mozilla.org/en-US/firefox/new/
    https://github.com/mozilla/geckodriver/releases
    Create a new class under : DAY01_FirefoxBrowserDemo
    Create main method
    */
    public static void main(String[] args) {
        //Set Path
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        //Create gecko driver
        WebDriver driver = new FirefoxDriver();

        //  Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

        // Maximize the window
       driver.manage().window().maximize();


        //Close/Quit the browser
        driver.close();

       // driver.quit();


    }
}
