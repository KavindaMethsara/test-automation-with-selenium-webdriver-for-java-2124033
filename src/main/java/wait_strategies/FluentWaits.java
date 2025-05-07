package wait_strategies;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import setup.Main;

public class FluentWaits extends Main
{

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/dynamic.html");
    driver.findElement(By.id("adder")).click();

    var wait = new FluentWait<>(driver)//Creating the FluentWait instance
    /*Adding builder patterns to chain additional methods to configure this fluent wait*/
      .withTimeout(Duration.ofSeconds(5))//To specify the maximum time of the wait, default is 500 milliseconds
      .pollingEvery(Duration.ofMillis(200))//How oftern to check the condition-pollingEvery method, default is 250 milliseconds
      .ignoring(NoSuchElementException.class);//Ignore the exception during to wait

    WebElement box = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("box0")));

    driver.quit();
  }
}