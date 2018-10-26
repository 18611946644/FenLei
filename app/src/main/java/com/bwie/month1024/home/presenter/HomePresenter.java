package com.bwie.month1024.home.presenter;

import com.bwie.month1024.bean.Restaurant;
import com.bwie.month1024.home.model.HomeModel;
import com.bwie.month1024.home.view.IView;
import com.bwie.month1024.inter.INetCallBack;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;

/**
 * Created by eric on 2018/10/24.
 */

public class HomePresenter {
    private IView<Restaurant> iv;
    private HomeModel model;

    public void attach(IView<Restaurant> iv) {
        this.iv = iv;
        model = new HomeModel();
    }

    public void getRestaurant(boolean isLoadMore) {
        String url = "";
        if (isLoadMore) {
            url = "http://www.wanandroid.com/tools/mockapi/6523/restaurants_offset_4_limit_4";
        } else {
            url = "http://www.wanandroid.com/tools/mockapi/6523/restaurants_offset_0_limit_4";
        }

        Type type = new TypeToken<Restaurant>() {
        }.getType();

        model.getData(url, new INetCallBack() {
            @Override
            public void success(Object obj) {
                iv.success((Restaurant) obj);
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
