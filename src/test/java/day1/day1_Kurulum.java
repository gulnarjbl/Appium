package day1;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class day1_Kurulum {

    AndroidDriver<AndroidElement> driver;
    //Android driver,Android cihazlar için ona uygun özellikler eklenmiş
    AppiumDriver <MobileElement> appiumDriver;
    // onceden tek bir driver vardı.oda appıumdrıver.zamanla appıyum kendını gelısştirdi
    // android için ayrı ,Ios ıcın ayrı ozellıkler bulunan driverler uretı.
    //yanı onceden tek bir driver vardı hem  ıos hem de android ıcın
    IOSDriver <IOSElement> iosDriver;
    //IOs drıver, IOs cıhazları ıcın ona uygun Özellikler eklenmiş

    @Test
    public void deneme() throws MalformedURLException {
        DesiredCapabilities cap =new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL 4 ");//cıhazın ısmı
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");// cıhazın ısletım sıstemı
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");// cıhazın otomasyonu
     // IUAutomator2 işletım sıstemı 6.0 dan buyuk ısletım sıstemlerı ıcın calısan otomasyon.

      cap.setCapability(MobileCapabilityType.APP ,"C:\\Users\\user\\IdeaProjects\\Appium_Team144\\Apps\\Calculator_8.4 (503542421)_Apkpure (3).apk");
      /*
        App capability bir uygulama eger yuklu degilse uygulamayi cihaza yuklemek icin kullanilir
        Eger uygulama yukluyse ve tekrardan test calistirilirsa App capability uygulama yuklu mu diye kontrol eder
        eger yuklu degilse uygulamayi yukler, eger yukluyse uygulamayi acar
         */
        driver =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        /*
        emir verıldıgın de gıt bır butona tıkla 15 sanıye sonra gerı don demek
         */






    }
}



