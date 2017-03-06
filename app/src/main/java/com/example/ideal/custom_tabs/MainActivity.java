package com.example.ideal.custom_tabs;

import android.graphics.Color;
import android.net.Uri;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    CustomTabsIntent mCustomTabsIntent;
    String url = "https://www.google.com/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mCustomTabsIntent = new CustomTabsIntent.Builder()
                .setShowTitle(true)
                .setToolbarColor(Color.GREEN)
                .addDefaultShareMenuItem()
                .build();

        mCustomTabsIntent.launchUrl(this, Uri.parse(url));










    }
}
