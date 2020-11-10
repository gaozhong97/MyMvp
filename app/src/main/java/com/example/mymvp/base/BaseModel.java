package com.example.mymvp.base;

import com.google.gson.Gson;
import com.zhy.http.okhttp.OkHttpUtils;
import com.zhy.http.okhttp.callback.StringCallback;

import java.util.Map;

public class BaseModel {
    public void post(String url, StringCallback callback) {
        OkHttpUtils
                .post()
                .url(url)
                .addParams("token","token")
                .build()
                .execute(callback);
    }

    public void post(String url, StringCallback callback, Map<String, String> params) {
        OkHttpUtils
                .post()
                .url(url)
                .addParams("token", "token")
                .addParams("body", new Gson().toJson(params))
                .build()
                .execute(callback);
    }
    public void get(String url, StringCallback callback) {
        OkHttpUtils
                .get()
                .url(url)
                .addParams("token","token")
                .build()
                .execute(callback);
    }
}
