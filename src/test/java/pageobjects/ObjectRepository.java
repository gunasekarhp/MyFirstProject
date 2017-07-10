package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ObjectRepository {
	private WebDriver driver;
	public static boolean bResult;

	public ObjectRepository(){}

	public By text = By.xpath("//*[@id=\"lst-ib\"]");

}
