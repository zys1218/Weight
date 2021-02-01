package com.example.weight.householdWaste;

import androidx.appcompat.app.AppCompatActivity;
import com.example.weight.R;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class CombustiblePutrescibleActivity extends AppCompatActivity {

    private TextView comeTime, leaveTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_combustible_putrescible);

        comeTime = findViewById(R.id.combustible_putrescible_come_time);
        leaveTime = findViewById(R.id.combustible_putrescible_leave_time);
    }

    public void selectComeTime(View view) {
        Calendar calendar = Calendar.getInstance();
        final int HOUR = calendar.get(Calendar.HOUR_OF_DAY);
        final int MINUTE = calendar.get(Calendar.MINUTE);

        new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                comeTime.setText(HOUR + ":" + MINUTE);
            }
        }
        ,HOUR
        ,MINUTE
        ,true).show();
    }

    public void selectLeaveTime(View view) {
        Calendar calendar = Calendar.getInstance();
        final int HOUR = calendar.get(Calendar.HOUR_OF_DAY);
        final int MINUTE = calendar.get(Calendar.MINUTE);

        new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                leaveTime.setText(HOUR + ":" + MINUTE);
            }
        }
        ,HOUR
        ,MINUTE
        ,true).show();
    }
}
