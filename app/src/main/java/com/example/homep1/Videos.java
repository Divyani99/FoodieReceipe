package com.example.homep1;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Videos extends AppCompatActivity {
        TextView txtTikka;
        WebView webView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videos);
        txtTikka=(TextView)findViewById(R.id.Linkgoogle);
        webView1=(WebView)findViewById(R.id.webview1);
        webView1.setWebViewClient(new MyBrowser());
        txtTikka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url=txtTikka.getText().toString();
                webView1.getSettings().setLoadsImagesAutomatically(true);
                webView1.getSettings().setJavaScriptEnabled(true);
                webView1.setScrollBarStyle(View.SCROLLBARS_INSIDE_OVERLAY);
                webView1.loadUrl(url);
            }
        });


    }
    private class MyBrowser extends WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view , String url)
        {
            view.loadUrl(url);
            return true;
        }
    }
}
