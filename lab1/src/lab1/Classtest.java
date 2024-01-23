package lab1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classtest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\mydriver\\my web driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("");
		
	}

}
