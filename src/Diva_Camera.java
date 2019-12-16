import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Diva_Camera extends Main {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver=cam();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String a=driver.getCapabilities().getCapability("deviceName").toString();
		System.out.println(a);
	
		try
		{
		System.out.println("OK found");
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		driver.pressKeyCode(AndroidKeyCode.BACK);
		}
		catch(Exception e)
		{
			System.out.println("demo page not found");
		}
		try
		{
		driver.findElementById("com.lge.camera:id/cancel_button").click();
		//Capture button (count=1)
		}
		catch (Exception e) {
		System.out.println("location dialog box dint appear");
			// TODO: handle exception
		}
		
		
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count=1");
		
		
		//Settings button
		waitmethd("com.lge.camera:id/quick_button_setting_expand",driver);
		driver.findElementById("com.lge.camera:id/quick_button_setting_expand").click();
		//timer option
		driver.findElementByXPath("(//android.widget.ImageButton[@content-desc='Timer'])").click();
		
	
		//3 sec radio button
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='3 sec']").click();
		System.out.println("timer chnged to 3 sec");
		
		//back button
		driver.pressKeyCode(AndroidKeyCode.BACK);
				
		//Capture Count:2
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count=2");
		
		
		
		//*************************Zooming concept Not Done*******************\/
		//TouchAction t=new TouchAction(driver);
		//MobileElement m=(MobileElement)driver.findElementByClassName("android.view.View");
		//WebElement w=driver.findElementByClassName("android.view.View");
		//t.s
		//////////////////////////////////////////////////////////////////////////
		

		//////////////////////////////changing timer to 0 sec//////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_setting_expand",driver);
		driver.findElementById("com.lge.camera:id/quick_button_setting_expand").click();
		driver.findElementByXPath("(//android.widget.TextView[@content-desc='Timer'])").click();
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Off']").click();
		System.out.println("changing timer to 0 sec");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		///////////////////////////////////////////////////////////////////////////////////		
	
		
		////////////////To turn on the flash light//////////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_flash",driver);
		driver.findElementById("com.lge.camera:id/quick_button_flash").click();
		System.out.println("flash turn on success");
		/////////////////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////Capture count:3//////////////////////////////
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count=3");
		//////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////changing to flash auto mode/////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_flash",driver);
		//driver.findElementById("com.lge.camera:id/quick_button_setting_expand").click();
		driver.findElementById("com.lge.camera:id/quick_button_flash").click();
		System.out.println("auto flash success");
		//////////////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////Capture count:4//////////////////////////////
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count:4");
		//////////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////Capture count:5//////////////////////////////
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count:5");
		//////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////changing to flash normal mode/////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_flash",driver);
		//driver.findElementById("com.lge.camera:id/quick_button_setting_expand").click();
		driver.findElementById("com.lge.camera:id/quick_button_flash").click();
		System.out.println("changing to flash normal mode");
		//////////////////////////////////////////////////////////////////////////////
		
		/////////////////////////video record///////////////////////////////////
		driver.findElementById("com.lge.camera:id/shutter_top_comp").click();
		System.out.println("video record started");
		slp();
		driver.findElementById("com.lge.camera:id/quick_button_flash").click();
		System.out.println("video flash on");
		slp();
		driver.findElementById("com.lge.camera:id/quick_button_flash").click();
		System.out.println("video flash off");
		slp();
		driver.findElementById("com.lge.camera:id/shutter_top_comp_type").click();
		////////////////////////////////////////////////////////////////////////
		
		//////////////////////////////Capture count:6//////////////////////////////
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count:6");
		//////////////////////////////////////////////////////////////////////////
		
		
		////////////////////////moving to front cam///////////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_swap_camera",driver);
		//driver.findElementById("com.lge.camera:id/quick_button_setting_expand").click();
		driver.findElementById("(com.lge.camera:id/quick_button_swap_camera").click();
		System.out.println("front cam success");
		//////////////////////////////////////////////////////////////////////////////
		
		Thread.sleep(2000);
		
		//////////////////////////////Capture count:5//////////////////////////////
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count:5");
		//////////////////////////////////////////////////////////////////////////		
		
		
		
	}

	public static void smlslp()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Thread Sleep error");
		}
	}
	public static void slp()
	{
		try
		{
			Thread.sleep(5000);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Thread Sleep error");
		}
	}
	
	public static void waitmethd(String a,AndroidDriver<AndroidElement> driver) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(a)));
		
	}
	
}
