//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class searchingfunctionality {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://staging4.koyal.pk:8444/");
		

		//click on search
		Thread.sleep(15000);
		driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.py-4.px-2.mob\\:px-2.lap\\:px-0.tab\\:px-0.fixed.top-0.w-full.z-30.headerContainer.mb-20.css-0 > div > svg")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:r2:\"]/a[5]/p")).click();
		
		//typing in input field
		Thread.sleep(10000); 
        WebElement searchInput = driver.findElement(By.cssSelector("input.chakra-input.bg-transparent"));
        // Type in the search field
        searchInput.sendKeys("Qaidi No 804");
        
		//over on song bar
		Thread.sleep(10000);	
		driver.findElement(By.cssSelector("div.group\\/item.flex.justify-between.items-center.mob\\:py-0.lap\\:py-1.py-2.mob\\:px-0.px-3.rounded-\\[6px\\].cursor-pointer.hover\\:bg-\\[\\#59595924\\].bg-\\[\\#ffffff\\]")).click();

		 //click on songs play button
		 //Thread.sleep(10000);
		 //driver.findElement(By.className("chakra-button")).click();
		 
		 //mute the song
		 //Thread.sleep(3000);
		 //driver.findElement(By.className("chakra-button")).click();
		 
		 //click on arrow sign
		 //Thread.sleep(5000); 
		 //driver.findElement(By.className("text-[28px]")).click();
		 
		 /////////////////////////////////////////////////Menu par click krna////////////////////////////////////////////////////
		 
		 //click on three dots
		 //Thread.sleep(5000); 
		 //driver.findElement(By.className("css-wu8ref")).click();
		 
		 //Thread.sleep(5000);
		 //driver.findElement(By.className("css-18esm8n")).click();
		 

	} 
}
