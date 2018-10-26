package com.bwie.month1024.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;

import com.bwie.month1024.R;
import com.bwie.month1024.adapter.DetailsAdapter;
import com.bwie.month1024.bean.Food;
import com.bwie.month1024.widget.AddDecreaseView;

import java.util.ArrayList;

/**
 * Created by eric on 2018/10/24.
 */

public class DetailFragment extends Fragment {
    public static final String ARGUMENT = "argument";
    private RecyclerView rvDetails;

    private ArrayList<Food.DataBean.SpusBean> list;
    private DetailsAdapter adapter;

    private OnPriceChangeListener listener;

    public interface OnPriceChangeListener {
        void onPriceChange(float price);
    }

    public void setOnPriceChangeListener(OnPriceChangeListener listener) {
        this.listener = listener;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_details, container, false);
        rvDetails = v.findViewById(R.id.rv_details);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = new ArrayList<>();
        adapter = new DetailsAdapter(getActivity(), list);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvDetails.setLayoutManager(layoutManager);
        rvDetails.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        // 添加一个加减器的点击监听
        adapter.setOnAddDecreaseClickListener(new AddDecreaseView.OnAddDecreaseClickListener() {
            @Override
            public void add(View view, int num) {
                int position = (int) view.getTag();
                list.get(position).setNum(num);
                calculatePrice();
            }

            @Override
            public void decrease(View view, int num) {
                int position = (int) view.getTag();
                list.get(position).setNum(num);
                calculatePrice();
            }
        });


        rvDetails.setAdapter(adapter);

        DisplayMetrics dm = new DisplayMetrics();
        Display defaultDisplay = getActivity().getWindowManager().getDefaultDisplay();
        defaultDisplay.getMetrics(dm);
        int widthPixels = dm.widthPixels;

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(widthPixels * 4 / 5,
                LinearLayout.LayoutParams.WRAP_CONTENT);
        rvDetails.setLayoutParams(params);

    }

    /**
     * 计算总价
     */
    private void calculatePrice() {
        float total = 0;
        for (Food.DataBean.SpusBean spusBean : list) {
            String priceStr = spusBean.getSkus().get(0).getPrice();
            float price = Float.parseFloat(priceStr);
            int num = spusBean.getNum();
            total += (price * num);
        }

        if (listener != null) {
            listener.onPriceChange(total);
        }
    }

    public void setData(ArrayList<Food.DataBean.SpusBean> data) {
        list.clear();
        list.addAll(data);
        adapter.notifyDataSetChanged();
    }
}
