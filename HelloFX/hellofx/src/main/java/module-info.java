module edu.djc {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;
    opens edu.djc to javafx.fxml;
    exports edu.djc;
}