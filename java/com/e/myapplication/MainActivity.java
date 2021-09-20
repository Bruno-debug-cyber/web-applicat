/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.view.View
 *  android.webkit.WebSettings
 *  android.webkit.WebView
 *  android.webkit.WebViewClient
 *  androidx.appcompat.app.AppCompatActivity
 *  java.lang.String
 */
package com.e.myapplication;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity
extends AppCompatActivity {
    private WebView mywebView;

    public void onBackPressed() {
        if (this.mywebView.canGoBack()) {
            this.mywebView.goBack();
            return;
        }
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        WebView webView;
        super.onCreate(bundle);
        this.setContentView(2131361820);
        this.mywebView = webView = (WebView)this.findViewById(2131165365);
        webView.setWebViewClient(new WebViewClient());
        this.mywebView.loadUrl("https://dmisjbu.edu.mw/");
        this.mywebView.getSettings().setJavaScriptEnabled(true);
    }

    public class mywebClient
    extends WebViewClient {
        public void onPageStarted(WebView webView, String string2, Bitmap bitmap) {
            super.onPageStarted(webView, string2, bitmap);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String string2) {
            webView.loadUrl(string2);
            return true;
        }
    }

}

