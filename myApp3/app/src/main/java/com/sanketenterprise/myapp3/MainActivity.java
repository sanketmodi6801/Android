package com.sanketenterprise.myapp3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText name;
    TextView text;
    public static final String name_ext = "com.sanketenterprise.myapp3.extra.NAME";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit=findViewById(R.id.button);
        name=findViewById(R.id.editTextTextPersonName);
        text=findViewById(R.id.textView3);

//        submit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "The button is clicked!!!!", Toast.LENGTH_SHORT).show();
//                Log.d("sanket", "onClick: The button is clicked ");
//            }
//        });
    }

//    public void openactivity(View snk)
//    {
//        Intent click = new Intent(this, MainActivity2.class);
//        String s= name.getText().toString();
////        text.setText(s);
//        click.putExtra(name_ext,s);
//        startActivity(click);
//    }

    public void newactivity(View view)
    {
        String s = name.getText().toString();
        Intent one =new Intent(this,MainActivity2.class);
        one.putExtra(name_ext,s);
        startActivity(one);
    }
}


