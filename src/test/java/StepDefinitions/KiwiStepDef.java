package StepDefinitions;

import Pages.KiwiPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.remote.DesiredCapabilities;
import utilities.ReusableMethods;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class KiwiStepDef {
    AndroidDriver<AndroidElement> androidDriver;
    KiwiPage page=new KiwiPage();

    @Given("Kullanici dosyayolu verilen {string} uygulamayi cihaza yukler")
    public void kullanici_dosyayolu_verilen_uygulamayi_cihaza_yukler(String dosyaYolu) throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 4");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,dosyaYolu);

        androidDriver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        androidDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("Continue as a guest butonuna tiklanir")
    public void continue_as_a_guest_butonuna_tiklanir() {
        page.ContinueASGButton.click();
    }
    @When("Acilan sayfalarda {string} ve {string}  tiklanir")
    public void acilan_sayfalarda_ve_tiklanir(String Continue, String Exploretheapp) throws InterruptedException {
        Thread.sleep(2500);
        for (int i = 0; i < 3; i++) {
            ReusableMethods.scrollWithUiScrollableAndClick(Continue);
            Thread.sleep(2500);
        }
        ReusableMethods.scrollWithUiScrollableAndClick(Exploretheapp);

    }
    @When("Acilan sayfalarda Continue ve Explore the app tiklanir")
    public void acilan_sayfalarda_continue_ve_explore_the_app_tiklanir() throws InterruptedException {
        Thread.sleep(2500);
        for (int i = 0; i <4; i++) {
            ReusableMethods.koordinatTiklamaMethodu(550,2050,400);
        }


    }
    @When("Trip type one way olarak secilir")
    public void trip_type_one_way_olarak_secilir() throws InterruptedException {
        Thread.sleep(2500);
        page.secimButton.click();
        Thread.sleep(2500);
        page.OneWayButton.click();

    }
    @When("Kalkıs sehri secenegine tiklanir ve default olan sehir kaldirilir")
    public void kalkıs_sehri_secenegine_tiklanir_ve_default_olan_sehir_kaldirilir() {

    }
    @When("Kalkıs sehri alanina Ankara yazilir ve Choose butonuna tiklanir")
    public void kalkıs_sehri_alanina_ankara_yazilir_ve_choose_butonuna_tiklanir() {

    }
    @When("Varış sehri alanina Frankfurt yazilir ve Choose butonuna tiklanir")
    public void varış_sehri_alanina_frankfurt_yazilir_ve_choose_butonuna_tiklanir() {

    }
    @When("Gidiş tarihi alanindan {int} Ekim secilir ve Set Date butonuna tiklanir")
    public void gidiş_tarihi_alanindan_ekim_secilir_ve_set_date_butonuna_tiklanir(Integer int1) {

    }
    @When("Search butonuna tiklanir")
    public void search_butonuna_tiklanir() {

    }
    @When("En ucuz ve Aktarmasiz filtrelemeleri yapilir")
    public void en_ucuz_ve_aktarmasiz_filtrelemeleri_yapilir() {

    }
    @Then("Gelen ilk bilet fiyati kaydedilir ve kullanicinin telefonuna SMS olarak gonderilir")
    public void gelen_ilk_bilet_fiyati_kaydedilir_ve_kullanicinin_telefonuna_sms_olarak_gonderilir() {

    }

}
