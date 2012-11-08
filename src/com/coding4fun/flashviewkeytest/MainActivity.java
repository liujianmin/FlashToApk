package com.coding4fun.flashviewkeytest;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MotionEvent;
import android.webkit.WebView;

public class MainActivity extends Activity {

    FlashWebView mWebView;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        mWebView = (FlashWebView) findViewById(R.id.webView);
        mWebView.getSettings().setJavaScriptEnabled(true);
        mWebView.getSettings().setPluginsEnabled(true);
        mWebView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        mWebView.setBackgroundColor(Color.parseColor("#000000"));
        mWebView.loadUrl("file:///android_asset/game.swf");
    }
    

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }


    /* (non-Javadoc)
     * @see android.app.Activity#onTouchEvent(android.view.MotionEvent)
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // TODO Auto-generated method stub
        
        Log.d("test","I anm here");
        
        KeyEvent  keyevent = new KeyEvent(0, KeyEvent.KEYCODE_DPAD_RIGHT);;
        mWebView.onKeyDown(KeyEvent.KEYCODE_DPAD_RIGHT, keyevent);
        
        return super.onTouchEvent(event);
    }
    
    
}
