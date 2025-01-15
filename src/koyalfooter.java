import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class koyalfooter {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://koyal.pk/");
		//WebElement footerdriver=driver.findElement(By.id("gf-BIG"))
		//WebElement footerdriver=driver.findElement(By.className("css-1eziwv"));
		//System.out.println(footerdriver.findElements(By.tagName("a")).size());
		//ye nichay table ka main block ha /html/body/div[1]/div[2]/div/div[4]/div[4]
		WebElement footerdriver=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div[4]"));
		 
		Thread.sleep(35000);
		driver.findElement(By.className("css-1eziwv")).click();
		
 	
		WebElement coloumndriver=footerdriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div[4]"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//////////////////////////////////////////////////////////////////////////////
		
//		WebElement footerdriver2=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div[4]"));
//		Thread.sleep(40000);
//		driver.findElement(By.xpath("//*[@id=\"accordion-button-:r5:\"]/span/p")).click();
//		
// 	
//		WebElement coloumndriver1=footerdriver2.findElement(By.cssSelector("#accordion-button-\\:r5\\: > span > p"));
//		System.out.println(coloumndriver1.findElements(By.tagName("a")).size()); 
		
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{

			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
 
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(7000L);
			
			Set<String> abc=driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			//hasNext tell us weather second index is present or not
			//when you it.next it actually move to next index
			while(it.hasNext())
			{
				driver.switchTo().window(it.next());
				System.out.println(driver.getTitle());
			}
		}
	}

}