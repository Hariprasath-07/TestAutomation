package basicScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Script18_DragandDrop {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver a = new ChromeDriver();

		a.manage().window().maximize();

		a.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

		WebElement src = a.findElement(By.id("box2"));
		WebElement des = a.findElement(By.id("box102"));

		Actions ac = new Actions(a);

		ac.dragAndDrop(src, des).perform();

	}

}
