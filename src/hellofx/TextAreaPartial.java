/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextAreaPartial extends VBox {
    
    private final TextArea textArea = new TextArea();
    
    public TextAreaPartial() {

        this.setStyle("-fx-padding:10,10,10,10");
        this.getChildren().add(textArea);
        
    }
    
    public void appendText(String text) {
        textArea.appendText(text+"\n");
    }
}
