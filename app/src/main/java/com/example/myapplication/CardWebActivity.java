package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class CardWebActivity extends AppCompatActivity {

     protected  WebView webviewVariable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_web);

        webviewVariable = this.findViewById(R.id.cardScreen);
        setupWebView(webviewVariable);
    }

    private  void setupWebView(WebView webview){
        webview.setWebViewClient(new WebViewClient());
        WebSettings webViewSettings = webview.getSettings();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            webViewSettings.setSafeBrowsingEnabled(true);
        }
        webview.loadUrl("https://developer.android.com/develop/ui/views/layout/webapps/webview#groovy");
    }


}