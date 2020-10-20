module edu.djc {
    requires javafx.controls;
    requires javafx.fxml;

    opens edu.djc to javafx.fxml;
    exports edu.djc;
}