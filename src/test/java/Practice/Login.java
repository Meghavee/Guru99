package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {



        public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver","C:\\Users\\cheta\\IdeaProjects\\SeleniumLearning\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.nopcommerce.com/en/Login");
            driver.manage().window().maximize();
            driver.getCurrentUrl();
            String url = driver.getCurrentUrl();
            System.out.println(url);

            WebElement login = driver.findElement(By.name("Username"));
            login.sendKeys("Meghavee1010");

            WebElement password = driver.findElement(By.name("Password"));
            password.sendKeys("Abc1010");
            Thread.sleep(2000);

            WebElement lgnbtn = driver.findElement(By.xpath("//*[@id=\"login-page\"]/body/div[7]/section/div/div/div/div/div/div[2]/div[1]/div[2]/form/div[2]/div[4]/input"));
            lgnbtn.click();
            Thread.sleep(2000);

            Actions action = new Actions(driver);
            WebElement we = driver.findElement(By.xpath("//*[@id=\"showcase-page\"]/body/div[7]/header/div/div[2]/ul/li[1]/span"));
            action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//*[@id=\"showcase-page\"]/body/div[7]/header/div/div[2]/ul/li[1]/ul/li[2]/a"))).click().build().perform();

        }
    }


