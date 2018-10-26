package com.bwie.month1024.details;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bwie.month1024.R;
import com.bwie.month1024.adapter.CategoryAdapter;
import com.bwie.month1024.bean.Food;
import com.bwie.month1024.details.presenter.CartPresenter;
import com.bwie.month1024.details.view.IView;
import com.bwie.month1024.fragment.CategoryFragment;
import com.bwie.month1024.fragment.DetailFragment;
import com.bwie.month1024.widget.TitleView;

import java.util.ArrayList;

public class DetailActivity extends AppCompatActivity implements IView<Food> {

    private CartPresenter presenter;
    private CategoryFragment cf;
    private DetailFragment df;
    private TitleView tvTitle;
    private ImageView imgCart;
    private TextView txtTotal;
    private TextView txtGotoPay;

    private ArrayList<Food.DataBean> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.tv_cart);
        imgCart = findViewById(R.id.img_cart);
        txtTotal = findViewById(R.id.txt_total_price);
        txtGotoPay = findViewById(R.id.txt_goto_pay);

        list = new ArrayList<>();
        cf = (CategoryFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_category);
        df = (DetailFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_detail);

        cf.setListener(new CategoryAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Food.DataBean dataBean = list.get(position);
                if (dataBean != null) {
                    ArrayList<Food.DataBean.SpusBean> spus = dataBean.getSpus();
                    df.setData(spus);
                }
            }
        });

        df.setOnPriceChangeListener(new DetailFragment.OnPriceChangeListener() {
            @Override
            public void onPriceChange(float price) {
                if (price > 0) {
                    imgCart.setImageResource(R.drawable.ic_shopping_cart_white_24dp);
                } else {
                    imgCart.setImageResource(R.drawable.ic_shopping_cart_grey_700_24dp);
                }
                txtTotal.setText("总价：" + price + "元");
            }
        });

        presenter = new CartPresenter();
        presenter.attach(this);
        presenter.getCart();
    }

    @Override
    public void success(Food food) {
        if (food != null) {
            ArrayList<Food.DataBean> data = food.getData();
            if (data != null) {
                list.clear();
                list.addAll(data);
                cf.setData(data);
            }
        }
    }

    @Override
    public void failed(Exception e) {
        Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (presenter != null) {
            presenter.detach();
        }
    }
}
