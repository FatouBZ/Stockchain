module com.example.mainsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mainsystem to javafx.fxml;
    exports com.example.mainsystem;
}