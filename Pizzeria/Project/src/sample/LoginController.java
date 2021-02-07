package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.stage.StageStyle;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;


public class LoginController  {
    @FXML
    private Button cancelButton;
    @FXML
    private Label loginmsgLabel;
    @FXML
    private TextField usernameTextField;
    @FXML
    private PasswordField enterPasswordField;
    @FXML
    private Button registrationButton;

public int money;

    public void loginBottonOnAction(ActionEvent event)
    {

        if(!usernameTextField.getText().isBlank() && !enterPasswordField.getText().isBlank())

        {
            validateLogin();
        }
        else {
            loginmsgLabel.setText("Please enter username and password");
        }
    }
    public void cancelButtonOnAction(ActionEvent event){
        Stage stage =(Stage)cancelButton.getScene().getWindow();
        stage.close();
    }
    public void registrationButtonOnAction(ActionEvent event)
    {
        registration();
    }
    public int validateLogin() {
        DatabaseConnection connect = new DatabaseConnection();
        Connection connectDB = connect.getConnection();
        String verifyLogin = "select * from user_account where username = '"+usernameTextField.getText()+"'";

        //String verifyLogin = "select count(1) from user_account where username= '" + usernameTextField.getText() + "'AND password='" + enterPasswordField.getText() + "'";


        try {
            Statement statement1 = connectDB.createStatement();
            ResultSet result = statement1.executeQuery(verifyLogin);

            while (result.next()) {
                String getPassword=new String(enterPasswordField.getText());
                String password=new String(result.getString("password"));
                String getUsername=new String(usernameTextField.getText());
                String username=new String(result.getString("username"));



                if ((getPassword.equals(password)) &&((getUsername.equals(username)))){

                    money=(result.getInt("amount"));
                     login();
                } else
                    loginmsgLabel.setText("invalid login!Please register first!");


            }

        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return money; }



public void registration(){
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
            Stage registration=new Stage();
            registration.initStyle(StageStyle.UNDECORATED);
            registration.setScene(new Scene(root, 520, 526));
            registration.show();

        }
        catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
}
public void login()
{
    try {
        Parent root = FXMLLoader.load(getClass().getResource("Pizzeria.fxml"));
        Stage Pizzeria=new Stage();
        Pizzeria.initStyle(StageStyle.UNDECORATED);
        Pizzeria.setScene(new Scene(root, 819, 541));
        Pizzeria.show();



    }
    catch (Exception e){
        e.printStackTrace();
        e.getCause();
    }
}

}
