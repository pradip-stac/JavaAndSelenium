package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLogInPagae {
		
	@FindBy (xpath = "//input[@type='text']")private WebElement email;
    @FindBy (xpath = "//input[@type='password']")private WebElement password;
	@FindBy (xpath = "//button[@name='login']")private WebElement submit;
	@FindBy (xpath = "//a[text()='Forgotten password?']")private WebElement forget;
	@FindBy (xpath = "(//a[@role='button'])[2]")private WebElement signUp;
	@FindBy (xpath = "//a[@class='_8esh']")private WebElement createPage;
	
	//for hidden browser popup
	
	@FindBy (xpath = "//input[@name='firstname']")private WebElement firstName;
	@FindBy (xpath = "//input[@name='lastname']")private WebElement lastName;
	@FindBy (xpath = "(//input[@type='text'])[4]")private WebElement mobileoremail;
	@FindBy (xpath = "//input[@name='reg_passwd__']")private WebElement newpassword;
	@FindBy (xpath ="//select[@id='day']")private WebElement day;
	@FindBy (xpath = "//select[@id='month']")private WebElement month;
	@FindBy (xpath = "//select[@id='year']")private WebElement year;
	@FindBy (xpath = "(//input[@name='sex'])[1]")private WebElement female;
	@FindBy (xpath = "(//input[@name='sex'])[2]")private WebElement male;
	@FindBy (xpath = "(//input[@name='sex'])[3]")private WebElement custom;
    @FindBy (xpath = "//*[@id=\"u_3_s_OO\"]")private WebElement signuponpopup;
	
	public FaceBookLogInPagae(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enteremailid(String mail) 
	{
		email.sendKeys(mail);
	}
	
	public void enterpassword(String pass) 
	{
		password.sendKeys(pass);
	}
	
	public void clickonlogin()
	{
		submit.click();
	}
	
	public void clickonforgetpassword()
	{
		forget.click();
	}
	
	public void clickoncreatenewaccount() 
	{
		signUp.click();
	}
	public void clickoncreateapage() {
		createPage.click();
		
	}
    public void  enterfirstname(String firstname) {
    	firstName.sendKeys(firstname);
    }
	public void enterlastname(String lastname) {
		lastName.sendKeys(lastname);
	}
	public void entermobileoremail(String mobile) {
		mobileoremail.sendKeys(mobile);
	}
	public void enternewpassword (String newpass) {
		newpassword.sendKeys(newpass);
	}
	public void selectdayofbirth() {
		day.click();
	}
	public void selectmonthofbirth() {
		month.click();
	}
	public void selectyearofbirth() {
		year.click();
	}
	public void clickonfemale() {
		female.click();
	}
	public void clickonmale() {
		male.click();
	}
	public void clickoncustom() {
		custom.click();
	}
	public void clickonsignup() {
		signuponpopup.click();
	}
	
	
	
}
