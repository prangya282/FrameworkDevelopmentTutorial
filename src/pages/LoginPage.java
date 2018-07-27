package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver =null;
    private static WebElement element = null;


    /*@FindBy(id="log")
    public static WebElement UserName ;


    @FindBy(id="pwd")
    public static WebElement passWord;
    
    @FindBy(id="login")
    public static WebElement btnLogin;*/
    
   /* public LoginPage(WebDriver driver){

        this.driver = driver;

        //This initElements method will create all WebElements

        PageFactory.initElements(driver, this);

    }*/

    //Set user name in textbox

    public static WebElement txtbx_UserName(WebDriver driver){

             element= driver.findElement(By.id("log"));
             return element;

             }

         public static WebElement txtbx_Password(WebDriver driver){

             element = driver.findElement(By.id("pwd"));
             return element;

             }

         public static WebElement btn_LogIn(WebDriver driver){

             element = driver.findElement(By.id("login"));

             return element;

             }

    
    /*public HomePage openMyAccount(){

        if(MyAccount.isDisplayed())
        {
        	System.out.println(" MyAccount Displayed");
        }
        return this;

    }
    public HomePage openHomePage(){

    	if(HomeLink.isDisplayed())
        {
    		HomeLink.click();
        	System.out.println(" MyAccount Displayed");
        }
        return this;


    }

    public HomePage closeBrowser(){

        driver.quit();
        return this;

    }*/
    

}
