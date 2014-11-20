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
        
        // Add text query layout to root
        root.getChildren().add(new TextFieldsPartial());

        // Add buttons layout to root
        root.getChildren().add(new ButtonsPartial());
        
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
