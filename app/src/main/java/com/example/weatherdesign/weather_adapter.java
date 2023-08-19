package com.example.weatherdesign;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class weather_adapter extends ArrayAdapter<weather_list> {

    public weather_adapter(@NonNull Context context, ArrayList<weather_list> PostModelArrayList) {
        super(context, 0, PostModelArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listitemView = convertView;
        if (listitemView == null) {
            // Layout Inflater inflates each item to be displayed in listview.
            listitemView = LayoutInflater.from(getContext()).inflate(R.layout.weather_desgin, parent, false);
        }

        weather_list weather = getItem(position);

        TextView weather_day;
        ImageButton weather_img;
        TextView weather_description;
        TextView weather_date;

        weather_day = listitemView.findViewById(R.id.txt_day);
        weather_img = listitemView.findViewById(R.id.icon1);
        weather_description = listitemView.findViewById(R.id.txt_desc);
        weather_date = listitemView.findViewById(R.id.txt_date);


        weather_day.setText(weather.getDay());
        weather_img.setImageResource(weather.getImg());
        weather_description.setText(weather.getWeatherDesc());
        weather_date.setText(weather.getDate());

        return listitemView;
    }
}
