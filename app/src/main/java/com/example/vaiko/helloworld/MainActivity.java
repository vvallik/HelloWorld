package com.example.vaiko.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnButtonClick(View view) {
        TextView textView = (TextView) findViewById(R.id.textView);

        if (textView.getText().toString().equals("Hello World!")) {


            textView.setText("H3ll0 W0RLD!");
        } else {
            textView.setText("Hello World!");
        }
    }
}