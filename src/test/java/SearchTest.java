import Pages.SearchPage;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchTest {

    public static Pages.SearchPage page1;

    @BeforeEach
    public void SetUp(){
        page1 = new SearchPage();
        page1.openApp();

    }

    @Test
    public void SearchTest() throws InterruptedException{
        page1.searchLocal("Carilo");
        Thread.sleep(1000);
        page1.Search();
        Thread.sleep(1000);
        String result = page1.getResult();

        assertTrue(result.contains("Increible"));
        System.out.println("Result:"+ result);

    }
    @AfterEach
    public void tearDown(){
        page1.quitDriver();
    }

}
