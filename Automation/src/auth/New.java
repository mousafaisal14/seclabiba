package auth; // --do not use the default package

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\driverr\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String email = "";
		String pass = "";

		driver.get("https://chat.labibabot.com");
		driver.manage().window().maximize();

		// driver.manage().window().fullscreen();// -->this to make the window full
		// screen and should be after the get screen

		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='Input_Email']")).sendKeys(email);
		driver.findElement(By.id("Input_Password")).sendKeys(pass);
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[1]/ul/li[2]/a")).click();

//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;           -->this function to scroll down by using js and import the javascript executer
//        jsExecutor.executeScript("window.scrollBy(0, 500);");

//		String myTitle = driver.getTitle();      --->this is to save the value the title and print it
//		System.out.println(myTitle);
		
//		String myOptionTag = driver.findElement(By.tagName("")).getText();     ---> this is to get the title value by tag name and store it in a variable then print it
//		System.out.println(myOptionTag);
		
//		String myOption = driver.findElements(By.tagName("option")).get(2).getText();    -->to get one index 
		
		
		
		
		
		
		List <WebElement> myListOfOption = driver.findElements(By.tagName(""));  // list to find all the elements and store them in the variable
		
		for(int i = 0 ; i < myListOfOption.size() ; i++) {                         
			
			System.out.println(myListOfOption.get(i).getText());                //to print every element in the list
			
		}
		
		
		
		
		
	}

}
