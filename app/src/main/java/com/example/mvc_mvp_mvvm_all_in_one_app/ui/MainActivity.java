package com.example.mvc_mvp_mvvm_all_in_one_app.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.view.View;

import com.example.mvc_mvp_mvvm_all_in_one_app.R;
import com.example.mvc_mvp_mvvm_all_in_one_app.databinding.ActivityMainBinding;
import com.example.mvc_mvp_mvvm_all_in_one_app.pojo.DataBase;


public class MainActivity extends AppCompatActivity implements DivView{

    DivPresenter divPresenter;

    PlusController plusController;
    DataBase dataBase ;

    // MVVM
    MulViewModel mulViewModel;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mulViewModel =  new ViewModelProvider(this).get(MulViewModel.class);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setLifecycleOwner(this);


        plusController = new PlusController();
        dataBase = new DataBase();
        divPresenter = new DivPresenter(this);



        activityMainBinding.plusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activityMainBinding.plusResultTextView.setText(Integer.toString(plusController.plusFunction(dataBase.getNumbers())));
            }
        });


        activityMainBinding.divButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                divPresenter.getDevitionResult();
            }
        });


        // MVVM

        activityMainBinding.mulButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mulViewModel.getMul();
            }
        });


      mulViewModel.mutableLiveDataNum.observe(this, new Observer<Integer>() {
          @Override
          public void onChanged(Integer integer) {
              activityMainBinding.mulResultTextView.setText(integer.toString());
          }
      });

    }

    @Override
    public void getDivtion(int numberModel) {

        activityMainBinding.divResultTextView.setText(Integer.toString(numberModel));
    }


}
