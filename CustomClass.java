package com.cat.reloaded.marwatasks;

import android.widget.ImageView;
import android.widget.TextView;

public class CustomClass {

    private String textView;
    private int imageView;

    public CustomClass(String textView, int imageView) {
        this.textView = textView;
        this.imageView = imageView;
    }

    public String getTextView() {
        return textView;
    }

    public void setTextView(String textView) {
        this.textView = textView;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}


