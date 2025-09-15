
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 6298674
 */
public class Lab3_Fall extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("User Registration Form");
        BorderPane root = new BorderPane();
        GridPane gp = new GridPane();
        
        Label fName = new Label("First Name:");
        Label lName = new Label("Last Name:");
        Label email = new Label("Email:");
        Label pass = new Label("Password:");
        
        TextField fNameText = new TextField();
        TextField lNameText = new TextField();
        TextField emailText = new TextField();
        TextField passText = new TextField();
        
        Button register = new Button("Register");
        register.setOnMouseClicked(event -> {
            if (emailText.getText().contains("@")) {
                String[] strs = emailText.getText().split("@");
                if (strs[0].length() >= 1 && strs[1].contains(".") && strs[1].split(".")[0].length() >= 1) {
                    System.out.println("Welcome");
                }
            } else {
                System.out.println("ERROR : Wrong email");
            }
        });
        register.setDisable(true);
        Button clear = new Button("Clear");
        clear.setOnMouseClicked(event -> {
           fNameText.clear();
           lNameText.clear();
           emailText.clear();
           passText.clear();
           register.setDisable(true);
        });
        
        gp.add(fName, 0, 0);
        gp.add(lName, 0, 1);
        gp.add(email, 0, 2);
        gp.add(pass, 0, 3);
        
        gp.add(fNameText, 1, 0);
        gp.add(lNameText, 1, 1);
        gp.add(emailText, 1, 2);
        gp.add(passText, 1, 3);
        
        gp.setVgap(10);
        
        VBox vb = new VBox(20, gp);
        HBox hb = new HBox(10, register, clear);
        
        VBox vb2 = new VBox(10, vb, hb);
        
        vb2.setPadding(new Insets(20));
        
        Scene scene = new Scene(vb2, 500, 300);
        stage.setScene(scene);
        
        fNameText.setOnKeyTyped(event -> {
            if (!(fNameText.getText().equals("")) && !(lNameText.getText().equals("")) && !(emailText.getText().equals("")) && !(passText.getText().equals("")) ) {
                register.setDisable(false);
            } else {
               register.setDisable(true); 
            }
        });
        lNameText.setOnKeyTyped(event -> {
            if (!(fNameText.getText().equals("")) && !(lNameText.getText().equals("")) && !(emailText.getText().equals("")) && !(passText.getText().equals("")) ) {
                register.setDisable(false);
            } else {
               register.setDisable(true); 
            }
        });
        emailText.setOnKeyTyped(event -> {
            if (!(fNameText.getText().equals("")) && !(lNameText.getText().equals("")) && !(emailText.getText().equals("")) && !(passText.getText().equals("")) ) {
                register.setDisable(false);
            } else {
               register.setDisable(true); 
            }
        });
        passText.setOnKeyTyped(event -> {
            if (!(fNameText.getText().equals("")) && !(lNameText.getText().equals("")) && !(emailText.getText().equals("")) && !(passText.getText().equals("")) ) {
                register.setDisable(false);
            } else {
               register.setDisable(true); 
            }
        });
        
        
        stage.show();
    }
}


