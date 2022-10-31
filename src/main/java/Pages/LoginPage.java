package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    protected static final String inputLogin = "//*[@id=\"email\"]"; //Xpath
    protected static final String inputPassword = "#password"; //CSS selector
    protected static final String btnLogin = "//*[@id=\"root\"]/main/div/form/button"; //Xpath

    public void insertLoginData(String email, String password){
        WebElement LoginField = getWebElement(By.xpath(inputLogin));
        LoginField.clear();
        LoginField.sendKeys(email);

        WebElement PasswordField = getWebElement(By.cssSelector(inputPassword));
        PasswordField.clear();
        PasswordField.sendKeys(password);
    }

    public void Login(){
        WebElement LoginButton =  getWebElement(By.xpath(btnLogin));
        LoginButton.click();
    }

}
