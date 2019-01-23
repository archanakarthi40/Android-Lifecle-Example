package com.example.dell.lifecycleactivity;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle","onCreate invoked");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d("lifecycle","onStart invoked");
    }
    @Override
    public void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume invoked");
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause invoked");
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop invoked");
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart invoked");
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy invoked");
    }
}
