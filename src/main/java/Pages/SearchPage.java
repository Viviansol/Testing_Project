package Pages;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class SearchPage extends BasePage {
    private static final String searchInput ="//*[@id=\"buscador\"]/div/div[1]/div/div[1]/div[2]";
    private static final String btnSearch = "//*[@id=\"btn-buscador\"]";
    private static final String resultCity = "\"//*[@id=\\\"20\\\"]/div[2]/div/div[1]/h3\"";
    public void searchLocal (String local) throws InterruptedException{

        WebElement searchBox = getWebElement(By.xpath(searchInput));
        //searchBox.clear();
        searchBox.sendKeys(local);
        Thread.sleep(2000);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void Search(){
        WebElement SearchButton = getWebElement(By.xpath(btnSearch));
        SearchButton.click();
    }

    public String getResult() {
        WebElement result = getWebElement(By.xpath(resultCity));
        return result.getText();
    }

}
