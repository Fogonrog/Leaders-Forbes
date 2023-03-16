package com.example.myapplication;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

public class MyMonthAdapter extends ArrayAdapter<Person> {

    public MyMonthAdapter(Context context, Person[] arr) {
        super(context, R.layout.adapter_item, arr);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Person month = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.adapter_item,null);
        }
        ((TextView) convertView.findViewById(R.id.name)).setText(String.valueOf(month.name));
        ((TextView) convertView.findViewById(R.id.money)).setText(String.valueOf(month.money));
        ((ImageView) convertView.findViewById(R.id.flag)).setImageResource(month.flag_res);
        return convertView;
    }
}