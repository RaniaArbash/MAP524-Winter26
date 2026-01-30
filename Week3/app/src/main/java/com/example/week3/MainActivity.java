package com.example.week3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText nameText;
    EditText programName;
    Button signInButton;
    Spinner collegesList;
    ListView listView;

    String[] collegeArray;
    ArrayList<Student> studentArrayList= new ArrayList<Student>(0);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this, "Welcome..... ",
                Toast.LENGTH_SHORT).show();
        collegeArray = new String[]{"Seneca College", "Humber College", "Centennial College"};

         nameText =  findViewById(R.id.stdname);
         programName = findViewById(R.id.programname);
         signInButton = findViewById(R.id.LogIn);
         collegesList = findViewById(R.id.collegeName);
         listView = findViewById(R.id.stdlist);

         ArrayAdapter adapter = new ArrayAdapter(this,
                 R.layout.spinner_row_layout,
                 R.id.spinner_college_text,
                 collegeArray);
        collegesList.setAdapter(adapter);

        StudentBaseAdapter baseAdapter = new StudentBaseAdapter(studentArrayList,this);
        listView.setAdapter(baseAdapter);

         signInButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (!nameText.getText().toString().isEmpty() &&
                         !programName.getText().toString().isEmpty()){

                    String selectedCollege =  collegesList.getSelectedItem().toString();
                     Toast.makeText(MainActivity.this, "Welcome " + nameText.getText().toString() + " to the app" ,
                             Toast.LENGTH_SHORT).show();

                     Student s = new Student(nameText.getText().toString(),programName.getText().toString(),selectedCollege);
                     studentArrayList.add(s);
                     baseAdapter.notifyDataSetChanged();
                    nameText.setText("");
                    programName.setText("");

                 }else {
                     Toast.makeText(MainActivity.this, "Missing Info",
                             Toast.LENGTH_SHORT).show();
                 }
             }
         });

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}