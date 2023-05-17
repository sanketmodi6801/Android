package com.sanketenterprise.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        result =findViewById(R.id.textView);
//        Intent intent=getIntent();
//        String name= intent.getStringExtra(MainActivity.name_ext);
//        result.setText(name);

        Intent two =getIntent();
        String v= two.getStringExtra(MainActivity.name_ext);
        result.setText(v);
//
    }

}