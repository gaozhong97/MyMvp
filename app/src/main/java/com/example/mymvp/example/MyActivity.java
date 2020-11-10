package com.example.mymvp.example;

import android.widget.TextView;

import com.lzx.easymvp.R;
import com.lzx.easymvp.base.BaseMvpActivity;
import com.lzx.easymvp.base.BaseView;
import com.lzx.easymvp.mvp.CreatePresenter;

import butterknife.BindView;

@CreatePresenter(presenter = SecondPresenter.class)
public class MyActivity extends BaseMvpActivity<SecondPresenter> implements BaseView {


    @BindView(R.id.word)
    TextView word;

    @Override
    protected int getContentView() {
        return R.layout.activity_my;
    }

    @Override
    public void init() {
        getPresenter().getPostData("url", 1);

    }

    @Override
    public void responseData(String repJson, int tag) {

    }
}