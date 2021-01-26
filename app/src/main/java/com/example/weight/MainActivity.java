package com.example.weight;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.weight.navigation.MainNavigationActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        List<String> stationList = new ArrayList<String>();
//        List<String> nameList = new ArrayList<String>();
//        stationList.add("请输入场站信息");
//        nameList.add("请输入姓名");
//        ArrayAdapter<String> stationAdapter = new ArrayAdapter<String>(this,
//                R.layout.support_simple_spinner_dropdown_item, stationList);
//        ArrayAdapter<String> nameAdapter = new ArrayAdapter<String>(this,
//                R.layout.support_simple_spinner_dropdown_item, nameList);
//
//        Spinner statonSelection = findViewById(R.id.login_station);
//        Spinner nameSelection = findViewById(R.id.login_name);
//
//        statonSelection.setAdapter(stationAdapter);
//        nameSelection.setAdapter(nameAdapter);

//        statonSelection.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
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
//        nameSelection.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//
//            }
//        });

        Button button = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Spinner nameSpinner = findViewById(R.id.login_name);
//                String name = nameSpinner.get;
                String name = "zys";
//                if (TextUtils.isEmpty(name)) {
//                    Toast.makeText(MainActivity.this, "请输入姓名", Toast.LENGTH_SHORT).show();
//                    return;
//                }
                Intent intent = new Intent(MainActivity.this, MainNavigationActivity.class);
                intent.putExtra("name", name);
                startActivity(intent);
            }
        });

        Button button1 = findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainNavigationActivity.class);
                startActivity(intent);
            }
        });
    }
}
