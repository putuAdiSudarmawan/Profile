package com.example.profile;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t= (TextView) findViewById(R.id.myPict);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/Lora-Regular.ttf");
        t.setTypeface(myCustomFont);
    }
}
