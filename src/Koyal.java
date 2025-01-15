
//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Koyal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1st Test Case of about URL link
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://koyal.pk/");
		//1st Test Case Pass
		
		////////////////////////////////////Sign In Test Cases///////////////////////////////////////////////////////
		
		//2ndTest Case Below about Valid Email and Password
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
 		driver.findElement(By.id("email_login")).sendKeys("noreen.iqbal@mobitisinginc.com");
 		driver.findElement(By.id("password")).sendKeys("12345678");
 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
 		driver.close();
 		 
//		 
//		
//		//3rdTest Case Below about Valid Email with Mixed Case
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys("Noreen.IqbAl@mobitisinginc.com");
// 		driver.findElement(By.id("password")).sendKeys("12345678");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
//		
//		
//		//4rthTest Case Below about Valid Email and Password with Special Characters
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys("@noreen%.iqbAl@mobitisinginc.com");
// 		driver.findElement(By.id("password")).sendKeys("$12345678%");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
// 
//		//5fthTest Case Below about Invalid Email Format
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys("@noree@n%.@@iqbAl@mobitisinginc.com");
// 		driver.findElement(By.id("password")).sendKeys("12345678");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
//		
//		
//		//6thTest Case Below about Incorrect Password
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys("noreen.iqbal@mobitisinginc.com");
// 		driver.findElement(By.id("password")).sendKeys("12345678....$#@1-= -=");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
		
 		//7thTest Case Below about Email Not Registered
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys("muhammad.ismail1@mobitisinginc.com");
// 		driver.findElement(By.id("password")).sendKeys("12345678");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
 		
 		
 		//8thTest Case Below about Empty Email and Password Fields
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys(" ");
// 		driver.findElement(By.id("password")).sendKeys(" ");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
 		
 		
 		//9thTest Case Below about Empty Email and Password Fields
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys(" ");
// 		driver.findElement(By.id("password")).sendKeys("123456789");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
 		
 		
 		//10thTest Case Below about Email and Empty Password Fields
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys("noreen.iqbal@mobitisinginc.com");
// 		driver.findElement(By.id("password")).sendKeys(" ");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
 		
 		//12thTest Case Below about Excessively Long Email or Password
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys("noreen.iqbal@mobitisinginc.comcomcomcomcomcomcomcomcomcom");
// 		driver.findElement(By.id("password")).sendKeys("123456789");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
 		
 		
 		//13thTest Case Below about Email with Special Characters Not Allowed
// 		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("email_login")).sendKeys("noreen@@!@.iqbal@mobitisinginc.com");
// 		driver.findElement(By.id("password")).sendKeys("123456789");
// 		driver.findElement(By.cssSelector("Button[type='submit']")).click();
 
		
		
		
 		 ///////////////////////////////////////Verify Eye Icon/////////////////////////////////////////////////////
		
		//14thTest Case Below about Enter a password in the password field and Eye icon should be clickable
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
// 		driver.findElement(By.id("password")).sendKeys("12345678");
// 		driver.findElement(By.className("chakra-input__right-element")).click();
 		 
		
		
 		//15thTest Case Below about only password typing
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.cssSelector("span[class='text-[#EC297B] cursor-pointer']")).click();
		//driver.findElement(By.id("password")).sendKeys("12345678");
 		
		
		/////////////////////////////////////Verify Sign Up////////////////////////////////////////////////////////
		//16thTest Case Below about Successful Sign-Up
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span[2]")).click();
//		driver.findElement(By.id("email_register")).sendKeys("muhammad.ismail1@mobitisingin.com");
//		driver.findElement(By.id("password_register")).sendKeys("123456789");
//		driver.findElement(By.id("confirm_password")).sendKeys("123456789");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span")).click();

		
		
		//17th test case click eye icon
//		
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span[2]")).click();
//		driver.findElement(By.id("email_register")).sendKeys("muhammad.ismail1@mobitisingin.com");
//		driver.findElement(By.id("password_register")).sendKeys("123456789");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[2]/div/div[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirm_password")).sendKeys("123456789");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[3]/div/div[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span")).click();
		
		//18th test case Invalid Email Format	
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span[2]")).click();
//		driver.findElement(By.id("email_register")).sendKeys("muhammad@.ismail1@mobitisingin.com@#$#");
//		driver.findElement(By.id("password_register")).sendKeys("123456789");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[2]/div/div[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirm_password")).sendKeys("123456789");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[3]/div/div[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span")).click();

		//19th test case password do not match
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span[2]")).click();
//		driver.findElement(By.id("email_register")).sendKeys("muhammad@.ismail1@mobitisingin.com@#$#");
//		driver.findElement(By.id("password_register")).sendKeys("123456789");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[2]/div/div[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirm_password")).sendKeys("12345678918");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[3]/div/div[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span")).click();

		//20th test case weak password 
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span[2]")).click();
//		driver.findElement(By.id("email_register")).sendKeys("muhammad@.ismail1@mobitisingin.com@#$#");
//		driver.findElement(By.id("password_register")).sendKeys("1");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[2]/div/div[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirm_password")).sendKeys("1");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[3]/div/div[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span")).click();
		
		
		//21th test case missing a password
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span[2]")).click();
//		driver.findElement(By.id("email_register")).sendKeys("muhammad@.ismail1@mobitisingin.com@#$#");
//		driver.findElement(By.id("password_register")).sendKeys(" ");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[2]/div/div[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirm_password")).sendKeys(" ");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[3]/div/div[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span")).click();
		
		//21th test case Continue without Entering Data
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span[2]")).click();
//		driver.findElement(By.id("email_register")).sendKeys(" ");
//		driver.findElement(By.id("password_register")).sendKeys(" ");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[2]/div/div[2]")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.id("confirm_password")).sendKeys(" ");
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/form/div[3]/div/div[2]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span")).click();
		
		//22th test case Click Login without Signing Up
//		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div[3]/button[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span[2]")).click();
//		driver.findElement(By.xpath("//*[@id=\"chakra-modal--body-:rt:\"]/div/div/div[1]/div/div/div/p[2]/span")).click();
	}
}