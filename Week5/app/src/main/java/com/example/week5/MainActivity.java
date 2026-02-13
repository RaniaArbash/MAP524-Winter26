package com.example.week5;

import static android.widget.Toast.LENGTH_LONG;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity
        extends AppCompatActivity
        implements AddNewToDo.AddingToDoListener,
        RecyclerViewAdapter.UpdateTaskListener{

    RecyclerView todolist;
    FloatingActionButton addNewTodo;
    RecyclerViewAdapter adapter;
    ArrayList<ToDo> todoList = new ArrayList<>(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        todolist = findViewById(R.id.todolist);
        addNewTodo = findViewById(R.id.addNewToDo);
        AddNewToDo.listener = this;

        todolist.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerViewAdapter(todoList,this);
        todolist.setAdapter(adapter);
        adapter.updateTaskListener = this;

        addNewTodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,AddNewToDo.class);
                startActivity(intent);
            }
        });

    }

    @Override
    public void addingNewTaskCanceled() {
        Toast.makeText(this, "No Tasks Added ", LENGTH_LONG).show();
    }

    @Override
    public void addingNewTaskDone(ToDo newTodo) {
        Toast.makeText(this, "Task Added Successfully ", LENGTH_LONG).show();
        todoList.add(newTodo);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void updateTask(int i) {
        todoList.get(i).isUrgent = !todoList.get(i).isUrgent;
        adapter.notifyDataSetChanged();
    }
}