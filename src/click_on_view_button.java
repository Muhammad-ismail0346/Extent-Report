import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class click_on_view_button {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//CLICK ON VIEW BUTTON AND THEN AUDIO DROPDOWN AUTOMATED
		
		//Click on view button
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging4.koyal.pk:8444/");
		
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[5]/p")).click();
		
		//typing in input field
		Thread.sleep(10000); 
        WebElement searchInput = driver.findElement(By.cssSelector("input.chakra-input.bg-transparent"));
        // Type in the search field
        searchInput.sendKeys("Qaidi No 804");
		
        //click on three dot button
        Thread.sleep(5000);
        driver.findElement(By.className("lap:text-[15px]")).click();
		
         //click on share button
         //Thread.sleep(5000);
         //driver.findElement(By.className("chakra-menu__menuitem")).click();
        
        //Add to Queue
        Thread.sleep(5000);
        driver.findElement(By.id("menu-list-:raf:-menuitem-:rai:")).click();
		
 
        
        
        //click on three dot button
        Thread.sleep(5000);
        driver.findElement(By.className("lap:text-[15px]")).click();
        
        
        //Add to Queue
        Thread.sleep(5000);
        driver.findElement(By.id("menu-list-:raf:-menuitem-:rai:")).click();
        
        //click on Queue arrow up arrow sign
        Thread.sleep(5000);
        driver.findElement(By.id("queue-up")).click();
        
        //click on Clear Queue option
        Thread.sleep(5000);
        driver.findElement(By.className("css-yvbm2a")).click();
        
        //click on clear to Queue button
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//div[text()= 'Clear Queue']")).click();
        driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rp:\"]/div[2]/div[2]/button[2]")).click();
        
        //click on three dot button
        //Thread.sleep(5000);
        //driver.findElement(By.className("lap:text-[15px]")).click();
        
        //Click on add to playlist
        //Thread.sleep(5000);
        //driver.findElement(By.className("css-7halv9")).click();
        
        
        //Click on three dot button
        //Thread.sleep(5000);
        //driver.findElement(By.className("lap:text-[15px]")).click();
        
 
		//click on view button
		 Thread.sleep(20000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[1]/p/a")).click();
		 
		 
		 ////////////////////////  CLICK ON SORT BY DROPDOWN CODE ///////////////////////////////
		 
		 //Thread.sleep(10000);   
         //WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
         //WebElement languages6Dropdown = wait3.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Sort By')]")));
		 
         //JavascriptExecutor js7 = (JavascriptExecutor) driver;
        //js7.executeScript("arguments[0].click();", languages6Dropdown);
         
         
         System.out.println("recently_added dropdown clicked!");
	    
         Thread.sleep(3000);
         driver.findElement(By.className("css-2lzsxm")).click();
         
         Thread.sleep(20000);
         driver.findElement(By.className("css-18esm8n")).click();
         
         //Click on delete icon
         Thread.sleep(3000);
         driver.findElement(By.className("group-hover:block")).click();
         
         Thread.sleep(3000);
         driver.findElement(By.className("css-2lzsxm")).click();
         
         Thread.sleep(3000);
         driver.findElement(By.cssSelector("button[value='recently_added']")).click();
         
         Thread.sleep(3000);
         driver.findElement(By.className("css-2lzsxm")).click();
         
         Thread.sleep(3000);
         driver.findElement(By.cssSelector("button[value='a_to_z']")).click();
         
         Thread.sleep(3000);
         driver.findElement(By.className("css-2lzsxm")).click();
         
         Thread.sleep(3000);
         driver.findElement(By.cssSelector("button[value='z_to_a']")).click();
         //Thread.sleep(6000);
         //driver.findElement(By.className("group-hover:block")).click();
         
         //Thread.sleep(3000);
         //driver.findElement(By.className("css-2lzsxm")).click();
         
         
 
         //Thread.sleep(5000);
	     //driver.findElement(By.cssSelector("button[value='new_release']")).click();
	     //Thread.sleep(6000);
	     //driver.findElement(By.cssSelector("button[value='new_release']")).click();
 
	 

	     
	     
	    // Thread.sleep(5000);
	     //driver.findElement(By.cssSelector("button[value='new_release']")).click();
	     //Thread.sleep(6000);
	     //driver.findElement(By.cssSelector("button[value='new_release']")).click();
	     
	     
		 //click on sort by button using this link https://staging4.koyal.pk:8444/audio/explore?sortby=z_to_a
		 //Thread.sleep(5000);
		 //driver.findElement(By.className("css-1hzyiq5")).click();
		 
		 //click on new release
		  //Thread.sleep(5000);
		  //driver.findElement(By.cssSelector("button[value='new_release']")).click();
		 
		 //click on delete icon
		 //Thread.sleep(10000);
		 //driver.findElement(By.className("group-hover:block")).click();
		 
		//click on sort by button
		//Thread.sleep(10000);
		//driver.findElement(By.className("css-1hzyiq5")).click();
		 
		//click on Recently added
		//Thread.sleep(10000);
		//driver.findElement(By.cssSelector("button[value='recently_added']")).click();
		 
		 
		
		//click on sort by button
		//Thread.sleep(10000);
		 //driver.findElement(By.className("css-1hzyiq5")).click();
		 
		//click on A to Z
		 //Thread.sleep(10000);
		 //driver.findElement(By.cssSelector("button[value='a_to_z']")).click();
		 
		//click on sort by button
		 //Thread.sleep(10000);
		 //driver.findElement(By.className("css-1hzyiq5")).click();
		 
		 
		//click on Z to A
		//Thread.sleep(10000);
		//driver.findElement(By.cssSelector("button[value='z_to_a']")).click();
		 
		 
		//////////////////////////////////CLICK ON LANGUAGES DROPDOWN///////////////////////
		
		Thread.sleep(10000);   
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement languagesDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Languages')]")));

        // Click the dropdown using JavaScript if normal click doesn't work
         JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();", languagesDropdown);

		 
        System.out.println("Languages dropdown clicked!");

        
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[value='All']")).click();
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("button[value='All']")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[value='Urdu']")).click(); 
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("button[value='Urdu']")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("button[value='Saraiki']")).click();
        
        Thread.sleep(6000);
        driver.findElement(By.cssSelector("button[value='Saraiki']")).click();
        
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='Punjabi']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='Punjabi']")).click();
         
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='Sindhi']")).click();
         
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='Sindhi']")).click();
         
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='Pashto']")).click();
         
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='Pashto']")).click();
         
         ////////////////////////////////////////////////////////////////////////////////////
         
         //click on dark mode and white mode
         Thread.sleep(10000);
         WebElement spanElement = driver.findElement(By.xpath("//span[contains(@class, 'w-2/5') and contains(@class, 'h-4/5') and contains(@class, 'bg-yellow-400')]"));
         spanElement.click();
         
         Thread.sleep(10000);
         WebElement spanElement1 = driver.findElement(By.xpath("//span[contains(@class, 'w-2/5') and contains(@class, 'h-4/5') and contains(@class, 'bg-yellow-400')]"));
         spanElement1.click();
         
         
         ////////////////////////////////CLICK ON TAGS DROPDOWN CODE ///////////////////////////////
         
         WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
         WebElement TagsDropdown1 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Tags')]")));

        // Click the dropdown using JavaScript if normal click doesn't work
         JavascriptExecutor js1 = (JavascriptExecutor) driver;
         js.executeScript("arguments[0].click();", TagsDropdown1);
         
         
         
         //Click on Love dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='love']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='love']")).click();
         
         
         //Click on request dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='request']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='request']")).click();
         
         
         //Click on Comedy dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='comedy']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='comedy']")).click();
         
         
         //Click on Family dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='family']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='family']")).click();
         
         //Click on Islamic dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='islamic']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='islamic']")).click();
         
         //Click on Sad dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='Sad']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='Sad']")).click();
         
         //Click on Joy dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='Joy']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='Joy']")).click();
         
         //Click on Romantic dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='Romantic']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='Romantic']")).click();
         
         
         //Click on Expectation dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='Expectation']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='Expectation']")).click();
         
         
         //Click on Expectation dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='Expectation']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='Expectation']")).click();
         
         //Click on Party dropdown check
         Thread.sleep(5000);
         driver.findElement(By.cssSelector("button[value='Party']")).click();
         Thread.sleep(6000);
         driver.findElement(By.cssSelector("button[value='Party']")).click();
         
        //////
         
        //Thread.sleep(3000);
        //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        //WebElement TagsDropdown = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'Tags')]")));

        // Click the dropdown using JavaScript if normal click doesn't work
        //JavascriptExecutor js1 = (JavascriptExecutor) driver;
        //js.executeScript("arguments[0].click();", TagsDropdown);

        //System.out.println("Tags dropdown clicked!");
		
		
	}

}
