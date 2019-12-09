package com.example.listviewstringarray;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String []names = new String[]{
            "Sanjeev(Creator)",
            "Dileep",
            "Sunil",
            "Ravi",
            "Manoj",
            "Vinod",
            "Rahul",
            "Abhishek",
            "Kunal",
            "Pritam",
            "Mukesh",
            "Dev",
            "Aniket",
            "kapil",
            "pintu",
            "Sunny",
            "Kamal"
    };
    ListView lvNames;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvNames=findViewById(R.id.lvtext);

        ArrayAdapter<String> namesAdapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                android.R.id.text1,names
        );
        lvNames.setAdapter(namesAdapter);




    }
}
