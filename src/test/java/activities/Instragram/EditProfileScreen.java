package activities.Instragram;

import controlAppium.Button;
import controlAppium.Label;
import controlAppium.TextBox;
import org.openqa.selenium.By;

public class EditProfileScreen {

    public TextBox nameTxtBox = new TextBox(By.xpath("//android.widget.EditText"));
    public TextBox presentationTxtBox = new TextBox(By.xpath("//android.widget.EditText"));
    public Label nameTxtLabel = new Label(By.xpath("//android.view.ViewGroup[1]/android.widget.EditText"));
    public Label presentationLabel = new Label(By.xpath("//android.view.ViewGroup[4]/android.widget.EditText"));
    public Button saveEditProfileBtn = new Button(By.id("com.instagram.android:id/action_bar_button_action"));

}
