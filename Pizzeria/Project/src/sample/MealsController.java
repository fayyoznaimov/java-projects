package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.stage.Stage;
import javafx.stage.StageStyle;



public class MealsController {
public int money=150000;
    @FXML
    private Button mealsCancelButton;
    @FXML
    private Button mealsPrevButton;
    @FXML
    private RadioButton lMargarita;
    @FXML
    private RadioButton mMargarita;
    @FXML
    private RadioButton sMargarita;
    @FXML
    private RadioButton lPeperoni;
    @FXML
    private RadioButton mPeperoni;
    @FXML
    private RadioButton sPeperoni;
    @FXML
    private RadioButton lKebab;
    @FXML
    private RadioButton mKebab;
    @FXML
    private RadioButton sKebab;
    @FXML
    private RadioButton lChicken;
    @FXML
    private RadioButton mChicken;
    @FXML
    private RadioButton sChicken;
    @FXML
    private RadioButton lAlfredo;
    @FXML
    private RadioButton mAlfredo;
    @FXML
    private RadioButton sAlfredo;
    @FXML
    private RadioButton lCheese;
    @FXML
    private RadioButton mCheese;
    @FXML
    private RadioButton sCheese;
    @FXML
    private Button orderButton;
    @FXML
    private Label pizzaLabel;


    public void mealNextPageButtonOnAction(ActionEvent event)
    {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Meal1.fxml"));
            Stage Meals1=new Stage();
            Meals1.initStyle(StageStyle.UNDECORATED);
            Meals1.setScene(new Scene(root, 819, 601));
            Meals1.show();

        }
        catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
    }
    public void MealsCancelButtonOnAction(ActionEvent event) {
        Stage stage = (Stage) mealsCancelButton.getScene().getWindow();
        stage.close();

    }
    public void handleOrderButtonAction (ActionEvent event)
    {   Pizza margarita=new Pizza();

        if(lMargarita.isSelected()) {
            margarita.setPrice(62000);
            if (money >= margarita.getPrice()) {
                money -= margarita.getPrice();
                System.out.println(margarita.getPrice());
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");

            }
            else pizzaLabel.setText("Lack of Money!");
        }
         else if(mMargarita.isSelected())
        {
            margarita.setPrice(52000);
            if (money >= margarita.getPrice()){
                money -= margarita.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
            }
            else pizzaLabel.setText("Lack of Money!");
        }
        else  if(sMargarita.isSelected())
        {
            margarita.setPrice(38000);
            if (money >= margarita.getPrice()){
                money -= margarita.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
            }
            else pizzaLabel.setText("Lack of Money!");
        }

    }
    public void  handleOrderButtonAction1 (ActionEvent event)
    {Pizza peperoni=new Pizza();
        if(lPeperoni.isSelected())
        {
            peperoni.setPrice(62000);
            if (money >= peperoni.getPrice()){
                money -= peperoni.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
            }
            else pizzaLabel.setText("Lack of Money!");
        }
         else if(mPeperoni.isSelected()) {
            peperoni.setPrice(52000);
            if (money >= peperoni.getPrice()) {
                money -= peperoni.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
            }
         }else if (sPeperoni.isSelected()) {
                peperoni.setPrice(38000);
                if (money >= peperoni.getPrice()) {
                    money -= peperoni.getPrice();
                    System.out.println("remainder:"+money);
                    pizzaLabel.setText("Successfully has been bought!");
                }
                else pizzaLabel.setText("Lack of Money!");}
            }
    public void handleOrderButtonAction2 (ActionEvent event)
    {Pizza kebab=new Pizza();
        if(lKebab.isSelected())
        {
            kebab.setPrice(72000);
            if (money >= kebab.getPrice()){
                money -= kebab.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
        }}
        else if(mKebab.isSelected())
        {
            kebab.setPrice(62000);
            if (money >= kebab.getPrice()){
                money -= kebab.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");

        }
            else pizzaLabel.setText("Lack of Money!");}

        else if(sKebab.isSelected())
        {
            kebab.setPrice(50000);
            if (money >= kebab.getPrice()){
                money -= kebab.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
        }
            else pizzaLabel.setText("Lack of Money!");}
    } public void handleOrderButtonAction3 (ActionEvent event)
    {Pizza chicken=new Pizza();
        if(lChicken.isSelected())
        {
            chicken.setPrice(65000);
            if (money >= chicken.getPrice()){
                money -= chicken.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
        }
            else pizzaLabel.setText("Lack of Money!");}
         else if(mChicken.isSelected())
        {
            chicken.setPrice(55000);
            if (money >= chicken.getPrice()){
                money -= chicken.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
        }
            else pizzaLabel.setText("Lack of Money!");}
         else if(sChicken.isSelected())
        {
            chicken.setPrice(45000);
            if (money >= chicken.getPrice()){
                money -= chicken.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");

        }
            else pizzaLabel.setText("Lack of Money!");}


    }
    public void handleOrderButtonAction4 (ActionEvent event)
    {Pizza alfredo=new Pizza();
        if(lAlfredo.isSelected())
        {
            alfredo.setPrice(62000);
            if (money >= alfredo.getPrice()){
                money -= alfredo.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");

        }else pizzaLabel.setText("Lack of Money!");}
         else if(mAlfredo.isSelected())
        {
            alfredo.setPrice(52000);
            if (money >= alfredo.getPrice()){
                money -= alfredo.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
        }else pizzaLabel.setText("Lack of Money!");}
        else  if(sAlfredo.isSelected())
        {
            alfredo.setPrice(38000);
            if (money >= alfredo.getPrice()){
                money -= alfredo.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
        }else pizzaLabel.setText("Lack of Money!");}


    }
    public void handleOrderButtonAction5 (ActionEvent event)
    {Pizza cheese=new Pizza();
        if(lCheese.isSelected())
        {
            cheese.setPrice(69000);
            if (money >= cheese.getPrice()){
                money -= cheese.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
        } else pizzaLabel.setText("Lack of Money!");}
        else  if(mCheese.isSelected() )
        {
            cheese.setPrice(58000);
            if (money >= cheese.getPrice()){
                money -= cheese.getPrice();
                System.out.println("remainder:"+money);
                pizzaLabel.setText("Successfully has been bought!");
        }else pizzaLabel.setText("Lack of Money!");}
         else if(sCheese.isSelected()) {
            cheese.setPrice(47000);
             if (money >= cheese.getPrice()){
                 money -= cheese.getPrice();
                 System.out.println("remainder:"+money);
                 pizzaLabel.setText("Successfully has been bought!");
        } else pizzaLabel.setText("Lack of Money!");}


    }
    public void mealsPrevButtonOnAction(ActionEvent event)
    {
        Stage stage = (Stage) mealsPrevButton.getScene().getWindow();
        stage.close();
    }
    int getMoney(){return money;}
}
