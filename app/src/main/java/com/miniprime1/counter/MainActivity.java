package com.miniprime1.counter;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import android.view.*;
import android.os.Bundle;

import com.miniprime1.counter.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    int number = 0;
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    }

    public void plus(View view) {
        number = number + 1;
        activityMainBinding.numTextView.setText(String.valueOf(number));

    }

    public void minus(View view) {
        number = number - 1;
        activityMainBinding.numTextView.setText(String.valueOf(number));
    }
}