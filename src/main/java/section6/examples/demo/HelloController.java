package section6.examples.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onSufferButtonClick() {
        welcomeText.setText("Have Fun Suffering! Endless pain and torment! Yippee!");
    }

    @FXML
    protected void onOptionButtonClick() {
        welcomeText.setText("There is no Other Option.");
    }
}