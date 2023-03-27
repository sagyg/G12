package com.amdocs.common.Utils;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;


public class Utils { 
	
	
	private static final String TAG = "G12N";
	public static void showSoftKeyboard (Context context, View view) {
        try {
            ((InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE))
            .showSoftInput(view, InputMethodManager.SHOW_FORCED);
        }
        catch (Exception ex) {
            Log.w(TAG, "showSoftKeyboard->"+ex.toString());
        }
    }
    public static void hideSoftKeyboard (Context context, View view) {
        try {
            InputMethodManager imm = (InputMethodManager)context.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getApplicationWindowToken(), 0);
        }
        catch (Exception ex) {
            Log.w(TAG, "hideSoftKeyboard->"+ex.toString());
        }
    }
	 
	
	 
	
}
