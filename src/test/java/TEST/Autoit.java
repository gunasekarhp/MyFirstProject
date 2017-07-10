package TEST;

import org.junit.Assert;
import org.junit.Test;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by kesavan on 7/7/2017.
 */
public class Autoit {


    private static WebDriver driver = null;

    public static void main(String[] args) throws IOException, InterruptedException {

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://toolsqa.wpengine.com/automation-practice-form");

        driver.findElement(By.id("photo")).click();

        Runtime.getRuntime().exec("C:\\Users\\kesav\\Desktop\\Testing\\GIG_test.exe");

        Thread.sleep(5000);

        driver.close();

    }
}
