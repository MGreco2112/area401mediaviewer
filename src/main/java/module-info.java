module com.example.area401video {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.area401video to javafx.fxml;
    exports com.example.area401video;
}