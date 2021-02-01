package com.example.weight.householdWaste;

import androidx.appcompat.app.AppCompatActivity;
import com.example.weight.R;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class FacilityMaintainPlanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facility_maintain_plan);

//        List<String> facilityList = new ArrayList<String>();
//        facilityList.add("请输入设备名称");
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
//                R.layout.support_simple_spinner_dropdown_item, facilityList);
//
//        List<String> maintainList = new ArrayList<String>();
//        facilityList.add("请输入维护内容");
//        ArrayAdapter<String> arrayAdapter2 = new ArrayAdapter<String>(this,
//                R.layout.support_simple_spinner_dropdown_item, maintainList);
//
//        Spinner facilityName = findViewById(R.id.facility_maintain_plan_facility_name);
//        Spinner maintainContent = findViewById(R.id.facility_maintain_plan_maintain_content);
//
//        facilityName.setAdapter(arrayAdapter);
//        facilityName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> parent) {
//
//            }
//        });
//
//        maintainContent.setAdapter(arrayAdapter2);
    }
}
