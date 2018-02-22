package com.example.robin.elderplannerv1;

/**
 * Created by Robin on 2018-02-22.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    String taskList[];
    String dateArray[];
    String placeList[];
    LayoutInflater inflter;

    public CustomAdapter(Context applicationContext, String[] taskList, String[] dateArray, String[] placeList) {
        this.context = context;
        this.taskList = taskList;
        this.dateArray = dateArray;
        this.placeList = placeList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return taskList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.list_item, null);
        TextView titleTxt = (TextView) view.findViewById(R.id.titleTxt);
        TextView dateTxt = (TextView) view.findViewById(R.id.dateTxt);
        TextView placeTxt = (TextView) view.findViewById(R.id.placeTxt);
        titleTxt.setText(taskList[i]);
        dateTxt.setText(dateArray[i]);
        placeTxt.setText(placeList[i]);
        return view;
    }
}