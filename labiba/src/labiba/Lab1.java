package labiba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\newdriver\\chromedriver-win64.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");

	}

}
