package com.souravmalani.i190434;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class UploadImage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.upload_image);
    }
    public void videoButtonClicked(View view) {
        Intent intent = new Intent(this, UploadVideo.class);
        startActivity(intent);
    }

    public void photoButtonClicked(View view) {
        Intent intent = new Intent(this, UploadImage.class);
        startActivity(intent);

    }
}
