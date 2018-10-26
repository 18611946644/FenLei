package com.bwie.month1024.details.presenter;

import com.bwie.month1024.bean.Food;
import com.bwie.month1024.details.model.CartModel;
import com.bwie.month1024.details.view.IView;
import com.bwie.month1024.inter.INetCallBack;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * Created by eric on 2018/10/24.
 */

public class CartPresenter {
    private IView<Food> iv;
    private CartModel model;

    public void attach(IView<Food> iv) {
        this.iv = iv;
        model = new CartModel();
    }

    public void getCart() {
        Type type = new TypeToken<Food>() {
        }.getType();
        String url = "http://www.wanandroid.com/tools/mockapi/6523/restaurant-list";
        model.getData(url, new INetCallBack() {
            @Override
            public void success(Object obj) {
                iv.success((Food) obj);
            }

            @Override
            public void failed(Exception e) {
                iv.failed(e);
            }
        }, type);
    }

    public void detach() {
        if (iv != null) {
            iv = null;
        }
    }
}
