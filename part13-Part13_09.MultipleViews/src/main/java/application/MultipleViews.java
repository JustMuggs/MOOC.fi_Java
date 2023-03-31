package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {

        BorderPane firstBP = new BorderPane();
        firstBP.setTop(new Label("First view!"));
        Button firstButton = new Button("To the second view!");
        firstBP.setCenter(firstButton);
        Scene first = new Scene(firstBP);
        
        VBox secondVBox = new VBox();
        Button secondButton = new Button("To the third view!");
        Label secondLabel = new Label("Second view!");
        secondVBox.getChildren().addAll(secondButton, secondLabel);
        Scene second = new Scene(secondVBox);
        
        GridPane thirdGP = new GridPane();
        Label thirdLabel = new Label("Third view!");
        Button thirdButton = new Button("To the first view!");
        thirdGP.add(thirdLabel, 0, 0);
        thirdGP.add(thirdButton, 1, 1);
        Scene third = new Scene(thirdGP);
        
        firstButton.setOnAction((event) -> {
            window.setScene(second);
        });
        secondButton.setOnAction((event) -> {
            window.setScene(third);
        });
        thirdButton.setOnAction((event) -> {
            window.setScene(first);
        });


        window.setScene(first);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
