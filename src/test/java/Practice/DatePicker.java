package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

    public static void main(String[] args) throws InterruptedException {

        String month = "March";
        String  day = "24";

        System.setProperty("webdriver.chrome.driver","C:\\Users\\cheta\\IdeaProjects\\SeleniumLearning\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://phptravels.net/");
        driver.findElement(By.xpath("//*[@id=\"checkin\"]")).click();

        Thread.sleep(2000);



        while (true)
        {
            String text = driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr[1]/td[4]")).getText();
            if(text.equals(month))
            {
                break;
            }
            else
            {
                driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/thead/tr[1]/th[3]/i")).click();
            }

        }
        driver.findElement((By.xpath("//body[1]/div[3]/div[1]/table[1]/tbody[1]//tr//td[contains(text(),"+day+")]"))).click();

    }
}
