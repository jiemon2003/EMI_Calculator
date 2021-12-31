import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class EMI_Calculator_Test {

    static AndroidDriver driver;

    @BeforeTest
    public static void AndroidSetup() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "Galaxy_J4");
        dc.setCapability("udid", "42001cc6f0a97535");
        dc.setCapability("PlatformVersion", "9.0.0");
        dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        dc.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        dc.setCapability("autoGrantPermissions", "true");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 0)
    public static void Add_Operation() throws Exception {
        MyScreenRecorder.stopRecording();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Plus\"]")).click();
        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_01")).click();
        driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Equal\"]")).click();
        MyScreenRecorder.stopRecording();

    }

    @AfterTest
    public static void close() {
        driver.quit();
    }




}
