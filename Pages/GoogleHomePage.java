package Pages;



import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class GoogleHomePage
{


    //creating constructor
    //initializing 3 objects the "TextSearch", "ButtonClick" and LinkClick
    //so the Page Factory will know that these are the 3 objects needed to be searched for this WebDriver
    //inputting parameters  WebDriver

    //constructor will initialize the objects in the page

    public GoogleHomePage(WebDriver driver)
    {                                               //with Page Factory initialize all the elements which are in the page
                                                    // selecting the driver "driver" and "this" is this page
        PageFactory.initElements(driver, this);

    }


    @FindBy(name = "q")                             // assigning "q" (which is the Google Search space) to the "TextSearch" box
    public WebElement TextSearch;                   // so "TextSearch" now has the Google Search space

    @FindBy(name = "btnK")                          //assigning "btnK" (which is the Search Button ) to the "ButtonClick" box
    public WebElement ButtonClick;                  // so "ButtonClick" now has the Search Button




    public void SearchText(String Text)             //creating a method SearchText with the String variable and Text Parameter in order to write text
    {

        TextSearch.sendKeys(Text);                  //searching for the text which is right now "www.amazon.com"

        ButtonClick.sendKeys(Keys.ENTER);                        //hitting the ENTER button

    }

    @FindBy(linkText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers ...")       //assigning the text in brackets to the LinkClick
    public WebElement LinkClick;                                                                    //so "LinkClick" now has a text in brackets


    public void AmazonLink()                //creating a method "AmazonLink"
    {

        LinkClick.click();                  //Clicking a link

    }


}
