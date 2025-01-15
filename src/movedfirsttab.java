import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WindowType;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class movedfirsttab {

 

			public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
				WebDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();
		        // Navigate to Google
		        driver.get("https://staging4.koyal.pk:8444/login");
		        System.out.println("Title of first tab: " + driver.getTitle());
		        
		        ////////////////////////////////////////
		        
		        Thread.sleep(5000);
//		 		1)
				WebElement dropdown = driver.findElement(By.className("react-select__control"));
		       dropdown.click();
		          
//				2) 
		        WebElement option = driver.findElement(By.xpath("//div[text()='Zong']"));
		        option.click();
		          
//		 		3) 
				WebElement submitButton = driver.findElement(By.cssSelector(".chakra-button"));
		        submitButton.click();
		          
//		  		4)
		        Thread.sleep(2000);
		        driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
		        
//				5)
		       driver.findElement(By.className("chakra-button")).click();
		        Thread.sleep(31000);
		        driver.findElement(By.className("underline")).click();
//				6)
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
		         
//				7)
		        //Thread.sleep(2000);
		        //driver.findElement(By.className("iti__tel-input")).sendKeys("3702241950");
		        //driver.findElement(By.className("chakra-button")).click();
		        
//		      8)
		        //Thread.sleep(7000);
		        //driver.findElement(By.id("header-unsubscribe")).click();
		        
//		      9)
		        //Thread.sleep(5000);
		        //driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div[2]/div[1]/button")).click();
		        //Thread.sleep(5000);
		        //driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div[2]/div/button")).click();

//		 		10)
		       //ye subscribe k button par click ka code ha
		        //Thread.sleep(3000);
		        //driver.findElement(By.id("header-subscribe")).click();
		        
//		      11)
//		      //payment plane par click krney ka code ye ha. Daily Payment par click krne k code
		        //Thread.sleep(8000); 
		        //driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/section/div/div/div/div/div/form/div/div/div[1]/p[2]")).click();
		        
//		       21)
//		      //subscribe button par click krney k code
		        //Thread.sleep(12000);
		        //driver.findElement(By.className("css-zegld0")).click();
		      
		        
		        
		        
		        ////////////////////////////////////////
		        
		        
		        

		        // Store the handle of the first tab
		         String originalTab = driver.getWindowHandle();
		        
		         Thread.sleep(3000);
 
		      	 JavascriptExecutor js = (JavascriptExecutor) driver;
		     //
		      	// Open the AUDIO section in a new tab
		      	js.executeScript("window.open('https://staging4.koyal.pk:8444/audio', '_blank');");
		      	Thread.sleep(3000);
		      	// Get window handles and switch to the new AUDIO tab
		        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		        driver.switchTo().window(tabs.get(1));
		         
		        
		       // Open the VIDEO section in a new tab
		       js.executeScript("window.open('https://staging4.koyal.pk:8444/video', '_blank');");
		//
		      // Get window handles and switch to the new VIDEO tab
		       tabs = new ArrayList<String>(driver.getWindowHandles());
		       driver.switchTo().window(tabs.get(2));
		       
 
		       
		        Thread.sleep(3000);
		        js.executeScript("window.open('https://staging4.koyal.pk:8444/movie', '_blank');");
		        tabs = new ArrayList<String>(driver.getWindowHandles());
			    driver.switchTo().window(tabs.get(3));
			       
		        Thread.sleep(3000);
		        js.executeScript("window.open('https://staging4.koyal.pk:8444/shorts/119', '_blank');");
		        tabs = new ArrayList<String>(driver.getWindowHandles());
		        driver.switchTo().window(tabs.get(4));
		        
		       //********************************************//
		       

		         
		       	  Thread.sleep(9000);
		         // Switch back to the original tab
		         driver.switchTo().window(originalTab);
		         System.out.println("Switched back to first tab: " + driver.getTitle());
		         
		         //Click on cancel button on login modal
		         driver.findElement(By.className("chakra-modal__close-btn")).click();
		         //[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[/////
		         
//		        Thread.sleep(35000);
//				driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
//				Thread.sleep(5000);
//				driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[1]/p")).click();

				//click on My Library
				 //Thread.sleep(5000);
				//driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
				//Thread.sleep(5000);
				//driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[2]/p")).click();
				
				//click on My Language
				//Thread.sleep(20000);
				//driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
				//Thread.sleep(20000);
				//driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[2]/p")).click();
				 
				
				//click on My Artist
				//Thread.sleep(25000);
				//driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
 				//Thread.sleep(5000);
 				//driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[3]/p")).click();
 

				//click on search
				Thread.sleep(15000);
				driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
				Thread.sleep(15000);
				driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[5]/p")).click(); 
				
				
				//click on song option in searching functionality
				//Thread.sleep(8000);
				//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/div/p[2]")).click();
				
				//click on Artist option in searching functionality
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/div/p[3]")).click();
				
				//click on Video option in searching functionality
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/div/p[4]")).click();
				
				//click on Album option in searching functionality
				Thread.sleep(8000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/div/p[5]")).click();
				
				//click on Movie option in searching functionality
				Thread.sleep(6000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/div/p[6]")).click();
				
				//click on song option in searching functionality
				Thread.sleep(6000);
				driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/div/p[2]")).click();
				
				//over on song bar
				Thread.sleep(10000);
				driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.overflow-x-clip.pt-20.px-16.mob\\:px-2.tab\\:ms-2.lap\\:ms-2.desk\\:ms-2.tab\\:px-2 > div > div > div.px-4.pb-4.mob\\:px-0.tab\\:px-0.css-0 > div > div > div.w-\\[100\\%\\].lap\\:w-\\[100\\%\\].tab\\:w-\\[100\\%\\].mob\\:w-\\[100\\%\\].mb-12.mob\\:mb-0.tab\\:mb-0.css-0 > div.h-auto.topSongsScroll.css-0 > div:nth-child(1) > div > div")).click();
				 
				//click on songs play button
				Thread.sleep(20000);
				//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[7]/div[4]/div[2]/svg/path")).click();
//				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[3]/div/div/div[2]/div/div/div[2]/div[2]/div[1]/div/div/div[2]/div/div[1]/button")).click();
				driver.findElements(By.cssSelector(".topSongsScroll > div:first-child button[aria-label='Done']"));
				
				//click on down arrow
				//Thread.sleep(15000);
				//driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[7]/div[1]/div[2]/svg[2]/path")).click();
				 
		        //[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[[/////
 
		         //login button par click krnay 
		         //Thread.sleep(3000);
		         //driver.findElement(By.className("chakra-menu__menu-button")).click();
		         
		         //logout button click
		         //Thread.sleep(4000);
		        //driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/div[3]/div/div/button")).click();
		         
		         //click on logout button
		         //Thread.sleep(4000);
		         //driver.findElement(By.className("css-1wxschu")).click();
		         
		         //Thread.sleep(3000);
		         //driver.findElement(By.className("css-1wxschu")).click();
		        // Close the driver
		        //driver.quit();
	}

}
