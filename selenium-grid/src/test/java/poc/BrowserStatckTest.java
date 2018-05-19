package poc;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

@Ignore
public class BrowserStatckTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws MalformedURLException {
		final String USERNAME = "USERNAME";
		final String AUTOMATE_KEY = "KEY";
		final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "IE");
		caps.setCapability("browser_version", "7.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "XP");
		caps.setCapability("browserstack.debug", "true");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
		driver.quit();

	}

}
