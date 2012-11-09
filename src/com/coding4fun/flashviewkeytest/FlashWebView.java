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
    
    
    private static final int GAMEPAD_LEFT_RIGHT =
        (KeyEvent.KEYCODE_DPAD_LEFT | KeyEvent.KEYCODE_DPAD_RIGHT);
private static final int GAMEPAD_UP_DOWN =
        (KeyEvent.KEYCODE_DPAD_UP | KeyEvent.KEYCODE_DPAD_DOWN);
private static final int GAMEPAD_DIRECTION =
        (GAMEPAD_UP_DOWN | GAMEPAD_LEFT_RIGHT);
    

    public FlashWebView(Context context, AttributeSet attrs) {
        super(context, attrs);
        // TODO Auto-generated constructor stub
        
         vkb = new VirtualKeypad(this,this);
         vkb.resize(1024, 720);
        
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
             vkb.onTouch(event, true);
        
        
        return super.onTouchEvent(event);
    }

    @Override
    public void onGameKeyChanged() {
        // TODO Auto-generated method stub
        int states = 0;
        if (vkb != null)
            states |= vkb.getKeyStates();
        
        
        if ((states & GAMEPAD_LEFT_RIGHT) == GAMEPAD_LEFT_RIGHT)
            states &= ~GAMEPAD_LEFT_RIGHT;
        if ((states & GAMEPAD_UP_DOWN) == GAMEPAD_UP_DOWN)
            states &= ~GAMEPAD_UP_DOWN;
        
        
        KeyEvent keyevent = new KeyEvent(0, states);
        onKeyDown(states, keyevent);
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
