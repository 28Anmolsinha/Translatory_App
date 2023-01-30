package com.example.vanishapp;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){
        ImageView doraemon = (ImageView) findViewById(R.id.doraemon);
        doraemon.animate().translationYBy(1000f).setDuration(2000);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}