package com.example.week4;

import static android.widget.Toast.LENGTH_LONG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    Button backBut;
    EditText collegeName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        Log.d("lifecycles","SecondActivity -onCreate");
        collegeName = findViewById(R.id.college_text);
        backBut = findViewById(R.id.backbut);
        int fromMainActivity =  getIntent().getIntExtra("usersnumber",-1);
        Toast.makeText(this, "The number is "+ fromMainActivity , LENGTH_LONG).show();
        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!collegeName.getText().toString().isEmpty()){
                    Intent backIntent = new Intent();
                    backIntent.putExtra("collegename", collegeName.getText().toString());
                    setResult(RESULT_OK,backIntent);
                    finish();// don't create a new intent
                }


            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycles","SecondActivity -onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycles","SecondActivity - onResume");
        // refresh the screen after retuning from other activities
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycles","SecondActivity - onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycles","SecondActivity - onDestroy");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycles","SecondActivity - onStop");

    }
}
