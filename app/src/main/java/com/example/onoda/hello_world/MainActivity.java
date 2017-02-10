package com.example.onoda.hello_world;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //開発1　Hello_World
        TextView textView1=(TextView)findViewById(R.id.textView1);
        textView1.setTextColor(Color.BLACK);
        textView1.setTypeface(Typeface.createFromAsset(getAssets(),"meiryo.ttc"));//メイリオフォント
        textView1.setText((R.string.app_name));
     }
}