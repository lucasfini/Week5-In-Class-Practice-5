package com.n01229590.inclass1project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
               Context context = getApplicationContext();
               CharSequence text = "Hello, this is my first Andriod APP";
               int duration = Toast.LENGTH_LONG;
               Toast.makeText(context, text, duration).show();


            }
        });

    }




}