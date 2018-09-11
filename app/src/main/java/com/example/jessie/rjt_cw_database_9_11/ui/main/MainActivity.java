package com.example.jessie.rjt_cw_database_9_11.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jessie.rjt_cw_database_9_11.R;

public class MainActivity extends AppCompatActivity implements IView{

    IPresenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(this);
    }

    public void clickHandler(View view)
    {

    }

    @Override
    public void showToast() {

    }
}
