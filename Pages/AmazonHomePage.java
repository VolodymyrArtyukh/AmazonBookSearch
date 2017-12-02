package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AmazonHomePage
{
    //creating constructor AmazonHomePage
    //initializing 4 objects the "DropDownBox", "Books", "SearchField" and "SearchBook"
    //so the Page Factory will know that these are the 4 objects needed to be searched for this WebDriver
    //inputting parameters  WebDriver


    public AmazonHomePage(WebDriver driver)
    {
        //with Page Factory initialize all the elements which are in the page
        // selecting the driver "driver" and "this" is this page

        PageFactory.initElements(driver, this);

    }


    @FindBy(id = "searchDropdownBox")           //assigning the "searchDropDown" (where is the drop down list) to the DropDownBox
    public WebElement DropDownBox;              //so DropDownBox has the drop down list



    @FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/form/div[1]/div/select/option[13]")     //assigning the Books XPath to the Books
    public WebElement Books;              //so Books now have the XPath



    @FindBy(name = "field-keywords")            //assigning "field-keywords" to the "SearchField"
    public WebElement SearchField;              //SearchField is the Amazon search field

    @FindBy(css = "input.nav-input:nth-child(2)")   //assigning css locator to "SearchButton" and it will click the search button
    public WebElement SearchButton;                 //so SearchButton has the css locator



    public void DropDown() throws InterruptedException {

        DropDownBox.click();        //clicking the Drop Down list

        Books.click();              //clicking the "Books" field

        SearchField.clear();        // clearing the Search Field
        SearchField.sendKeys("test automation using selenium webdriver with java"); //searching this text in Search Field

        Thread.sleep(5000);     //waiting for 5 seconds
        SearchButton.click();        //clicking the Search Button
    }



}
