package test_file;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class b_login extends b_base {

	@Test //Negative
	public void InvalidEmail() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Close\"]").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Akun']").click();
	    driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
	    driver.findElementByXPath("//android.widget.EditText[@text='Masukkan di sini, ya']").sendKeys("testing11243@gmail.com");
	    driver.findElementByXPath("//android.widget.TextView[@text='Lanjut']").click();
	    driver.findElementByXPath("//android.widget.EditText[@text='Masukkan password di sini']").sendKeys("123");
	    driver.findElementById("com.bukalapak.android:id/buttonAV").click();
	    String failmsg = driver.findElementByXPath("//android.widget.TextView[@text='Password yang kamu masukkan salah. Coba ulangi lagi, ya']").getText();
	    Assert.assertEquals("Password yang kamu masukkan salah. Coba ulangi lagi, ya", failmsg);
	}
	
	@Test //Positive
	public void ValidEmail() throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = capabilities();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Close\"]").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Akun']").click();
	    driver.findElementByXPath("//android.widget.Button[@text='Login']").click();
	    driver.findElementByXPath("//android.widget.EditText[@text='Masukkan di sini, ya']").sendKeys("testing11243@gmail.com");
	    driver.findElementByXPath("//android.widget.TextView[@text='Lanjut']").click();
	    driver.findElementByXPath("//android.widget.EditText[@text='Masukkan password di sini']").sendKeys("dadu123");
	    driver.findElementById("com.bukalapak.android:id/buttonAV").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Kenalan Dong']").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Nanti Saja']").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Akun']").click();
	    String success  = driver.findElementByXPath("//android.widget.TextView[@text='Testing']").getText();
	    Assert.assertEquals("Testing", success);
	}
}