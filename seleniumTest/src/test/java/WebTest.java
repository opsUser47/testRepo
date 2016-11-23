package test.java;
 import static org.junit.Assert.assertEquals;
 
 import java.util.List;
 
 import org.junit.Test;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;  
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver; 
 public class WebTest {
 	//public String webUrl = "http://localhost:9001/sample-0.1.1-SNAPSHOT";
 	 @Test
 		public void testCaseVerifyHomePage() {
 		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
 		 	WebDriver driver=new ChromeDriver();
 		 	driver.navigate().to(System.getProperty("hostname"));
 			List<WebElement> links = driver.findElements(By.tagName("a"));
 			assertEquals(2, links.size());
 			driver.close();
 		}
 	 @Test
 	 	public void testCaseVerifyTilteOfFirstPage() {
	 	System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
 		 WebDriver driver=new ChromeDriver();
 		 driver.navigate().to(System.getProperty("hostname"));
 		 List<WebElement> links = driver.findElements(By.tagName("a"));
 		 String url = links.get(0).getAttribute("href");
 		 driver.navigate().to(url);
 		 assertEquals("Sample Application JSP Page", driver.getTitle());
 		 driver.close();
 	 }
 	 @Test
 	 	public void testCaseVerifyTilteOfSecondPage() {
 		 System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver_win32\\chromedriver.exe");
 		 WebDriver driver=new ChromeDriver();
 		driver.navigate().to(System.getProperty("hostname"));
 		 List<WebElement> links = driver.findElements(By.tagName("a"));
 		 String url = links.get(1).getAttribute("href");
 		 driver.navigate().to(url);
 		 assertEquals("Sample Application JSP Page", driver.getTitle());
 		 driver.close();
 	 }
}