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
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    Button tosecond;
    Button tothird;
    EditText number_text;

    private ActivityResultLauncher<Intent> myLauncher;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        tosecond = findViewById(R.id.gotoSecond);
        tothird = findViewById(R.id.gotoThird);

        number_text = findViewById(R.id.number_text);
        Log.d("lifecycles","MainActivity - OnCreate");


        myLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result -> {
                    if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                        Intent data = result.getData();
                        String collegeName = data.getStringExtra("collegename");
                        Toast.makeText(MainActivity.this, "The college is "+ collegeName , LENGTH_LONG).show();
                    }
                });

        tosecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!number_text.getText().toString().isEmpty()){
                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("usersnumber",  Integer.parseInt(number_text.getText().toString()));
                    myLauncher.launch(i);// don't use startActivity
                }
            }
        });

        tothird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               //
                Intent tothirdIntent = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(tothirdIntent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycles","MainActivity - onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycles","MainActivity - onResume");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycles","MainActivity - onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycles","MainActivity - onDestroy");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycles","MainActivity - onStop");

    }
}