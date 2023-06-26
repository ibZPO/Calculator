module ib.mi.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens ib.mi.calculator to javafx.fxml;
    exports ib.mi.calculator;
}