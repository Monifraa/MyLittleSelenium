import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.assertj.core.api.Assertions.assertThat;

public class firstTest {
    private static WebDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();

    }
    @After
    public void tearDown(){
        driver.close();
    }
    @Test
    public void CheckIfPracujPlTitleIsCorrect(){


        String baseUrl = "http://www.pracuj.pl";
        String actualTitle = "";
        String expectedTitle = "Ofert pracy - Pracuj.pl";

        driver.get(baseUrl);

        assertThat(driver.getTitle().contentEquals(expectedTitle));

}

}
