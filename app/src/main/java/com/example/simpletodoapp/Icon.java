package com.example.simpletodoapp;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.Gravity;

public class Icon extends AppCompatTextView {

  private Context context;

  public Icon(Context context) {
    super(context);
    this.context = context;
    createView();
  }

  public Icon(Context context, AttributeSet attrs) {
	super(context, attrs);
	this.context = context;
	createView();
  }

  private void createView() {
	AssetManager am = context.getApplicationContext().getAssets();
    setGravity(Gravity.CENTER);
    setTypeface(Typeface.createFromAsset(am, "Font Awesome 5 Free-Solid-900.otf"));
  }
}
