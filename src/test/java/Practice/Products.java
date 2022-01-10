package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Products {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.nopcommerce.com/en");
        driver.manage().window().maximize();


        Actions actions = new Actions(driver);
        //moveToElement() method of WebDriver
        //helps us to move the mouse cursor to a WebElement on the web page.
        WebElement product = driver.findElement(By.xpath("//*[@id=\"en-page\"]/body/div[7]/header/div/div[2]/ul/li[1]/span "));
        actions.moveToElement(product).build().perform();
        actions.click(product).build().perform();

        WebElement showcase = driver.findElement(By.xpath("/html/body/div[7]/header/div/div[2]/ul/li[1]/ul/li[2]/a"));
        actions.moveToElement(showcase).build().perform();
        actions.click(showcase).build().perform();

        WebElement language = driver.findElement(By.className("filters-title"));
        language.click();

        WebElement selectcheckbox = driver.findElement(By.xpath("//*[@id=\"showcase-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/div[2]/div/div/div[2]/div[2]/ul/li[10]/div/label"));
        actions.moveToElement(selectcheckbox).build().perform();
        actions.click(selectcheckbox).build().perform();

        WebElement category = driver.findElement(By.xpath("//*[@id=\"showcase-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/div[2]/div/div/div[3]/div[1]"));
        category.click();

        Thread.sleep(2000);

        WebElement shopping = driver.findElement(By.xpath("//*[@id=\"category-shopping\"]"));
        actions.moveToElement(shopping).build().perform();
        actions.click(shopping).build().perform();

        WebElement apply = driver.findElement(By.xpath("//*[@id=\"showcase-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/div[2]/div/div/div[4]/a"));
        apply.click();

        WebElement dp = driver.findElement(By.xpath("/html/body/div[7]/section/div/div/div/div/div/div[2]/div[3]/div[1]/div[4]/div[2]/a/img"));
        dp.click();

        WebElement bride = driver.findElement(By.xpath("/html/body/div[6]/div/div[3]/div/div/div/div/div/div[2]/div[1]/ul/li[3]/a"));

        //WebElement bride = driver.findElement(By.xpath("//*[@id=\"language-english\"]"));
        bride.click();






    }

}





