package interactions;

import setup.Main;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class DropdownMenus extends Main {

  @SuppressWarnings("unused")
  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    Select dropdown = new Select(driver.findElement(By.name("my-select")));//finding thw select element
    dropdown.selectByValue("2");
    dropdown.selectByVisibleText("Three");
    dropdown.selectByIndex(1);

    //Select class provides couple of methods to retrive the selected options from a dropdown

    //To get the first option that selected
    WebElement selectedOption = dropdown.getFirstSelectedOption();

    //To get all the selected options from a multi-select dropdown
    List<WebElement>selectOptions = dropdown.getAllSelectedOptions();

    //To deselect
    dropdown.deselectByValue("2");
    dropdown.deselectByVisibleText("Three");
    dropdown.deselectByIndex(1);

    driver.quit();
  }
  
}
