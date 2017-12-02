package MainTestPage;

import Pages.AmazonHomePage;
import Pages.GoogleHomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class Amazon
{

    private WebDriver driver;

    @BeforeTest
    public void setUp()
    {
        System.setProperty("webdriver.chrome.driver", "D:\\Java\\ChromeDriver\\chromedriver.exe");     //setting system properties

        driver = new ChromeDriver();       //setting up Chrome browser

        driver.manage().window().maximize();    //making full screen page

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS); //wait for 15 seconds till the page loads

    }


    @Test(priority = 1)
    public void Google()
    {

        driver.get("https://www.google.com");    //navigating to Google Page

        String title = driver.getTitle();       //checking the title

        System.out.print("The title is : " + title);    //printing the title

    }


    @Test(priority = 2)
    public void GoogleHomePage()
    {

        GoogleHomePage Page = new GoogleHomePage(driver);   //calling the GoogleHomePage class with parameter driver

        Page.SearchText("www.amazon.com");          //Searching for Amazon Page in the Search and clicking button "Search"

        Assert.assertEquals("www.amazon.com","www.amazon.com");

        Page.AmazonLink();                          //clicking the link


    }

    @Test(priority = 3)
    public void AmazonHomePage() throws InterruptedException {


        AmazonHomePage Page = new AmazonHomePage(driver);       //calling the AmazonHomePage class with parameter driver

        Page.DropDown();                                        //Executing the DropDown method
        Assert.assertEquals("Books", "Books");             // checking if "Books" where selected in "Books" search field


    }

    @AfterTest
    public void tearDown() throws InterruptedException {

        Thread.sleep(5000);             //waiting for 5 seconds

        driver.quit();                      //closing the Chrome browser

    }

}
