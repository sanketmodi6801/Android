package com.sanketenterprise.app6_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    TextView textView;
    String arr[]={"This..","Is new..","List type of...","View","So...!!","Let's Get"," Started..!!","Sanket","You are..","Very cool!!"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview =findViewById(R.id.listview);
        textView =findViewById(R.id.textView);

        ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_list_item_1,arr);
        listview.setAdapter(ad);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(MainActivity.this, "You clicked on "+(position+1), Toast.LENGTH_SHORT).show();
            }
        });

//        for(int i=0;i<=arr.length;i++)
//        {
//
//            textView.setText(arr[i]);
//        }

    }
}