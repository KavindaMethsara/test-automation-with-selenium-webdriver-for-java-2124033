package browser_interactions;

import org.openqa.selenium.By;

import setup.Main;

public class Tabs extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/window_switching_tests/page_with_frame.html");

    driver.findElement(By.id("a-link-that-opens-a-new-window")).click();
    var windows = driver.getWindowHandles();//To get unique identifiers for windows or tabs that is currently open within this session
    System.out.println(windows);

    String originalWindow = driver.getWindowHandle();
    for(String window : windows){
      if(!window.equals(originalWindow)){
        driver.switchTo().window(window);
      }
    }

    System.out.println(driver.getTitle());

    driver.quit();
  }
}