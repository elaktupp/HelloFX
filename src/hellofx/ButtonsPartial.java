/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonsPartial extends HBox implements EventHandler<ActionEvent> {
    
    // Button components for actions
    private final Button buttonClose = new Button("Close");
    private final Button buttonSave = new Button("Save");

    public ButtonsPartial() {
 
        this.setStyle("-fx-padding:10;-fx-spacing:10");
        // HBox.setMargin(this, new Insets(10,10,10,10)); <- Not working here?
        
        // Add Buttons to layout
        this.getChildren().add(buttonClose);
        this.getChildren().add(buttonSave);
        
        // When implements EventHandler interface need to set who
        buttonClose.setOnAction(this); // Who gets the event
        buttonSave.setOnAction(this);
        
        // Inline implementation for ActionEvent, it per Button, no need to setOnAction
//        buttonClose.setOnAction(new EventHandler<ActionEvent>() {
//
//            @Override
//            public void handle(ActionEvent event) {
//                Platform.exit(); // rather use this on FX than System.exit
//            }
//            
//        });
    }

    // Compared to inline implementation this is for all Buttons
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource().equals(buttonClose)) {
            Platform.exit(); // rather use this on FX than System.exit
        } else {
            System.out.println("SAVE");
        }
    }
    
}
