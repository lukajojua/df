module com.example.quiz4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.quiz4 to javafx.fxml;
    exports com.example.quiz4;
}