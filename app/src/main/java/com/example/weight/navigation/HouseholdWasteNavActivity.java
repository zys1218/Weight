package com.example.weight.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weight.R;
import com.example.weight.householdWaste.AbnormalRubbishActivity;
import com.example.weight.householdWaste.BottleClassifierPutrescibleActivity;
import com.example.weight.householdWaste.ChangeWaterActivity;
import com.example.weight.householdWaste.CombustiblePutrescibleActivity;
import com.example.weight.householdWaste.DeodorantSprayTimeActivity;
import com.example.weight.householdWaste.ElectricRecordActivity;
import com.example.weight.householdWaste.FacilityMaintainPlanActivity;
import com.example.weight.householdWaste.FacilityRuntimeActivity;
import com.example.weight.householdWaste.FaultRepairActivity;
import com.example.weight.householdWaste.StoppageClearActivity;
import com.example.weight.householdWaste.WaterRecordActivity;
import com.example.weight.householdWaste.YijingStationResourceActivity;

public class HouseholdWasteNavActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_household_waste_nav);

        Intent previousIntent = getIntent();
        final String name = previousIntent.getStringExtra("name");

        Button abnormalRubbishNav, bottleClassifierPutrescibleNav, changeWaterNav, combustiblePutrescibleNav,
                deodorantSprayTimeNav, electricRecordNav, facilityMaintainPlanNav, facilityRuntimeNav,
                faultRepairNav, stoppageClearNav, waterRecordNav, yijingStationResourceNav;

        abnormalRubbishNav = findViewById(R.id.abnormal_rubbish_nav);
        abnormalRubbishNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, AbnormalRubbishActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        bottleClassifierPutrescibleNav = findViewById(R.id.bottle_classifier_putrescible_nav);
        bottleClassifierPutrescibleNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, BottleClassifierPutrescibleActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        changeWaterNav = findViewById(R.id.change_water_nav);
        changeWaterNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, ChangeWaterActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        combustiblePutrescibleNav = findViewById(R.id.combustible_putrescible_nav);
        combustiblePutrescibleNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, CombustiblePutrescibleActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        deodorantSprayTimeNav = findViewById(R.id.deodorant_spray_nav);
        deodorantSprayTimeNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, DeodorantSprayTimeActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        electricRecordNav = findViewById(R.id.electric_record_nav);
        electricRecordNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, ElectricRecordActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        facilityMaintainPlanNav = findViewById(R.id.facility_maintain_plan_nav);
        facilityMaintainPlanNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, FacilityMaintainPlanActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        facilityRuntimeNav = findViewById(R.id.facility_runtime_nav);
        facilityRuntimeNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, FacilityRuntimeActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        faultRepairNav = findViewById(R.id.fault_repair_nav);
        faultRepairNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, FaultRepairActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        stoppageClearNav = findViewById(R.id.stoppage_clear_nav);
        stoppageClearNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, StoppageClearActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        waterRecordNav = findViewById(R.id.water_record_nav);
        waterRecordNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, WaterRecordActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        yijingStationResourceNav = findViewById(R.id.yijing_station_resource_nav);
        yijingStationResourceNav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseholdWasteNavActivity.this, YijingStationResourceActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });
    }
}
