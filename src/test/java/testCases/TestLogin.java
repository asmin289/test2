package testCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestLogin {

    @Test
    public void LoginTest(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");


        System.out.println(driver.getTitle());


        System.out.println("111111111111111111111111111111111111111111111");




//        driver.close();
        driver.quit();



    }

}
