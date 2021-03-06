package test_file;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class b_checkout extends b_base{

	@Test
	public void CheckoutSKU() throws InterruptedException, MalformedURLException {
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
	    
	    driver.findElementByXPath("//android.widget.TextView[@text='Home']").click();
	    driver.findElementById("com.bukalapak.android.dfbase:id/searchBarContainerMV").click();
	    driver.findElementById("com.bukalapak.android:id/iconAV").click();
	    Actions action = new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();
	    driver.findElementByXPath("//android.widget.TextView[@text='Sepeda 27.5 MTB Atlantis 7Speeds Cakram']").click();
	    driver.findElementByXPath("//android.widget.Button[@text='Beli Sekarang']").click();
	    driver.findElementById("com.bukalapak.android:id/buttonSmallAV").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Bayar sekarang']").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Belum pilih metode pembayaran']").click();
	    driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Transfer Bank Manual\"));");
	    driver.findElementByXPath("//android.widget.TextView[@text='Transfer Bank Otomatis']").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='BCA']").click();
	    driver.findElementById("com.bukalapak.android:id/trackingButtonAV").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Bayar sekarang']").click();
	    driver.findElementByXPath("//android.widget.TextView[@text='Lanjut Pembayaran']").click();
	    String checkout = driver.findElementByXPath("//android.widget.TextView[@text='80008121575272556']").getText();
	    Assert.assertEquals("80008121575272556", checkout);
	}

}
