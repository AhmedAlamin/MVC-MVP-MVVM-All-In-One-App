package com.example.mvc_mvp_mvvm_all_in_one_app.ui;



import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.mvc_mvp_mvvm_all_in_one_app.model.NumberModel;
import com.example.mvc_mvp_mvvm_all_in_one_app.pojo.DataBase;


public class MulViewModel extends ViewModel {

    public MutableLiveData<Integer> mutableLiveDataNum = new MutableLiveData<>();

    public void getMul(){
        DataBase dataBase = new DataBase();
         NumberModel numberModel =  dataBase.getNumbers();
         Integer integer ;
         integer = numberModel.getFirstNum() * numberModel.getSecondNum();
         mutableLiveDataNum.setValue(integer);
    }
}
