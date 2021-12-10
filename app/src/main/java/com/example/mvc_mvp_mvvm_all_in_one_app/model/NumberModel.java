package com.example.mvc_mvp_mvvm_all_in_one_app.model;

public class NumberModel {
    private int firstNum, secondNum;

    public NumberModel(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }

    public int getFirstNum() {
        return firstNum;
    }
    public int getSecondNum() {
        return secondNum;
    }
}
