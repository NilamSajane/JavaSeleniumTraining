package day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class SeleniumExample {

    public static void main(String[] args) {

        String browser = "Chrome";


        WebDriver driver = null;
        if(browser == "Chrome") {
            driver = WebDriverManager.chromedriver().create();
        }else if(browser == "Firefox"){
            driver = WebDriverManager.firefoxdriver().create();
        }
      driver.get("https://www.amazon.in");
    }
}
