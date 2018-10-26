package com.bwie.month1024.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bwie.month1024.R;

/**
 * Created by eric on 2018/10/24.
 */

public class AddDecreaseView extends RelativeLayout implements View.OnClickListener {
    private ImageView imgAdd;
    private ImageView imgDecrease;
    private TextView txtNum;
    private int num = 0;

    public interface OnAddDecreaseClickListener {
        void add(View view, int num);

        void decrease(View view, int num);
    }

    private OnAddDecreaseClickListener listener;

    public void setOnAddDecreaseClickListener(OnAddDecreaseClickListener listener) {
        this.listener = listener;
    }

    public AddDecreaseView(Context context) {
        this(context, null);
    }

    public AddDecreaseView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public AddDecreaseView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        View.inflate(context, R.layout.item_add_decrease, this);
        imgAdd = findViewById(R.id.img_add);
        imgDecrease = findViewById(R.id.img_decrease);
        txtNum = findViewById(R.id.txt_num);

        imgAdd.setOnClickListener(this);
        imgDecrease.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_add:
                num++;
                imgDecrease.setVisibility(VISIBLE);
                txtNum.setVisibility(VISIBLE);
                txtNum.setText(num + "");
                if (listener != null) {
                    listener.add(this, num);
                }
                break;
            case R.id.img_decrease:
                if (num > 0) {
                    num--;
                }
                if (num == 0) {
                    txtNum.setVisibility(GONE);
                    imgDecrease.setVisibility(GONE);
                } else {
                    txtNum.setVisibility(VISIBLE);
                    imgDecrease.setVisibility(VISIBLE);
                }
                txtNum.setText(num + "");
                if (listener != null) {
                    listener.decrease(this, num);
                }
                break;
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
