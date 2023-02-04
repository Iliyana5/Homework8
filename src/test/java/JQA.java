import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQA {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/D://chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        //launching the specified URL
        driver.get("https://www.abv.bg/");


       driver.findElement(By.id("username")).sendKeys("123456");
       driver.findElement(By.id("password")).sendKeys("898989");
       driver.findElement(By.id("loginBut")).click();

    }
}
