/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openwindow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;

/**
 *
 * @author w00kyx
 */
public class FXMLNewWindowController {
    @FXML
    private Label label;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked in NewWindow!");
        label.setText("Hello World New Window!!!!!!!!");
    }
    
    @FXML
    private void handleButtonActionClose(ActionEvent event) {
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }
    
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
