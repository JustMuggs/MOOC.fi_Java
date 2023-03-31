package application;

import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage stage) {
        BorderPane layout = new BorderPane();

        BorderPane savingsBP = new BorderPane();

        Slider savingsSlider = new Slider(25, 250, 25);
        savingsSlider.setSnapToTicks(true);
        savingsSlider.setBlockIncrement(500);
        savingsSlider.setShowTickMarks(true);
        savingsSlider.setShowTickLabels(true);

        Label savingsInfo = new Label();
        savingsInfo.setText("" + savingsSlider.getValue());

        savingsBP.setLeft(new Label("Monthly savings"));
        savingsBP.setCenter(savingsSlider);
        savingsBP.setRight(savingsInfo);
        savingsBP.setPadding(new Insets(10));

        BorderPane interestBP = new BorderPane();

        Slider interestSlider = new Slider(0, 10, 0);
        interestSlider.setMinorTickCount(10);
        interestSlider.setShowTickMarks(true);
        interestSlider.setShowTickLabels(true);

        Label interestInfo = new Label();
        interestInfo.setText("" + interestSlider.getValue());

        interestBP.setLeft(new Label("Yearly interest rate"));
        interestBP.setCenter(interestSlider);
        interestBP.setRight(interestInfo);
        interestBP.setPadding(new Insets(10));

        VBox topVB = new VBox();
        topVB.getChildren().addAll(savingsBP, interestBP);
        layout.setTop(topVB);

        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setAnimated(false);
        lineChart.setLegendVisible(false);
        lineChart.setTitle("Savings calculator");
        layout.setCenter(lineChart);

        XYChart.Series savingsSeries = new XYChart.Series();
        XYChart.Series interestSeries = new XYChart.Series();
        lineChart.getData().addAll(savingsSeries, interestSeries);

        savingsSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            int savings = newvalue.intValue();
            savingsInfo.setText("" + savings);

            updateSavings(savingsSlider.getValue(), interestSlider.getValue(), savingsSeries, interestSeries);
        });

        interestSlider.valueProperty().addListener((observable, oldvalue, newvalue) -> {
            interestInfo.setText("" + newvalue);

            updateSavings(savingsSlider.getValue(), interestSlider.getValue(), savingsSeries, interestSeries);
        });
        for (int year = 0; year < 31; year++) {
            double sum = savingsSlider.getValue() * 12 * year;
            savingsSeries.getData().add(new XYChart.Data(year, sum));
            interestSeries.getData().add(new XYChart.Data(year, sum));
        }

        Scene view = new Scene(layout, 640, 480);
        stage.setScene(view);
        stage.show();
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

    private void updateSavings(double savings, double interest, XYChart.Series savingsSeries, XYChart.Series interestSeries) {
        savingsSeries.getData().clear();
        interestSeries.getData().clear();

        savingsSeries.getData().add(new XYChart.Data(0, 0));
        interestSeries.getData().add(new XYChart.Data(0, 0));

        double savs = 0.0;
        double intrs = 0.0;

        for (int i = 0; i <= 30; i++) {
            savingsSeries.getData().add(new XYChart.Data(i, savs));
            interestSeries.getData().add(new XYChart.Data(i, intrs));

            savs += savings * 12;
            intrs = (intrs + savings * 12) * (1.0 + interest / 100.0);
        }
    }

}
