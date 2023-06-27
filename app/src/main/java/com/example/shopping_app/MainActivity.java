package com.example.shopping_app;
import com.example.shopping_app.R;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String Videourl = "shopping.mp4";

        VideoView videoView = findViewById(R.id.videoView);

       Uri uri = Uri.parse(Videourl);

       videoView.setVideoURI(uri);
       videoView.start();

    }
}
