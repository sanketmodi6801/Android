package com.sanketenterprise.myapp8_contactlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    Contact a1= new Contact(1,"9726140484","Sanket");
    Contact a2= new Contact(1,"9726140484","Sanket");
    Contact a3= new Contact(1,"9726140484","Sanket");
    Contact a4= new Contact(1,"9726140484","Sanket");
    Contact a5= new Contact(1,"9726140484","Sanket");
    Contact a6= new Contact(1,"9726140484","Sanket");
    Contact a7= new Contact(1,"9726140484","Sanket");
    Contact a8= new Contact(1,"9726140484","Sanket");
    Contact a9= new Contact(1,"9726140484","Sanket");
    Contact a10= new Contact(1,"9726140484","Sanket");
    Contact a11= new Contact(1,"9726140484","Sanket");
    Contact a12= new Contact(1,"9726140484","Sanket");

    Contact [] contacts={a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView =findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        CustomAdapter c = new CustomAdapter(contacts);
        recyclerView.setAdapter(c);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
    }
}