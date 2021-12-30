package com.sefakerem.easytoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sefakerem.library.EasyToast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EasyToast.simpleToast(this,"Hello World!");

    }
}