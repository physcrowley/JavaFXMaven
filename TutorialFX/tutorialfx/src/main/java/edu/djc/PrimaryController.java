package edu.djc;

import java.util.Random;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController 
{
    @FXML
    Label number;
    
    public void generateRandom(ActionEvent event)
    {
        var rand = new Random();
        int myrand = rand.nextInt(50) + 1;
        number.setText(Integer.toString(myrand));
        //System.out.println(myrand);
    }
}
