package com.example.mymvp.example.login;


import com.lzx.easymvp.mvp.BasePresenter;

import java.util.Map;

/**
 * create by lzx
 * time:2018/7/26
 */
public class LoginPresenter extends BasePresenter<LoginView> {

    public void login() {
        mViewRef.get().loginSuccess();
    }


    private int code;
    private String msg;

    public LoginPresenter() {
    }

    public void getData(String url, Map<String, String> params, int tag) {
        mViewRef.get().loginSuccess();

//        mModel.post(url, new StringCallback() {
//            @Override
//            public void onError(Call call, Exception e) {
//                LogUtils.e(e.getMessage());
//
//            }
//
//            @Override
//            public void onResponse(String response) {
//                LogUtils.d("接口返回---->" + response);
//                getJsonData(response);
//                if (code == 200) {
//                    if (isViewAttached()) {
//                        mView.responseData(response, tag);
//                    }
//
//                } else {
//                    ToastUtils.showShort(msg);
//                }
//            }
//        }, params);
    }

    public void getData(String url, int tag) {

    }
}
