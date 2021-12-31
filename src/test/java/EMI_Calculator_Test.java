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
        dc.setCapability("deviceName", "Redmi_Note7");
        dc.setCapability("udid", "42001cc6f0a97535");
        dc.setCapability("PlatformVersion", "9.0.0");
        dc.setCapability("appPackage", "com.sec.android.app.popupcalculator");
        dc.setCapability("appActivity", "com.sec.android.app.popupcalculator.Calculator");
        dc.setCapability("autoGrantPermissions", "true");
        driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), dc);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(priority = 0)
    public static void Enter_Loan_in_the_amount_field() throws Exception {
        MyScreenRecorder.stopRecording();

        MyScreenRecorder.stopRecording();

    }

    @Test(priority = 1)
    public static void Enter__Interest_Percent_rate_in_the_interest_field() throws Exception {
        MyScreenRecorder.stopRecording();

        MyScreenRecorder.stopRecording();

    }

    @Test(priority = 2)
    public static void Enter_period_in_the_period_field_in_years() throws Exception {
        MyScreenRecorder.stopRecording();

        MyScreenRecorder.stopRecording();

    }

    @Test(priority = 3)
    public static void Enter_pFee_percent_for_the_processing_fee() throws Exception {
        MyScreenRecorder.stopRecording();

        MyScreenRecorder.stopRecording();

    }

    @Test(priority = 4)
    public static void And_tap_on_the_calculate_button() throws Exception {
        MyScreenRecorder.stopRecording();

        MyScreenRecorder.stopRecording();

    }

    @Test(priority = 5)
    public static void Then_Verify_that_the_detail_results_are_correct() throws Exception {
        MyScreenRecorder.stopRecording();

        MyScreenRecorder.stopRecording();

    }








    @AfterTest
    public static void close() {
        driver.quit();
    }




}
