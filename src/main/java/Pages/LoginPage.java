package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    protected static final String btnInicialSessao = "//*[@id=\"root\"]/header/nav/a[2]"; //css

    protected static final String inputLogin = "//*[@id=\"email\"]"; //Xpath
    protected static final String inputPassword = "#password"; //CSS selector
    protected static final String btnLogin = "//*[@id=\"root\"]/main/div/form/button"; //Xpath
    protected static final String message = "//*[@id=\"root\"]/main/div/form/p[1]";

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
    public String getUserLogin() {
        WebElement identify = getWebElement(By.xpath("//*[@id=\"root\"]/header/nav/div/div/div/p[2]"));
        return identify.getText();
    }
    public void iniciarSessao(){
        WebElement logar = getWebElement(By.xpath(btnInicialSessao));
        logar.click();
    }
    public String getMessageLogin() {
        WebElement messageError = getWebElement(By.xpath(message));
        return messageError.getText();
    }
}
