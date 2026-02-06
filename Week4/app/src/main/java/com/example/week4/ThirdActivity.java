package com.example.week4;

import static android.widget.Toast.LENGTH_LONG;

import android.content.Intent;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ThirdActivity extends AppCompatActivity {


    Button takeAphoto;
    ImageView photo;
    private ActivityResultLauncher<Intent> myLauncher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_third);
        takeAphoto = findViewById(R.id.camerabut);
        photo = findViewById(R.id.photo);


        myLauncher = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(), result -> {
                        if (result.getResultCode() == RESULT_OK && result.getData() != null) {
                            Bitmap thumbnail = result.getData().getParcelableExtra("data");
                            photo.setImageBitmap(thumbnail);
                    }
                });


        takeAphoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //implicit Intent
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                myLauncher.launch(cameraIntent);

            }
        });


    }
}