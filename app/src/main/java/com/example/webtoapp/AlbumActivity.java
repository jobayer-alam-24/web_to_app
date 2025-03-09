package com.example.webtoapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AlbumActivity extends AppCompatActivity {

    public static String websiteUrl = "";
    AppCompatButton daraz, shajgoj, bongoBazar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_album);

        daraz = findViewById(R.id.daraz);
        shajgoj = findViewById(R.id.shajgoj);
        bongoBazar = findViewById(R.id.bongoBazar);

        daraz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                websiteUrl = "https://www.daraz.com.bd/";
                Intent next = new Intent(AlbumActivity.this, DisplayActivity.class);
                startActivity(next);
            }
        });
        shajgoj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                websiteUrl = "https://www.shajgoj.com/";
                Intent next = new Intent(AlbumActivity.this, DisplayActivity.class);
                startActivity(next);
            }
        });
        bongoBazar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                websiteUrl = "https://www.bongo.com.bd/";
                Intent next = new Intent(AlbumActivity.this, DisplayActivity.class);
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}