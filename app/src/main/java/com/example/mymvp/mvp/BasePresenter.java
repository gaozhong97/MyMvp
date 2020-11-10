package com.example.mymvp.mvp;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;

import java.lang.ref.WeakReference;

/**
 * create by lzx
 * time:2018/7/26
 */
public class BasePresenter <V>  {
//
//    protected Context mContext;
//    protected V mView;
//
//    protected void onCleared() {
//
//    }
//
//    public void attachView(Context context, V view) {
//        this.mContext = context;
//        this.mView = view;
//    }
//
//    public void detachView() {
//        this.mView = null;
//    }
//
//    public boolean isAttachView() {
//        return this.mView != null;
//    }
//
//    public void onCreatePresenter(@Nullable Bundle savedState) {
//
//    }
//
//    public void onDestroyPresenter() {
//        this.mContext = null;
//        detachView();
//    }
//
//    public void onSaveInstanceState(Bundle outState) {
//
//    }


    protected WeakReference<V> mViewRef;
    protected Context mContext;

    protected void attachView(Context context, V view) {
        this.mContext = context;
        mViewRef = new WeakReference<V>(view);
    }

    protected V getView() {
        return mViewRef == null ? null : mViewRef.get();
    }

    protected boolean isViewAttached() {
        return mViewRef != null && mViewRef.get() != null;
    }

    protected void detachView() {
        if (mViewRef != null) {
            mViewRef.clear();
            mViewRef = null;
        }
    }

    protected void onCleared() {

    }

    public void onSaveInstanceState(Bundle outState) {

    }

    public void onCreatePresenter(@Nullable Bundle savedState) {

    }
    public void onDestroyPresenter() {
        this.mContext = null;
        detachView();
    }
}
