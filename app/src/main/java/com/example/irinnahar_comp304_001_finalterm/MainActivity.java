package com.example.irinnahar_comp304_001_finalterm;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lv_jobs;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.getJobButton);
        lv_jobs = findViewById(R.id.job);
        textView = findViewById(R.id.selectview);

        AppDatabase appDatabase = Room.databaseBuilder(getApplicationContext() ,
                AppDatabase.class, "jobinfo_db").allowMainThreadQueries().build();

        List<JobInfo> jobInfoList =  new DataProvider(appDatabase).getJobInformation();


        ArrayAdapter customerArrayAdapter =
                new ArrayAdapter<JobInfo>(this, android.R.layout.simple_list_item_1, jobInfoList);


        button.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        textView.setText("Select an open position");
                        lv_jobs.setAdapter(customerArrayAdapter);
                    }
                }
        );




        lv_jobs.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


//                Intent intent = new Intent(MainActivity.this,Ac_Restaurant.class);
//                intent.putExtra("cuisineName",cuisines.get(position).getName());
//                intent.putExtra("cuisineId",cuisines.get(position).getId());
//                intent.putExtra("position", position);
//
//                startActivity(intent);

            }
        });
    }
}