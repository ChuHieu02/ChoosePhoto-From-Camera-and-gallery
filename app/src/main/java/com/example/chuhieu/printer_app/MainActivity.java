package com.example.chuhieu.printer_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.chuhieu.printer_app.UpLoadPhoto.UploadPhotoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnphoto(View view) {
        startActivity(new Intent(this,UploadPhotoActivity.class));
    }
}
