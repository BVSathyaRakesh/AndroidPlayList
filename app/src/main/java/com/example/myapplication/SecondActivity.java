package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Notification;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;

import java.net.URI;

public class SecondActivity extends AppCompatActivity {

    private CardView cardWebBtn;
    private CardView cardCameraBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        cardWebBtn = this.findViewById(R.id.cardWeb);
        cardCameraBtn = this.findViewById(R.id.cardCamera);
    }

    public void  cardWebLinkBtnPressed(View v){
        Log.v("check","web clicked");
        Intent intent = new Intent(Intent.ACTION_VIEW,
        Uri.parse("https://www.google.com/"));
        startActivity(intent);
    }

    public void  cardCameraBtnPressed(View v){
        Log.v("check","camera clicked");
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivity(intent);
    }

    public  void  setCardWebBtn(View v){
        Log.v("check","WebView clicked");
        Intent explicitIntent = new Intent(getApplicationContext(),CardWebActivity.class);
        startActivity(explicitIntent);
    }


}