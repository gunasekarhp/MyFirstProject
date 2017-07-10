package modules;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pageobjects.ObjectRepository;

public class Google_ACTION {
	public WebDriver webDriver;
	ObjectRepository OR = new ObjectRepository();

	public Google_ACTION(WebDriver driver){

		this.webDriver = driver;

	}

	public void search_for_text(String text){
		webDriver.findElement(OR.text).sendKeys(text);
		webDriver.findElement(OR.text).sendKeys(Keys.ENTER);
		System.out.print("hi");
	}
}
