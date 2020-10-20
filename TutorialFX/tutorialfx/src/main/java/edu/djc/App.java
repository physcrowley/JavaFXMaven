package edu.djc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX App
 */
public class App extends Application {

    public static void main(String[] args) 
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception 
    {
        Parent root = FXMLLoader.load(App.class.getResource("fxml/primary.fxml"));
        
        var scene = new Scene(root);
        scene.getStylesheets().add(App.class.getResource("css/styles.css").toExternalForm());

        stage.setScene(scene);
        stage.show();

    }
    
}