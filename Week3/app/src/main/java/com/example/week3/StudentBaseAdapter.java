package com.example.week3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class StudentBaseAdapter extends BaseAdapter {

    ArrayList<Student> list;
    Context context;

    public StudentBaseAdapter(ArrayList<Student> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = LayoutInflater.from(context).inflate(R.layout.student_row_layout,parent, false);
        TextView name = v.findViewById(R.id.std_list_stdName);
        TextView program = v.findViewById(R.id.std_list_programName);
        TextView college = v.findViewById(R.id.std_list_collegeName);

        name.setText(list.get(position).name);
        program.setText(list.get(position).program);
        college.setText(list.get(position).college);

        return v;
    }
}
