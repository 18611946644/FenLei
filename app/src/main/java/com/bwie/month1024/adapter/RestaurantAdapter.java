package com.bwie.month1024.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bwie.month1024.R;
import com.bwie.month1024.bean.Restaurant;

import java.util.List;

/**
 * Created by eric on 2018/10/24.
 */

public class RestaurantAdapter extends RecyclerView.Adapter<RestaurantAdapter.ViewHolder> {
    private Context context;
    private List<Restaurant.DataBean> list;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    private OnItemClickListener listener;

    public void setOnItemClickListener(OnItemClickListener listener) {
        this.listener = listener;
    }

    public RestaurantAdapter(Context context, List<Restaurant.DataBean> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = View.inflate(context, R.layout.item_restaurant, null);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).load(list.get(position).getPicUrl()).into(holder.imgLogo);
        holder.txtName.setText(list.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onItemClick(v, position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgLogo;
        private TextView txtName;

        public ViewHolder(View itemView) {
            super(itemView);

            imgLogo = itemView.findViewById(R.id.img_logo);
            txtName = itemView.findViewById(R.id.txt_restaurant_name);
        }
    }
}
