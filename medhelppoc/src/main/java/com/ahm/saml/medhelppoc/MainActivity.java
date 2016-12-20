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
import android.app.ProgressDialog;
import android.support.v7.app.ActionBarActivity;
import android.widget.ProgressBar;
import android.os.Handler;

public class MainActivity extends Activity {

    private Button button;
    private WebView webView;
    private static final int PROGRESS = 0x1;

    private ProgressBar mProgress;
    private int mProgressStatus = 0;

    private Handler mHandler = new Handler();

    public void onCreate(Bundle savedInstanceState) {
        final Context context = this;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView)findViewById(R.id.webView1);

        gotoMedHelp();


    }



private void gotoMedHelp(){
        Button button = (Button) findViewById(R.id.buttonUrl);

        button.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent activityChangeIntent = new Intent(MainActivity.this, WebViewActivity.class);

                // currentContext.startActivity(activityChangeIntent);

                MainActivity.this.startActivity(activityChangeIntent);
            }
        });
    }




    /*private class WebViewClient extends android.webkit.WebViewClient
    {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return super.shouldOverrideUrlLoading(view, url);
        }
    }*/


}
