package com.example.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);
        setTitle("About ALC");

        WebView myWebView = (WebView) findViewById(R.id.webview_about_alc);
        WebSettings webSettings = myWebView.getSettings();

        webSettings.setJavaScriptEnabled(true);

        // HTTPS in webView
        myWebView.setWebViewClient(new WebViewClient(){
            @Override
            public void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
                handler.proceed();
            }
        });

        myWebView.loadUrl("https://andela.com/alc/");
    }

}
