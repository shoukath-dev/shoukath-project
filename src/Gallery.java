
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Gallery extends Main {
	
	static List<AndroidElement> ls;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		Main m=new Main();
		AndroidDriver<AndroidElement> driver=m.galry();
		
		try
		{
		System.out.println("OK found");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		}
		catch(Exception e)
		{
			System.out.println("demo page not found");
		}
		String str=driver.getPageSource();
		System.out.println(str);
		//Thread.sleep(5000);
		
		TouchAction t=new TouchAction(driver);
		t.press(388, 208).release().perform();
		
		
		/*
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.RelativeLayout[@package='com.android.gallery3d'")));
				
		//driver.findElementById("com.android.packageinstaller:id/permission_allow_button").click();
		//driver.findElementById("android:id/button1").click();
		ls=driver.findElementsByClassName("android.view.View");
		System.out.println(ls.size());
		//driver.findElementByClassName("android.view.View").click();
		//driver.findElementByXPath("(//android.widget.TextView)[2]").click();
		//driver.findElementByAndroidUIAutomator("class(\"android.widget.ImageButton\")").click();
		//driver.findElementByClassName("android.widget.ImageButton").click();
		//driver.findElementsByClassName("android.widget.TextView").get(0).click();
		//driver.findElementByAndroidUIAutomator("resource-id(\"com.android.gallery3d:id/action_camera\")");
		//driver.findElementById("com.android.gallery3d:id/action_camera").click();
		 
		 */
	}
}
