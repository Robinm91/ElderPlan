package com.example.robin.elderplannerv1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView weekListView;

    String taskList[] = {"doc", "meds", "visit", "relatives"};
    String placeList[] = {"hospital", "home","grandkids","home"};
    String dateArray[] = {"26/3", "1/4", "3/5", "5/5"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        weekListView = (ListView) findViewById(R.id.weekList);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), taskList, dateArray,placeList);
        weekListView.setAdapter(customAdapter);
    }
    public void onButtonClick(View view)
    {
        Intent intent = new Intent(this, AddEventActivity.class);
        startActivity(intent);
    }
}
