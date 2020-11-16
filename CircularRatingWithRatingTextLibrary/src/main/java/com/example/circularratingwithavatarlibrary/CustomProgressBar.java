package com.example.circularratingwithavatarlibrary;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

import androidx.annotation.RequiresApi;

public class CustomProgressBar extends ProgressBar {

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
     * set the ring color showing the progess
     *
     * @param color
     */
    public void setProgressColor(int color) {
        LayerDrawable ld = (LayerDrawable) getProgressDrawable();
        GradientDrawable drawable = (GradientDrawable) ld.findDrawableByLayerId(android.R.id.progress);
        ((GradientDrawable) drawable).setColor(color);
    }


}

