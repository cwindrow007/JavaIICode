/*
Author: Christopher Windrow
Description: Week 7 GUI and JavaFX. This assignment creates a GUI using JavaFX which allows a user to input a running pace and outputs the average pace per mile.
                this will change depending on tue user selection of 1 mile, 5k, 10k, 1/2 marathon, or marathon.
 */
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class week7Assignment extends Application {

    //Method to calculate seconds to hours
    private long calcTotalSec(int hours, int minutes, int seconds) {
        return (hours * 3600L) + (minutes * 60L) + seconds;
    }
    //Method to determine race distance
    private double getDistanceInMiles(RadioButton raceSelection) {
        switch(raceSelection.getText()){
            case "1 Miles":
                return 1.0;
            case "5k": //5K in miles
                return 3.106;
            case "10k": //10k in miles
                return 6.211;
            case "1/2 Mar": //Half Marathon in miles
                return 13.109;
            case "Marathon": //Marathon in miles
                return 26.219;
            default:
                return 0.0; //Default case

        }
    }

    //Method to calculate Pace
    private String calcPacePerMile(long totalSeconds, double distanceInMiles){
        double paceInSecondsPerMiles = totalSeconds/ distanceInMiles;
        long hours = (long) (paceInSecondsPerMiles / 3600);
        long minutes = (long) (paceInSecondsPerMiles % 3600) / 60;
        long seconds = (long) (paceInSecondsPerMiles % 60);
        return String.format("%d hours \n%d minutes\n%d seconds per mile", hours, minutes, seconds);
    }


    @Override
    public void start(Stage primaryStage) throws Exception{
        //Pace Display
        Label pace = new Label("Pace: 00:00:00 per mile");

        //Radio Button
        ToggleGroup mileageGroup = new ToggleGroup();
        //1st Miles Radio Button
        RadioButton oneMile = new RadioButton("1 Miles");
        oneMile.setToggleGroup(mileageGroup);
        //5k Radio button
        RadioButton fiveK = new RadioButton("5k");
        fiveK.setToggleGroup(mileageGroup);
        //10K Radio Button
        RadioButton tenK = new RadioButton("10k");
        tenK.setToggleGroup(mileageGroup);
        //Half-Marathon Radio Button
        RadioButton halfMarathon = new RadioButton("1/2 Mar");
        halfMarathon.setToggleGroup(mileageGroup);
        RadioButton marathon = new RadioButton("Marathon");
        marathon.setToggleGroup(mileageGroup);

        //Time entry fields
        TextField hours = new TextField("0");
        TextField minutes = new TextField("0");
        TextField seconds = new TextField("0");

        //Calculate Pace

        Button calcPace = new Button("Calculate Pace");
        calcPace.setOnAction(actionEvent -> {
            //Integer parsing
            int mileHours = Integer.parseInt(hours.getText());
            int mileMinutes = Integer.parseInt(minutes.getText());
            int mileSeconds = Integer.parseInt(seconds.getText());

            //Getting selected race and distance
            RadioButton raceSelection = (RadioButton) mileageGroup.getSelectedToggle();
            double distanceInMiles = getDistanceInMiles(raceSelection);

            //Calculating Pace

            long totalSeconds = calcTotalSec(mileHours, mileMinutes, mileSeconds);
            String paceCalc = calcPacePerMile(totalSeconds, distanceInMiles);

            //Displaying pace
            pace.setText("Pace: " + paceCalc);


        });


        //Layout
        VBox layout = new VBox(
                10, oneMile, fiveK, tenK, halfMarathon, marathon,
                new Label("Hours"), hours, new Label("Minutes"), minutes, new Label("Seconds"), seconds, calcPace, pace);
        layout.setPadding(new Insets(20));

        //Scene
        Scene scene = new Scene(layout, 500, 450);
        primaryStage.setTitle("Running Pace Calculator - Christopher Windrow");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    //Main method
    public static void main(String[] args) {

        launch(args);
    }

}
