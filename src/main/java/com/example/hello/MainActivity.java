package com.uber.hello;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.errorprone.annotations.Var;

public class MainActivity extends AppCompatActivity {
  @Var private Object mOnCreateInitialiedField = null;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mOnCreateInitialiedField = new Object();
    @Var Object mOnCreateInitialiedField2 = null;
    mOnCreateInitialiedField2 = new Object();
  }

}
