package com.example.weight.navigation;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weight.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SijiqingCenterNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sijiqing_center_nav);

        Intent previousIntent = getIntent();
        final String name = previousIntent.getStringExtra("name");

        Button weight, solidLiquidSep, flocculation, compost, waterDeal,
                deodorization, researchDevelopment, systemMaintain;

        weight = findViewById(R.id.sijiqing_weight_nav);
        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SijiqingCenterNavActivity.this, SijiqingWeightNavActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        solidLiquidSep = findViewById(R.id.sijiqing_solid_liquid_sep_nav);
        solidLiquidSep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SijiqingCenterNavActivity.this, SijiqingSolidLiquidSepNavActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        flocculation = findViewById(R.id.sijiqing_flocculation_nav);
        flocculation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SijiqingCenterNavActivity.this, SijiqingFlocculationNavActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        compost = findViewById(R.id.sijiqing_compost_nav);
        compost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SijiqingCenterNavActivity.this, SijiqingCompostNavActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        waterDeal = findViewById(R.id.sijiqing_water_deal_nav);
        waterDeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SijiqingCenterNavActivity.this, SijiqingWaterDealNavActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        deodorization = findViewById(R.id.sijiqing_deodorization_nav);
        deodorization.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });

        researchDevelopment = findViewById(R.id.sijiqing_research_development_nav);
        researchDevelopment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SijiqingCenterNavActivity.this, SijiqingResearchDevelopmentNavActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        systemMaintain = findViewById(R.id.sijiqing_system_maintain_nav);
        systemMaintain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}
