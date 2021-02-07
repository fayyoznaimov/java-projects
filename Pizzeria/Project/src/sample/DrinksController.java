package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class DrinksController {


        @FXML
        private Button drinksCancelButton;
        @FXML
        private Button drinksPrevButton;
        @FXML
        private Button drinksNextButton;
    public void drinksNextButtonOnAction(ActionEvent event) {
        drinks();
    }
    public void drinks() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Drinks1.fxml"));
            Stage Drinks1 = new Stage();
            Drinks1.initStyle(StageStyle.UNDECORATED);
            Drinks1.setScene(new Scene(root, 819, 601));
            Drinks1.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }


    }

    public void DrinksCancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) drinksCancelButton.getScene().getWindow();
        stage.close();

    }
    public void DrinksPrevButtonOnAction(ActionEvent event)
    {
        Stage stage = (Stage) drinksPrevButton.getScene().getWindow();
        stage.close();

    }
}
