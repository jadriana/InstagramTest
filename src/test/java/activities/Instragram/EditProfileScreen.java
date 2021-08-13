package activities.Instragram;

import controlAppium.Button;
import controlAppium.Label;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class EditProfileScreen {
    public Button backEditBtn = new Button(By.id("com.instagram.android:id/action_bar_button_back"));
    public Label editProfileLabel;
    public TextBox editTxtBox = new TextBox(By.xpath("//android.widget.MultiAutoCompleteTextView"));
    public TextBox nameTxtBox = new TextBox(By.xpath("//android.widget.EditText"));
    public TextBox siteTxtBox = new TextBox(By.xpath("//android.view.ViewGroup[3]/android.widget.EditText"));
    public TextBox presentationTxtBox = new TextBox(By.xpath("//android.widget.EditText"));
    public Label nameTxtLabel = new Label(By.xpath("//android.view.ViewGroup[1]/android.widget.TextView"));
    public Label siteTxtLabel = new Label(By.xpath("//android.view.ViewGroup[3]/android.widget.TextView"));
    public Label presentationLabel = new Label(By.xpath("//android.view.ViewGroup[4]/android.widget.TextView"));


    public Button saveEditProfileBtn = new Button(By.xpath("com.instagram.android:id/action_bar_button_action"));




    public enum TexBoxType{
        NOMBRE,
        SITIO,
        PRESENTACION
    }

    /*public EditProfileScreen(TexBoxType type) {
        switch (type){
            case NOMBRE:
                editProfileLabel = new Label(By.id("//android.widget.EditText"));
                saveEditProfileBtn = new Button(By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup[3]"));
                break;
            case SITIO:
                editProfileLabel = new Label(By.xpath("//android.view.ViewGroup[7]"));
                saveEditProfileBtn = new Button(By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup[3]"));
                break;
            case PRESENTACION:
                editProfileLabel = new Label(By.xpath("//android.view.ViewGroup[8]"));
                saveEditProfileBtn = new Button(By.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup[3]"));
                break;


                /*
                switch (type){
            case NOMBRE:
                editProfileLabel = new Label(By.xpath("//android.view.ViewGroup[5]"));
                saveEditProfileBtn = new Button(By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup[3]"));
                break;
            case SITIO:
                editProfileLabel = new Label(By.xpath("//android.view.ViewGroup[7]"));
                saveEditProfileBtn = new Button(By.xpath("//android.view.ViewGroup[1]/android.view.ViewGroup[3]"));
                break;
            case PRESENTACION:
                editProfileLabel = new Label(By.xpath("//android.view.ViewGroup[8]"));
                saveEditProfileBtn = new Button(By.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup[3]"));
                break;


    }            * */




/*
    public void cargar (){
        switch (type){
            case NOMBRE:
                editLabel = new Label(By.xpath("//android.view.ViewGroup[5]"));
                break;
            case SITIO:
                editLabel = new Label(By.xpath("//android.view.ViewGroup[7]"));
                break;
            case PRESENTACION:
                editLabel = new Label(By.xpath("//android.view.ViewGroup[8]"));
                saveEditProfileBtn = new Button(By.xpath("//android.view.ViewGroup[3]/android.view.ViewGroup[3]"));
                break;
        }
    }

*/

    /*public boolean editProfileTxTBox (TexBoxType type, String valor) throws MalformedURLException {
        editLabel.click();
        editTxtBox.setValue(valor);
        saveEditProfileBtn.click();
        String result = editLabel.getText();
        System.out.println("verificacion : "+ result + " "+valor +" return: "+result==valor);

        return result==valor;

    }*/







    /*public Button loginFacebookBtn = new Button(By.id("com.instagram.android:id/facebook_text_switcher"));
    public Button perfilBtn = new Button(By.id("com.instagram.android:id/tab_avatar"));
    public Button editPerfilBtn = new Button(By.id("com.instagram.android:id/button_text"));
    public Button saveEditPerfilBtn = new Button(By.id("com.instagram.android:id/action_bar_button_action"));
*/







//   }
}
