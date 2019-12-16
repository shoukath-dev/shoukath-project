import java.net.MalformedURLException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileBy.ByAccessibilityId;
import io.appium.java_client.MobileElement;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

public class Camera extends Main {
	
		
	public static void main(String[] args) throws Exception {
		AndroidDriver<AndroidElement> driver=cam();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String a=driver.getCapabilities().getCapability("deviceName").toString();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		System.out.println(a);
		Camera camera = new Camera();
		camera.test();
		try
		{
		System.out.println("OK found");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		}
		catch(Exception e)
		{
			System.out.println("demo page not found");
		}
		try
		{
		driver.findElementById("com.lge.camera:id/cancel_button").click();
		//driver.pressKeyCode(AndroidKeyCode.BACK);
		//Capture button (count=1)
		}
		catch (Exception e) {
		System.out.println("location dialog box dint appear");
			// TODO: handle exception
		}
		
		//String str=driver.getPageSource();
		//System.out.println(str);
		
		
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver,wait);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count=1");
		
		
		WebElement we=driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type");
		int x1= we.getLocation().getX();
		int y1= we.getLocation().getY();
		 
		try {
		System.out.println("Zoom started");
		TouchAction fingr1=new TouchAction(driver);
		fingr1.press(380, 1000).moveTo(380,300).release();
		TouchAction fingr2=new TouchAction(driver);
		fingr2.press(400, 1000).moveTo(400,1500).release();
		MultiTouchAction action=new MultiTouchAction(driver);
		action.add(fingr1).add(fingr2).perform();
		driver.performMultiTouchAction(action);
		Thread.sleep(800);
		System.out.println("Zoom ended");
		
		//////////////////////////testing///////////////////////////////
		
		System.out.println("zoom point=\t"+driver.findElementById("com.lge.camera:id/zoom_cursor").getCenter());
		System.out.println("cursor point\t"+driver.findElementByAccessibilityId("Zoom control bar").getLocation());
		
		int x3=driver.findElementById("com.lge.camera:id/zoom_cursor").getCenter().getX();
		int y3=driver.findElementById("com.lge.camera:id/zoom_cursor").getCenter().getY();
		
		System.out.println("x=\t"+x3+"y=\t"+y3);
		TouchAction touchAction=new TouchAction(driver);
		touchAction.press(x3,y3).waitAction(Duration.ofSeconds(2)).moveTo(x3+200,y3).release().perform();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("zoom failed");
		}
		
		///////////////////////////////////////////////////////////////////////
		//Settings button
		waitmethd("com.lge.camera:id/quick_button_setting_expand",driver,wait);
		
		
		driver.findElementById("com.lge.camera:id/quick_button_setting_expand").click();
		
		
		//timer option
		//wait.until(ExpectedConditions.presenceOfElementLocated(ByAccessibilityId("Timer")));
		driver.findElementByAccessibilityId("Timer").click();
		
	
		//3 sec radio button
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='3 sec']").click();
		System.out.println("timer chnged to 3 sec");
		
		//back button
		driver.pressKeyCode(AndroidKeyCode.BACK);
				
		//Capture Count:2
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver,wait);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count=2");
		
		
		
		//*************************Zooming concept Not Done*******************\/
		//TouchAction t=new TouchAction(driver);
		//MobileElement m=(MobileElement)driver.findElementByClassName("android.view.View");
		//WebElement w=driver.findElementByClassName("android.view.View");
		//t.s
		//////////////////////////////////////////////////////////////////////////
		

		//////////////////////////////changing timer to 0 sec//////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_setting_expand",driver,wait);
		driver.findElementById("com.lge.camera:id/quick_button_setting_expand").click();
		driver.findElementByAccessibilityId("Timer").click();
		driver.findElementByXPath("//android.widget.CheckedTextView[@text='Off']").click();
		System.out.println("changing timer to 0 sec");
		driver.pressKeyCode(AndroidKeyCode.BACK);
		///////////////////////////////////////////////////////////////////////////////////		
	
		
		////////////////To turn on the flash light//////////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_flash",driver,wait);
		driver.findElementById("com.lge.camera:id/quick_button_flash").click();
		System.out.println("flash turn on success");
		/////////////////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////Capture count:3//////////////////////////////
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver,wait);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count=3");
		//////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////changing to flash auto mode/////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_flash",driver,wait);
		//driver.findElementById("com.lge.camera:id/quick_button_setting_expand").click();
		driver.findElementById("com.lge.camera:id/quick_button_flash").click();
		System.out.println("auto flash success");
		//////////////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////Capture count:4//////////////////////////////
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver,wait);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count:4");
		//////////////////////////////////////////////////////////////////////////
		
		
		//////////////////////////////Capture count:5//////////////////////////////
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver,wait);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count:5");
		//////////////////////////////////////////////////////////////////////////
		
		
		///////////////////////changing to flash normal mode/////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_flash",driver,wait);
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
		waitmethd("com.lge.camera:id/shutter_top_comp_type", driver,wait);
		driver.findElementById("com.lge.camera:id/shutter_top_comp_type").click();
		////////////////////////////////////////////////////////////////////////
		
		//////////////////////////////Capture count:6//////////////////////////////
		waitmethd("com.lge.camera:id/shutter_bottom_comp_type",driver,wait);
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count:6");
		//////////////////////////////////////////////////////////////////////////
	
		
		////////////////////////moving to front cam///////////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_setting_expand",driver,wait);
		 TouchAction t=new TouchAction(driver);
		 t.longPress(x1, y1-500).moveTo(x1+100, y1-800).release().perform();
		System.out.println("front cam success");
		//////////////////////////////////////////////////////////////////////////////
		
		/*
		TouchAction fingr1=new TouchAction(driver);	
		fingr1.press(x1, y1-500).moveTo(x1, y1-600);
		TouchAction fingr2=new TouchAction(driver);
		fingr2.press(x1, y1-800).moveTo(x1, y1-700);
		MultiTouchAction action=new MultiTouchAction(driver);
		action.add(fingr1).add(fingr2).perform();
		Thread.sleep(800);
		*/
		
		///////////////////////////////////////////////////////////////////////////////
		
		Thread.sleep(2000);
		
		//////////////////////////////Capture count:5//////////////////////////////
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count:7");
		//////////////////////////////////////////////////////////////////////////	
		
		///////////////////////////flash on front cam/////////////////////////////
		waitmethd("com.lge.camera:id/quick_button_light_frame", driver, wait);
		driver.findElementByAccessibilityId("Switch to flash off, on").click();
		//driver.findElement(By.id("com.lge.camera:id/quick_button_light_frame")).click();
		System.out.println("flash on front cam");
		//////////////////////////////////////////////////////////////////////////

		//////////////////////////////Capture count:6//////////////////////////////
		driver.findElementById("com.lge.camera:id/shutter_bottom_comp_type").click();
		System.out.println("Capture count:8");
		//////////////////////////////////////////////////////////////////////////	
		

		driver.quit();
		
	}
	
	private void test() {
		
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
	
	public static void waitmethd(String a,AndroidDriver<AndroidElement> driver,WebDriverWait wait) {
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(a)));
		
	}
	
}
