package com.example.uts_tekber_h1101171025;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class aktivitas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aktivitas);
    }
    public void synactivity (View view){
        Intent intent = new Intent(this,synaktivitas.class);
        startActivity(intent);
    }
    public void open (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://android-beginner-lessons.blogspot.com/2015/10/android-mengenal-komponen-aplikasi.html"));
        startActivity(browserIntent);
    }
}


