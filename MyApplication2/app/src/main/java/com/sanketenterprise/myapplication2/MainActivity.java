package com.sanketenterprise.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.MessageFormat;

public class MainActivity extends AppCompatActivity {

    EditText box1,box2,box3;
    Button button;
    TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        box1 = findViewById(R.id.box1);
        box2 = findViewById(R.id.box2);
        box3 = findViewById(R.id.box3);
        button= findViewById(R.id.button);
        total = findViewById(R.id.total);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int sum = Integer.parseInt(box1.getText().toString()) + Integer.parseInt(box2.getText().toString()) + Integer.parseInt(box3.getText().toString());
                double per = Double.parseDouble(String.valueOf((sum*100)/300));
              //  total.setText(MessageFormat.format("Your total is :{0}\n Your percentage is :{1}", sum, per));
                    total.setText("Your total is : "+sum+"/300"+ "\nYour percentage is : "+per);

            }
        });

    }
}