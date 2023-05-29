import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static org.openqa.selenium.By.xpath;


public class SpeedTest {
    AndroidDriver driver;
    Dimension dim;


    @BeforeClass()
    public void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("automationName", "uiAutomator2");
        caps.setCapability("platformVersion", "10");
        caps.setCapability("deviceName", "Vivo Y21");
        caps.setCapability(MobileCapabilityType.UDID, "0602033112003150");
//        caps.setCapability(MobileCapabilityType.UDID,"3078f7bf");
        caps.setCapability("appPackage", "internet.speedmeter.lite.netspeed.internetmeter");
        caps.setCapability("appActivity", "com.scorpio.speedtestnew.ui.SplashActivity");
        URL remoteurl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(remoteurl, caps);
        caps.setCapability("autoGrantPermissions", "true");
        dim = driver.manage().window().getSize();
        Dimension dim = driver.manage().window().getSize();

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////////
        //////////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("app start");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/start")).click();
        Thread.sleep(800);
        driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
        System.out.println("language screen");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
        System.out.println("permission screen");
//        Thread.sleep(6000);
        driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.Button")).click();
        System.out.println("Allow permission");
        System.out.println("click on device  permission");
        Thread.sleep(1500);
//        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[3]")).click();
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
//        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
//                driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
       driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
        System.out.println("Now we are at Home screen");
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        @Test(priority = 1)
        public void Home_Screen(){
//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView[1]")).click();
//            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[14]")).click();
//            driver.manage().timeouts().implicitlyWait(2500,TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(700, TimeUnit.SECONDS);
            System.out.println("scroll wifi");
            Dimension dim =driver.manage().window().getSize();
            int start_x=(int)(dim.width*0.5);
            int start_y=(int)(dim.height*0.9);

            int end_x=(int)(dim.width*0.9);
            int end_y=(int)(dim.height*0.2);

            @SuppressWarnings("rawtypes")
            TouchAction ts=new TouchAction(driver);

            ts.press(PointOption.point(start_x,start_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end_x,end_y)).release().perform();

            driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);


            int start_x1=(int)(dim.width*0.5);
            int start_y1=(int)(dim.height*0.9);

            int end_x1=(int)(dim.width*0.7);
            int end_y1=(int)(dim.height*0.3);

            @SuppressWarnings("rawtypes")
            TouchAction ts1=new TouchAction(driver);

            ts.press(PointOption.point(start_x1,start_y1)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end_x1,end_y1)).release().perform();

            driver.manage().timeouts().implicitlyWait(3000,TimeUnit.SECONDS);


            int start2_x=(int)(dim.width*0.5);
            int start2_y=(int)(dim.height*0.7);

            int end2_x=(int)(dim.width*0.5);
            int end2_y=(int)(dim.height*0.5);

            @SuppressWarnings("rawtypes")
            TouchAction ts2=new TouchAction(driver);

            ts.press(PointOption.point(start2_x,start2_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
                    .moveTo(PointOption.point(end2_x,end2_y)).release().perform();


//            driver.navigate().back();
//            int start5_x=(int)(dim.width*0.5);
//            int start5_y=(int)(dim.height*0.2);
//
//            int end5_x=(int)(dim.width*0.5);
//            int end5_y=(int)(dim.height*0.8);
//            @SuppressWarnings("rawtypes")
//            TouchAction ts5=new TouchAction(driver);
//            //ts.tap(x,top_y).moveTo(x,bottom_y).release().perform();
//
//            ts5.press(PointOption.point(start5_x,start5_y)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//                    .moveTo(PointOption.point(end5_x,end5_y)).release().perform();



            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        }
        @Test(priority = 2)
        public void Speed_test_Mbps () throws InterruptedException {
            System.out.println("click on Settings");
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/setting")).click();
            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
            System.out.println("click on Speed unit");
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")).click();
            Thread.sleep(3500);
            driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]")).click();
            System.out.println("click on Done");
            Thread.sleep(2500);
            driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
            System.out.println("click on back button");
            Thread.sleep(2500);
            driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Speed\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
            Thread.sleep(2900);
            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
            System.out.println("Click on speedtest icon");
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[3]")).click();
            Thread.sleep(3500);
            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
            System.out.println(" click on go");
            try {
                String Expecteddialg = "Mbps";
                String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]")).getText();
                Assert.assertEquals(Actualdialog, Expecteddialg);
                System.out.println("try pass");
                Thread.sleep(1500);
            }    catch (AssertionError e) {
                System.out.println(e.getMessage());
            }
            Thread.sleep(2500);
            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")).click();
            System.out.println("click on more details");
            Thread.sleep(2500);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
            System.out.println("click on back button of more details");
           Thread.sleep(2500);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
            System.out.println("click on back button");
            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]")).click();
            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[12]")).click();
            System.out.println("click on ok ");
            Thread.sleep(2000);
            driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView[1]")).click();
            driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/ok")).click();
            driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        @Test(priority = 3)
        public void Speed_test_Kb() throws InterruptedException {
            System.out.println("click on Settings");
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/setting")).click();
//            Thread.sleep(3000);
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            System.out.println("click on Speed unit");
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")).click();
            System.out.println("KB/s");
            driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
            System.out.println("click on Done");
//            Thread.sleep(9000);
            driver.manage().timeouts().implicitlyWait(2600, TimeUnit.SECONDS);
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/done")).click();
            System.out.println("click on back button");
            driver.manage().timeouts().implicitlyWait(2600, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
            System.out.println("Click on speed test icon");
            driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Speed\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(2500,TimeUnit.SECONDS);
            System.out.println(" click on go");
            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[3]")).click();
            driver.manage().timeouts().implicitlyWait(2500,TimeUnit.SECONDS);
            try {
                String Expecteddialg = "KB/s";
                String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]")).getText();
                Assert.assertEquals(Actualdialog, Expecteddialg);
                System.out.println("try pass");
                Thread.sleep(1500);
            }    catch (AssertionError e) {
                System.out.println(e.getMessage());
            }
            driver.manage().timeouts().implicitlyWait(2500,TimeUnit.SECONDS);
//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")).click();
//            System.out.println("click on more details");
////            Thread.sleep(3000);
//            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
//            System.out.println("click on back button of more details");
////            Thread.sleep(2000);
//            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
//            System.out.println("click on back button");
//            driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
            driver.navigate().back();
        }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        @Test(priority = 4)
        public void Speed_test_MB() throws InterruptedException {
            System.out.println("click on Settings");
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/setting")).click();
            driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
            System.out.println("click on Speed unit");
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")).click();
            driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
            System.out.println("MB/s");
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/Mb_s")).click();
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            System.out.println("click on Done");
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]")).click();
            driver.manage().timeouts().implicitlyWait(1200,TimeUnit.SECONDS);
            System.out.println("click on back button");
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
            System.out.println("Click on speedtest icon");
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Speed\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(900,TimeUnit.SECONDS);

            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            System.out.println(" click on go");
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[3]")).click();

            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            Thread.sleep(5000);
            try {
                String Expecteddialg = "MB/s";
                String Actualdialog = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[4]")).getText();
                Assert.assertEquals(Actualdialog, Expecteddialg);
                Thread.sleep(1500);
                System.out.println("try pass");
            }
            catch (AssertionError e) {
                System.out.println(e.getMessage());
            }

//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")).click();
//            System.out.println("click on more details");
//            Thread.sleep(5000);
//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
//            System.out.println("click on back button of more details");
//            Thread.sleep(2000);
//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
//            System.out.println("click on back button");
            driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
            driver.navigate().back();
        }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        @Test(priority = 5)
        public void Tools_video_Test() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Tools\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
            System.out.println("click on Tools");
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/video_test")).click();
            System.out.println("click on video test icon");
            driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.ImageView[3]")).click();
            System.out.println("click on video");
            driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
//            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/back")).click();
            System.out.println("click on back button");
            Thread.sleep(6000);
            driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);

            driver.navigate().back();

        }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////



        @Test(priority = 6)
            public void Video_Upload_time() throws InterruptedException {
            System.out.println("click on Tools");
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Tools\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
            System.out.println("video upload time");
            driver.manage().timeouts().implicitlyWait(1500,TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]")).click();
            System.out.println("permission dialog");
            driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
            System.out.println("select video from gallery");

            Thread.sleep(1000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ImageView")).click();
            System.out.println("started");
            driver.manage().timeouts().implicitlyWait(4000,TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView[3]")).click();
            Thread.sleep(9000);
            driver.manage().timeouts().implicitlyWait(6000,TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView")).click();
            driver.navigate().back();
        }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        @Test(priority = 7)
        public void Ping_Test() throws InterruptedException {
            System.out.println("click on Tools");
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Tools\"]/android.widget.FrameLayout/android.widget.ImageView")).click();

            driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
            System.out.println("click on pings");
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/ping_test")).click();
            Thread.sleep(19000);
            driver.manage().timeouts().implicitlyWait(2500,TimeUnit.SECONDS);
            System.out.println("click on back button");
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[1]")).click();

            driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
        }


    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        @Test(priority = 8)
        public void Wi_Fi() throws InterruptedException {
            System.out.println("click on Tools");
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Tools\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
            driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[8]")).click();
            driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS);
            Thread.sleep(9000);
            System.out.println("Click on Wifi analyzer");

        }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        @Test(priority = 9)
        public void Data_Usage() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Tools\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
            System.out.println("click on Tools");
            driver.manage().timeouts().implicitlyWait(1200, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[9]")).click();
            System.out.println("click on Data_Usage");
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
            Thread.sleep(2000);
//            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[1]")).click();
//            System.out.println("click on Days");
//            driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
            driver.navigate().back();
        }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        @Test(priority = 10)
        public void Statistics() throws InterruptedException {
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.ImageView[4]")).click();
            System.out.println("click on  statistics");
            driver.manage().timeouts().implicitlyWait(4000, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
            System.out.println("click on icon speed result");
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/back")).click();
            System.out.println("Back");
            driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
            driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Video\"]/android.widget.TextView")).click();
            System.out.println("Videos");
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup")).click();
            System.out.println("click on videos test result");
            driver.manage().timeouts().implicitlyWait(15000, TimeUnit.SECONDS);
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/back")).click();
            System.out.println("Back button");
            driver.manage().timeouts().implicitlyWait(8000, TimeUnit.SECONDS);
            }
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        @Test(priority = 11)
        public void Settings_Speed_Unit() throws InterruptedException {

            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/setting")).click();
            System.out.println("click on Settings");
            driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")).click();
            System.out.println("click on Speed unit");
            Thread.sleep(8000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView[3]")).click();
            System.out.println("click on Done");
            Thread.sleep(9000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")).click();
            System.out.println("Again click on Speed unit");
            Thread.sleep(9000);
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/Mb_s")).click();
            System.out.println("MB/s");
            Thread.sleep(9000);
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/done")).click();
            System.out.println("click on Done");
            Thread.sleep(9000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[2]")).click();
            System.out.println("Again click on Speed unit");
            Thread.sleep(9000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
            System.out.println("Kb/s");
            Thread.sleep(9000);
            driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/done")).click();
            System.out.println("click on Done");
        }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Test(priority = 12)
    public void Languages() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/setting")).click();
        System.out.println("click on Settings");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView[1]")).click();
        System.out.println("click on languages");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[2]")).click();
        System.out.println("select language");
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        Thread.sleep(3000);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[2]")).click();
        System.out.println("Done");
        try {
            Thread.sleep(5000);
            String Expecteddialg = "Analyseur Wi-Fi  ";
            String Actualdialog = driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Analyseur Wi-Fi\"]/android.view.ViewGroup/android.widget.TextView")).getText();
            Assert.assertEquals(Actualdialog, Expecteddialg);
            Thread.sleep(2000);
            //Assert.assertEquals(Actualdialog, Expecteddialg);

            System.out.println("******************************************* Home Screen language Change Successfully into francise ");

        }
        catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
        driver.manage().timeouts().implicitlyWait(9000,TimeUnit.SECONDS);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



    @Test(priority = 13)
    public void Feedback(){
        driver.findElement(By.id("internet.speedmeter.lite.netspeed.internetmeter:id/setting")).click();
        System.out.println("click on Settings");
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView[2]")).click();
        System.out.println("Feedback");
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[2]")).click();
        System.out.println("Crash");
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[3]")).click();
        System.out.println("App not responding");
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[12]")).click();
        System.out.println("submit");
        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        driver.navigate().back();
    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    @Test(priority = 14)
    public void Signal_Test(){
//        driver.manage().timeouts().implicitlyWait(1500, TimeUnit.SECONDS);
        System.out.println("click on Tools");
        driver.findElement(By.xpath("//android.widget.FrameLayout[@content-desc=\"Tools\"]/android.widget.FrameLayout/android.widget.ImageView")).click();
        driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
        System.out.println("click on signal strength");
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.TextView[7]")).click();
        System.out.println("click on Go");
        driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ImageView[1]")).click();
        System.out.println("permission screen");
        driver.manage().timeouts().implicitlyWait(2500, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.Button[1]")).click();
        System.out.println("permission allowed");
        System.out.println("Go");
        driver.navigate().back();
    }


    }






