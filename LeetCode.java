package Testing.Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.Arrays;



public class LeetCode {

	public static void main(String[] args) throws InterruptedException, IOException, AWTException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrom.driver", "C:/Chrome Web Driver/chromedriver-win64/chromedriver-win64/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
		options.setExperimentalOption("useAutomationExtension", false);

		WebDriver driver = new ChromeDriver(options);
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		WebDriver driver = new ChromeDriver();
		driver.get("https://leetcode.com/accounts/login/");
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		Thread.sleep(30000);
		
		//Log-In Leetcode with Credetials
		driver.findElement(By.className("input__2o8B")).sendKeys("xxx"); //Enter you user id on the 'xxx'
		driver.findElement(By.id("id_password")).sendKeys("yyy"); //Enter your password on the 'yyy'
		driver.findElement(By.className("btn-content-container__2HVS")).click();
		
		//Traversing to problems page
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[text() = 'Problems']")).click();

		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class = 'truncate']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//button[text() = 'C++']")).click();
		driver.findElement(By.xpath("//div[text() ='Python3']")).click();
//		driver.findElement(By.xpath("//div[text() ='Java']")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("solutions_tab")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("div[class = 'relative rounded-md input_input-container__6l534 w-full'] input[placeholder = 'Search...']")).sendKeys("Python3");
//		driver.findElement(By.cssSelector("div[class = 'relative rounded-md input_input-container__6l534 w-full'] input[placeholder = 'Search...']")).sendKeys("Java");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text() = 'Python3']")).click();
//		driver.findElement(By.xpath("//div[text() = 'Java']")).click();
		Thread.sleep(5000);
		
		Actions actions = new Actions(driver);
//		actions.moveToElement(driver.findElement(By.cssSelector("code[class = 'language-java']"))).perform();
//        driver.findElement(By.cssSelector("svg[class=\"svg-inline--fa fa-clone absolute left-1/2 top-1/2 h-[1em] -translate-x-1/2 -translate-y-1/2 align-[-0.125em]\"]")).click();
		
//        Actions actions1 = new Actions(driver);
        Thread.sleep(5000);
        

//        actions.moveToElement(driver.findElement(By.cssSelector("code[class = 'language-java']"))).perform();
        actions.moveToElement(driver.findElement(By.cssSelector("code[class = 'language-python']"))).perform();
        
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("svg[class=\"svg-inline--fa fa-clone absolute left-1/2 top-1/2 h-[1em] -translate-x-1/2 -translate-y-1/2 align-[-0.125em]\"]")).click();
        
        
        driver.findElement(By.cssSelector("div[class = 'view-lines monaco-mouse-cursor-text']")).click();
        
//        Actions actions11 = new Actions(driver);
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
        
        Robot robot = new Robot();
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        driver.findElement(By.cssSelector("button[data-e2e-locator=\"console-run-button\"]")).click();
        
        Thread.sleep(30000);
        
        driver.findElement(By.cssSelector("button[data-e2e-locator=\"console-submit-button\"]")).click();
        
        
        System.out.println("Success!!");
	}
}
