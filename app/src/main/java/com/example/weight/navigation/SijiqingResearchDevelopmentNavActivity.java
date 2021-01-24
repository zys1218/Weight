package com.example.weight.navigation;

import androidx.appcompat.app.AppCompatActivity;
import com.example.weight.R;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SijiqingResearchDevelopmentNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sijiqing_research_development_nav);

        Intent previousIntent = getIntent();
        final String name = previousIntent.getStringExtra("name");
    }
}
