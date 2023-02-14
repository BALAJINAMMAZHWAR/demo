package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;

	// 1 BrowserLaunch
	public static WebDriver launchBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\firefox gecko driver\\geckodriver.exe");
			driver = new FirefoxDriver();

		}
		else if (browserName.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"\\EdgeDriver\\msedgedriver.exe");
			driver= new EdgeDriver();
			
		}
		driver.manage().window().maximize();
		return driver;
	}
	

	// 2 Url Load
	public static void launchUrl(String url) {
		driver.get(url);
	}
	

	// 3 CLoseTab
	public static WebDriver closeTab() {
		driver.close();
		return driver;
	}
	

	// 4 Close Window
	public static WebDriver quit() {
		driver.quit();
		return driver;

	}

	
	// 5 PassInput
	public static void passInput(WebElement element, String input) {
		element.sendKeys(input);
	}
	

	// 6 ClickOnElement
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	

	// 7 Clear
	public void deleteInput(WebElement element) {
		element.clear();
	}
	

	// 8 NavigateTo
	public static void navigateTo(String urlto) {
		driver.navigate().to(urlto);
	}
	

	// 9 NavigateBack
	public static void navigateBack() {
		driver.navigate().back();
	}

	// 10 Navigate Forward
	public static void navigateForward() {
		driver.navigate().forward();
	}
	

	// 11 Navigate Refresh
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}

	
	// 12 Get Window Handles
	public static void getWindowHandles() {

		driver.getWindowHandles();
	}
	

	// 13 Get Title
	public static void getTitle() {
		driver.getTitle();
	}

	
	// 14 Get Page Source
	public static void getPageSource() {
		// TODO Auto-generated method stub

	}

	
	// 15 Get Window Handle
	public static void getWindowHandle() {
		String handle = driver.getWindowHandle();
		System.out.println(handle);
	}

	
	// 16 Get Current URL
	public static void getCurrentUrl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

	
	// 17 Get Text
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}

	
	// 18 DropDown
	public static void dropDown(WebElement element, String type, String value, int index) {

		Select s = new Select(element);

		if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		} else if (type.equalsIgnoreCase("index")) {

			s.selectByIndex(index);
		} else if (type.equalsIgnoreCase("visibleText")) {
			s.selectByVisibleText(value);

		}
	}

	
	// 19 ScreenShot
	public static void screenshot(String loca) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ssa = ts.getScreenshotAs(OutputType.FILE);
		File des = new File(loca);
		FileUtils.copyFile(ssa, des);

	}

	
	// 20 RadioButton
	public static void radioButton(WebElement element) {
		element.click();
	}

	
	// 21 Scroll Up and Down
	public static void scrollUpDown(String sud, WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(sud, element);
	}

	
	// 22 Implicit Wait
	public static void wait(int timeOutInSeconds) {
		driver.manage().timeouts().implicitlyWait(timeOutInSeconds, TimeUnit.SECONDS);
	}

	
	// 23 Alert Accept
	public static void alertAccept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	
	// 24 Alert Dismiss
	public static void alertDismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}

	
	// 25 Alert DialogueBox SendKeys
	public static void alertDialogueBoxSendKeys(String input) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(input);
	}

	
	// 26 Get Alert Text
	public static void getAlertText() {
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());

	}

	
	// Actions Object
	private static Actions actionsObject() {
		Actions ac = (Actions) driver;
		return ac;
	}

	// 27 Actions Drag and Drop
	public static void drapAndDrop(WebElement element, WebElement element1) {
		actionsObject().dragAndDrop(element, element1).click().build().perform();

	}

	
	// 28 Actions Click
	public static void actionsClick(WebElement element) {
		actionsObject().click(element).perform();
	}

	
	// 29 Actions Move to Element
	public static void moveToElement(WebElement element) {
		actionsObject().moveToElement(element).perform();
	}

	
	// 30 Actions Context Click
	public static void contextClick(WebElement element) {
		actionsObject().contextClick(element).perform();
	}

	
	// 31 Actions Double Click
	public static void doubleClick(WebElement element) {
		actionsObject().doubleClick(element).perform();
	}

	
	// Robot Object
	public static Robot robotObject() throws AWTException {
		Robot r = new Robot();
		return r;
	}

	// 32 Robots Up Key Press and Release

	public static void upKey() throws AWTException {
		robotObject().keyPress(KeyEvent.VK_KP_UP);
		robotObject().keyRelease(KeyEvent.VK_KP_UP);
	}

	
	// 33 Robots Down Key Press and Release
	public static void downKey() throws AWTException {
		robotObject().keyPress(KeyEvent.VK_DOWN);
	}
	
	
	// 34 Get Options

	public static void getOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> optionslist = s.getOptions();
		for (WebElement set : optionslist) {
			System.out.println(set.getText());
		}

	}

	
	// 35 Get First Selected Option
	public static void getFirstSelectedOption(WebElement element) {
		Select s = new Select(element);
		WebElement fso = s.getFirstSelectedOption();
		System.out.println(fso.getText());
	}
	
	
	// 36 Get All Selected Options

	public static void getAllSelectedOption(WebElement element) {
		Select s = new Select(element);
		List<WebElement> aso = s.getAllSelectedOptions();
		for (WebElement listofselected : aso) {
			System.out.println(listofselected.getText());
		}
	}
	
	
	// 37 WebTable All Data

	public static void allDatasWebTable(List<WebElement> elements) {
		List<WebElement> datas = elements;
		for (WebElement alldatas : datas) {
			System.out.println(alldatas.getText());
		}
	}
	
	
	// 38 WebTable ColumnData
	public static void columnData(List<WebElement>elements) {
List<WebElement>cd= elements;
for (WebElement columnData : cd) {
	System.out.println(columnData.getText());
}
	}
	
	
	// 39 WebTable RowData
	public static void rowData(List<WebElement>elements) {
		List<WebElement>rd= elements;
		for (WebElement rowData : rd) {
			System.out.println(rowData.getText());
		}
			}
	
	
	//40 Web Table SingleData
	public static void singleData(WebElement element) {
System.out.println(element.getText());
	}
	
	
	//41 Is Enabled
	public static void isEnabled(WebElement element) {
		System.out.println(element.isEnabled());
	}
	
	
	//42 Is Displayed
	public static void isDisplayed(WebElement element) {
		System.out.println(element.isDisplayed());
	}
	
	
	//43 Is Selected
	public static void isSelected(WebElement element) {
		System.out.println(element.isSelected());
		}
	
	
	 //44 Is Multiple
	 public static void ismultiple(WebElement element) {
	 Select s = new Select(element);
	 System.out.println(s.isMultiple());
	 }
	 
	 
	 //45 Frame Id
	 public static void frameId(String id) {
driver.switchTo().frame(id);
	}
	 
	 
	 //46 Frame Index
	 
	 public static void frameIndex(int index) {

		 driver.switchTo().frame(index);
	}
	 
	 
	 //47 Frame WebElement
	 
	 public static void frameWebElement(WebElement element) {
driver.switchTo().frame(element);
	}
	 
	 
	 //48 Frame Leave
	 public static void frameLeave() {
driver.switchTo().defaultContent();
	}
	 
	 
	 // 49 Outer Frame
	 public static void outerFrame() {
driver.switchTo().parentFrame();
	}
}
