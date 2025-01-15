//import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class testing {

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
		
		//click on song option in searching functionality
		//Thread.sleep(8000);
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/div/p[2]")).click();
		
		//over on song bar
		//Thread.sleep(10000);
		//driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.overflow-x-clip.pt-20.px-16.mob\\:px-2.tab\\:ms-2.lap\\:ms-2.desk\\:ms-2.tab\\:px-2 > div > div > div.px-4.pb-4.mob\\:px-0.tab\\:px-0.css-0 > div > div > div.w-\\[100\\%\\].lap\\:w-\\[100\\%\\].tab\\:w-\\[100\\%\\].mob\\:w-\\[100\\%\\].mb-12.mob\\:mb-0.tab\\:mb-0.css-0 > div.h-auto.topSongsScroll.css-0 > div:nth-child(1) > div > div")).click();
 
		//click on songs play button
		//Thread.sleep(20000);
		//driver.findElement(By.cssSelector("body > div.relative.flex.flex-col > div:nth-child(2) > div > div.overflow-x-clip.pt-20.px-16.mob\\:px-2.tab\\:ms-2.lap\\:ms-2.desk\\:ms-2.tab\\:px-2 > div > div > div.px-4.pb-4.mob\\:px-0.tab\\:px-0.css-0 > div > div > div.w-\\[100\\%\\].lap\\:w-\\[100\\%\\].tab\\:w-\\[100\\%\\].mob\\:w-\\[100\\%\\].mb-12.mob\\:mb-0.tab\\:mb-0.css-0 > div.h-auto.topSongsScroll.css-0 > div:nth-child(1) > div > div > div:nth-child(2) > div > div.me-2.mob\\:visible.tab\\:visible.invisible.group-hover\\/item\\:visible > button > svg")).click();
 
		//click on stop song button
		//driver.findElement(By.className("rhap_main-controls")).click();
		
		//typing in input field
		Thread.sleep(10000); 
        WebElement searchInput = driver.findElement(By.cssSelector("input.chakra-input.bg-transparent"));
        // Type in the search field
        searchInput.sendKeys("Qaidi No 804");
        
		//over on song bar
		 Thread.sleep(10000);	
		 driver.findElement(By.cssSelector("div.group\\/item.flex.justify-between.items-center.mob\\:py-0.lap\\:py-1.py-2.mob\\:px-0.px-3.rounded-\\[6px\\].cursor-pointer.hover\\:bg-\\[\\#59595924\\].bg-\\[\\#ffffff\\]")).click();

	}

}
