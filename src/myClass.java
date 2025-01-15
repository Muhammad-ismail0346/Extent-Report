import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//import java.util.ArrayList;

public class myClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
        
        // Navigate to Google
        driver.get("https://staging4.koyal.pk:8444/login");
        System.out.println("Title of first tab: " + driver.getTitle());
        
        ////////////////////////////////////////
        
        Thread.sleep(5000);
// 		1)
		WebElement dropdown = driver.findElement(By.className("react-select__control"));
        dropdown.click();
          
//		2) 
        WebElement option = driver.findElement(By.xpath("//div[text()='Zong']"));
        option.click();
          
// 		3) 
		WebElement submitButton = driver.findElement(By.cssSelector(".chakra-button"));
        submitButton.click();
          
//  	4)
        Thread.sleep(2000);
        driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
        
//		5)
        driver.findElement(By.className("chakra-button")).click();
        Thread.sleep(31000);
        driver.findElement(By.className("underline")).click();
//		6)
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
         
//		7)
         Thread.sleep(2000);
        driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
        driver.findElement(By.className("chakra-button")).click();
        
//      8)
        Thread.sleep(7000);
        driver.findElement(By.id("header-unsubscribe")).click();
        
//      9)
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div[2]/div[1]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div[2]/div/button")).click();

// 		10)
       //ye subscribe k button par click ka code ha
        Thread.sleep(3000);
        driver.findElement(By.id("header-subscribe")).click();
        
//      11)
//      //payment plane par click krney ka code ye ha. Daily Payment par click krne k code
        Thread.sleep(8000); 
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div/form/div/div/div[1]/p[2]")).click();
        
//       21)
//      //subscribe button par click krney k code
        Thread.sleep(12000);
        driver.findElement(By.className("css-zegld0")).click();
      
        
        
        
        ////////////////////////////////////////
        
        
        

        // Store the handle of the first tab
         String originalTab = driver.getWindowHandle();
        
         Thread.sleep(3000);
        // Open a new tab and switch to it
         driver.switchTo().newWindow(WindowType.TAB);
        
        
        // Navigate to Bing in the new tab
         driver.get("https://staging4.koyal.pk:8444/login");
         //System.out.println("Title of second tab: " + driver.getTitle());
 
         //********************************************//
         Thread.sleep(10000);
      	JavascriptExecutor js = (JavascriptExecutor) driver;
     //
      	// Open the AUDIO section in a new tab
      	js.executeScript("window.open('https://staging4.koyal.pk:8444/audio', '_blank');");
         
      	Thread.sleep(3000);
      	// Get window handles and switch to the new AUDIO tab
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        
       // Open the VIDEO section in a new tab
       js.executeScript("window.open('https://koyal.pk/video', '_blank');");
//
      // Get window handles and switch to the new VIDEO tab
       tabs = new ArrayList<String>(driver.getWindowHandles());
       driver.switchTo().window(tabs.get(2));
        
       //Movie code
       Thread.sleep(3000);
       js.executeScript("window.open('https://koyal.pk/movie', '_blank');");
 
       Thread.sleep(8000);
       js.executeScript("window.open('https://koyal.pk/shorts', '_blank');");
       
       //********************************************//
       
       	  Thread.sleep(9000);
         // Switch back to the original tab
         driver.switchTo().window(originalTab);
         System.out.println("Switched back to first tab: " + driver.getTitle());

        // Close the driver
        //driver.quit();
		
		
////////////////////////////////////////////////////////////////////////////////////////////
//	WebDriver driver = new FirefoxDriver();
//	driver.get("https://staging4.koyal.pk:8444/login");
//	driver.manage().window().maximize();
//	//driver.get("https://koyal.pk/login");
//	driver.get("https://staging4.koyal.pk:8444/login");
//
//    
//	/////////////////////////////////////////////////////////
//	Thread.sleep(3000);
////	//////////////////////////////////////////////////////////////////////////////
//	  1) WebElement dropdown = driver.findElement(By.className("react-select__control"));
//    dropdown.click();
        
//    2) WebElement option = driver.findElement(By.xpath("//div[text()='Zong']"));
//    option.click();
        
//    3) WebElement submitButton = driver.findElement(By.cssSelector(".chakra-button"));
//    submitButton.click();
        
//	  4)
//    Thread.sleep(2000);
//    driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
        
//    5)
//    driver.findElement(By.className("chakra-button")).click();
//    Thread.sleep(31000);
//    driver.findElement(By.className("underline")).click();
//    
//    6)
//    Thread.sleep(3000);
//	WebElement pinInput1 = driver.findElement(By.xpath("(//input[@type='tel'])[1]"));
//	WebElement pinInput2 = driver.findElement(By.xpath("(//input[@type='tel'])[2]"));
//	WebElement pinInput3 = driver.findElement(By.xpath("(//input[@type='tel'])[3]"));
//	WebElement pinInput4 = driver.findElement(By.xpath("(//input[@type='tel'])[4]"));
//    // Send keys to each input field
//    pinInput1.sendKeys("0");
//    pinInput2.sendKeys("0");
//    pinInput3.sendKeys("0");
//    pinInput4.sendKeys("0");
//	
// 	   7)
//    Thread.sleep(2000);
//    driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
//    driver.findElement(By.className("chakra-button")).click();
//    
//	   8)
//    Thread.sleep(7000);
//    driver.findElement(By.id("header-unsubscribe")).click();
//	
//    9)
//    Thread.sleep(5000);
//    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div[2]/div[1]/button")).click();
//    Thread.sleep(5000);
//    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div[2]/div/button")).click();
//    
//    10)
//    //ye subscribe k button par click ka code ha
//    Thread.sleep(3000);
//    driver.findElement(By.id("header-subscribe")).click();
//    11)
//    //payment plane par click krney ka code ye ha. Daily Payment par click krne k code
//    Thread.sleep(8000); 
//    driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div/form/div/div/div[1]/p[2]")).click();
//    
//    21)
//    //subscribe button par click krney k code
//    Thread.sleep(12000);
//    driver.findElement(By.className("css-zegld0")).click();
//    
// 
//	
//	System.out.println(driver.getTitle());
//	
//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
//	
//	driver.get("https://staging4.koyal.pk:8444/");
//	
//	System.out.println(driver.getTitle());
//	
//	Thread.sleep(10000);
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//
//	// Open the AUDIO section in a new tab
//	js.executeScript("window.open('https://koyal.pk/audio', '_blank');");
//	
//	Thread.sleep(30000);
//	driver.get("https://staging4.koyal.pk:8444/");
//	
//	System.out.println(driver.getTitle());
//	
//	//this domain is used to get back to the previous tab
//	driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "\t");
// 
	
		    }
		

	} 
