// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UsunTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void usun() {
    driver.get("https://localhost:5001/");
    driver.manage().window().setSize(new Dimension(1936, 1056));
    driver.findElement(By.linkText("Zaloguj się")).click();
    driver.findElement(By.id("Input_Email")).click();
    driver.findElement(By.id("Input_Email")).sendKeys("uzytkownik");
    driver.findElement(By.id("Input_Password")).click();
    driver.findElement(By.id("Input_Password")).sendKeys("!Test123");
    driver.findElement(By.cssSelector(".btn")).click();
    driver.findElement(By.linkText("Sprzęt")).click();
    driver.findElement(By.cssSelector("tr:nth-child(2) a:nth-child(3)")).click();
    driver.findElement(By.cssSelector(".btn-danger")).click();
    assertThat(driver.findElement(By.cssSelector(".pb-3")).getText(), is(not("Sthil")));
  }
}
