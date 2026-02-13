package com.example.week5;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Switch;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends
        RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{
    ArrayList<ToDo> toDoArrayList;
    Context context;
    UpdateTaskListener updateTaskListener;

    interface UpdateTaskListener{
        void updateTask(int i);
    }
    public RecyclerViewAdapter(ArrayList<ToDo> toDoArrayList, Context c) {
        this.toDoArrayList = toDoArrayList;
        this.context = c;
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView taskName;
        private final TextView taskDate;
        private final Switch urgentSwitch;

        public MyViewHolder(View view) {
            super(view);
            taskName = (TextView) view.findViewById(R.id.rtaskname);
            taskDate = view.findViewById(R.id.rtaskdate);
            urgentSwitch = view.findViewById(R.id.rurgency_update);
        }
        public TextView getTaskName() {
            return taskName;
        }

        public TextView getTaskDate() {
            return taskDate;
        }

        public Switch getUrgentSwitch() {
            return urgentSwitch;
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.todo_row_layout,parent,false);
        return new MyViewHolder(v);// 1000 books  Only create 10 viewholders
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.taskName.setText(toDoArrayList.get(position).task);
        holder.taskDate.setText(toDoArrayList.get(position).date_time.toString());
        holder.urgentSwitch.setChecked(toDoArrayList.get(position).isUrgent);
        // finish the assignment // Feb 19 // urgent
        if (toDoArrayList.get(position).isUrgent)
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.red));
        else
            holder.itemView.setBackgroundColor(context.getResources().getColor(R.color.green));

    holder.urgentSwitch.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            int i = holder.getBindingAdapterPosition();
            updateTaskListener.updateTask(i);
        }
    });

    }


    @Override
    public int getItemCount() {
        return toDoArrayList.size();
    }
}
