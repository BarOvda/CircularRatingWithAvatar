package com.example.circularratingwithavatarlibrary;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

import androidx.annotation.RequiresApi;

public class CustomProgressBar extends ProgressBar {
    private int lowColor;
    private int midColor;
    private int highColor;

    @Override
    public synchronized void setProgress(int progress) {
        super.setProgress(progress);
    }

    public CustomProgressBar(Context context) {
        super(context);
     //   init(context,this,null);
    }


    public CustomProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
      //  init(context,this,attrs);
    }


    public CustomProgressBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public CustomProgressBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
    public void setProgress(){

    }
    /**
     * @param canvas
     */
    @Override
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    /**
     * set the ring color showing for the rating
     *
     * @param rating
     * @param maxRating
     */
    public void initAnimation(float rating,float maxRating,int highColor,int midColor
    ,int lowColor){
        this.lowColor=lowColor;
        this.midColor=midColor;
        this.highColor=highColor;

        int currentRatingBais = (int)rating*100;
        int maxRatingBais = (int)maxRating*100;
        this.setMax(maxRatingBais);


        ObjectAnimator animation = ObjectAnimator.ofInt(this, "progress", 0, currentRatingBais);

        animation.setInterpolator(new DecelerateInterpolator());
        animation.addListener(new Animator.AnimatorListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onAnimationStart(Animator animation) {

                if(rating<maxRating/3){
                    setProgressColor(lowColor);
                }else if( rating<maxRating*2/3){
                    setProgressColor(midColor);
                }else{
                    setProgressColor(highColor);
                }
            }

            @Override
            public void onAnimationEnd(Animator animation) {

            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {
                //     progressBar.setProgress(100);
            }
        });


        animation.start();
    }
    /**
     * set the ring color showing for the rating
     *
     * @param color
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public void setProgressColor(int color) {
        this.setProgressTintList(ColorStateList.valueOf(color));
    }


}

