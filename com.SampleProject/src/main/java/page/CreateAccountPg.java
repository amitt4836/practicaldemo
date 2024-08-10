package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import base.TestBase;
import utils.Util;

public class CreateAccountPg extends TestBase {
	
	public CreateAccountPg()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@data-testid='open-registration-form-button']")
	private WebElement createAccount;
	
	@FindBy(xpath="//input[@placeholder='First name']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement email;
	
	@FindBy(xpath="//select[@name='birthday_day']")
	private WebElement bdate;
	
	@FindBy(xpath="//select[@name='birthday_month']")
	private WebElement bmonth;
	
	@FindBy(xpath="//select[@name='birthday_year']")
	private WebElement byear;
	
	@FindBy(xpath="//div[@class='mbs _52lq fsl fwb fcb']")
	private WebElement titlesingup;
	
	public void clickoncreateaccount() 
	{
		createAccount.click();
	}
	
	public void enterFirstname(String name, String lname , String eemail) {
		firstname.sendKeys(name);
		lastname.sendKeys(lname);
		email.sendKeys(eemail);	
	}
	
	public void selectdateofbirth() {
		Util.dropdown(bdate, "20");
		Util.dropdown(bmonth, "12");
		Util.dropdown(byear, "1990");
	}
	
	public String gettitlesingup() {
		return titlesingup.getText();
	}

}
