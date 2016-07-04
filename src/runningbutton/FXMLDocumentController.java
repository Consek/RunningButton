/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningbutton;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;


/**
 *
 * @author Consek
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button button;
    
    @FXML
    private void handleButtonAction(MouseEvent event) {
        System.out.println("You clicked me!");
        button.setText("Hello World!");
        
        Random r = new Random();
        button.setLayoutX(r.nextDouble() * 320);
        button.setLayoutY(r.nextDouble() * 365);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
