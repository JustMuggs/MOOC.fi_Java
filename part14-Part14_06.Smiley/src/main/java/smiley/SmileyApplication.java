package smiley;

import javafx.scene.paint.Color;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(300, 300);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        drawSmiley(painter);

        BorderPane smileyLayout = new BorderPane();
        smileyLayout.setCenter(paintingCanvas);

        Scene view = new Scene(smileyLayout);

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    private void drawSmiley(GraphicsContext gc) {

        gc.setFill(Color.BLACK);
        gc.fillRect(70, 60, 25, 25);
        gc.fillRect(200, 60, 25, 25);
        gc.fillRect(75, 200, 150, 25);
        gc.fillRect(75, 175, 25, 25);
        gc.fillRect(200, 175, 25, 25);
    }
}
