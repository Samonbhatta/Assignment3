

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import javax.swing.*;


public class Triangle extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        GridPane gridpane= new GridPane();
        gridpane.setPadding(new Insets(15,15,15,15));
        gridpane.setVgap(15);
        gridpane.setHgap(15);

        Label label = new Label("Please enter first side of triangle");
        GridPane.setConstraints(label,0,0);
        gridpane.getChildren().addAll(label);

        TextField firstside=new TextField();
        GridPane.setConstraints(firstside,1,0);
        gridpane.getChildren().addAll(firstside);

        Label label1 = new Label("Please enter Second side of triangle");
        GridPane.setConstraints(label1,0,1);
        gridpane.getChildren().addAll(label1);

        TextField secondside=new TextField();
        GridPane.setConstraints(secondside,1,1);
        gridpane.getChildren().addAll(secondside);

        Label label2 = new Label("Please enter third side of triangle");
        GridPane.setConstraints(label2,0,2);
        gridpane.getChildren().addAll(label2);

        TextField thirdside=new TextField();
        GridPane.setConstraints(thirdside,1,2);
        gridpane.getChildren().addAll(thirdside);

        Button submitBtx = new Button("Submit");
        submitBtx.setOnAction(e->{
            double a=Double.parseDouble(firstside.getText());
            double b = Double.parseDouble(secondside.getText());
            double c = Double.parseDouble(thirdside.getText());

            if((a+b>c)&&(b+c>a)&&(a+c>b)){
                double perimeter = a+b+c;

                JOptionPane.showMessageDialog(null,"THe perimeter of the triangle is " + perimeter);
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Input");


            }
        });
        GridPane.setConstraints(submitBtx,3,2);
        gridpane.getChildren().addAll(submitBtx);




        Scene scene = new Scene(gridpane);
        primaryStage.setScene(scene);
        primaryStage.setTitle("The perimeter calculator");

        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
