package com.example.mvc_mvp_mvvm_all_in_one_app.ui;


import com.example.mvc_mvp_mvvm_all_in_one_app.model.NumberModel;
import com.example.mvc_mvp_mvvm_all_in_one_app.pojo.DataBase;
import com.example.mvc_mvp_mvvm_all_in_one_app.ui.DivView;


public class DivPresenter {

    DivView divView;

    public DivPresenter(DivView divView) {
        this.divView = divView;
    }

    private NumberModel getDataFromDB(){
        DataBase dataBase = new DataBase();
       return dataBase.getNumbers();
    }

    private int divFunction (NumberModel numberModel){
        return numberModel.getFirstNum()/numberModel.getSecondNum();
    }

    public void getDevitionResult(){
        divView.getDivtion(divFunction(getDataFromDB()));
    }

}
