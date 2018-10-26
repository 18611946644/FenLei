package com.bwie.month1024.details.model;

import com.bwie.month1024.inter.INetCallBack;
import com.bwie.month1024.utils.HttpUtils;

import java.lang.reflect.Type;

/**
 * Created by eric on 2018/10/24.
 */

public class CartModel {
    public void getData(String url, INetCallBack callBack, Type type) {
        HttpUtils.getInstance().get(url, callBack, type);
    }
}
