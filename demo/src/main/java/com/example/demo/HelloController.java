package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    TextField year;
    @FXML
    protected void caculatedAge() {
       int now =2023;
       int age =  - Integer.parseInt(year.getText());
       Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Tuổi của bạn là: " + age);
        alert.show();

    }
}