package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class SaladsController {
    @FXML
    private Button saladsCancelButton;
    @FXML
    private Button saladsPrevButton;
    @FXML
    private Button saladsNextButton;
    @FXML
    private Label saladsLabel;
MealsController controller=new MealsController();
int remainder=0;


    public void SaladNextPageButtonOnAction(ActionEvent event)
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Salad.fxml"));
            Stage Salad=new Stage();
            Salad.initStyle(StageStyle.UNDECORATED);
            Salad.setScene(new Scene(root, 819, 601));
            Salad.show();
        }
        catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
    public void saladOrderAction1(ActionEvent event)
    {
        Salads greece=new Salads();
        greece.setPrice(15000);
        if(controller.getMoney()>=greece.getPrice())
        {
            controller.money=controller.getMoney()-greece.getPrice();
            saladsLabel.setText("Successfully has been bought!");
            System.out.println("remainder:"+controller.money);
        }
        else
            saladsLabel.setText("Lack of money!");
    }
    public void saladOrderAction2(ActionEvent event)
    {
        Salads cesar=new Salads();
        cesar.setPrice(15000);
        if(controller.getMoney()>=cesar.getPrice())
        { controller.money=controller.money-cesar.getPrice();
            saladsLabel.setText("Successfully has been bought!");
            System.out.println("remainder:"+controller.money);
        }
        else
            saladsLabel.setText("Lack of money!");
    }
    public void saladOrderAction3(ActionEvent event)
    {
        Salads alfredo=new Salads();
        alfredo.setPrice(29000);
        if(controller.getMoney()>=alfredo.getPrice())
        {
            controller.money=controller.money-alfredo.getPrice();
            saladsLabel.setText("Successfully has been bought!");
            System.out.println("remainder:"+controller.money);
        }
        else
            saladsLabel.setText("Lack of money!");
    }
    public void saladOrderAction4(ActionEvent event)
    {
        Salads fries=new Salads();
        fries.setPrice(12000);
        if(controller.getMoney()>=fries.getPrice())
        {
            controller.money=controller.money-fries.getPrice();
            saladsLabel.setText("Successfully has been bought!");
            System.out.println("remainder:"+controller.money);
        }
        else
            saladsLabel.setText("Lack of money!");
    }
    public void saladOrderAction5(ActionEvent event)
    {
        Salads potato=new Salads();
        potato.setPrice(14000);
        if(controller.getMoney()>=potato.getPrice())
        {
            controller.money=controller.money-potato.getPrice();
            saladsLabel.setText("Successfully has been bought!");
            System.out.println("remainder:"+controller.money);
        }
        else
            saladsLabel.setText("Lack of money!");
    }
    public void saladOrderAction6(ActionEvent event)
    {
        Salads sinamons=new Salads();
        sinamons.setPrice(16000);
        if(controller.getMoney()>=sinamons.getPrice())
        {
            controller.money=controller.money-sinamons.getPrice();
            saladsLabel.setText("Successfully has been bought!");
            System.out.println("remainder:"+controller.money);
        }
        else
            saladsLabel.setText("Lack of money!");
    }
    public void SaladCancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) saladsCancelButton.getScene().getWindow();
        stage.close();

    }
    public void mealsPrevButtonOnAction(ActionEvent event)
    {
        Stage stage = (Stage) saladsPrevButton.getScene().getWindow();
        stage.close();
    }
}

