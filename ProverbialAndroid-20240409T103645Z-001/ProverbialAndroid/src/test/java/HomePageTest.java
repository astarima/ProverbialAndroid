import io.appium.java_client.AppiumBy;
import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

public class HomePageTest extends BaseTest {
    @Test
    public void  testContentByResourceId() {
     WebElement toastButton = driver.findElement(AppiumBy.id("com.lambdatest.proverbial:id/toast"));
        toastButton.isDisplayed();
        toastButton.click();
    }
    @Test
    public void testByAccessibilityId() {
        WebElement browserIcon = driver.findElement(AppiumBy.accessibilityId("Browser"));
        browserIcon.click();
    }
    @Test
    public void testByClassName() {
        WebElement colorButton = driver.findElement(AppiumBy.className("android.widget.Button"));
        colorButton.click();
    }
    @Test
    public void testByClassNameList() {
        driver.findElements(AppiumBy.className("android.widget.Button")).get(3).click();


    }
    @Test
    public void testByXPath() {
        driver.findElement(AppiumBy.xpath("//*[@content-desc='Home']")).click();
    }
    @Test
    public void testByUiSelector() {
        driver.findElement(AppiumBy.androidUIAutomator("textStartsWith(\"Hello!\")")).isDisplayed();
    }
}
