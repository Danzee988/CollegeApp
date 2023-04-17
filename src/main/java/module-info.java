module com.example.collegeapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.collegeapp to javafx.fxml;
    exports com.example.collegeapp;
}