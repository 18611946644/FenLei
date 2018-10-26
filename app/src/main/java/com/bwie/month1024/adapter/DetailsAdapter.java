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
import com.bwie.month1024.bean.Food;
import com.bwie.month1024.widget.AddDecreaseView;

import java.util.ArrayList;

/**
 * Created by eric on 2018/10/24.
 */

public class DetailsAdapter extends RecyclerView.Adapter<DetailsAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Food.DataBean.SpusBean> list;
    private AddDecreaseView.OnAddDecreaseClickListener listener;

    public void setOnAddDecreaseClickListener(AddDecreaseView.OnAddDecreaseClickListener listener) {
        this.listener = listener;
    }

    public DetailsAdapter(Context context, ArrayList<Food.DataBean.SpusBean> list) {
        this.context = context;
        this.list = list;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = View.inflate(context, R.layout.item_details, null);
        ViewHolder holder = new ViewHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).load(list.get(position).getPicUrl()).into(holder.imgDetail);
        holder.txtName.setText(list.get(position).getName());
        holder.txtPrice.setText(list.get(position).getSkus().get(0).getPrice());
        holder.adv.setTag(position);
        holder.adv.setOnAddDecreaseClickListener(listener);

    }

    @Override
    public int getItemCount() {
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imgDetail;
        private TextView txtName;
        private TextView txtPrice;
        private AddDecreaseView adv;

        public ViewHolder(View itemView) {
            super(itemView);

            imgDetail = itemView.findViewById(R.id.img_details);
            txtName = itemView.findViewById(R.id.txt_details_name);
            txtPrice = itemView.findViewById(R.id.txt_single_price);
            adv = itemView.findViewById(R.id.adv_details);
        }
    }
}
