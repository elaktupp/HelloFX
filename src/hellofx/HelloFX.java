/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import java.awt.BasicStroke;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.border.StrokeBorder;

/**
 *
 * @author Ohjelmistokehitys
 */
public class HelloFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // Note: Root layout should contain only other layouts.
        
        // Main layout is root
        VBox root = new VBox();

        // Query components
        Label labelName = new Label("Name");
        TextField fieldName = new TextField(); // single line, Area for multi
        Label labelAddress = new Label("Address");
        TextField fieldAddress = new TextField(); // single line, Area for multi
        Label labelPhone = new Label("Phone");
        TextField fieldPhone = new TextField(); // single line, Area for multi
        
        // Layout for Query components
        VBox queries = new VBox();

        // ("-fx-padding:0,10,0,10"); // :top,right,bottom,left
        queries.setStyle("-fx-padding:10;-fx-spacing:10");
        
        // Add Query components to layout
        queries.getChildren().add(labelName);
        queries.getChildren().add(fieldName);
        queries.getChildren().add(labelAddress);
        queries.getChildren().add(fieldAddress);
        queries.getChildren().add(labelPhone);
        queries.getChildren().add(fieldPhone);
        
        // Add queries layout to root
        root.getChildren().add(queries);
        
        // Layout for action Button components
        HBox buttons = new HBox();

        buttons.setStyle("-fx-padding:10;-fx-spacing:10");
        
        // Button components for actions
        Button buttonClose = new Button("Close");
        Button buttonSave = new Button("Save");
        
        // Add Buttons to layout
        buttons.getChildren().add(buttonClose);
        buttons.getChildren().add(buttonSave);
        
        // Add buttons layout to root
        root.getChildren().add(buttons);
        
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("IDEA");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
