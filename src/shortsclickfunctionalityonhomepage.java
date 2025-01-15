
	////////////////////////////// IS MA PREFERENCES PAR KAAM HUWA WA HA //////////////////////////////////////////////////////
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class shortsclickfunctionalityonhomepage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://koyal.pk/login");
 
 
		Thread.sleep(3000);
 

		WebElement dropdown = driver.findElement(By.className("react-select__control"));
        dropdown.click();
        
        WebElement option = driver.findElement(By.xpath("//div[text()='Telenor']"));
        option.click();
        
        WebElement submitButton = driver.findElement(By.cssSelector(".chakra-button"));
        submitButton.click();

 
        //YE LIVE KA LINK HA 
        Thread.sleep(2000);
        driver.findElement(By.className("iti__tel-input")).sendKeys("3422140766");
 

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
        driver.findElement(By.className("iti__tel-input")).sendKeys("3422140766");
        
        driver.findElement(By.className("chakra-button")).click();
 
        Thread.sleep(5000);
      
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/main/div/div/div/div/div/div/div[1]/div[4]/div/div[1]/div[1]/a/div/div[1]/div/div/img")).click();
    
		
		//click on login button code here
		Thread.sleep(5000); 
		WebElement likeDiv = driver.findElement(By.cssSelector("div.w-\\[45px\\].h-\\[45px\\].bg-\\[\\#3a3a3a\\].flex.justify-center.items-center.rounded-full.mt-6.cursor-pointer.css-0"));
		likeDiv.click();
		
		Thread.sleep(5000); 
		WebElement dislikeDiv = driver.findElement(By.cssSelector("div.w-\\[45px\\].h-\\[45px\\].bg-\\[\\#3a3a3a\\].flex.justify-center.items-center.rounded-full.mt-6.cursor-pointer.css-0"));
		dislikeDiv.click();
 
		//CLICK ON PLAY BUTTON
		//Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"scrollable-div\"]/div[1]/div[2]/div")).click();
		///Click on login button
		 Thread.sleep(5000); 
		 driver.findElement(By.className("css-kjvu41")).click();

		//THIS CODE IS FOR TO CLICK ON PREFERENCES
		Thread.sleep(5000);
   		driver.findElement(By.cssSelector("a[href='/preferences/language']")).click();
   		
   		//CLICK ON URDU 
   		Thread.sleep(6000);
   		driver.findElement(By.id("language-0")).click();
   		
   		//CLICK ON CONTINUE
   		Thread.sleep(6000);
   		driver.findElement(By.id("language-continue")).click();
   		
   		//PICK YOUR GENER
   		Thread.sleep(6000);
   		driver.findElement(By.id("genre-0")).click();
   		
   		//CLICK ON CONTINUE BUTTON
   		Thread.sleep(6000);
   		driver.findElement(By.id("genre-continue")).click();
   		
   		
   		//CLICK ON ARTIST
   		Thread.sleep(5000);
   		driver.findElement(By.id("artist-0")).click();
   		
   		//CLICK ON CONTINUE
   		Thread.sleep(5000);
   		driver.findElement(By.id("artist-continue")).click();
 
   		
	}
	 
}
 
