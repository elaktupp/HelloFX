/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import java.util.ArrayList;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonsPartial extends HBox {
    
    // Button components for actions
    private final Button buttonClose = new Button("Close");
    private final Button buttonSave = new Button("Save");
    private final Button buttonPrint = new Button("Print");

    private ArrayList<UserInfo> infoList = new ArrayList();
    
    public ButtonsPartial(TextAreaPartial textArea, TextFieldsPartial textFields) {
 
        this.setStyle("-fx-padding:10;-fx-spacing:10");
        
        // Add Buttons to layout
        this.getChildren().add(buttonClose);
        this.getChildren().add(buttonSave);
        this.getChildren().add(buttonPrint);
        
        buttonClose.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                Platform.exit(); // rather use this on FX than System.exit
            }
            
        });
        
        buttonSave.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                infoList.add(textFields.getUserInfo());
            }
            
        });
        
        buttonPrint.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent event) {
                for (UserInfo info : infoList) {
                    textArea.appendText(info.getName());
                    textArea.appendText(info.getAddress());
                    textArea.appendText(info.getPhone());
                }
            }
            
        });
    }
    
}
