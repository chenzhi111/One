package com.example.frame;


public interface ICommonPresenter<P> extends ICommonView {
    void getData(int whichApi, P... pPS);
}
