import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;

public class tabselect {
    public static void main(String[] args) throws InterruptedException {
        // Set the path for the ChromeDriver
        //System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Maximize the browser window
        driver.manage().window().maximize();

        // Open the website
        driver.get("https://koyal.pk/");

        // Cast the driver to JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Open the AUDIO section in a new tab
        js.executeScript("window.open('https://koyal.pk/audio', '_blank');");
        Thread.sleep(3000);
        // Get window handles and switch to the new AUDIO tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        // Perform any action on the AUDIO page (optional)
        //System.out.println("AUDIO tab opened: " + driver.getTitle());

        // Go back to the original tab
        //driver.switchTo().window(tabs.get(1));

        // Open the VIDEO section in a new tab
        js.executeScript("window.open('https://koyal.pk/video', '_blank');");
        //driver.switchTo().window(tabs.get(tabs.size() - 2));
        System.out.println("Switched back to second tab: " + driver.getTitle());
        
        // Get window handles and switch to the new VIDEO tab
        tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(2));

        // Perform any action on the VIDEO page (optional)
        //System.out.println("VIDEO tab opened: " + driver.getTitle());

        
//        js.executeScript("window.open('https://koyal.pk/movie', '_blank');");
//        
//        Thread.sleep(3000);
//        js.executeScript("window.open('https://koyal.pk/shorts', '_blank');");
        Thread.sleep(3000);
        js.executeScript("window.open('https://koyal.pk/movie', '_blank');");
        Thread.sleep(3000);
        js.executeScript("window.open('https://koyal.pk/shorts/119', '_blank');");
        
        // Close the driver (optional)
        // driver.quit();
    }
}