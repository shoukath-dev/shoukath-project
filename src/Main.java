import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Main {
	
	public AndroidDriver<AndroidElement> galry() throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver;
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"android devices");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.android.gallery3d");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.android.gallery3d.app.Gallery");
		cap.setCapability("autoAcceptAlerts", true);
		driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		
		return driver;
	}
	public void show()
	{
		System.out.println("HEllo");
	}
	public static AndroidDriver<AndroidElement> cam() throws MalformedURLException
	{
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"android devices");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lge.camera");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lge.camera.app.CameraActivity");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
		
		
	}
	protected static AndroidDriver<AndroidElement> musicPlayer() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"android devices");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lge.music");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lge.music.MusicBrowserActivity");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	
	}
	protected static AndroidDriver<AndroidElement> fileManager() throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.ANDROID);
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"android devices");
		cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.lge.filemanager");
		cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.lge.filemanager.view.HomeActivity2");
		AndroidDriver<AndroidElement> driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
		return driver;
	
	}

}
