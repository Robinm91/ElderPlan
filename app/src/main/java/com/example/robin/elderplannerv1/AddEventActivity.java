package com.example.robin.elderplannerv1;

/**
 * Created by Robin on 2018-02-22.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddEventActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_event);

    }
    public void createEventClick(View view)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}