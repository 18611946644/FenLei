package com.bwie.month1024.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwie.month1024.R;
import com.bwie.month1024.adapter.CategoryAdapter;
import com.bwie.month1024.bean.Food;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by eric on 2018/10/24.
 */

public class CategoryFragment extends Fragment {
    public static final String ARGUMENT = "argument";
    private RecyclerView rvCategory;

    private CategoryAdapter adapter;
    private ArrayList<Food.DataBean> list;

    private CategoryAdapter.OnItemClickListener listener;

    public void setListener(CategoryAdapter.OnItemClickListener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_category, container, false);
        rvCategory = v.findViewById(R.id.rv_category);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        list = new ArrayList<>();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvCategory.setLayoutManager(layoutManager);
        rvCategory.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

        adapter = new CategoryAdapter(getActivity(), list);

        // 不要再Fragment中实例化
        // 在Fragment中实例化接口的话，需要给右侧的Fragment传值，也就是需要拿到右侧的Fragmen的对象
        // 这样就使得一个Fragment管理另外一个Fragment，产生了强耦合关系，应该尽量让Activity去管理Fragment
        if (listener != null) {
            adapter.setOnItemClickListener(listener);
        }
//        adapter.setOnItemClickListener();
        rvCategory.setAdapter(adapter);

    }

    public void setData(ArrayList<Food.DataBean> data) {
        list.clear();
        list.addAll(data);
        adapter.notifyDataSetChanged();
    }

}
