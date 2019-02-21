package com.example.user.cprogrammingtutorial;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoPlayActivity extends AppCompatActivity {

    private VideoView vv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);

        vv = (VideoView) findViewById(R.id.videoId);


        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.structures);
        vv.setVideoURI(uri);

        MediaController media =  new MediaController(this);
        vv.setMediaController(media);
        vv.start();

    }
}