package ib.mi.calculator;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalculatorController {

    Calculator calculator = new Calculator();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btnDot;

    @FXML
    private Button btnEquals;

    @FXML
    private Button btnPlus;

    @FXML
    private TextField tvScreen;

    @FXML
    void btn0Clicked(ActionEvent event) {

    }

    @FXML
    void btn1Clicked(ActionEvent event) {
        setDisplay(1);

    }

    @FXML
    void btn2Clicked(ActionEvent event) {
        setDisplay(2);

    }

    @FXML
    void btn3Clicked(ActionEvent event) {
        setDisplay(3);

    }

    @FXML
    void btnDotClicked(ActionEvent event) {

    }

    @FXML
    void btnEqualsClicked(ActionEvent event) {
        calculator.setRegister1(getNumberFromDisplay());
        calculator.calculate();
        showResult();

    }

    @FXML
    void btnPlusClicked(ActionEvent event) {
        calculator.setRegister1(getNumberFromDisplay());
        calculator.setOperation(Operations.ADD);

    }

    private void showResult(){
        tvScreen.setText(String.valueOf(calculator.getRegister1()));
    }

    private void setDisplay(int i){
        tvScreen.setText(String.valueOf(i));
    }

    private void updateDisplay(int i){
        tvScreen.setText(tvScreen.getText()+i);
    }

    private float getNumberFromDisplay(){
        return Float.parseFloat(tvScreen.getText());
    }

    @FXML
    void initialize() {


    }

}
