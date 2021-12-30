package com.sefakerem.library;

import android.content.Context;
import android.widget.Toast;

public class EasyToast {
    public static void simpleToast(Context context,String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
