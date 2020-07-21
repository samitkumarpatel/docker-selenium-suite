package net.samitlearning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GUITest {

	@Test
	public void testGUI() throws Exception {

		//System.setProperty("webdriver.chrome.driver", "/Applications/Google Chrome.app/Contents/MacOS/Google Chrome");

		WebDriver driver = new ChromeDriver();
		//WebDriver driver =  new RemoteWebDriver(new URL("http://localhost:45198"),DesiredCapabilities.chrome());

		
		driver.get("https://google.com");
		Assertions.assertEquals("google",driver.getTitle());
		
		/*
		driver.findElement(By.name("q")).sendKeys("cheese" + Keys.ENTER);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10).getSeconds());
		WebElement firstResult = wait.until(presenceOfElementLocated(By.cssSelector("h3>div")));
		System.out.println(firstResult.getAttribute("textContent"));
		*/
		
		driver.quit();

	}

}
