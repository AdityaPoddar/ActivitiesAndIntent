package com.example.activitesandintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        displayText = findViewById(R.id.display_text);
        Intent intent = getIntent();
        String display = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        displayText.setText(display);
    }
}