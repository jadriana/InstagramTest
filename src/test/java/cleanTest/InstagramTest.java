package cleanTest;

import activities.Instragram.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import session.Session;
import java.net.MalformedURLException;

public class InstagramTest {

    private LoginScreen loginScreen = new LoginScreen();
    private MainScreen mainScreen= new MainScreen();
    private ProfileScreen profileScreen = new ProfileScreen();
    private EditProfileScreen editProfileScreen = new EditProfileScreen();

    @Test
    public void verifyEditName() throws MalformedURLException, InterruptedException {
        loginScreen.iniciarSesionBtn.click();
        loginScreen.login("jaqctest","123test");
        loginScreen.ingresarCtaBtn.click();
        Thread.sleep(5000);
        mainScreen.inPerfilBtn.click();
        profileScreen.editPerfilBtn.click();
        editProfileScreen.nameTxtLabel.click();
        String varname = "Equipo 4";
        editProfileScreen.nameTxtBox.setValue(varname);
        editProfileScreen.saveEditProfileBtn.click();
        Thread.sleep(3000);
        String resultaEsperado = editProfileScreen.nameTxtLabel.getText();
        editProfileScreen.saveEditProfileBtn.click();
        System.out.println("Nombre esperado --> "+resultaEsperado);
        Assert.assertEquals("ERROR! campo nombre no actualizado",varname,resultaEsperado);
    }

    @Test
    public void verifyEditPresentation() throws MalformedURLException, InterruptedException {
        loginScreen.iniciarSesionBtn.click();
        loginScreen.login("jaqctest","123test");
        loginScreen.ingresarCtaBtn.click();
        Thread.sleep(5000);
        mainScreen.inPerfilBtn.click();
        profileScreen.editPerfilBtn.click();
        editProfileScreen.presentationLabel.click();
        String varpresentation = "Si se puede imaginar se puede programar";
        editProfileScreen.presentationTxtBox.setValue(varpresentation);
        editProfileScreen.saveEditProfileBtn.click();
        Thread.sleep(3000);
        String resulEsperado = editProfileScreen.presentationLabel.getText();
        System.out.println("presentacion esperado--> "+resulEsperado);
        editProfileScreen.saveEditProfileBtn.click();
        Assert.assertEquals("ERROR! campo presentacion no actualizado",varpresentation,resulEsperado);
    }

    @After
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
