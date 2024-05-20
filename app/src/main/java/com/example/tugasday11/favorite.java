package com.example.tugasday11;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class favorite extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite);

         ImageButton btnInbox = findViewById(R.id.btnfavoriteInbox);
        ImageButton btnNews = findViewById(R.id.btnfavoriteNews);
        ImageButton btnStore = findViewById(R.id.btnfavoriteStore);

        btnInbox.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(favorite.this, inbox.class);
                startActivity(intent);
            }
        });

        btnNews.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(favorite.this, news.class);
                startActivity(intent);
            }
        });
        btnStore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(favorite.this, store.class);
                startActivity(intent);
            }
        });
    }
}
