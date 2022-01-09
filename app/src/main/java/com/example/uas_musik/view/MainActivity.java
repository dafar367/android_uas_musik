package com.example.uas_musik.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.uas_musik.R;
import com.example.uas_musik.view.quiz.quiz;

public class MainActivity extends AppCompatActivity {
    Button btn_materi;
    NavHostFragment navHostFragment;
    NavController navController;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);

        AppBarConfiguration configuration = new AppBarConfiguration.Builder(R.id.loginFragment, R.id.registerFragment).build();
        navController = navHostFragment.getNavController();
        });
//        btn_materi = findViewById(R.id.btn_materi);
//
//        btn_materi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, quiz.class);
//                startActivity(intent);
//            }
//        });


    }
}