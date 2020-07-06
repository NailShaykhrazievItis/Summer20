package com.itis.summertemplate;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

class Sdasdsa extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null) {
            savedInstanceState.getInt("sds");
        }

        TextView textView = findViewById(R.id.textView);
        textView.setText("Sdsadasda");

    }
}
