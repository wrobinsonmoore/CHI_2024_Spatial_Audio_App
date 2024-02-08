package com.SLU_multimodal_touch.Graphs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class GraphSelector extends AppCompatActivity {

    /**************************************************************************************
     * GLOBAL VARIABLES
     **************************************************************************************/
    String TAG = "GraphSelector: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.graph_selector);

        /**************************************************************************************
         * LOCK THE ORIENTATION, HIDE NAVIGATION BUTTONS
         **************************************************************************************/
        // Lock the orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        // Hide the navigation buttons
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        /**************************************************************************************
         * HISTOGRAM BUTTONS
         **************************************************************************************/
        Button histo_training_normal = findViewById(R.id.histo_training_normal);
        histo_training_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, histo_training_normal.class);
                startActivity(next_activity);
            }
        });
        Button histo_10_normal = findViewById(R.id.histo_10_normal);
        histo_10_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, histo_10_normal.class);
                startActivity(next_activity);
            }
        });
        Button histo_15_normal = findViewById(R.id.histo_15_normal);
        histo_15_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, histo_15_normal.class);
                startActivity(next_activity);
            }
        });
        Button histo_training_spatial = findViewById(R.id.histo_training_spatial);
        histo_training_spatial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, histo_training_spatial.class);
                startActivity(next_activity);
            }
        });
        Button histo_10_spatial = findViewById(R.id.histo_10_spatial);
        histo_10_spatial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, histo_10_spatial.class);
                startActivity(next_activity);
            }
        });
        Button histo_15_spatial = findViewById(R.id.histo_15_spatial);
        histo_15_spatial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, histo_15_spatial.class);
                startActivity(next_activity);
            }
        });

        /**************************************************************************************
         * SCATTER PLOT BUTTONS
         **************************************************************************************/
        Button scatter_training_normal = findViewById(R.id.scatter_training_normal);
        scatter_training_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, scatter_training_normal.class);
                startActivity(next_activity);
            }
        });
        Button scatter_training_spatial = findViewById(R.id.scatter_training_spatial);
        scatter_training_spatial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, scatter_training_spatial.class);
                startActivity(next_activity);
            }
        });
        Button scatter_100_normal = findViewById(R.id.scatter_100_normal);
        scatter_100_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, scatter_100_normal.class);
                startActivity(next_activity);
            }
        });
        Button scatter_500_normal = findViewById(R.id.scatter_500_normal);
        scatter_500_normal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, scatter_500_normal.class);
                startActivity(next_activity);
            }
        });
        Button scatter_100_spatial = findViewById(R.id.scatter_100_spatial);
        scatter_100_spatial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, scatter_100_spatial.class);
                startActivity(next_activity);
            }
        });
        Button scatter_500_spatial = findViewById(R.id.scatter_500_spatial);
        scatter_500_spatial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Move to the next activity
                Intent next_activity = new Intent(GraphSelector.this, scatter_500_spatial.class);
                startActivity(next_activity);
            }
        });






        /**************************************************************************************
         * NAVIGATION BUTTONS
         **************************************************************************************/
        Button back_button = findViewById(R.id.back);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Go Back to Participant Activity
                Intent back = new Intent(GraphSelector.this, participant.class);
                startActivity(back);
            }
        });

    }
}