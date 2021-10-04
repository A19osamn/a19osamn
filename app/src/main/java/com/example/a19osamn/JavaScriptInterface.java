package com.example.a19osamn;

import android.content.Context;
import android.webkit.JavascriptInterface;
import android.widget.Toast;

public class JavaScriptInterface {
    private Context mContext;
    JavaScriptInterface(Context context) {
        mContext = context;
    }

    @JavascriptInterface
    public void showToast(String toast) {
        // In this method you can do anything you want
        Toast.makeText(mContext, toast, Toast.LENGTH_SHORT).show();

    }


}
