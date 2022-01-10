package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class openchromedriverpractice {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\cheta\\IdeaProjects\\SeleniumLearning\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.nopcommerce.com/en/demo");
        String url = driver.getCurrentUrl();
        System.out.println(url);
        String title = driver.getTitle();
        System.out.println(title);
        driver.close();

    }


}
