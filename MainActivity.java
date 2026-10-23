package com.example.activitylifecycle;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e()tag:"Lifecycle","onCreate: ");

    @Override
    protected void onStart() {
        super.onStart();
            Log.e()tag:"Lifecycle","onStart: ");
    }


    @Override
    protected void onResume() {
        super.onResume();
            Log.i()tag:"Lifecycle","onResume: ");
    }


    @Override
    protected void onPause() {
        super.onPause();
            Log.w()tag:"Lifecycle","onPause: ");
    }



    @Override
    protected void onRestart() {
        super.onRestart();
            Log.e()tag:"Lifecycle","onRestart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
            Log.d()tag:"Lifecycle","onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
            Log.i()tag:"Lifecycle","onDestroy: ");
    }
}