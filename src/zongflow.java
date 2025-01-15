//import java.time.Duration;
//import java.util.ArrayList;

//import java.util.ArrayList;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class zongflow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.get("https://koyal.pk/login");
		driver.get("https://staging4.koyal.pk:8444/login");
 
        
		/////////////////////////////////////////////////////////
		Thread.sleep(3000);
//		//////////////////////////////////////////////////////////////////////////////
		WebElement dropdown = driver.findElement(By.className("react-select__control"));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//div[text()='Zong']"));
        option.click();
        
        WebElement submitButton = driver.findElement(By.cssSelector(".chakra-button"));
        submitButton.click();
        
        Thread.sleep(2000);
        driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
        driver.findElement(By.className("chakra-button")).click();
        Thread.sleep(31000);
        driver.findElement(By.className("underline")).click();
        
        
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
        
        Thread.sleep(2000);
        driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
        driver.findElement(By.className("chakra-button")).click();
        
        Thread.sleep(7000);
        driver.findElement(By.id("header-unsubscribe")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div[2]/div[1]/button")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div[2]/div/button")).click();
        
        //ye subscribe k button par click ka code ha
        Thread.sleep(3000);
        driver.findElement(By.id("header-subscribe")).click();
        
       
        
        //payment plane par click krney ka code ye ha. Daily Payment par click krne k code
         Thread.sleep(8000); 
         driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div/form/div/div/div[1]/p[2]")).click();
        
        //subscribe button par click krney k code
         Thread.sleep(12000);
         driver.findElement(By.className("css-zegld0")).click();
        

        
        //unsubscribe par click krney k leye ye code lika   
         //Thread.sleep(12000);
         //driver.findElement(By.id("header-unsubscribe")).click();
        
         //click on unsubscribe button
         //Thread.sleep(5000);
         //driver.findElement(By.id("modal-unsub")).click();
        
        //click on done button code
         //Thread.sleep(5000);
         //driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div[2]/div[1]/button")).click();
         
    
          
         
        //ye subscribe k button par click kra ha
         //Thread.sleep(4000);
        //driver.findElement(By.id("header-subscribe")).click();
         
        //Thread.sleep(5000);
        //driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div/form/div/div/div[1]")).click();
        
        
         //Thread.sleep(10000);
         //driver.findElement(By.className("chakra-button")).click();
         
       	//Thread.sleep(3000);
      	//driver.manage().window().setSize(new Dimension(1, 1));
      	 
      	//This is windows maximize code 
        //driver.manage().window().maximize();
        //driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r6e:\"]/div/div/div/div/form/button")).click();
         
		//This is library icon clicking code
 
        Thread.sleep(25000);
		driver.findElement(By.cssSelector("a[href='/library']")).click();
		//This is language icon clicking code
 		Thread.sleep(10000);
 		driver.findElement(By.cssSelector("a[href='/languages']")).click();
		
		//This is artist icon clicking code
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("a[href='/artists']")).click();
		
		//This is search icon clicking code
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("a[href='/search']")).click();

		//This code is for black background
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/label")).click();
       //This code is for bright background
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/label/span")).click();	
        
        driver.findElement(By.className("lap:text-[18px]")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("chakra-modal__close-btn")).click();
        //click on login button
        Thread.sleep(3000);
        driver.findElement(By.className("chakra-menu__menu-button")).click();
        
        //click on logout button
        Thread.sleep(4000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[3]/div/div/button")).click();
        
        //click on logout button
        Thread.sleep(4000);
        driver.findElement(By.className("css-1wxschu")).click();
         //////////////////////////////////////////////////////
        
		 
        
        
///////////////////////////////////////////////////////////////////////////////////////////////////
//			Ye code ha jo new tabs ma open kr rha ha      
//        Thread.sleep(10000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//
//        // Open the AUDIO section in a new tab
//        js.executeScript("window.open('https://koyal.pk/audio', '_blank');");
//         Thread.sleep(3000);
//        // Get window handles and switch to the new AUDIO tab
//         ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//         driver.switchTo().window(tabs.get(1));
//
//        // Perform any action on the AUDIO page (optional)
//         System.out.println("AUDIO tab opened: " + driver.getTitle());
//
//        // Go back to the original tab
//         driver.switchTo().window(tabs.get(1));
//
//        // Open the VIDEO section in a new tab
//         js.executeScript("window.open('https://koyal.pk/video', '_blank');");
//
//        // Get window handles and switch to the new VIDEO tab
//         tabs = new ArrayList<String>(driver.getWindowHandles());
//         driver.switchTo().window(tabs.get(2));
//
//
//         Thread.sleep(3000);
//         js.executeScript("window.open('https://koyal.pk/movie', '_blank');");
//         Thread.sleep(8000);
//         js.executeScript("window.open('https://koyal.pk/shorts', '_blank');");
        
//         Thread.sleep(3000);
//         driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/a[1]/abbr/svg")).click();
 
 
	}

}