import Pages.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest {
    private static LoginPage page;

    @BeforeEach
    public void SetUp(){
        page = new LoginPage();
        page.openApp();

    }

    @Test
    public void loginFlowTest() throws InterruptedException{
        page.iniciarSessao();
        page.insertLoginData("viviansan93@gmail", "123");
        Thread.sleep(2000);
        page.Login();
        Thread.sleep(2000);
        String messageErrorTest = page.getMessageLogin();


        assertTrue(messageErrorTest.contains("Sus credenciales son inválidas. Por favor, vuelva a intentarlo"));


    }
}
