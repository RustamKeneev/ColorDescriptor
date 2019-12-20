package com.example.colordescriptor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner color_spinner;
    private Button find_color_description_button;
    private TextView description_color_text_view;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAndBuildViews();
    }

    private void initAndBuildViews() {
        color_spinner = findViewById(R.id.color_spinner);
        find_color_description_button = findViewById(R.id.find_color_description_button);
        description_color_text_view = findViewById(R.id.description_color_text_view);
    }

    public void showDescription(View view) {
        int position = color_spinner.getSelectedItemPosition();
        String description = getDescriptionByPosition(position);
        description_color_text_view.setText(description);
    }
    private String getDescriptionByPosition(int position){
        String[] descriptionArrays = getResources().getStringArray(R.array.color_description_array);
        return descriptionArrays[position];
    }
}
