import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.className;

public class TestGoogle {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/in-anubhav.srivastava/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebElement searchBox = driver.findElement(By.id("user-message"));
        searchBox.sendKeys("Nishi Foods");

        WebElement ShowMessage = driver.findElement(By.className("btn-default"));
        ShowMessage.click();


        String expectedMessage = "Nishi Foods";
        String message = driver.findElement(By.id("display")).getText();
        if (expectedMessage == "Nishi Foods") {
            System.out.println("True");
        }
driver.close();
    }}


