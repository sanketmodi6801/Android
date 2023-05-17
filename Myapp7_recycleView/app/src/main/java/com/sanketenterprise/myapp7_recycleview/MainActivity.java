package com.sanketenterprise.myapp7_recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String [] arr = {"SANKET1 ","SANKET2","SANKET3","SANKET4","SANKET5","SANKET6","SANKET7","SANKET8","SANKET9","SANKET10","SANKET11","SANKET12"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerView);
        CustomAdapter c = new CustomAdapter(arr);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(c);

        // This section is not working!! :(
//      recyclerView.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//              Toast.makeText(MainActivity.this, "you clicked the button!! ", Toast.LENGTH_SHORT).show();
//          }
//      });

    }
}