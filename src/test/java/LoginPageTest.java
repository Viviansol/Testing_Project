import Pages.LoginPage;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest {
    private static LoginPage page;


    @Test
    public void LoginNegativeFlowTest() throws InterruptedException{
        page = new LoginPage();
        page.openApp();
        page.iniciarSessao();
        page.insertLoginData("viviansan93@gmail.com", "023456");
        Thread.sleep(2000);
        page.Login();
        Thread.sleep(2000);
        String messageErrorTest = page.getMessageLogin();
        assertTrue(messageErrorTest.contains("Sus credenciales son inválidas. Por favor, vuelva a intentarlo"));

    }

    @Test
    public void LoginFlowTest() throws InterruptedException{
        page = new LoginPage();
        page.openApp();
        page.iniciarSessao();
        page.insertLoginData("viviansan93@gmail.com", "123456");
        Thread.sleep(2000);
        page.Login();
        Thread.sleep(2000);


    }


}
