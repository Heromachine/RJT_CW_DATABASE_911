package com.example.jessie.rjt_cw_database_9_11.ui.main;

import android.view.View;

public class Presenter implements IPresenter{

    IView view;
    public Presenter(MainActivity mainActivity) {
        view = mainActivity;
    }

    @Override
    public void onButtonClicked(View v){
        view.showToast();
    }
}
