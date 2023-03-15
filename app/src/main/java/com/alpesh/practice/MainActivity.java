package com.alpesh.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    WebView IdWeb;
    String url = "https://m.youtube.com/";

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IdWeb = findViewById(R.id.IdWeb);

        WebSettings settings = IdWeb.getSettings();
        settings.setJavaScriptEnabled(true);
        IdWeb.loadUrl(url);
    }
}