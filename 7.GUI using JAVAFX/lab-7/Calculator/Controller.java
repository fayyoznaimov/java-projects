package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
float data;
int operation=-1;


    @FXML
    public Button seven;

    @FXML
    public Button eight;

    @FXML
    public Button nine;

    @FXML
    public Button devide;

    @FXML
    public Button four;

    @FXML
    public Button five;

    @FXML
    public Button six;

    @FXML
    public Button multipy;

    @FXML
    public Button one;

    @FXML
    public Button two;

    @FXML
    public Button three;

    @FXML
    public Button minus;

    @FXML
    public Button zero;

    @FXML
    public Button parial;

    @FXML
    public Button equal;

    @FXML
    public Button plus;

    @FXML
    public TextField display;

    @FXML
    void handleButtonAction(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        }
        else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        }
        else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        }
        else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        }
        else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        }
        else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        }
        else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        }
        else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        }
        else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        }
        else if (event.getSource() == plus) {
            data=Float.parseFloat(display.getText());
            operation=1;
            display.setText("");
        }
        else if(event.getSource()==minus){
            data=Float.parseFloat(display.getText());
            operation=2;
            display.setText("");
        }
        else if(event.getSource()==multipy){
            data=Float.parseFloat(display.getText());
            operation=3;
            display.setText("");
        }
        else if(event.getSource()==devide){
            data=Float.parseFloat(display.getText());
            operation=4;
            display.setText("");
        }
        else if(event.getSource()==equal)
        {
            Float secondOperand= Float.parseFloat(display.getText());
            if(operation==1) {
                Float ans=data+secondOperand;
                display.setText((String.valueOf(ans)));
            }
            if(operation==2) {
                Float ans=data-secondOperand;
                display.setText((String.valueOf(ans)));
            }
            if(operation==3) {
                Float ans=data*secondOperand;
                display.setText((String.valueOf(ans)));
            }
            if(operation==4) {

                Float ans = data/secondOperand;
                display.setText((String.valueOf( ans)));

            }
        }


    }


    }

