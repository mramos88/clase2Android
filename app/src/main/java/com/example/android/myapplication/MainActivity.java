package com.example.android.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText ed = (EditText)findViewById(R.id.edit);
        Button btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(new MyListener(ed));

    }
}
