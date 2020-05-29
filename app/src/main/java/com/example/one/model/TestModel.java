package com.example.one.model;


import com.example.frame.ApiConfig;
import com.example.frame.ICommonModel;
import com.example.frame.ICommonPresenter;
import com.example.frame.NetManger;

import java.util.Map;

public class TestModel implements ICommonModel {
    NetManger mManger = NetManger.getInstance();

    @Override
    public void getData(final ICommonPresenter pPresenter, final int whichApi, Object[] params) {
        switch (whichApi) {
            case ApiConfig.TEST_GET:
                final int loadType = (int) params[0];
                Map param = (Map) params[1];
                int pageId = (int) params[2];
                mManger.netWork(mManger.getService().getTestData(param, pageId), pPresenter, whichApi, loadType);
                break;
            case ApiConfig.ADVERT:

                break;
        }
    }


  /*  @Override
    public void getTrendsData(ICommonPresenter pPresenter, int whichApi, int dataType, Object[] param) {

    }*/
}
