package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RegisterController {
    @FXML private Button closeButton;
    @FXML private Label registrationLabel;
    @FXML private PasswordField setPasswordField;
    @FXML private PasswordField confirmPasswordField;
    @FXML private Label confirmPasswordLabel;
    @FXML private TextField firstnameTextField;
    @FXML private TextField lastnameTextField;
    @FXML private TextField usernameTextField;
    @FXML private TextField moneyTextField;

    int money = 200;

    DatabaseConnection connect=new DatabaseConnection();
    Connection connectDB=connect.getConnection();
    public void closeButtonOnAction(ActionEvent event)
    {
        Stage stage=(Stage)closeButton.getScene().getWindow();
        stage.close();


    }
    public void registerButtonOnAction(ActionEvent event)
    {
        if(setPasswordField.getText().equals(confirmPasswordField.getText()))
        {
            registerUser();
            confirmPasswordLabel.setText("");


        }
        else
        {
            confirmPasswordLabel.setText("Password does not match!");
        }

    }
    public void registerUser()
    {

       //making readable code
       String firstname = firstnameTextField.getText();
       String lastname = lastnameTextField.getText();
       String username = usernameTextField.getText();
       String password = setPasswordField.getText();
       String amount = moneyTextField.getText();
       money = Integer.parseInt(amount);


           if (!firstname.isBlank() && !lastname.isBlank() && !username.isBlank() && !password.isBlank()) {

               try {
                   Statement statement = connectDB.createStatement();
                   //validation for unique username
                   String SQL = "select * from user_account where username='" + username + "'";

                   ResultSet rs = statement.executeQuery(SQL);


                   if (!rs.next()) {
                       registrationLabel.setText("User has been registered successfully!");
                       String insertFields = "INSERT INTO USER_ACCOUNT(firstname, lastname, username, password,amount) VALUES ('";
                       String insertValues = firstname + "','" + lastname + "','" + username + "','" + password +"',"+money+")";
                       String insertToRegister = insertFields + insertValues;
                       statement.executeUpdate(insertToRegister);



                   }
                   else
                       registrationLabel.setText("The given username already exists!");
               }
               catch (Exception e) {
                   e.printStackTrace();
                   e.getCause();

               }


           }else
               registrationLabel.setText("Please fill all fields!");




    }

}
