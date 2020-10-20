module edu.djc {
    requires javafx.controls;
    requires javafx.fxml;
    exports edu.djc;
    opens edu.djc to javafx.fxml;
}