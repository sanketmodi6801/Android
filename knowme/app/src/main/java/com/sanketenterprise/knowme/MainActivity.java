package com.sanketenterprise.knowme;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button yes,no;
    TextView question;

    public String[] questions ={"This guy likes to travel..!! ","This guy is not funny..!!",
            "This guy likes to Sleep..!!","This guy does not likes to code..!!","This guy watches web series..!!"};
    public boolean[] answer ={true,false,true,false,true};
    public int score=0;
    public int index=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        question=findViewById(R.id.question);
        question.setText(questions[index]);

        // if user selects yes...
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){

                    //if correct answer is selected
                    if(answer[index]){
                        score++;
                    }
                        ++index;
                    if(index<=questions.length-1){
                      question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "YOUR SCORE IS "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please restart the app to play again..!!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // if user selects no
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(index<=questions.length-1){

                    //if correct answer is selected
                    if (!answer[index]) {
                        score++;
                    }
                    ++index;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "YOUR SCORE IS "+score+"/"+questions.length, Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Please restart the app to play again..!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}