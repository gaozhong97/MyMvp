package com.example.mymvp.base;

public interface BaseView {
        /**
         * 加载成功
         */
        void responseData(String repJson, int tag);
        /**
         * 加载失败
         */
//        void onLoadFailed();

}
