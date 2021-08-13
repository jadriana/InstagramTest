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
    public Button confirNoSavePassBtn = new Button(By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"));

    /*

    public Button iniciarSesionBtn = new Button(By.xpath("//android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.view.View"));
    private TextBox userTxtBox = new TextBox(By.xpath("//android.widget.MultiAutoCompleteTextView[1]"));
    private TextBox passTxtBox = new TextBox(By.xpath("//android.widget.MultiAutoCompleteTextView[2]"));
    public Button ingresarCtaBtn = new Button(By.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup[4]"));
    public Button confirNoSavePassBtn = new Button(By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]"));

    * */


    public void login(String user, String pass) throws MalformedURLException, InterruptedException {
        this.userTxtBox.setValue(user);
        Thread.sleep(3000);
        this.passTxtBox.setValue(pass);
        Thread.sleep(3000);
    }
}
