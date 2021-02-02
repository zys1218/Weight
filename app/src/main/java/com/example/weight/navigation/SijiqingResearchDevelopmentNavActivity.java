package com.example.weight.navigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weight.R;

public class SijiqingResearchDevelopmentNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sijiqing_research_development_nav);

        Intent previousIntent = getIntent();
        final String name = previousIntent.getStringExtra("name");
    }
}
