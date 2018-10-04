package Testapplication;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintCategories {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Honey\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://localhost/nss-todo-automation-alpha/index.php");
		
		//Coding of count and print all the categories from dropdown
		
				Select Count = new Select(driver.findElement(By.name("category")));
				List<WebElement> Dropdown = Count.getOptions();
				System.out.println(Dropdown.size());
				
				int isize = Dropdown.size();
				for(int i=0; i<=isize; i++)
		{
			String Output = Dropdown.get(i).getText();
			System.out.println(Output);
		
	}
	}
}


