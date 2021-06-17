package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class SecondActivity extends AppCompatActivity {
    WebView wvPagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        wvPagina = (WebView) findViewById(R.id.wvPagina);

        String enlace = getIntent().getStringExtra("enlace");
        WebSettings webSettings = wvPagina.getSettings();
        webSettings.getJavaScriptEnabled();
        wvPagina.loadUrl("http://" + enlace);
        wvPagina.setWebViewClient(new WebViewClient());
        wvPagina.setWebChromeClient(new WebChromeClient());
    }
}