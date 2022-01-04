package com.example.uas_musik.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uas_musik.R;
import com.example.uas_musik.view.quiz.quiz;

public class MainActivity extends AppCompatActivity {
    Button btn_materi;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_materi = findViewById(R.id.btn_materi);

        btn_materi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, quiz.class);
                startActivity(intent);
            }
        });
    }
}