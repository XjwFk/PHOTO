package com.gallery.photo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent galleryIntent = new Intent(MainActivity.this, GalleryActivity.class);
        startActivity(galleryIntent);
    }
}
