package me.bean5389.finderssample;

import android.os.Bundle;
import android.webkit.WebView;

import me.bean5389.finderssample.base.BaseActivity;
import me.bean5389.finderssample.base.BaseWebChromeClient;
import me.bean5389.finderssample.base.BaseWebViewClient;

/**
 * Created by bean on 20/01/2019.
 */

public class MainActivity extends BaseActivity {

    WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        mWebView = findViewById(R.id.webView);
        mWebView.setWebViewClient(new BaseWebViewClient());
        mWebView.setWebChromeClient(new BaseWebChromeClient());

        mWebView.loadUrl("http://52.78.113.251:8080/finders/hello");
    }
}
