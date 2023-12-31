package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class bookMyShowLink {
    ChromeDriver driver;
    public bookMyShowLink()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01(){
        System.out.println("Start Test case: testCase01");
        // Navigate to url  https://in.bookmyshow.com/explore/home/chennai
        driver.get("https://in.bookmyshow.com/explore/home/chennai");
        // Locate all hyperlinks Using Locator "XPath" //a[@href]
        List<WebElement> links = driver.findElements(By.xpath("//a[@href]"));
        System.out.println("All links :"+links.size());
    }
}
