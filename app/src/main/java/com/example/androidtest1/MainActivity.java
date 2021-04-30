package com.example.androidtest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    this.play = (Button) findViewById(R.id.button);
        play.setOnClickListener(view -> {
            Intent autreact = new Intent (getApplicationContext(), otherActivity.class);
            startActivity(autreact);
            finish();
        });

    }
}