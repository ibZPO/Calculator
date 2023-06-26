package ib.mi.calculator;

import java.util.concurrent.CopyOnWriteArraySet;

public class Calculator {

    private float register1;
    private float register2;

    private Operations operation;

    public Calculator() {
        this.register1 = 0;
        this.register2 = 0;
        this.operation =Operations.NONE;
    }

    public float getRegister1() {
        return register1;
    }

    public float getRegister2() {return register2;}


    public void setRegister1(float register1) {
        this.register1 = register1;
    }

    public void transferToRegister2(){
        register2=register1;
    }

    public void clearRegister1(){
        register1=0;
    }


    public void setOperation(Operations operation){
        this.operation=operation;
        transferToRegister2();
    }

    public void calculate() {
        float result;
        switch (operation) {
            case ADD:
                result=register1+register2;
                break;
            case SUBTRACT:
                result=register1-register2;
                break;
            case MULTIPLY:
                result=register1*register2;
                break;
            case DIVIDE:
                result=register2/register1;
            default:
                result=register1;
        }
        setRegister1(result);
    }
}
