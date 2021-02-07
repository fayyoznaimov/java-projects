package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import javafx.stage.StageStyle;




public class PizzeriaController {
    @FXML
    private Button logoutButton;

    public void mealsButtonOnAction(ActionEvent event) {
        meals();
    }


    public void meals() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Meals.fxml"));
            Stage Meals = new Stage();
            Meals.initStyle(StageStyle.UNDECORATED);
            Meals.setScene(new Scene(root, 819, 601));
            Meals.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }


    }

    public void saladsButtonOnAction(ActionEvent event) {
        salads();
    }

    public void salads() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Salad1.fxml"));
            Stage Salad1 = new Stage();
            Salad1.initStyle(StageStyle.UNDECORATED);
            Salad1.setScene(new Scene(root, 819, 601));
            Salad1.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }

    public void drinksButtonOnAction(ActionEvent event) {
        drinks();
    }

    public void drinks() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Drinks.fxml"));
            Stage Drink = new Stage();
            Drink.initStyle(StageStyle.UNDECORATED);
            Drink.setScene(new Scene(root, 819, 601));
            Drink.show();
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
    }


    public void logoutButtonOnAction(ActionEvent event)
    {
        Stage stage=(Stage)logoutButton.getScene().getWindow();
        stage.close();
    }
}