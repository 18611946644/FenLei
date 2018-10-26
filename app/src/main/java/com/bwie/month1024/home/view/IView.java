package com.bwie.month1024.home.view;

/**
 * Created by eric on 2018/10/24.
 */

public interface IView<T> {
    void success(T t);

    void failed(Exception e);
}
