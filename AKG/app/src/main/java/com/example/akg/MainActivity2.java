package com.example.akg;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import android.widget.VideoView;

public class MainActivity2 extends AppCompatActivity {
protected TextView textView;
VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
         TextView textView=findViewById(R.id.textView4);
        textView.setText("\n Cloud Computing Cell has been a part of Ajay Kumar Garg Engineering College since February 2016. The members are exposed to the latest Cloud Technologies that enable them to be market ready thereby increasing their opportunities in placements and research. It provides a platform to the students to compute, manage and deploy the cloud. The Cell is coordinated by Dr. J. K. Seth, Dr. Anupama Sharma and Dr. Parneet Kaur, faculty members, IT department.\n" +
                "\n" +
                "Cloud computing is a growing computing technology that provides almost unlimited computing resources on demand.");
        TextView linkTextView = findViewById(R.id.textView3);
        linkTextView.setText("Raghav");
        linkTextView.setMovementMethod(LinkMovementMethod.getInstance());
        videoView=findViewById(R.id.videoView);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.bg);
        videoView.setVideoURI(uri);
        videoView.start();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
            }
        });

        }
    @Override
    protected void onPostResume(){
        videoView.resume();
        super.onPostResume();
    }
    @Override
    protected void onRestart(){
        videoView.start();
        super.onRestart();
    }
    @Override
    protected void onPause(){
        videoView.suspend();
        super.onPause();
    }
    @Override
    protected void onDestroy(){
        videoView.stopPlayback();
        super.onDestroy();
    }
}