import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome");
        WebDriver driver  = new ChromeDriver();
        driver.get("https://google.com");
        WebElement input = driver.findElement(By.xpath("//*[@id=\"input\"]"));
        input.click();

    }
}
