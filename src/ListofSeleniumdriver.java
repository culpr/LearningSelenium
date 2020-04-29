import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListofSeleniumdriver {

	
	
	WebDriver driver;
	
	
	public void form() {
		System.setProperty("webdriver.chrome.driver","/Users/rayculp/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		
		
		try {
			Thread.sleep(1000);
			
			WebElement fname= driver.findElement(By.id("first-name"));
			fname.sendKeys("Ray");
			
			Thread.sleep(1000);
			WebElement lname= driver.findElement(By.id("last-name"));
			lname.sendKeys("Culp");
			
			Thread.sleep(1000);
			WebElement job= driver.findElement(By.id("job-title"));
			job.sendKeys("Computer Engineering");
			
			
			Thread.sleep(1000);
			WebElement edu= driver.findElement(By.id("radio-button-2"));
			edu.click();
			
			Thread.sleep(1000);
			WebElement sex= driver.findElement(By.id("checkbox-1"));
			sex.click();
			
			Thread.sleep(1000);
			WebElement exp= driver.findElement(By.cssSelector("option[value='2']"));
			exp.click();
			
			
			Thread.sleep(1000);
			WebElement date= driver.findElement(By.id("datepicker"));
			date.sendKeys("01/01/2020");
			WebElement date1= driver.findElement(By.id("datepicker"));
			date1.sendKeys(Keys.RETURN);
			
			
			driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
			WebDriverWait wait = new WebDriverWait(driver, 10); 
			WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".alert.alert-success")));
			
			
			String alart = result.getText();
			
			assertEquals("The form was successfully submitted!", alart); 
			
			Thread.sleep(1000);
			driver.close();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void fileUpLoad() {
		System.setProperty("webdriver.chrome.driver","/Users/rayculp/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/fileupload");
		
		
		
		
		
		try {
			
			//WebElement fileUP = driver.findElement(By.cssSelector("input[class='btn.btn-secondary.btn-choose']"));
			WebElement fileUP = driver.findElement(By.id("file-upload-field"));
			fileUP.sendKeys("Megamillion.htm");
			
			Thread.sleep(5000);
			driver.close();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void dropDown() {
		System.setProperty("webdriver.chrome.driver","/Users/rayculp/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		try {
			Thread.sleep(1000);
			WebElement dropDownM = driver.findElement(By.id("dropdownMenuButton"));
			dropDownM.click();
			Thread.sleep(1000);
			
			WebElement autoC = driver.findElement(By.id("autocomplete"));
			autoC.click(); 
			
			Thread.sleep(1000);
			
			driver.close();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void datePicker() {
		System.setProperty("webdriver.chrome.driver","/Users/rayculp/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/datepicker");
		
		try {
			Thread.sleep(1000);
			WebElement dateField = driver.findElement(By.id("datepicker"));
			
			dateField.sendKeys("03/03/2020");
			dateField.sendKeys(Keys.RETURN);
			 
			
			
			
			Thread.sleep(1000);
			driver.close();
			
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void CheckBox() {
		System.setProperty("webdriver.chrome.driver","/Users/rayculp/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/checkbox");
		
		try {
			
					Thread.sleep(1000);
					WebElement cB1 = driver.findElement(By.id("checkbox-1"));
					cB1.click();
				
					Thread.sleep(1000);
					WebElement cB2 = driver.findElement(By.cssSelector("input[value='checkbox-2']"));
					cB2.click();
					Thread.sleep(1000);
						
					WebElement cB3 = driver.findElement(By.cssSelector("input[value='checkbox-3']"));
					cB3.click();
					Thread.sleep(1000);
					driver.close();
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void RadioButton()
	{
		System.setProperty("webdriver.chrome.driver","/Users/rayculp/Documents/Selenium/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/radiobutton");
		
		WebElement rB1 = driver.findElement(By.id("radio-button-1"));
		rB1.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement rB2 = driver.findElement(By.cssSelector("input[value='option2']"));
		rB2.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement rB3 = driver.findElement(By.xpath("/html/body/div/div[3]/input"));
		rB3.click();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
		
	}
	
public void launchBrower() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rayculp/Documents/Selenium/chromedriver");
		driver =new ChromeDriver();
		driver.get("https://www.google.com/");
		
		/*
		 * Ways to find elements
		 * By.ClassName
		 *   .CssSelector
		 *   .Id
		 *   .Name
		 *   .XPath
		 * 
		 * 
		 */
		//WebElement element = driver.findElement(By.name("q"));
		WebElement element = driver.findElement(By.cssSelector("input[name='q']"));
		//WebElement element = driver.findElement(By.cssSelector("input[id='fakebox']"));
		element.sendKeys("Cheese!");
		element.submit();
		driver.quit();
		
	}
	
public void launchFormy() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/rayculp/Documents/Selenium/chromedriver");
		driver =new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/keypress");
		
		/*
		 * Ways to find elements
		 * By.ClassName
		 *   .CssSelector
		 *   .Id
		 *   .Name
		 *   .XPath
		 * 
		 * 
		 */
		WebElement element = driver.findElement(By.id("name"));
		element.click();
		element.sendKeys("Ray Culp");
		
		WebElement button = driver.findElement(By.id("button"));
		button.click();
		
		//element.submit();
		//driver.quit();
		
	}
public void Formyauto() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/rayculp/Documents/Selenium/chromedriver");
	driver =new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/autocomplete");
	//driver.findElement(By.className("btn btn-lg")).click();
	
	String currentURL = driver.getCurrentUrl();
	System.out.println(" "+currentURL);
	
	/*
	 * Ways to find elements
	 * By.ClassName
	 *   .CssSelector
	 *   .Id
	 *   .Name
	 *   .XPath
	 * 
	 * 
	 */
	WebElement autocomplete = driver.findElement(By.id("autocomplete"));
	autocomplete.sendKeys("919 Floresta Street");
	
	//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	
	
	WebDriverWait wait = new WebDriverWait(driver, 10); 
	WebElement result = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pac-item")));
	
	//WebElement result = driver.findElement(By.className("pac-item"));
	result.click();
	
	
	
	//element.sendKeys("Ray Culp");
	
	//WebElement button = driver.findElement(By.id("button"));
	//button.click();
	
	//element.submit();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
	
}
public void launchscroll() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/rayculp/Documents/Selenium/chromedriver");
	driver =new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/scroll");
	
	WebElement element = driver.findElement(By.id("name"));
	Actions act = new Actions(driver);
	
	act.moveToElement(element); 
	element.sendKeys("Ray Culp");
	WebElement date = driver.findElement(By.id("date"));
	date.sendKeys("01/01/2020");
	
	//driver.quit();
	
}

public void launchswitch() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/rayculp/Documents/Selenium/chromedriver");
	driver =new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/switch-window");
	
	WebElement newTbutton = driver.findElement(By.id("new-tab-button"));
	newTbutton.click();
	
	String origHandle =driver.getWindowHandle();
	
	
	for(String h1: driver.getWindowHandles()) {
		
		driver.switchTo().window(h1);
	}
	
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	driver.switchTo().window(origHandle);
	
	
	driver.quit();
	
}

public void launchswitch2() {
	
	System.setProperty("webdriver.chrome.driver", "/Users/rayculp/Documents/Selenium/chromedriver");
	driver =new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/switch-window");
	
	WebElement Abutton = driver.findElement(By.id("alert-button"));
	Abutton.click();
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	driver.quit();
	
}

public void launchmodal() {
	try {
	System.setProperty("webdriver.chrome.driver", "/Users/rayculp/Documents/Selenium/chromedriver");
	driver =new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/modal");
	
	WebElement Abutton = driver.findElement(By.id("modal-button"));
	Abutton.click();
	
	Thread.sleep(1000);
	
	WebElement closeButton = driver.findElement(By.id("close-button"));
	
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	js.executeScript("arguments[0].click();", closeButton);
	
	//js.executeAsyncScript("arguments[0].click();", closeButton);
	

	Thread.sleep(1000);
	
	driver.quit();
	
	
	
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	
}

public void launchdrag() {
	try {
	System.setProperty("webdriver.chrome.driver", "/Users/rayculp/Documents/Selenium/chromedriver");
	driver =new ChromeDriver();
	driver.get("https://formy-project.herokuapp.com/dragdrop");
	
	WebElement pic = driver.findElement(By.id("image"));
	
	WebElement box = driver.findElement(By.id("box"));
	
	
	
	Actions act = new Actions(driver);
	
	act.dragAndDrop(pic, box).build().perform();
	
	
	Thread.sleep(5000);
	
	driver.quit();
	
	
	
	}
	catch(InterruptedException e) {
		e.printStackTrace();
	}
	
}

}
