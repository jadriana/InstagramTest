package activities.Instragram;

import controlAppium.Button;
import controlAppium.Label;
import org.openqa.selenium.By;

public class ProfileScreen {

    public Button editPerfilBtn = new Button(By.id("com.instagram.android:id/button_text"));
    public Label presentacion = new Label(By.xpath("//android.view.ViewGroup[5]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.View"));
}
