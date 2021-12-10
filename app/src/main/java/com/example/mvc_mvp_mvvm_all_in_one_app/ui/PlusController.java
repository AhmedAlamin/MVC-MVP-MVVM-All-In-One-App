package com.example.mvc_mvp_mvvm_all_in_one_app.ui;


import com.example.mvc_mvp_mvvm_all_in_one_app.model.NumberModel;

public class PlusController {


    public int plusFunction(NumberModel numberModel){
        return numberModel.getFirstNum() + numberModel.getSecondNum();
    }
}
