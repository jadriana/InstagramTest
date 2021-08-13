package cleanTest;

import activities.Instragram.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import session.Session;
import java.net.MalformedURLException;

public class InstagramTest {

    private LoginScreen loginScreen = new LoginScreen();
    private MainScreen mainScreen= new MainScreen();
    private ProfileScreen profileScreen = new ProfileScreen();
    private EditProfileScreen editProfileScreen = new EditProfileScreen();
    @Test
    public void verifyAuthentication() throws MalformedURLException, InterruptedException {
        loginScreen.iniciarSesionBtn.click();
        loginScreen.login("jaqctest","123test");
        loginScreen.ingresarCtaBtn.click();
        Thread.sleep(8000);
        mainScreen.inPerfilBtn.click();
        profileScreen.editPerfilBtn.click();
        System.out.println("paso 0 "+editProfileScreen.presentationLabel.getText());
        editProfileScreen.presentationLabel.click();
        editProfileScreen.presentationTxtBox.setValue("test jaqc");
        editProfileScreen.backEditBtn.click();
        System.out.println("paso 1 "+editProfileScreen.presentationLabel.getText());
        //editProfileScreen.saveEditProfileBtn.click();*/
        Thread.sleep(3000);
        System.out.println("name salida "+editProfileScreen.nameTxtLabel.getText());
        System.out.println("site salida "+editProfileScreen.siteTxtLabel.getText());
        System.out.println("presentatioin salida "+editProfileScreen.presentationLabel.getText());

        /*System.out.println(editProfileScreen.nameTxtLabel.getText());
        System.out.println(editProfileScreen.siteTxtLabel.getText());
        System.out.println(editProfileScreen.presentationLabel.getText());
        Thread.sleep(3000);
        editProfileScreen.siteTxtbox.setValue("jaqc@test.com.bo");
        Thread.sleep(2000);
        editProfileScreen.presentationTxtbox.click();
        editProfileScreen.presentationTxtbox.setValue("Si se puede imaginar se puede programar");
        Thread.sleep(2000);*/
    }

    @Test
    public void verifyUpdateName() throws MalformedURLException {
        mainScreen.inPerfilBtn.click();
        profileScreen.editPerfilBtn.click();

        editProfileScreen = new EditProfileScreen();
        String newDat = "JAQC Name test";

        System.out.println("paso 0" +editProfileScreen.editProfileLabel.getText());
        editProfileScreen.editProfileLabel.click();
        editProfileScreen.editTxtBox.setValue(newDat);
        editProfileScreen.saveEditProfileBtn.click();
        editProfileScreen.editProfileLabel.click();

       //Assert.assertEquals("ERROR! campo no actualizado",newDat,editProfileScreen.editProfileLabel.getText());
    }

    @Test
    public void verifyUpdateSite() throws MalformedURLException {
        mainScreen.inPerfilBtn.click();
        profileScreen.editPerfilBtn.click();

        editProfileScreen = new EditProfileScreen();
        String newDat = "jaqc@test.com.bo";

        System.out.println("paso 0" +editProfileScreen.editProfileLabel.getText());
        editProfileScreen.editProfileLabel.click();
        editProfileScreen.editTxtBox.setValue(newDat);
        editProfileScreen.saveEditProfileBtn.click();
        editProfileScreen.editProfileLabel.click();

        //Assert.assertEquals("ERROR! campo no actualizado",newDat,editProfileScreen.editProfileLabel.getText());
    }


    @Test
    public void verifyUpdatePresentation() throws MalformedURLException {
        mainScreen.inPerfilBtn.click();
        profileScreen.editPerfilBtn.click();

        editProfileScreen = new EditProfileScreen();
        String newDat = "Si se puede imaginar se puede programar";

        System.out.println("paso 0" +editProfileScreen.editProfileLabel.getText());
        editProfileScreen.editProfileLabel.click();
        editProfileScreen.editTxtBox.setValue(newDat);
        editProfileScreen.saveEditProfileBtn.click();
        editProfileScreen.saveEditProfileBtn.click();
        ///editProfileScreen.editProfileLabel.click();
        //System.out.println("paso 1" +profileScreen.presentacionLabel.getText());
        //Assert.assertEquals("ERROR! campo no actualizado",newDat,editProfileScreen.editProfileLabel.getText());
    }

    @After
    public void close() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
