import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class footer {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		Driver.get("https://koyal.pk/");
		
//		System.out.println(Driver.findElements(By.tagName("a")).size());
		WebElement FooterDriver = Driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]"));
		
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		
		
		WebElement ColumnDriver = FooterDriver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[4]/div[4]/div"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		Thread.sleep(35000);
		Driver.findElement(By.xpath("//*[@id=\"accordion-button-:r5:\"]/span/p")).click();
		
		
		//Click on each link in the column.
		
		for(int i=1;i<ColumnDriver.findElements(By.tagName("a")).size();i++)
		{
			//ye nichay jo code lika ha iska combination ap ko bataega k tab par kis trha cick krna ha (this combination will let you know to click on tab so that it open in another tab)
			//Keys.chord(Keys.CONTROL,Keys.ENTER) --> this tab will basically select the control;
			//aur jo string clickonlink liya ha ye variable ha
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
			
			//yaha Set data type k leye use huwa ha
			//ye loop all tabs ko open krta ha
			Set<String> abc=Driver.getWindowHandles();
			Iterator<String> it=abc.iterator();
			
			//hasNext tell us weather second index is present or not
			//when you it.next it actually move to next index
			while(it.hasNext())
			{
				Driver.switchTo().window(it.next());
				System.out.println(Driver.getTitle());
			}
		}
			
			
	}
		
	}