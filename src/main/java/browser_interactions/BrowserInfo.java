package browser_interactions;

import setup.Main;

public class BrowserInfo extends Main {

  public static void main(String[] args) {
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    String title = driver.getTitle();//To get the Title of the web page
    String url = driver.getCurrentUrl();//To get the url of the page

    System.out.println(title);
    System.out.println(url);

    driver.quit();
  }
}