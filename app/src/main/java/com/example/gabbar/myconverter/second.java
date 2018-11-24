package com.example.gabbar.myconverter;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;

import java.text.FieldPosition;

public class second extends Activity  {
Button b1;
ListView lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
      lst=(ListView)findViewById(R.id.lst);
        /*  b1=(Button)findViewById(R.id.sbt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),third.class);
                startActivity(i);
            }
        });*/final String [] items = getResources().getStringArray(
                R.array.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                getBaseContext(),
                android.R.layout.simple_list_item_1, items);

        lst.setAdapter(adapter);
        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:   Intent intent=new Intent(getApplicationContext(),third.class);
                        intent.putExtra("string","one");
                        startActivity(intent);
                        break;
                    case 1:   Intent intent1=new Intent(getApplicationContext(),third.class);
                        intent1.putExtra("string","two");
                        startActivity(intent1);
                        break;
                    case 2:   Intent intent2=new Intent(getApplicationContext(),third.class);
                        intent2.putExtra("string","three");
                        startActivity(intent2);
                        break;
                    case 3:   Intent intent3=new Intent(getApplicationContext(),third.class);
                        intent3.putExtra("string","four");
                        startActivity(intent3);
                        break;
                    case 4:   Intent intent4=new Intent(getApplicationContext(),third.class);
                        intent4.putExtra("string","five");
                        startActivity(intent4);
                        break;
                    case 5:   Intent intent5=new Intent(getApplicationContext(),third.class);
                        intent5.putExtra("string","six");
                        startActivity(intent5);
                        break;
                    case 6:   Intent intent6=new Intent(getApplicationContext(),third.class);
                        intent6.putExtra("string","seven");
                        startActivity(intent6);
                        break;


                }

                Toast.makeText(getBaseContext(),
                      "You are "+items[i]+" Selected",
                        Toast.LENGTH_SHORT).show();

            }
        });

    }



  }
