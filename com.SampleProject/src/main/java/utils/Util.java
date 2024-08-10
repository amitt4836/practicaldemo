package utils;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import base.TestBase;

public class Util extends TestBase {
	
	public static void dropdown(WebElement ele, String value) {
		Select select = new Select(ele);
		select.selectByValue(value);
	}
	
	public static void takescreenshot() throws IOException {
		File ts = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/photo1.png");
		FileHandler.copy(ts, destination);
		
		
	}

}
