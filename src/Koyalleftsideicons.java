//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Koyalleftsideicons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://koyal.pk/login");
		Thread.sleep(3000);
//		//////////////////////////////////////////////////////////////////////////////
		WebElement dropdown = driver.findElement(By.className("react-select__control"));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//div[text()='Telenor']"));
        option.click();
        WebElement submitButton = driver.findElement(By.cssSelector(".chakra-button"));
        submitButton.click();
        
        Thread.sleep(2000);
        driver.findElement(By.className("iti__tel-input")).sendKeys("3422140766");
        
        driver.findElement(By.className("chakra-button")).click();
        ///////////////////////////////////////////////
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
        
        
        Thread.sleep(8000);
        driver.findElement(By.className("chakra-button")).click(); 
        
        /////////////////////////////////
        
     
		//This is library icon clicking code
        Thread.sleep(4000);
		driver.findElement(By.cssSelector("a[href='/library']")).click();

		//This is language icon clicking code
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("a[href='/languages']")).click();
		
		//This is artist icon clicking code
		Thread.sleep(6000);
		driver.findElement(By.cssSelector("a[href='/artists']")).click();
        
		//This is search icon clicking code
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("a[href='/search']")).click();
//        
//		Thread.sleep(6000);
//		driver.findElement(By.cssSelector("a[href='/Languages']")).click(); 
        //Selection on Languages
//        Thread.sleep(3000);
		//driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div.w-\\[5\\%\\].fixed.top-20.left-0.right-0 > div > a:nth-child(3) > abbr > svg")).click();
//		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div.w-\\[5\\%\\].fixed.top-20.left-0.right-0 > div > a:nth-child(3) > abbr > svg > path")).click();					  

	}

}
