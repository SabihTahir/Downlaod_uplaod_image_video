package com.example.firebase_firestorage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void moveToUploadImage(View v)
    {
        startActivity(new Intent(this,upload_image.class));
    }

    public void moveToDownloadImage(View v)
    {
        startActivity(new Intent(this,download_image.class));
    }
    public void moveToUploadVideo(View v)
    {
        startActivity(new Intent(this,upload_video.class));
    }

    public void moveToDownloadVideo(View v)
    {
        startActivity(new Intent(this,download_video.class));
    }
}
