package com.kasmag.module_toast;

import android.content.Context;
import android.widget.Toast;

public class ToastingModule {

    public void MakeToast(Context context,String str){
        Toast.makeText(context, str, Toast.LENGTH_SHORT).show();
    }
}
