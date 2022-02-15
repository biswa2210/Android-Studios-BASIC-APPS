package com.example.mediaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {
    SeekBar skb;
    Thread updateSeek;
    Boolean playState=true;
    Button plyPau;
    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mp = MediaPlayer.create(this,R.raw.kusukusu);
        mp.start();
        plyPau=(Button)findViewById(R.id.button);
        skb=(SeekBar)findViewById(R.id.seekBar);
        skb.setMax(mp.getDuration());

        skb.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                if(b){
                    mp.seekTo(i);
                    skb.setProgress(i);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        plyPau.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(updateState().equals("play")){
                        mp.start();
                        playState=true;
                        updateState();


                    }
                    else if(updateState().equals("pause")){
                        mp.pause();
                        playState=false;
                        updateState();
                    }
                }
            });
        updateSeek= new Thread(){
            @Override
            public void run() {
                int curr_pos=0;
                try{
                    while(curr_pos<mp.getDuration()){
                        curr_pos=mp.getCurrentPosition();
                        skb.setProgress(curr_pos);
                        sleep(500);
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        };
        updateSeek.start();
    }
    public String updateState(){
        plyPau=(Button)findViewById(R.id.button);
        if(playState){
            plyPau.setText("Pause");
            return "pause";
        }
        else{
            plyPau.setText("Play");
            return "play";
        }
    }

}