package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Practice04_chatGTP2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        WebDriver ref = new ChromeDriver();
        ref.manage().window().maximize();
        ref.navigate().to("https://www.amazon.in/");
        
        // Use WebDriverWait for Selenium 3
        WebDriverWait wait = new WebDriverWait(ref, 10); // Timeout in seconds

        Thread.sleep(2000);
        WebElement search = ref.findElement(By.id("twotabsearchtextbox"));
        search.sendKeys("laptops");

        WebElement clk = ref.findElement(By.id("nav-search-submit-button"));
        clk.click();

        // Apply HP filter
        WebElement brand = ref.findElement(By.xpath("//span[.='HP']"));
        brand.click();

        // Wait for price range inputs and apply the range
        WebElement minPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='number' and @aria-labelledby='low-price-label']")));
        minPrice.sendKeys("30000");

        WebElement maxPrice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='number' and @aria-labelledby='high-price-label']")));
        maxPrice.sendKeys("60000");

        WebElement goButton = ref.findElement(By.xpath("//input[@type='submit' and @aria-labelledby='a-autoid-1-announce']"));
        goButton.click();

        // Extract product names and prices
        Thread.sleep(2000);  // Wait for results to load
        WebElement firstProduct = ref.findElement(By.xpath("//span[@class='a-text-normal']"));
        System.out.println("First product: " + firstProduct.getText());

        ref.quit();
    }
}
