package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
       // System.setProperty("webdriver,chrome,driver","/Users/yorkmacbook022/Downloads/chromedriver_mac64/chromedriver");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //for time out
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Adile");
        driver.findElement(By.name("inputPassword")).sendKeys("Hello12");
        driver.findElement(By.className("submit")).click();
        // implicit wait- 5 seconds time out to catch the text
        WebElement fail=driver.findElement(By.cssSelector("p.error"));//.getText();
        System.out.println(fail.getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Adile");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("adile@gail");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("adile@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("2314321");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        //Thread.sleep(2000);
        WebElement text=driver.findElement(By.cssSelector("form p"));
        System.out.println(text.getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("Adile");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span/input[@id='chkboxOne']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

    }
}
