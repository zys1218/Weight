package com.example.weight.householdWaste;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.appcompat.app.AppCompatActivity;

import com.example.weight.R;

import java.util.ArrayList;
import java.util.List;

public class StoppageClearActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stoppage_clear);

        List<String> stoppagePartList = new ArrayList<String>();
        stoppagePartList.add("请输入堵塞部位");
        stoppagePartList.add("test");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item, stoppagePartList);

        Spinner stoppagePartSelection = findViewById(R.id.stoppage_part_selection);
        stoppagePartSelection.setAdapter(arrayAdapter);
        stoppagePartSelection.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
