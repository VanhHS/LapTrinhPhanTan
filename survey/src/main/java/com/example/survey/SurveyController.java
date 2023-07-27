package com.example.survey;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.io.FileWriter;
import java.io.IOException;

public class SurveyController {

    @FXML
    private ToggleGroup toggleGroup;

    @FXML
    private CheckBox checkBox;

    @FXML
    private Button submitButton;

    @FXML
    private void submitSurvey() {
        // Lấy thông tin khảo sát từ giao diện
        String selectedOption = "";
        if (toggleGroup.getSelectedToggle() != null) {
            RadioButton selectedRadioButton = (RadioButton) toggleGroup.getSelectedToggle();
            selectedOption = selectedRadioButton.getText();
        }

        boolean isChecked = checkBox.isSelected();

        // Ghi thông tin khảo sát vào file data.txt
        try (FileWriter writer = new FileWriter("data.txt")) {
            writer.write("Selected Option: " + selectedOption + "\n");
            writer.write("Is Checkbox Checked: " + isChecked + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}