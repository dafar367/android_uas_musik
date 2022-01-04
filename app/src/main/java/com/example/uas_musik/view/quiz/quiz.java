package com.example.uas_musik.view.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.uas_musik.R;
import com.example.uas_musik.model.quizArray;

public class quiz extends AppCompatActivity {

    TextView quiz_soal;
    private quizArray quizArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

    }
}