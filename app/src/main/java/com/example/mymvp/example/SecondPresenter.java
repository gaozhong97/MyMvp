package com.example.mymvp.example;


import com.lzx.easymvp.base.BaseModel;
import com.lzx.easymvp.base.BaseView;
import com.lzx.easymvp.mvp.BasePresenter;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.Map;

import okhttp3.Call;


public class SecondPresenter extends BasePresenter<BaseView> {
    private BaseModel mModel;

    private int code;
    private String msg;

    public SecondPresenter() {
        mModel = new BaseModel();
    }

    public void getData(String url, Map<String, String> params, final int tag) {

        mModel.post(url, new StringCallback() {
            @Override
            public void onError(Call call, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                if (isViewAttached()) {
                    getView().responseData(response, tag);
                }
            }
        }, params);
    }

    public void getPostData(String url, final int tag) {
        mModel.post(url, new StringCallback() {
            @Override
            public void onError(Call call, Exception e) {

            }

            @Override
            public void onResponse(String response) {
                if (isViewAttached()) {
                    getView().responseData(response, tag);
                }
            }
        });
    }
}
