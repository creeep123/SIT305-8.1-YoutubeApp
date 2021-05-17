package com.example.youtubeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button playButton;
    EditText urlEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        playButton = findViewById(R.id.playButton);
        urlEditText = findViewById(R.id.urlEditText);

        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = urlEditText.getText().toString();
                String playUrl;
                if (url.length() != 0) {
                    Intent intent = new Intent(MainActivity.this, VideoActivity.class);
                    playUrl = url.substring(30);
                    intent.putExtra("URL", playUrl);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Please enter a youtube url!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}