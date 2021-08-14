package activities.Instragram;

import controlAppium.Button;
import controlAppium.TextBox;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

public class LoginScreen {

    public Button iniciarSesionBtn = new Button(By.id("com.instagram.android:id/log_in_button"));
    public TextBox userTxtBox = new TextBox(By.id("com.instagram.android:id/login_username"));
    public TextBox passTxtBox = new TextBox(By.id("com.instagram.android:id/password"));
    public Button ingresarCtaBtn = new Button(By.id("com.instagram.android:id/next_button"));

    public void login(String user, String pass) throws MalformedURLException, InterruptedException {
        this.userTxtBox.setValue(user);
        Thread.sleep(2000);
        this.passTxtBox.setValue(pass);
        Thread.sleep(2000);
    }
}
