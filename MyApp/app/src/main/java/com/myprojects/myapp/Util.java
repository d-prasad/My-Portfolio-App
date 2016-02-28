package com.myprojects.myapp;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by debiduttprasad on 02/02/16.
 */
public class Util {

    protected static void  showToast(Context context,int stringID,String toastMessage){
        Toast.makeText(context,String.format(getString(context,stringID),toastMessage),Toast.LENGTH_SHORT).show();
    }

    protected static String  getString(Context context,int resId){
        return context.getResources().getString(resId);
    }

}
