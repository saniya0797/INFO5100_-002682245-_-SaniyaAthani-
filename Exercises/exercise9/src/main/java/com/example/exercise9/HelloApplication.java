package com.example.exercise9;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.control.skin.ColorPickerSkin;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    TextField textfield = new TextField();  //creating a TextField object
    double operand1,operand2;   //declaring variable to store operands values
    String operator ="";      //initializing operator as a empty string
    boolean start = true;  //boolean variable to check whether user has started entering values or not
    Calculate cal=new Calculate();  //creating object of Calculate class

    @Override
    public void start(Stage stage) throws IOException {

        BorderPane root = new BorderPane();                //creating Borderpane as a main layout
        Scene scene = new Scene(root, 260, 380);     //creating a Scene object with root and size parameter
        stage.setScene(scene);          //setting the stage for scene
        stage.setTitle("CALCULATOR");   //setting the stage name
        stage.show();                   //showig the stage
        stage.setResizable(true);      //setting stage resizable(user can resize the stage)

        textfield.setFont(Font.font(25));  //setting the fontsize for the textfield
        textfield.setPrefHeight(50);         //setting height for the textfield
        textfield.setAlignment(Pos.CENTER);   //aligning text of the textfield in a center
        textfield.setEditable(true);  //allowing user textfield editable
        root.setTop(textfield);      //setting textfield on the top of Borderpane

        FlowPane flow = new FlowPane();  //creating object of Flowpane to hold the buttons
        flow.setHgap(10);    //setting horizontal gap between buttons
        flow.setVgap(10);    //setting vertical gap between buttons
        flow.setAlignment(Pos.CENTER);  //aligning button on the center of the Flowpane
        flow.getChildren().addAll(createOperandsButton("7", e->processOperandsButton(e)), //adding all operators and operands buttons to the FlowPane
                createOperandsButton("8",e->processOperandsButton(e)),
                createOperandsButton("9",e->processOperandsButton(e)),createOperatorButton("/",e->processOperatorButton(e)),
                createOperandsButton("4",e->processOperandsButton(e)), createOperandsButton("5",e->processOperandsButton(e)),
                createOperandsButton("6",e->processOperandsButton(e)), createOperatorButton("*",e->processOperatorButton(e)),
                createOperandsButton("1",e->processOperandsButton(e)), createOperandsButton("2",e->processOperandsButton(e)),
                createOperandsButton("3",e->processOperandsButton(e)), createOperatorButton("-",e->processOperatorButton(e)),
                createOperandsButton(".",e->processOperandsButton(e)), createOperandsButton("0",e->processOperandsButton(e)),
                createOperatorButton("=",e->processOperatorButton(e)), createOperatorButton("+",e->processOperatorButton(e)),
                createOperatorButton("%",e->processOperatorButton(e)));
        root.setCenter(flow);  //setting FlowPane at the center of the BorderPane

    }

    Button createOperandsButton(String bt,EventHandler<ActionEvent> handler) {   //method for creating operands button
        Button button = new Button(bt);   //creating button object
        button.setFont(Font.font(23));  //setting font size
        button.setPrefSize(50, 50);   //setting width and height of the button
        button.setOnAction(handler);        //setting event handler for button
        return button;                      //return button
    }
    void processOperandsButton(ActionEvent e) {  //method to process operands when operands button is pressed
        if (start) {               //if start boolean is true the textfield is cleared
            textfield.setText("");
            start = false;
        }
        String value = ((Button) e.getSource()).getText(); //value is stored in "value"
        textfield.setText(textfield.getText() + value); // the value is added to the textfield
    }
    Button createOperatorButton(String bt,EventHandler<ActionEvent> handler) {   //method for creating operator button
        Button button = new Button(bt);   //creating button object
        button.setFont(Font.font(23));  //setting font size
        button.setPrefSize(50, 50);  //setting width and height of the button
        button.setOnAction(handler);      //setting event handler for button
        return button;                    //return button
    }
    void processOperatorButton(ActionEvent e)  {    //method to process operators when operator button is pressed
        String value = ((Button) e.getSource()).getText();  //
        if (!value.equals("=")) {   //if the operator is not equal to "=" and operator variable is not empty then method returns without performing any operation
            if (!operator.isEmpty())
                return;
            operand1 = Double.parseDouble(textfield.getText());
            operator = value;
            textfield.setText("");

        } else {       //else method calculates the result of the operation and set the start boolean to " true" to perform next operation
            if (operator.isEmpty())
                return;
            operand2 = Double.parseDouble(textfield.getText());
            double result=cal.calculator(operand1, operand2, operator);
            textfield.setText(String.valueOf(result));
            start=true;
            operator="";
        }
    }
    public static void main(String[] args) {   //main method
        launch();        //launching application
    }
}