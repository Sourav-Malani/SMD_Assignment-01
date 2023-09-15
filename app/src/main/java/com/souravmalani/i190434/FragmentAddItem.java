package com.souravmalani.i190434;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FragmentAddItem extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_add_item);

        // Add any additional initialization or logic for this activity here
    }

    public void uploadImageClicked(View view) {
        Intent intent = new Intent(this, UploadImage.class);
        startActivity(intent);

    }

    public void uploadVideoClicked(View view) {
        Intent intent = new Intent(this, UploadVideo.class);
        startActivity(intent);

    }
}
