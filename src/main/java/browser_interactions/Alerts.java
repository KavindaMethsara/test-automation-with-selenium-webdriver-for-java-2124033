package browser_interactions;

import org.apache.commons.lang3.exception.ExceptionContext;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import setup.Main;

public class Alerts extends Main {
  
  public static void main(String[] args) {
    alerts();
    confirmations();
    prompts();
    waits();

    driver.quit();
  }
  /* Alerts are not within the DOM */
  public static void alerts(){
    driver.get("https://www.selenium.dev/selenium/web/alerts.html");
    driver.findElement(By.id("alert")).click();//This click triggers the alert
    /* Access the alert */
    Alert alert = driver.switchTo().alert();
    String message = alert.getText();//Get the message within the alert
    alert.accept();/* The alert is not in the DOM, so we can't use the click method here, but the
                      alert class provides the accept method, which will click OK.*/
  } 

  public static void confirmations() {
      driver.get("https://www.selenium.dev/selenium/web/alerts.html");
      driver.findElement(By.id("confirm")).click();
      Alert confirmation = driver.switchTo().alert();
      confirmation.accept();//Confirm the action
      confirmation.dismiss();//Cancel the action

  }

  public static void prompts(){
      driver.get("https://www.selenium.dev/selenium/web/alerts.html");
      driver.findElement(By.id("prompt")).click();
      Alert prompt = driver.switchTo().alert();
      prompt.sendKeys("Somethiong");
      prompt.accept();
  }

  public static void waits(){
      driver.get("https://www.selenium.dev/selenium/web/alerts.html");
      driver.findElement(By.id("slow-alert")).click();
      var wait = new WebDriverWait(driver, Duration.ofSeconds(2));
      Alert alert = wait.until(ExpectedConditions.alertIsPresent());
      alert.accept();
  }
}
