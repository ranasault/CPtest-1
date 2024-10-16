package com.example.mandeeptest1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField username;
    public PasswordField password;

    @FXML
    private Label welcomeText;
    Integer counter=5;
    String x = "Mandeep";
    String y = "0123";
    @FXML
    protected void onHelloButtonClick() {

        welcomeText.setText("");

        String u = username.getText();
        String p = password.getText();

        if(x.equals(u)&&y.equals(p)) {
            counter=5;
            welcomeText.setText("Login successful");

        }else if(x.equals(u)&&y!=p) {
            if(counter>=0)
                if(counter==0) {

                    welcomeText.setText("account locked");
                }else{
                    counter--;
                    welcomeText.setText(" you have"+counter+"attempt left");

                }
        }
        else{
            welcomeText.setText("Invalid username or password");
        }
    }
}


