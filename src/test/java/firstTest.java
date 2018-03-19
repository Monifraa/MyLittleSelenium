import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class firstTest {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","c://chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.pracuj.pl");

        String actualTitle ="";

        actualTitle = driver.getTitle();
        System.out.println("NIZEJ BEDZIE TYTUL");
        System.out.println("TUTAJ TYTUL STRONY:" + actualTitle);

        if (actualTitle.contentEquals(  "Oferty pracy - Pracuj.pl")) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }



        driver.quit();
}
}
