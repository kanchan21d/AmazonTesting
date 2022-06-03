package Utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	public static void captureScreenshotAs(WebDriver driver,String screenshotName) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		SimpleDateFormat ac=new SimpleDateFormat("dd-MM-YYYY_HH mm ss");
		String timestrap=ac.format(d);
		File destination=new File("test-output\\screenshot\\image"+"_"+screenshotName+"_"+timestrap+".png");
		FileHandler.copy(source, destination);
	}
	

}
