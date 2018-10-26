package com.bwie.month1024.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bwie.month1024.R;

/**
 * Created by eric on 2018/10/24.
 */

public class TitleView extends RelativeLayout {
    private TextView txtTitle;
    private ImageView imgBack;

    public interface OnBackClickListener {
        void onBack();
    }

    private OnBackClickListener listener;

    public void setOnBackClickListener(OnBackClickListener listener) {
        this.listener = listener;
    }

    public TitleView(Context context) {
        this(context, null);
    }

    public TitleView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TitleView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs, int defStyleAttr) {
        View.inflate(context, R.layout.view_title, this);

        txtTitle = findViewById(R.id.txt_title);
        imgBack = findViewById(R.id.img_title_back);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.TitleViewStyle);
        String title = a.getString(R.styleable.TitleViewStyle_title);

        imgBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null) {
                    listener.onBack();
                }
            }
        });
        txtTitle.setText(title);
        a.recycle();

    }
}
