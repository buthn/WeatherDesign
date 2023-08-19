package com.example.weatherdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Design2Activity extends AppCompatActivity {

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design2);
        list = findViewById(R.id.list1);

        ArrayList<weather_list> weather_arry = new ArrayList<weather_list>();

        weather_arry.add(new weather_list("Mon",R.drawable.weather,"mostly clear","20 / 19"));
        weather_arry.add(new weather_list("Sun",R.drawable.weather,"mostly clear","20 / 19"));
        weather_arry.add(new weather_list("Tue",R.drawable.weather,"mostly clear","20 / 19"));
        weather_arry.add(new weather_list("Wen",R.drawable.weather,"Partly Clear","20 / 19"));
        weather_arry.add(new weather_list("Thu",R.drawable.weather,"mostly clear","20 / 19"));
        weather_arry.add(new weather_list("Fir",R.drawable.weather,"mostly clear","20 / 19"));
        weather_arry.add(new weather_list("Sat",R.drawable.weather,"mostly clear","20 / 19"));

        weather_adapter arrayAdapter = new weather_adapter(this,weather_arry);
        list.setAdapter(arrayAdapter);
    }
}