package com.example.frame;

import android.annotation.SuppressLint;
import android.os.Build;

import androidx.annotation.RequiresApi;


public interface ICommonModel<T> {

    void getData(ICommonPresenter pPresenter, int whichApi, T... params);

}
