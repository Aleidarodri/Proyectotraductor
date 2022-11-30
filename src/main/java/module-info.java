module com.example.traductor {
    requires javafx.controls;
    requires javafx.fxml;
    requires antlr;


    opens com.example.traductor to javafx.fxml;
    exports com.example.traductor;
    exports com.example.main;
    opens com.example.main to javafx.fxml;
}