package Com.Cen.Utilities;

import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.io.File;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ReadConfig {
Properties pro;
public ReadConfig(){
	File src=new File("./Configuration/config.properties");
	try {
		FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		
	}catch(Exception e) {
		System.out.println("Exception is"+e.getMessage());
	}
}

public String BaseURL() {
	String str=pro.getProperty("baseURL");
	return str;
	
}
public String UserID() {
	String UserID=pro.getProperty("userName");
	return UserID;
}
public String Password() {
	String password=pro.getProperty("password");
	return password;
}
public static String GetCurrentDateTime() {
	DateFormat CustomFormate=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
	Date currentdate=new Date();
	return CustomFormate.format(currentdate);
	
}
public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
    //below line is just to append the date format with the screenshot name to avoid duplicate names		
    String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
TakesScreenshot ts = (TakesScreenshot) driver;
File source = ts.getScreenshotAs(OutputType.FILE);
    //after execution, you could see a folder "FailedTestsScreenshots" under src folder
String destination = System.getProperty("user.dir") + "/Screenshots/"+screenshotName+dateName+".png";
File finalDestination = new File(destination);
FileUtils.copyFile(source, finalDestination);
    //Returns the captured file path
return destination;
}
}
