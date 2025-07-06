package expendTesting;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.*;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class ZZZxpathList {
    public static WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = TestBase.createDriver();
    }



    @Test
    public void browserInformationPagetestication() {
        zzzURL.uuUrl_MyBrowserInformationPage(driver);
        zzzBox.bbbutton_showBrowser(driver);

        WebElement tttextCodeName = driver.findElement(By.xpath("//*[text()='CodeName']"));
        boolean isDisplayed = tttextCodeName.isDisplayed();
        System.out.println("CodeName kutusunun görünürlülüğü " + isDisplayed);

        WebElement tttextcodeNameValue = driver.findElement(By.xpath("//*[text()='Mozilla']"));
        boolean icerkKontrolu = tttextcodeNameValue.isDisplayed();
        System.out.println("CodeName kutusunun içeriği " + icerkKontrolu);
        assertTrue(tttextCodeName.isDisplayed());
        assertTrue(tttextcodeNameValue.isDisplayed());
        boolean bothDisplayed = tttextCodeName.isDisplayed() && tttextcodeNameValue.isDisplayed();
        assertTrue(bothDisplayed);
        assertEquals("CodeName", tttextCodeName.getText());
        assertEquals("Mozilla", tttextcodeNameValue.getText());

        WebElement tttextBrowserName = driver.findElement(By.xpath("//*[text()='Name']"));
        System.out.println(tttextBrowserName.getText());
        boolean degeratatttextBrowserName = tttextBrowserName.isDisplayed();
        System.out.println("Name kutususunu görünürlüğü " + degeratatttextBrowserName);

        WebElement tttextBrowserNameValue = driver.findElement(By.xpath("//*[text()='Google Chrome']"));
        System.out.println(tttextBrowserNameValue.getText());
        /// /

        assertEquals("Google Chrome", tttextBrowserNameValue.getText());

        /// /
        boolean degeratatttextBrowserNameValue = tttextBrowserNameValue.isDisplayed();
        System.out.println("Browser adının görünürlülüğü"
                + " "
                + degeratatttextBrowserNameValue
                + " "
                + "görünen isim:"
                + tttextBrowserNameValue.getText()
        );

        WebElement tttextCookiesEnabled = driver.findElement(By.xpath("//*[text()='Cookies Enabled']"));
        System.out.println("kutunun görünen adı " + tttextCookiesEnabled.getText());
        boolean degeratatttextCookiesEnabled = tttextCookiesEnabled.isDisplayed();
        System.out.println("Cookies Enabled"
                + "yazısınıngörünürlüğü"
                + degeratatttextCookiesEnabled
                + "kutu içinde görünen yazı "
                + tttextCookiesEnabled.getText()
        );

        WebElement tttextCookiesEnabledValue = driver.findElement(By.xpath("//*[text()='true']"));
        System.out.println("Cookies enabled " + "yazısının karşısında " + tttextCookiesEnabledValue.getText());
        boolean degeratatttextCookiesEnabledValue = tttextCookiesEnabledValue.isDisplayed();
        System.out.println("tarayıcıda Cookies Enabled işaretli mi? " + degeratatttextCookiesEnabledValue);

        WebElement tttextPlatformName = driver.findElement(By.xpath("//*[text()='Platform']"));
        WebElement tttextPlatformNameValue = driver.findElement(By.xpath("//*[text()='Win32']"));
        System.out.println(tttextPlatformName.getText());
        System.out.println(tttextPlatformNameValue.getText());
        assertEquals("Platform", tttextPlatformName.getText());

        WebElement bbbuttonHideBrowserInformation = driver.findElement(By.xpath("//*[text()='Hide Browser Information']"));
        bbbuttonHideBrowserInformation.click();
    }

    @Test
    public void radioButonTest(){
        driver.get("https://practice.expandtesting.com/radio-buttons");

        WebElement bbbuttonBlue = driver.findElement(By.xpath("//input[@id='blue']"));
        BulXpath.printXpathFormulas(bbbuttonBlue);
        bbbuttonBlue.click();


        WebElement bbbuttonBasketball = driver.findElement(By.xpath("//input[@id='basketball']"));
        BulXpath.printXpathFormulas(bbbuttonBasketball);
        bbbuttonBasketball.click();
        ReusableMethods.bekle(3);

    }

    @Test
    public void dragANDdrop(){
        driver.get("https://practice.expandtesting.com/drag-and-drop");

        WebElement kareA = driver.findElement(By.xpath("//*[@id='column-a']"));
        WebElement kareB = driver.findElement(By.xpath("//*[@id='column-b']"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(kareA, kareB).perform();

        // Son durumları oku
        String textA = kareA.getText();
        String textB = kareB.getText();

        // Konsola anlamlı açıklama yazdır
        System.out.println("Drag&Drop işlemi sonrası:");
        System.out.println("A kutusunun içindeki yazı: " + textA);
        System.out.println("B kutusunun içindeki yazı: " + textB);

        // Yer değişti mi, insan gözüyle anlamlı çıktı
        if ("B".equals(textA) && "A".equals(textB)) {
            System.out.println("Başarılı: A ve B kutuları yer değiştirdi.");
        } else {
            System.out.println("Başarısız: Kutular beklenen şekilde yer değiştirmedi.");
        }

        // Otomasyon assertionları
        assertEquals("A", textB);
        assertEquals("B", textA);
        assertEquals("A", textB);
        assertEquals("B", textA);
        System.out.println("Test sonucu: " + (("B".equals(textA) && "A".equals(textB)) ? "Başarılı" : "Başarısız"));
    }


    @Test
    public void formValidationTest(){
        driver.get("https://practice.expandtesting.com/form-validation");

        WebElement contactNameBox = driver.findElement(By.xpath("//input[@id='validationCustom01']"));
        contactNameBox.clear();
        contactNameBox.sendKeys("lapseki lapseki");


        WebElement contactNumberBox = driver.findElement(By.xpath("//input[@id='validationCustom05']"));
        contactNumberBox.clear();
        contactNumberBox.sendKeys("012-3456789");
        ReusableMethods.bekle(12);







        WebElement paymentMethodBox = driver.findElement(By.xpath("//*[@id='validationCustom04']"));
        //paymentMethodBox.click();
        Select select = new Select(paymentMethodBox);

        // Seçeneklerden birini value ile seçmek:
        // select.selectByValue("1");

        // Seçeneklerden birini görünen yazı ile seçmek:
        select.selectByVisibleText("card");

        // Seçeneklerden birini index ile seçmek:
        select.selectByIndex(1);
        WebElement pickUpDateBox = driver.findElement(By.xpath("//*[@id=\"validationCustom05\"]"));
        pickUpDateBox.submit();
        ReusableMethods.bekle(12);
        pickUpDateBox.sendKeys("03.07.2025"); // yyyy-MM-dd formatı genelde çalışır


        WebElement registerButton = driver.findElement(By.xpath("//button[@class='btn btn-primary']"));




    }
    @Test
    public void test02(){

        driver.get("https://practice.expandtesting.com/form-validation");

        WebElement contactNameBox = driver.findElement(By.id("validationCustom01"));
        contactNameBox.clear();
        contactNameBox.sendKeys("lapseki lapseki");

        WebElement contactNumberBox = driver.findElement(By.xpath("(//input[@id='validationCustom05'])[1]")); // Telefon kutusu
        contactNumberBox.clear();
        contactNumberBox.sendKeys("012-3456789");

        // Doğru id ile date kutusunu bul!
        WebElement pickUpDateBox = driver.findElement(By.xpath("(//input[@id='validationCustom05'])[2]")); // Örnek: id'yi kontrol et!
        pickUpDateBox.clear();
        pickUpDateBox.sendKeys("2025-07-03"); // Eğer input type="date" ise bu format kullanılmalı

        WebElement paymentMethodBox = driver.findElement(By.id("validationCustom04"));
        Select select = new Select(paymentMethodBox);
        select.selectByVisibleText("card");

        WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"core\"]/div/div/div/div/div/form/div[5]/button")) ;
        registerButton.click(); // Formu gönder


        WebElement alertbox = driver.findElement(By.xpath("//*[@id=\"core\"]/div/div/div"));

        String expectedTextAlertBox= "Thank you for validating your ticket";
        System.out.println(driver.findElement(By.xpath("//*[@id=\"core\"]/div/div/div/p")).getText());

        if (driver.findElement(By.xpath("//*[@id=\"core\"]/div/div/div/p")).getText().equalsIgnoreCase(expectedTextAlertBox)) {
            System.out.println("huguh");
        }else System.out.println("nahuguh");
        // //*[text()='CodeName']
        // Gerekirse bekleme ekleyebilirsin
        // ReusableMethods.bekle(2);
    }

    @Test
    public void upLoadTest() throws IOException {
        driver.get("https://practice.expandtesting.com/upload");
        ReusableMethods.bekle(4);

        String filePath = "C:\\Users\\Hp\\OneDrive\\Desktop\\sdlc\\pom.txt";


        WebElement uploadElement = driver.findElement(By.id("fileInput"));

        ReusableMethods.bekle(3);

        uploadElement.sendKeys(filePath);

        WebElement upLoadButton = driver.findElement(By.id("fileSubmit"));

        upLoadButton.click();

        WebElement alertBox = driver.findElement(By.id("uploaded-files"));
        File alertBoxScreenshot = alertBox.getScreenshotAs(OutputType.FILE);
        FileHandler.copy(alertBoxScreenshot,new File("C:\\\\Users\\\\Hp\\\\OneDrive\\\\Desktop\\\\sdlc\\\\alertBoxScreenshot.png"));
        FileHandler.copy(alertBoxScreenshot, new File("C:\\Users\\Hp\\OneDrive\\Desktop\\alertBoxScreenshot.png"));
        //  "C:\\Users\\Hp\\OneDrive\\Desktop\\sdlc\\alertBoxScreenshot.png"

        boolean isDisplayed  = alertBox.isDisplayed();
        String uploadedFileName = alertBox.getText() ;
        alertBox.getText();

        System.out.println("dosya yükleme "+isDisplayed);

        System.out.println("dosya adı "+uploadedFileName);
















    }

    @Test
    public void downloadFileTest(){
        driver.get("https://practice.expandtesting.com/download");
        ReusableMethods.bekle(3);
        System.out.println("1");
        WebElement downloadButton1 = driver.findElement(By.xpath("(//div[@class='d-flex mb-2'][1])"));
        System.out.println("Butonun metni: " + downloadButton1.getText());
        System.out.println("Download butonu görünüyor mu? " + downloadButton1.isDisplayed());
        System.out.println("Download butonu aktif mi? " + downloadButton1.isEnabled());


        // İsteğe bağlı: Tıklanabilir olmasını bekle
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(downloadButton1));
        downloadButton1.click();
        // ((JavascriptExecutor)driver).executeScript("arguments[0].click();", downloadButton1);


        //WebElement downloadButton2 = driver.findElement(By.xpath("(//div[@class='d-flex mb-2'][2])"));
        // System.out.println(downloadButton2.getText());
        // downloadButton2.click();
        System.out.println("2");
        WebElement downloadButton2 = driver.findElement(By.xpath("(//div[@class='d-flex mb-2'][2])"));
        System.out.println("Butonun metni: " + downloadButton2.getText());
        System.out.println("Download butonu görünüyor mu? " + downloadButton2.isDisplayed());
        System.out.println("Download butonu aktif mi? " + downloadButton2.isEnabled());
        downloadButton2.click();
        System.out.println("3");
        WebElement downloadButton3 = driver.findElement(By.xpath("(//div[@class='d-flex mb-2'][3])"));
        System.out.println("Butonun metni: " + downloadButton3.getText());
        System.out.println("Download butonu görünüyor mu? " + downloadButton3.isDisplayed());
        System.out.println("Download butonu aktif mi? " + downloadButton3.isEnabled());

        downloadButton3.click();
        System.out.println("4");
        WebElement downloadButton4 = driver.findElement(By.xpath("(//div[@class='d-flex mb-2'][4])"));
        System.out.println("Butonun metni: " + downloadButton4.getText());
        System.out.println("Download butonu görünüyor mu? " + downloadButton4.isDisplayed());
        System.out.println("Download butonu aktif mi? " + downloadButton4.isEnabled());
        downloadButton4.click();
        System.out.println("5");
        WebElement downloadButton5 = driver.findElement(By.xpath("(//div[@class='d-flex mb-2'][5])"));
        System.out.println("Butonun metni: " + downloadButton5.getText());
        System.out.println("Download butonu görünüyor mu? " + downloadButton5.isDisplayed());
        System.out.println("Download butonu aktif mi? " + downloadButton5.isEnabled());
        downloadButton5.click();
        System.out.println("6");
        WebElement downloadButton6 = driver.findElement(By.xpath("(//div[@class='d-flex mb-2'][6])"));
        System.out.println("Butonun metni: " + downloadButton6.getText());
        System.out.println("Download butonu görünüyor mu? " + downloadButton6.isDisplayed());
        System.out.println("Download butonu aktif mi? " + downloadButton6.isEnabled());
        downloadButton6.click();
    }
    @Test
    public void addRemoveTest(){
        driver.get("https://practice.expandtesting.com/add-remove-elements");

        WebElement removeElementButton = driver.findElement(By.xpath("//button[@class='btn btn-primary mt-3']"));
        System.out.println( "butonun metni"+ removeElementButton.getText());
        System.out.println("removeElementButonu görünüyor mu? "+ removeElementButton.isDisplayed());
        System.out.println("removeElementButonu aktif mi ? "+removeElementButton.isEnabled());
        removeElementButton.click();

        WebElement deleteElementButton = driver.findElement(By.xpath("(//button[@class='added-manually btn btn-info'][1])"));
        System.out.println("delete Butonunun metni "+ deleteElementButton.getText());
        System.out.println("delete Butonun metni görnüyormu? "+ deleteElementButton.isDisplayed());
        System.out.println("delete butonunu aktif mi ? "+deleteElementButton.isEnabled());
        deleteElementButton.click();
    }

    @Test
    public void addRemoveTest5circle(){

        for (int i = 0; i < 5; i++) {
            System.out.println("Test Döngüsü: " + (i + 1)); // Hangi döngüde olduğunu göster

            driver.get("https://practice.expandtesting.com/add-remove-elements");

            WebElement removeElementButton = driver.findElement(By.xpath("//button[@class='btn btn-primary mt-3']"));
            System.out.println("butonun metni: " + removeElementButton.getText());
            System.out.println("removeElementButonu görünüyor mu? " + removeElementButton.isDisplayed());
            System.out.println("removeElementButonu aktif mi? " + removeElementButton.isEnabled());
            removeElementButton.click();

            WebElement deleteElementButton = driver.findElement(By.xpath("(//button[@class='added-manually btn btn-info'][1])"));
            System.out.println("delete Butonunun metni: " + deleteElementButton.getText());
            System.out.println("delete Butonun metni görünüyor mu? " + deleteElementButton.isDisplayed());
            System.out.println("delete butonunu aktif mi? " + deleteElementButton.isEnabled());
            deleteElementButton.click();

            System.out.println("----------------------"); // Döngüler arasında ayraç
        }
    }
    @Test  @Disabled
    public void downLoadSecure(){
        // https://kullaniciadi:sifre@adres.com/yol
        //  https://admin:12345@secure-download-site.com/files

        // document.querySelectorAll('input')  consolda bir şeyleri açıyor .


        driver.get("https://practice:SuperSecretPassword!@practice.expandtesting.com/secure-download");

        // switchtoAlertBox
        // eğitim videosuiçin
        // https://www.youtube.com/watch?v=Ogo_t1c-TN4
        //// 1. "alertBox" ID'li butonu bul ve tıkla (Simple Alert tetiklenir)
        //driver.findElement(By.id("alertBox")).click();
        //
        //// 2. Açılan alert penceresine geçiş yap
        //Alert simpleAlert = driver.switchTo().alert();
        //
        //// 3. Alert'in üzerindeki mesajı konsola yazdır
        //System.out.println(simpleAlert.getText());
        //
        //// 4. 2 saniye bekle (alert'in göründüğünü gözle görmek için)
        //Thread.sleep(2000);
        //
        //// 5. Alert'i kabul et (OK/Onay butonuna basar)
        //simpleAlert.accept();
        //
        //// 6. 2 saniye daha bekle (kapanışı gözlemek için)
        //Thread.sleep(2000);

    }
}




















