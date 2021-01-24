package com.example.weight.navigation;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weight.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainNavigationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_navigation);

        Intent previousIntent = getIntent();
        final String name = previousIntent.getStringExtra("name");

        Button householdWasteNav, kitchenRubbishNav, sijiqingCenterNav;
        householdWasteNav = findViewById(R.id.household_waste_nav);
        kitchenRubbishNav = findViewById(R.id.kitchen_rubbish_nav);
        sijiqingCenterNav = findViewById(R.id.sijiqing_center_nav);

        householdWasteNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, HouseholdWasteNavActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        kitchenRubbishNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, KitchenRubbishNavActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        sijiqingCenterNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainNavigationActivity.this, SijiqingCenterNavActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }
}
