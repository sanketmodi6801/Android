package com.SanketEnterprise.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  //  public Button button;
    public TextView output;
    public EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editTextNumber);
        output = findViewById(R.id.output);
     //   button = findViewById(R.id.button);

//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                String s = editText.getText().toString();
//                int kg = Integer.parseInt(s);
//                double pound = 2.205 * kg;
//                Toast.makeText(MainActivity.this, "Thanks for using this app!!", Toast.LENGTH_SHORT).show();
//            }
//        });


    }
    public void calculator(View view)
    {
        String s = editText.getText().toString();
        int kg = Integer.parseInt(s);
        double pound = 2.205 * kg;
        output.setText(" The corresponding weight in pound is :" +pound);
    }
}