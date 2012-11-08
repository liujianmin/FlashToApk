package com.coding4fun.flashviewkeytest;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.webkit.WebView;

public class FlashWebView extends WebView implements GameKeyListener{

    VirtualKeypad vkb;
    

    public FlashWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        
         vkb = new VirtualKeypad(this,this);
        
    }

    /* (non-Javadoc)
     * @see android.webkit.WebView#onTouchEvent(android.view.MotionEvent)
     */
    @Override
    public boolean onTouchEvent(MotionEvent event) {
/*        final int action = event.getAction();
        switch (action & MotionEvent.ACTION_MASK) {
            case MotionEvent.ACTION_DOWN:
                Log.d("test", "ACTION_DOWN");
                KeyEvent keyevent = new KeyEvent(0, KeyEvent.KEYCODE_DPAD_RIGHT);
                ;
                onKeyDown(KeyEvent.KEYCODE_DPAD_RIGHT, keyevent);
                break;
            case MotionEvent.ACTION_UP:
                Log.d("test", "ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.d("test", "ACTION_MOVE");
                break;
            // case MotionEvent.ACTION_DOWN:
            // Log.d("test","ACTION_DOWN");
            // break;
        }

        Log.d("test", "I anm here2");*/

        // TODO Auto-generated method stub
        
        if (vkb != null)
            return vkb.onTouch(event, true);
        
        
        return super.onTouchEvent(event);
    }

    @Override
    public void onGameKeyChanged() {
        // TODO Auto-generated method stub
        int states = 0;
        if (vkb != null)
            states |= vkb.getKeyStates();
    }

    /* (non-Javadoc)
     * @see android.view.View#draw(android.graphics.Canvas)
     */
    @Override
    public void draw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.draw(canvas);
        
        if (vkb != null)
            vkb.draw(canvas);
    }
    

}
