package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class Main {

  static protected WebDriver driver;/*Declaring a WebDriver Object*/

  static {
    chromedriver().setup();/*ChromeDriver executable-Automatically download and configure the browser*/
    var options = new ChromeOptions();/*To change the brower behavior */
    options.addArguments("--no-sandbox");
    driver = new ChromeDriver(options);
  }

  public static void main(String[] args) {
    driver.get("https://google.com");
    driver.quit();
  }
}