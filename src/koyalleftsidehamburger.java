import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class koyalleftsidehamburger{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://koyal.pk/login");
		Thread.sleep(3000);
		////////////////////////////////////////////////////////////////////////////////
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
        //driver.findElement(By.xpath("//a[contains(@class, 'tab-audio')]")).click(); 
		///////////////////////////////////////////////////////////////////////////////
		//subscribe button code
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[3]")).click();
		//click on Home
		Thread.sleep(35000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		//driver.findElement(By.className("#chakra-modal--body-\\:r2\\: > a:nth-child(1) > p")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[1]/p")).click();
		
		//click on My Library
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[2]/p")).click();
		
		//click on My Language
		 //Thread.sleep(5000);
		 //driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		 //Thread.sleep(5000);
		 //driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[2]/p")).click();
		
		//click on My Languages
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[3]/p")).click();
		
		//click on search
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[6]/p")).click(); 
		
		//cross button left side bar code
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000); 
		driver.findElement(By.cssSelector("#chakra-modal--header-\\:r2\\: > div > svg")).click();
	
	}

}
