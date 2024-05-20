package com.example.tugasday11;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class news extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);

        ImageButton btnInbox = findViewById(R.id.btnnewsInbox);
        ImageButton btnStore = findViewById(R.id.btnnewsStore);
        ImageButton btnFavorite = findViewById(R.id.btnnewsFavorite);

        btnInbox.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(news.this, inbox.class);
                startActivity(intent);
            }
        });

        btnFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(news.this, favorite.class);
                startActivity(intent);
            }
        });


        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(news.this, store.class);
                startActivity(intent);
            }
        });
    }
}
