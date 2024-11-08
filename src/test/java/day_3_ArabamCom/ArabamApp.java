package day_3_ArabamCom;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ArabamApp {
    AndroidDriver<AndroidElement> driver;

 @BeforeTest
    public void   setUp () throws MalformedURLException {
     DesiredCapabilities cap =new DesiredCapabilities();
     cap.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL 4 ");//cıhazın ısmı
     cap.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
     cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");// cıhazın ısletım sıstemı
     cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
     cap.setCapability("appPackage","com.dogan.arabam");
  // AppPackage uzerinde caliscak oldugumuz uygulamanin kimlik bilgisidir. Apk infodan kimlik bilgisi bulunur

  cap.setCapability("appActivity","com.dogan.arabam.presentation.feature.home.HomeActivity" );
  // AppActivity ise uzerinde calisacak oldugumuz uygulamanin hangi sayfasindan baslamak istedigimizi belir
  // yani profil kismindan baslamak istiyorsam ilgili activity bulunur ve appActivity bolumune
  // yazilarak uygulama oradan baslatilir

  driver =new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
     driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);



  }
  @Test
  public void arabamTest1(){
      // uygulamanin basarili bir sekilde yuklendigi dogrulanir
     // uygulaminin basarili bir sekilde acildigi dogrulanir
     // alt menuden ilan ara butonuna tiklanir
     // kategori olarak otomobil secilir
     // arac olarak Volkswagen secilir
     // arac markasi olarak passat secilir
     // 1.4 TSI BlueMotion secilir
     // Paket secimi yapilir
     // Ucuzdan pahaliya siralama yaparak filtreleme yapilir
     // Gelen en ucuz aracin 500.000 tl den buyuk oldugu dogrulanir












 }





















}