/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextFieldsPartial extends VBox {

    // Query components
    private final Label labelName = new Label("Name");
    private final TextField fieldName = new TextField(); // single line, Area for multi
    private final Label labelAddress = new Label("Address");
    private final TextField fieldAddress = new TextField(); // single line, Area for multi
    private final Label labelPhone = new Label("Phone");
    private final TextField fieldPhone = new TextField(); // single line, Area for multi
    // Layout for Query components
    // private final VBox queries = new VBox(); <- Not needed since extends VBox
    
    public TextFieldsPartial() {
        
        // ("-fx-padding:0,10,0,10"); // :top,right,bottom,left
        this.setStyle("-fx-padding:10;-fx-spacing:10");
        
        this.setMinWidth(100);

        // Add Query components to layout
        this.getChildren().add(labelName);
        this.getChildren().add(fieldName);
        this.getChildren().add(labelAddress);
        this.getChildren().add(fieldAddress);
        this.getChildren().add(labelPhone);
        this.getChildren().add(fieldPhone);
       
    }
    
    public UserInfo getUserInfo() {
        UserInfo info = new UserInfo();
        info.setName(fieldName.getText());
        info.setAddress(fieldAddress.getText());
        info.setPhone(fieldPhone.getText());
        return info;
    }
}
