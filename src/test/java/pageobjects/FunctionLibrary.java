package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FunctionLibrary {
	public WebDriver webDriver;

	public FunctionLibrary(WebDriver driver){
		this.webDriver = driver;
	}

	public void Click(By locator){
		webDriver.findElement(locator).click();
	}

	public void type(By locator,String text){
		webDriver.findElement(locator).sendKeys(text);
	}

}
