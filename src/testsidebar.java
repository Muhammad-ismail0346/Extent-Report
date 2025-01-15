import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class testsidebar {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://koyal.pk/");
			
			Thread.sleep(5000); 
			WebElement languages= driver.findElement(By.cssSelector("a[href='/languages']"));
			languages.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			
			
			//click artist tab
			Thread.sleep(5000); 
			WebElement artists= driver.findElement(By.cssSelector("a[href='/artists']"));
			artists.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			
			//click search tab
			Thread.sleep(5000); 
			WebElement search= driver.findElement(By.cssSelector("a[href='/search']"));
			search.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			
			
//			Thread.sleep(3000);
//			WebElement VideoTab = driver.findElement(By.className("tab-video"));
//			VideoTab.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			
//			Thread.sleep(4000);
//			WebElement MovieTab = driver.findElement(By.className("tab-movie"));
//			MovieTab.sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
			
//			Thread.sleep(3000);
//			WebElement ShortsTab = driver.findElement(By.className("tab-shorts"));
//			driver.findElement(By.className("tab-shorts")).click();
		
			
			Thread.sleep(3000);
			Set<String>windows = driver.getWindowHandles();
			Iterator<String>it=windows.iterator();
			Thread.sleep(3000);
			
	        		
			
			String parentid = it.next();  //YE AUDIO ka code ha
			String childid = it.next(); //YE VIDEO KA HA
			String Subchild = it.next(); //YE Movie KA HA
			String Subchild1 = it.next(); //YE home page KA HA
		
		
			
			Thread.sleep(2000);
			driver.switchTo().window(parentid);
			System.out.println("Parent id" + driver.getTitle());
			Thread.sleep(5000);
			driver.switchTo().window(childid);
			System.out.println("child id:" + driver.getTitle());
			Thread.sleep(4000);
			driver.switchTo().window(Subchild);
			System.out.println("SubChild" + driver.getTitle());
			Thread.sleep(3000);
			driver.switchTo().window(Subchild1);
			System.out.println("SubChild1" + driver.getTitle());
			
			
			
	}
}