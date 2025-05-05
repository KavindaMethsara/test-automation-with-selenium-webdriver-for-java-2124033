package element_state;

import setup.Main;
import org.openqa.selenium.By;

public class Displayed extends Main {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    boolean isvisible = driver.findElement(By.name("my-hidden")).isDisplayed();//To check whether the relevant element is visible

    driver.quit();
  }
}
