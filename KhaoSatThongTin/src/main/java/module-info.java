module com.example.khaosatthongtin {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.khaosatthongtin to javafx.fxml;
    exports com.example.khaosatthongtin;
}