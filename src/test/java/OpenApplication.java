import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;
import static org.testng.AssertJUnit.assertNotNull;

public class OpenApplication {

    AndroidDriver driver;

    @BeforeClass
    public void beforClass() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Nexus 5X API 27");
        capabilities.setCapability("platformVersion", "8.1");
        capabilities.setCapability("app", "C:\\Users\\Ahmed\\Desktop\\Zakker.apk");
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @Test(priority = 1)
    public void openApplication() throws InterruptedException {

        Thread.sleep(5000);
        WebElement zekkrTab_btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[4]/android.widget.ImageView"));
        zekkrTab_btn.click();
        WebElement notificationSettingsIcon = driver.findElement(By.id("com.madarsoft.thekr:id/azkar_settings"));
        Assert.assertTrue(notificationSettingsIcon.isDisplayed(), "The Main screen has problem and not displayed well");
    }

    @Test(priority = 2)
    public void openHesnElMoslemTab() {
        WebElement hesnElMoslem_btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[3]/android.widget.ImageView"));
        hesnElMoslem_btn.click();
        WebElement searchBar = driver.findElement(By.id("com.madarsoft.thekr:id/search_layout"));
        Assert.assertTrue(searchBar.isDisplayed(), "HesnElmoslem screen has an issue and not displayed well");
    }

    @Test(priority = 3)
    public void openDoaaTab() throws InterruptedException {
        WebElement doaa_btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[2]/android.widget.ImageView"));
        doaa_btn.click();
        WebElement searchBar = driver.findElement(By.id("com.madarsoft.thekr:id/search_layout"));
        WebElement doaaQuranImage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.ImageView"));
        WebElement doaaQuranText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.TextView"));
        WebElement doaaSonnaImage = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.ImageView"));
        WebElement doaaSonaaText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v4.view.ViewPager/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));

        Assert.assertTrue(searchBar.isDisplayed(), "Doaa screen has an issue and not displayed well");
        Assert.assertTrue(doaaQuranImage.isDisplayed(), "Doaa screen has an issue and not displayed well");
        Assert.assertTrue(doaaQuranText.isDisplayed(), "Doaa screen has an issue and not displayed well");
        Assert.assertTrue(doaaSonnaImage.isDisplayed(), "Doaa screen has an issue and not displayed well");
        Assert.assertTrue(doaaSonaaText.isDisplayed(), "Doaa screen has an issue and not displayed well");
        Assert.assertEquals(doaaQuranText.getText(), "أدعية من القرآن");
    }

    @Test(priority = 4)
    public void openBenfitsTab() {
        WebElement benfits_btn = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.support.v7.app.ActionBar.Tab[1]/android.widget.ImageView"));
        benfits_btn.click();
    }

    @Test(priority = 5)
    public void aboutUsScreen() throws InterruptedException {
        Thread.sleep(3000);
        WebElement menu_image = driver.findElement(By.id("com.madarsoft.thekr:id/menu_image"));
        menu_image.click();

        //Navigation to item in list
        AndroidElement list = (AndroidElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView"));
        MobileElement listGroup = list
                .findElement(MobileBy
                        .AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                                + "new UiSelector().text(\"من نحن\"));"));
        assertNotNull(listGroup.getLocation());
        listGroup.click();

        Thread.sleep(1500);
        WebElement aboutUsTitle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.TextView"));
        String expectedAboutUsTitle = "من نحن";
        Assert.assertEquals(aboutUsTitle.getText(), expectedAboutUsTitle, "Title not match");

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
    }
}