package textstatistics;

import javafx.scene.control.TextArea;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;



public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        layout.setCenter(new TextArea("Text field"));

        HBox labelBar = new HBox();
        labelBar.setSpacing(10);

        Label firstLabel = new Label("Letters: 0");
        Label secondLabel = new Label("Words: 0");
        Label thirdLabel = new Label("The longest word is: ");

        labelBar.getChildren().add(firstLabel);
        labelBar.getChildren().add(secondLabel);
        labelBar.getChildren().add(thirdLabel);
        layout.setBottom(labelBar);        

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}
