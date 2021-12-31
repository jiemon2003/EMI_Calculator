import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
@Listeners(ITestListener.class)

public class EMI_Calculator_Test {

    static AppiumDriver<MobileElement> driver;

    @BeforeTest
    public void AndroidSetup() throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "Android");
        dc.setCapability("deviceName", "Redmi Note_7");
        dc.setCapability("udid", "b8cf3b7");
        dc.setCapability("PlatformVersion", "10");
        dc.setCapability("appPackage", "com.continuum.emi.calculator");
        dc.setCapability("appActivity", "com.finance.emicalci.activity.Splash_screnn");
        dc.setCapability("autoGrantPermissions", "true");
        URL url = new URL ("http://127.0.0.1:4723/wd/hub");
        //driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), dc);
        driver = new AppiumDriver<MobileElement>(url, dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.out.println("Application started......");
    }

    @Test(priority = 0)
    public void Enter_Loan_in_the_amount_field() throws Exception {

        MyScreenRecorder.startRecording("");
        Thread.sleep(2000);

        driver.findElement(By.id("com.sec.android.app.popupcalculator:id/bt_08")).click();

        Thread.sleep(2000);

        MyScreenRecorder.stopRecording();


    }

    //@Test(priority = 1)
    public static void Enter__Interest_Percent_rate_in_the_interest_field() throws Exception {

    }

    //@Test(priority = 2)
    public static void Enter_period_in_the_period_field_in_years() throws Exception {


    }

    //@Test(priority = 3)
    public static void Enter_pFee_percent_for_the_processing_fee() throws Exception {


    }

    //@Test(priority = 4)
    public static void And_tap_on_the_calculate_button() throws Exception {


    }

    //@Test(priority = 5)
    public synchronized void Then_Verify_that_the_detail_results_are_correct() throws Exception {


    }








    @AfterTest
    public void close() {

        driver.quit();
    }




}
