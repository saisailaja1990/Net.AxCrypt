import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AXC_test_Login {
    //public WebDriver driver;
    public static void main(String[] args) {


        ChromeOptions opt = new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*");
// Launching the browser
       // driver=new ChromeDriver(opt);
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(opt);


        driver.manage().window().maximize();
        driver.get("https://account.axcrypt.net/en/Home/Login");
        WebElement EmailID= driver.findElement(By.id("useremail"));
        EmailID.sendKeys("Saisailajapattipati@axcrypt.net");
        WebElement password= driver.findElement(By.id("login-temp-password"));
        password.sendKeys("Suneel@143");
        WebElement showPSW= driver.findElement(By.id("togglePassword"));
        showPSW.click();
        WebElement Sign_in_btn=driver.findElement(By.xpath("//input[@class='button signin-button success']"));
        Sign_in_btn.click();
        WebElement signout=driver.findElement(By.xpath("//li[@class='logout']"));
        signout.click();
        driver.quit();

    }
}
