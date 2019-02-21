package com.example.user.cprogrammingtutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class ContactActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        webView = (WebView) findViewById(R.id.webViewId);

        webView.loadUrl("https://accounts.google.com/ServiceLogin/signinchooser?hl=en-GB&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

    }
}
