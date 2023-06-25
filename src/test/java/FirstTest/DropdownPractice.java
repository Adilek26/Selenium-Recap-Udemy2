package FirstTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;


public class DropdownPractice {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        //
        WebElement staticDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        driver.manage().window().maximize();

        Select dropdown= new Select(staticDropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
//        Thread.sleep(2000);
//        dropdown.selectByVisibleText("AED");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        Thread.sleep(2000);
//        dropdown.selectByValue("INR");
//        System.out.println(dropdown.getFirstSelectedOption().getText());
       // ------- Dropdown with while loop
        driver.findElement(By.id("divpaxinfo")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Thread.sleep(1000);
        // click 4 times with while loop
//        int i=1;
//        while(i<5) {
//            driver.findElement(By.id("hrefIncAdt")).click();
//            i++;
//        }
        for(int i=1; i<5; i++){
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        for (int i=0; i<3; i++){
            driver.findElement(By.id("hrefIncChd")).click();
        }

        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult, 3 Child");
        driver.close();
    }
}
