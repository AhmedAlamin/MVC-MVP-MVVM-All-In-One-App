package com.example.mvc_mvp_mvvm_all_in_one_app.pojo;


import com.example.mvc_mvp_mvvm_all_in_one_app.model.NumberModel;

public class DataBase {
    public NumberModel getNumbers(){
        return new NumberModel(4, 2);
    }
}
