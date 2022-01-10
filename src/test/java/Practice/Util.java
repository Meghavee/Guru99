package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

    static WebDriver driver;

   // public static final String FIREFOX_PATH = "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe";

    public Util(WebDriver driver)
    {
        this.driver = driver;
    }
    public WebElement getElement(By locator)
    {
     WebElement element = driver.findElement(locator);
     return  element;
    }
    public void doClick(By locator)
    {
        getElement(locator).click();
    }






    }

