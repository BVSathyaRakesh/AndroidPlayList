package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button darkBtn;
    private  Button lightBtn;
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        darkBtn =  this.findViewById(R.id.btnDark);
        lightBtn = this.findViewById(R.id.lightBtn);
        linearLayout =  this.findViewById(R.id.linearLayout);

    }

    public void darkClicked(View v){
//        linearLayout.setBackgroundColor(getColor(R.color.yellow));

        //Explicit Intent: Navigation/Opening an activity within the application
        Intent explicitIntent = new Intent(getApplicationContext(),SecondActivity.class);
        startActivity(explicitIntent);
    }

    public void lightClicked(View v){
//        linearLayout.setBackgroundColor(getColor(R.color.black));

         //Explicit Intent: Navigation/Opening a application outside the application

    }

}