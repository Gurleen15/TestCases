package Testapplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Categories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Honey\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/nss-todo-automation-alpha/index.php");
		
		//Coding of Add Category
		
		//driver.findElement(By.name("categorydata")).sendKeys("Shopping");
	   // driver.findElement(By.xpath("//*[@id=\"extra\"]/input[2]")).click();
		
		
		
		//Coding of add task with category and date.
		
	    /*    driver.findElement(By.name("data")).sendKeys("Fashion");
	Select type = new Select(driver.findElement(By.xpath("//*[@id=\"extra\"]/select[1]")));
	type.selectByIndex(7);
	
	Select date = new Select(driver.findElement(By.name("due_day")));
	date.selectByVisibleText("10");
	
	Select Month = new Select(driver.findElement(By.name("due_month")));
	Month.selectByVisibleText("Jun");
	
	Select Year = new Select(driver.findElement(By.name("due_year")));
	Year.selectByVisibleText("2018");
	
	driver.findElement(By.xpath("/html/body/div[4]/input[2]")).click();*/
		
		//Coding of select task and completed
		
		/*driver.findElement(By.name("todo[7]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/input[2]")).click();*/
		
		// Coding of select task and removed
		 
		/*driver.findElement(By.name("todo[10]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/input[1]")).click();*/
		
		// Coding of toggle all
		
		/*driver.findElement(By.name("allbox")).click();
		driver.findElement(By.xpath("/html/body/div[3]/input[2]")).click();*/
		
		// Coding of Advanced
		 //driver.findElement(By.xpath("/html/body/div[3]/a[1]")).click();
		
		 //Coding of Update the task when click on Task no.
		driver.findElement(By.xpath("//*[@id=\"todos-content\"]/form/ul/li[4]/a")).click();
	Select Category1 = new Select(driver.findElement(By.xpath("/html/body/form/select[1]")));
	Category1.selectByVisibleText("Play");
	Select date = new Select(driver.findElement(By.name("due_day")));
	date.selectByVisibleText("12");
	
	Select Month = new Select(driver.findElement(By.name("due_month")));
	Month.selectByVisibleText("Mar");
	
	Select Year = new Select(driver.findElement(By.name("due_year")));
	Year.selectByVisibleText("2018");
	
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		
		
}
	
	

	}

