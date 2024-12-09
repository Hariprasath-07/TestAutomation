package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class sample {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
        ChromeOptions op = new ChromeOptions();
        op.addArguments("--disable-notifications");
        WebDriver ref = new ChromeDriver(op);
        ref.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(ref, 10); // For Selenium 3.x

        try {
            // Navigate to the website
            ref.get("https://www.busonlineticket.com/booking/bus-tickets.aspx");

            // Select Origin
            WebElement sourceField = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtOriginGeneral")));
            sourceField.click();
            WebElement sourceOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"select2-result-label\"])[2]")));
            sourceOption.click();

            // Select Destination
            WebElement destinationField = wait.until(ExpectedConditions.elementToBeClickable(By.id("txtDestinationGeneral")));
            destinationField.click();
            WebElement destinationOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class=\"select2-result-label\"])[2]")));
            destinationOption.click();

            // Select Depart Date
            WebElement departDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[contains(.,'Depart Date')])[7]")));
            departDate.click();
            WebElement nextMonth = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='ui-datepicker-next ui-corner-all']")));
            nextMonth.click();
            WebElement specificDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='20']")));
            specificDate.click();

            // Search Buses
            WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("btnBusSearchNewGeneral")));
            searchButton.click();

            // Click Cheapest Option
            WebElement cheapestButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='Cheapest']")));
            cheapestButton.click();

            // Scroll Down
            JavascriptExecutor js = (JavascriptExecutor) ref;
            js.executeScript("window.scrollBy(0,500)");

            // Select Bus
            WebElement selectBus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//b[.='SELECT'])[1]")));
            selectBus.click();

            // Wait for the seat element to become clickable
            WebElement seat = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class='seat' and .//small[text()='5C']]")));
            js.executeScript("arguments[0].scrollIntoView(true);", seat); // Scroll to seat
            seat.click(); // Click the seat
            System.out.println("Seat 5C clicked successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Quit the driver to clean up resources
            ref.quit();
        }
    }
}
