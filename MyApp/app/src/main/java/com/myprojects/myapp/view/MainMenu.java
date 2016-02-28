package com.myprojects.myapp.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.myprojects.myapp.R;

/**
 * Created by debiduttprasad on 30/01/16.
 */

public class MainMenu extends RelativeLayout {

    public MainMenu(Context context) {
        super(context);
        onSetUpView();
    }

    public MainMenu(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MainMenu(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void onSetUpView(){
        inflate(getContext(),R.layout.custom_main_menu,null);
    }


}
