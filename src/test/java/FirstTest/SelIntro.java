package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SelIntro {
     public static void main(String[] args) {
        //Invoke browser
         WebDriverManager.chromedriver().setup();
         // **Because of some difficulties decided to use WebDriverManager instead installing drivers
         //WebDriver interface gather all browsers under
         //chromedriver-> Chrome browser
       // System.setProperty("webdriver.chrome.driver","C:\\Users\\fehmi\\Downloads\\chromedriver_win32.exe");
        // WebDriver driver=new ChromeDriver();
         //Chrome browser
         WebDriver driver=new ChromeDriver(); // will give just for Chrome

         //Firefox Launch
        // WebDriver driver=new FirefoxDriver();


         //shifting a webpage
         driver.get("https://www.rahulshettyacademy.com/");
         driver.getTitle();
         System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
    }
}
