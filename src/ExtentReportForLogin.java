import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.Status;
//import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportForLogin {

	private static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		 
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		// create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
     // Add System Information (like Author)
        extent.setSystemInfo("Tester Name", "Muhammad Ismail");
        extent.setSystemInfo("Environment:", "Live");
        extent.setSystemInfo("Browser:", "Chrome");
        extent.setSystemInfo("Operating System:", "Windows 10");
        
        
		
     // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Koyal application login page");
        ExtentTest test2 = extent.createTest("Click On Login Button");
        ExtentTest test3 = extent.createTest("Select an operator");
        ExtentTest test4 = extent.createTest("Click on Continue Button");
        ExtentTest test5 = extent.createTest("Type Contact Number in Input field");
        ExtentTest test6 = extent.createTest("Click on Continue Button");
        ExtentTest test7 = extent.createTest("To Control OTP Response Time");
        ExtentTest test8 = extent.createTest("Type OTP in input field");
        ExtentTest test9 = extent.createTest("Type Contact Number in Input field");
        ExtentTest test10 = extent.createTest("Type Character In Input field");
        ExtentTest test11 = extent.createTest("Click on Continue Button");
        ExtentTest test12 = extent.createTest("Click On Left Side Hamburger Button");
        ExtentTest test13 = extent.createTest("Click On Home Button");
        ExtentTest test14 = extent.createTest("Click On My Library"); 
        ExtentTest test15 = extent.createTest("Click On My Languages");
        ExtentTest test16 = extent.createTest("Click On My Artist");
        ExtentTest test17 = extent.createTest("Click On My Search");
        ExtentTest test18 = extent.createTest("Click On Audio And Open Tab In New Browser");
        ExtentTest test19 = extent.createTest("Click On Video And Open Tab In New Browser");
        ExtentTest test20 = extent.createTest("Click On Movie And Open Tab In New Browser");
        ExtentTest test21 = extent.createTest("Click On Shorts And Open Tab In New Browser");
        ExtentTest test22 = extent.createTest("Switched Back To First Tab");
        
        String projectPath = System.getProperty("user.dir");
        //System.setProperty("webdriver.chrome.driver", projectPath+"/driver");
        System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        
        
//        test1.log(Status.INFO, "Koyal application login page");
//        test2.log(Status.INFO, "Click On Login Button");
//        test3.log(Status.INFO, "Select an operator");
        
        
        //test2.log(Status.INFO, "Pass");
        //test3.log(Status.INFO, "Fail");
        
        driver.get("https://koyal.pk/login"); 
        test1.pass("Navigated To Koyal Login Page");
        
        Thread.sleep(3000);
        
        								//CLICK ON LOGIN BUTTON 
		WebElement dropdown = driver.findElement(By.className("react-select__control"));
        dropdown.click();
        test2.pass("Click On Login Button");
        
        						//SELECT A OPERATOR FROM DROP DOWN CODE
        WebElement option = driver.findElement(By.xpath("//div[text()='Telenor']"));
        option.click();
        test3.pass("Select an operator");
        
        							//CLICK ON CONTINUE BUTTON
        WebElement submitButton = driver.findElement(By.cssSelector(".chakra-button"));
        submitButton.click();
        test4.pass("Click on Continue Button");
        
        Thread.sleep(2000);
        driver.findElement(By.className("iti__tel-input")).sendKeys("3422140766");
        test5.pass("Type Contact Number in Input field");
        
        
        driver.findElement(By.className("chakra-button")).click();
        test6.pass("Click on Continue Button");
        
        Thread.sleep(31000);
        driver.findElement(By.className("underline")).click();
        test7.pass("To Control OTP Response Time");
        
        Thread.sleep(3000);
		WebElement pinInput1 = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
		WebElement pinInput2 = driver.findElement(By.xpath("(//input[@type='tel'])[2]"));
		WebElement pinInput3 = driver.findElement(By.xpath("(//input[@type='tel'])[3]"));
		WebElement pinInput4 = driver.findElement(By.xpath("(//input[@type='tel'])[4]"));
		
        						// Send keys to each input field
        pinInput1.sendKeys("0");
        pinInput2.sendKeys("0");
        pinInput3.sendKeys("0");
        pinInput4.sendKeys("0");
        
        test8.pass("Type OTP in input field");
        
        Thread.sleep(2000);
        driver.findElement(By.className("iti__tel-input")).sendKeys("3422140766");
        test9.pass("Type Contact Number in Input field");
 
        Thread.sleep(2000);
        driver.findElement(By.className("iti__tel-input")).sendKeys("abc");
        test10.fail("Type Character In Input field");
        
         driver.findElement(By.className("chakra-button")).click();
         test11.pass("Click on Continue Button");
        
         //driver.findElement(By.className("chakra-button")).click();
         //CLICK ON HAMBURG BUTTON ON LEFT SIDE
         
 		Thread.sleep(35000);
 		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
        test12.pass("Click On Left Side Hamburger Button");
         
        //////////////////////////////////////////CLICK ON HOME BUTTON OF LEFT SIDE BAR///////////////////////////////
        Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[1]/p")).click();
		test13.pass("Click On Home Button");
		
		//System.out.println("Checking library");
		//Thread.sleep(10000);
		//driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		
		//Thread.sleep(35000);
  		//driver.findElement(By.cssSelector("a[href='/library']")).click();
		//driver.findElement(By.xpath("//a[contains(@href, '/library')]")).click();
		
										//CLICK ON MY LIBRARY
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[2]/p")).click();
		test14.pass("Click On My Library");
		
										//CLICK ON MY LEFT SIDEBAR LANGUAGE
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[3]/p")).click();
		test15.pass("Click On My Languages");
		
		
										//CLICK ON MY LEFT SIDEBAR Artist OPTION
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[4]/p")).click();
		test16.pass("Click On My Artist");
		 
		
										//CLICK ON SEARCH BUTTON
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[6]/p")).click(); 
		test17.pass("Click On My Search");
		
		
		//////////////////////////////////////OPEN AUDIO, VIDEO, MOVIE, SEARCH IN NEW TAB///////////////////////////////////////////
		// Store the handle of the first tab
		Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open('https://koyal.pk/audio', '_blank');");
        //test.pass("Opened AUDIO section in a new tab");

        Thread.sleep(3000);

        // Get window handles and switch to the new AUDIO tab
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        //test.pass("Switched to AUDIO tab: " + tabs.get(1));
        test18.pass("Click on Audio");
        
        js.executeScript("window.open('https://koyal.pk/video', '_blank');");
        test19.pass("Click on video");
        
        Thread.sleep(3000);
        js.executeScript("window.open('https://koyal.pk/movie', '_blank');");
        test20.pass("Click on movie");
        
        Thread.sleep(4000);
        js.executeScript("window.open('https://koyal.pk/shorts/119', '_blank');");
        test21.pass("Click on shorts");
        
     // Store the handle of the first tab
        String originalTab = driver.getWindowHandle();
        
        Thread.sleep(9000);
        // Switch back to the original tab
     
        driver.switchTo().window(originalTab);
        System.out.println("Switched back to first tab: " + driver.getTitle());
        test22.pass("Switched back to first tab");
        
        
        Thread.sleep(3000);
        js.executeScript("window.open('https://koyal.pk/', '_blank');");
        
        ///////////////////////////////////////////////////////////////////////////////////////////
        
        ///////////////////////////////////////CLICK ON PREFERENCES WORK HERE /////////////////////////////////
        
        
//        Thread.sleep(15000);
//        System.out.println("Click here");
//   		driver.findElement(By.cssSelector("a[href='/preferences/language']")).click();
//   		
//   		 
//   		//CLICK ON URDU 
//   		Thread.sleep(6000);
//   		driver.findElement(By.id("language-0")).click();
//   		
//   		//CLICK ON CONTINUE
//   		Thread.sleep(6000);
//   		driver.findElement(By.id("language-continue")).click();
//   		
//   		//PICK YOUR GENER
//   		Thread.sleep(6000);
//   		driver.findElement(By.id("genre-0")).click();
//   		
//   		//CLICK ON CONTINUE BUTTON
//   		Thread.sleep(6000);
//   		driver.findElement(By.id("genre-continue")).click();
//   		
//   		
//   		//CLICK ON ARTIST
//   		Thread.sleep(5000);
//   		driver.findElement(By.id("artist-0")).click();
//   		
//   		//CLICK ON CONTINUE
//   		Thread.sleep(5000);
//   		driver.findElement(By.id("artist-continue")).click();
// 
 
       
	         
       
        extent.flush();
	}

}