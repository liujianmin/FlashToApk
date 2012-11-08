package com.coding4fun.flashviewkeytest;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;

public class FlashWebView extends WebView {


    

    public FlashWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
    }

    /* (non-Javadoc)
     * @see android.webkit.WebView#onTouchEvent(android.view.MotionEvent)
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        final int action = event.getAction();
        switch(action & MotionEvent.ACTION_MASK)
        {
            case  MotionEvent.ACTION_DOWN:
                Log.d("test","ACTION_DOWN");
                break;
            case  MotionEvent.ACTION_UP:
                Log.d("test","ACTION_UP");
                break;
            case  MotionEvent.ACTION_MOVE:
                Log.d("test","ACTION_MOVE");
                break;
           // case  MotionEvent.ACTION_DOWN:
            //    Log.d("test","ACTION_DOWN");
            //    break;
        }
        
        
        Log.d("test","I anm here2");
        
      //  KeyEvent  keyevent = new KeyEvent(0, KeyEvent.KEYCODE_DPAD_RIGHT);;
      //  onKeyDown(KeyEvent.KEYCODE_DPAD_RIGHT, keyevent);
        // TODO Auto-generated method stub
        return super.onTouchEvent(event);
    }
    

}
