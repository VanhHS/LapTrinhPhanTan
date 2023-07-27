module com.example.baitaptracnghiem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.baitaptracnghiem to javafx.fxml;
    exports com.example.baitaptracnghiem;
}