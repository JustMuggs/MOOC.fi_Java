package textstatistics;

import java.util.Arrays;
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
        TextArea textArea = new TextArea();
        layout.setCenter(textArea);

        HBox labelBar = new HBox();
        labelBar.setSpacing(10);

        Label firstLabel = new Label("Letters: 0");
        Label secondLabel = new Label("Words: 0");
        Label thirdLabel = new Label("The longest word is: ");

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                    .sorted((s1, s2) -> s2.length() - s1.length())
                    .findFirst()
                    .get();

            firstLabel.setText("Letters: " + String.valueOf(characters));
            secondLabel.setText("Words: " + String.valueOf(words));
            thirdLabel.setText("The longest word is: " + longest);
        });

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
