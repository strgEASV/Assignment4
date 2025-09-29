package dk.easv.assignment4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextInputDialog;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class NumberConversionController implements Initializable {

    private NumberConversionModel ncmodel = new NumberConversionModel();

    @FXML
    private Label label;

    @FXML
    private TextField txtNumberInput;

    @FXML
    private Label lblResult;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TextInputDialog dialog = new TextInputDialog("");
        dialog.setTitle("Text Input Dialog");
        dialog.setHeaderText("Greetings from JavaFX");
        dialog.setContentText("Please enter your name:");

        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            String message = ncmodel.getGreetingsMessage(result.get());
            label.setText(message);
        }
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        try {
            double kmValue = Double.parseDouble(txtNumberInput.getText());
            double miles = ncmodel.getMilesFromKilometers(kmValue);
            lblResult.setText(String.format("%.2f miles", miles));
        } catch (NumberFormatException e) {
            lblResult.setText("Please enter a valid number!");
        }
    }

    @FXML
    private void handleButtonAction2(ActionEvent event) {
        try {
            double milesValue = Double.parseDouble(txtNumberInput.getText());
            double km = ncmodel.getKilometersFromMiles(milesValue);
            lblResult.setText(String.format("%.2f km", km));
        } catch (NumberFormatException e) {
            lblResult.setText("Please enter a valid number!");
        }
    }
}