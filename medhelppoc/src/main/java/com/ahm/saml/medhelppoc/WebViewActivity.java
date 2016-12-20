package com.ahm.saml.medhelppoc;



import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
public class WebViewActivity extends Activity {
    public WebView webView;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);

        webView = (WebView)findViewById(R.id.webView1);

        WebSettings webSetting = webView.getSettings();
        webSetting.setBuiltInZoomControls(true);
        webSetting.setJavaScriptEnabled(true);

        webView.setWebViewClient(new WebViewActivity.WebViewClient());
        webView.loadUrl("file:///android_res/raw/sso.html");


    }
    private class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }



}
