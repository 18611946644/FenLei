package com.bwie.month1024.home;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.amap.api.location.AMapLocation;
import com.amap.api.location.AMapLocationClient;
import com.amap.api.location.AMapLocationClientOption;
import com.amap.api.location.AMapLocationListener;
import com.bwie.month1024.R;
import com.bwie.month1024.adapter.RestaurantAdapter;
import com.bwie.month1024.bean.Restaurant;
import com.bwie.month1024.details.DetailActivity;
import com.bwie.month1024.home.presenter.HomePresenter;
import com.bwie.month1024.home.view.IView;
import com.jcodecraeer.xrecyclerview.XRecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IView<Restaurant> {
    private static final String TAG = "MainActivity";
    private TextView txtLocationl;
    private XRecyclerView xrvRestaurant;
    private RestaurantAdapter adapter;
    private List<Restaurant.DataBean> list;
    private HomePresenter presenter;
    private boolean isLoadMore = false;

    //声明AMapLocationClient类对象
    public AMapLocationClient mLocationClient = null;
    //声明定位回调监听器
    public AMapLocationListener mLocationListener = new AMapLocationListener() {
        @Override
        public void onLocationChanged(AMapLocation aMapLocation) {
            if (aMapLocation != null) {
                if (aMapLocation.getErrorCode() == 0) {
                    //可在其中解析amapLocation获取相应内容。
                    txtLocationl.setText(aMapLocation.getCity());
                } else {
                    //定位失败时，可通过ErrCode（错误码）信息来确定失败的原因，errInfo是错误信息，详见错误码表。
                    Log.e("AmapError", "location Error, ErrCode:"
                            + aMapLocation.getErrorCode() + ", errInfo:"
                            + aMapLocation.getErrorInfo());
                }
            }

        }
    };
    //声明AMapLocationClientOption对象
    public AMapLocationClientOption mLocationOption = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initMap();

        // 允许上拉加载更多
        xrvRestaurant.setLoadingMoreEnabled(true);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        xrvRestaurant.setLayoutManager(manager);

        xrvRestaurant.setLoadingListener(new XRecyclerView.LoadingListener() {
            @Override
            public void onRefresh() {
                isLoadMore = false;
                presenter.getRestaurant(isLoadMore);
            }

            @Override
            public void onLoadMore() {
                isLoadMore = true;
                presenter.getRestaurant(isLoadMore);
            }
        });

        list = new ArrayList<>();
        adapter = new RestaurantAdapter(this, list);
        adapter.setOnItemClickListener(new RestaurantAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        xrvRestaurant.setAdapter(adapter);
        presenter = new HomePresenter();
        presenter.attach(this);
        presenter.getRestaurant(isLoadMore);
    }

    private void initView() {
        txtLocationl = findViewById(R.id.txt_location);
        xrvRestaurant = findViewById(R.id.xrv_restaurant);
    }

    /**
     * 初始化地图设置
     */
    private void initMap() {
        //初始化定位
        mLocationClient = new AMapLocationClient(getApplicationContext());
        //设置定位回调监听
        mLocationClient.setLocationListener(mLocationListener);
        //初始化AMapLocationClientOption对象
        mLocationOption = new AMapLocationClientOption();
        //设置定位模式为AMapLocationMode.Hight_Accuracy，高精度模式。
        mLocationOption.setLocationMode(AMapLocationClientOption.AMapLocationMode.Hight_Accuracy);
        //获取一次定位结果：
        //该方法默认为false。
        mLocationOption.setOnceLocation(true);

        //获取最近3s内精度最高的一次定位结果：
        //设置setOnceLocationLatest(boolean b)接口为true，启动定位时SDK会返回最近3s内精度最高的一次定位结果。如果设置其为true，setOnceLocation(boolean b)接口也会被设置为true，反之不会，默认为false。
        mLocationOption.setOnceLocationLatest(true);

        //设置是否返回地址信息（默认返回地址信息）
        mLocationOption.setNeedAddress(true);

        //设置是否允许模拟位置,默认为true，允许模拟位置
        mLocationOption.setMockEnable(true);

        mLocationClient.setLocationOption(mLocationOption);
        //设置场景模式后最好调用一次stop，再调用start以保证场景模式生效
        mLocationClient.stopLocation();
        mLocationClient.startLocation();
    }

    @Override
    public void success(Restaurant restaurant) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                xrvRestaurant.refreshComplete();
                xrvRestaurant.loadMoreComplete();
            }
        }, 2000);

        if (restaurant != null) {
            List<Restaurant.DataBean> data = restaurant.getData();
            if (data != null) {
                if (!isLoadMore) {
                    list.clear();
                }
                list.addAll(data);
                adapter.notifyDataSetChanged();
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
