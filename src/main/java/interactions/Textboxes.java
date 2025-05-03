package interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import setup.Main;

public class Textboxes extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/formPage.html");

    WebElement textbox = driver.findElement(By.name("id-name1"));
    textbox.getText();//This will return the string of the text in the text box
    textbox.clear();//To remove the text in the text box
    textbox.sendKeys("Sample text-01");

    //driver.quit();
  }
}
