import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MusicPlayer{

	private static Object finaly;

	public void MoveMusic() throws IOException
	{
	Process p=Runtime.getRuntime().exec("cmd /c D:\\MUSIc\\push_music.bat");
	InputStream is = p.getInputStream();
	int i = 0;
	while( (i = is.read() ) != -1)
	{
	//System.out.print("song"+i);
	}
	}
	
	public static void main(String[] args) throws Exception {
		
		
		//MusicPlayer ms=new MusicPlayer();
		//ms.MoveMusic();
		
		
		Thread.sleep(40000);
		AndroidDriver<AndroidElement> driver= Main.musicPlayer();
		WebDriverWait wait=new WebDriverWait(driver, 10);
		System.out.println("music player opened");
		
		
		MusicPlayer.testSample(driver);
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("android.widget.ImageButton"))).click();
		System.out.println("menu clicked");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='Playlists']"))).click();
		System.out.println("playlist clicked");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.lge.music:id/fab_add"))).click();
		System.out.println("addplaylist clicked");
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("com.lge.music:id/playlist")));
		driver.findElement(By.id("com.lge.music:id/playlist")).clear();
		driver.findElement(By.id("com.lge.music:id/playlist")).sendKeys("newPlaylist");
		System.out.println("playlist name sent");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.lge.music:id/create"))).click();
		System.out.println("save clicked");
		try {
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("android.widget.CheckedTextView")));
		driver.findElements(By.className("android.widget.CheckedTextView")).get(2).click();
		driver.findElements(By.className("android.widget.CheckedTextView")).get(3).click();
		driver.findElements(By.className("android.widget.CheckedTextView")).get(4).click();
		driver.findElements(By.className("android.widget.CheckedTextView")).get(5).click();
		System.out.println("4 songs selected");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[@text='ADD']"))).click();
		System.out.println("playlist creation success");
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("playlst alrdy prsnt");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.lge.music:id/cancel"))).click();
			
		}
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.TextView[@text='newPlaylist']"))).click();
		System.out.println("created playlist clicked");
		driver.findElements(By.id("com.lge.music:id/line1")).get(0).click();
		System.out.println(driver.getPageSource());
		
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.lge.music:id/progress"))).getLocation());
		TouchAction t=new TouchAction(driver);
		t.tap(0, 1080).getClass();
		Thread.sleep(10000);
		
		try {
		
		t.tap(30, 1080).perform();
		
		System.out.println("Success");
		}
		catch(Exception e)
		{
			System.out.println("NOt Found");
		}
		
		Thread.sleep(10000);
		
		/*
		for(int i=0;i<100;i++)
		{
			int x=10,y=1000+i;
			try {
				t.tap(x, y).perform();
				System.out.println("clicked @\t"+"("+x+","+y+")");
				}
				catch(Exception e)
				{
					System.out.println("dint fount");
				}
			
		}		
		*/
		driver.quit();
		
		
		
	}

	public static void testSample(AndroidDriver<AndroidElement> driver) throws InterruptedException
	{
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.lge.music:id/line1"))).click();
		
		System.out.println(wait.until(ExpectedConditions.presenceOfElementLocated(By.id("com.lge.music:id/progress"))).getLocation());
		Thread.sleep(10000);
		TouchAction t=new TouchAction(driver);
		for(int i=1;i<10;i++)
		{
		t.tap(0, 1080+i).perform();
		int n=1080+i;
		System.out.println("y="+n);
		Thread.sleep(3000);
		}
		
		driver.quit();
		
	}
	

}
