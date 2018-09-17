package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button clickMeButton;
    private int count = 0;
    private String str = " time";
    public void initialize () {


        clickMeButton.setOnAction(event -> {
            count ++;
            if(count > 1){
                str = " times";
            }
            if(count%10 == 0){
                str += "\n You naughty boy!!";
            }
            System.out.println("You clicked me " + count + str + "!");

        });
    }
}
