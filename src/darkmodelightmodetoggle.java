import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class darkmodelightmodetoggle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://koyal.pk/login");
		
		/////////////////////////////////////////////////////////
		Thread.sleep(3000);
//		//////////////////////////////////////////////////////////////////////////////
		WebElement dropdown = driver.findElement(By.className("react-select__control"));
        dropdown.click();
        WebElement option = driver.findElement(By.xpath("//div[text()='Telenor']"));
        option.click();
        WebElement submitButton = driver.findElement(By.cssSelector(".chakra-button"));
        submitButton.click();
        Thread.sleep(2000);
        driver.findElement(By.className("form-control")).sendKeys("3422140766");
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
//        Thread.sleep(8000);
//        driver.findElement(By.className("chakra-button")).click(); 

        Thread.sleep(10000);
        WebElement spanElement = driver.findElement(By.xpath("//span[contains(@class, 'w-2/5') and contains(@class, 'h-4/5') and contains(@class, 'bg-yellow-400')]"));
        spanElement.click();
        
        Thread.sleep(10000);
        WebElement spanElement1 = driver.findElement(By.xpath("//span[contains(@class, 'w-2/5') and contains(@class, 'h-4/5') and contains(@class, 'bg-yellow-400')]"));
        spanElement1.click();
        
        //login button par click krnay 
        Thread.sleep(3000);
        driver.findElement(By.className("chakra-menu__menu-button")).click();
        
      	//login button par click krnay 
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"menu-list-:r1a:-menuitem-:r1d:\"]")).click();
        
        Thread.sleep(3000);
        driver.findElement(By.className("css-1wxschu")).click();
        
	}

}
