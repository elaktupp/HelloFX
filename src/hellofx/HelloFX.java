/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellofx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 *
 * @author Ohjelmistokehitys
 */
public class HelloFX extends Application {

    private final TextFieldsPartial inputZone = new TextFieldsPartial();
    private final TextAreaPartial textListZone = new TextAreaPartial();
    private final ButtonsPartial buttonZone = new ButtonsPartial(textListZone,inputZone);
    
    @Override
    public void start(Stage primaryStage) {

        // Note: Root layout should contain only other layouts.
        
        // Main layout is root
        BorderPane root = new BorderPane();
        
        // Add text query layout to root
        root.setCenter(inputZone);

        // Add buttons layout to root
        root.setBottom(buttonZone);
        
        // Add printing pane
        root.setRight(textListZone);
        
        Scene scene = new Scene(root);
        primaryStage.setTitle("IDEA");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
