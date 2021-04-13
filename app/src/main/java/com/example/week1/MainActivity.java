package com.example.week1;

/*

Aaron Allen, finished on 4/13/2021

 */
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.btn1);

        button.setOnClickListener(v -> Toast.makeText(getApplicationContext(), "BOOM, i got ya", Toast.LENGTH_LONG).show());
    }
}