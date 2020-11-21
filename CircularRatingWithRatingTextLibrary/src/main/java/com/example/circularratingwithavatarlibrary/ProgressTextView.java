package com.example.circularratingwithavatarlibrary;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.text.DecimalFormat;

public class ProgressTextView extends FrameLayout {
    public static final int DEFAULT_MAX_RATING = 100;
    public static final int DEFAULT_RATING = 0;
    private CustomProgressBar mProgressBar;
    private TextView ratingTextView;
    private float rating;
    private float maxRating;
    private int lowColor;
    private int midColor;
    private int highColor;
        public ProgressTextView(Context context) {
            super(context);
             init(context,null);
        }


        public ProgressTextView(Context context, AttributeSet attrs) {
            super(context, attrs);
              init(context,attrs);
        }


        public ProgressTextView(Context context, AttributeSet attrs, int defStyleAttr) {
            super(context, attrs, defStyleAttr);
            init(context,attrs);
        }


        @TargetApi(Build.VERSION_CODES.LOLLIPOP)
        public ProgressTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
        }

        /**
         * @param canvas
         */
        @Override
        protected synchronized void onDraw(Canvas canvas) {
            super.onDraw(canvas);
        }

        void init(Context context, AttributeSet attributeSet){

            View progressbar = View.inflate(context, R.layout.circular_rating_bar, this);
            mProgressBar = progressbar.findViewById(R.id.progress);

            TypedArray a = getContext().obtainStyledAttributes(attributeSet, R.styleable.ProgressImageView, 0, 0);

            try {
                if (attributeSet != null) {
                    this.maxRating = (float) a.getFloat(R.styleable.ProgressImageView_max_rating, DEFAULT_MAX_RATING);
                    this.rating = (float) a.getFloat(R.styleable.ProgressImageView_current_rating, DEFAULT_RATING);
                    this.highColor = (int) a.getColor(R.styleable.ProgressImageView_high_color,getResources().getColor(R.color.high_color));
                    this.midColor = (int) a.getColor(R.styleable.ProgressImageView_mid_color,getResources().getColor(R.color.mid_color));
                    this.lowColor = (int) a.getColor(R.styleable.ProgressImageView_low_color,getResources().getColor(R.color.min_color));
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                return;
            }


            ratingTextView = progressbar.findViewById(R.id.rating_text);

            DecimalFormat df = new DecimalFormat();
            df.setMaximumFractionDigits(2);
            df.setMinimumFractionDigits(1);
            this.ratingTextView.setText(df.format(rating)+"");
            this.mProgressBar.initAnimation(rating,maxRating,highColor,midColor,
                    lowColor);
        }






}
