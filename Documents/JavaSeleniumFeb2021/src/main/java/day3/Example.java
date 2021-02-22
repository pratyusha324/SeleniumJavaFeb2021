package day3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Example {

    public static void main(String[] args) {

        WebDriver driver = null;

        String browser = "chrome";
        if(browser.equalsIgnoreCase("chrome")) {
            System.out.println("Opening chrome");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

        }else if(browser.equalsIgnoreCase("firefox")){
            System.out.println("Open firefox");
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        driver.get("https://www.amazon.com/");
    }
  }