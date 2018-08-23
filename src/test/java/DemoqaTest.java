import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Condition.visible;

public class DemoqaTest {

    @BeforeMethod
    public void setup(){
        Configuration.browser = "chrome";
        open("http://demoqa.com/");}

        @Test
        public void titleMainPage()
        {$(".entry-title").shouldHave(visible, text("Home"));}


    @AfterMethod
    public void tearDown()
    {
        WebDriverRunner.getWebDriver().quit();
    }

}
