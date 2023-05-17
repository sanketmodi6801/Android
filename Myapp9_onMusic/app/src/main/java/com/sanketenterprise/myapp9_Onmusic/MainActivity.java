package com.sanketenterprise.myapp9_Onmusic;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.Toast;

import com.sanketenterprise.myapp9_Onmusic.R;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private MediaPlayer mediaPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        SeekBar seekBar = findViewById(R.id.seekBar);

//        mediaPlayer = MediaPlayer.create(this, R.raw.dillagi);

        mediaPlayer=new MediaPlayer();
        try {
            mediaPlayer.setDataSource("http://socialdance.stanford.edu/music/Partners_For_Life_Waltz_Q_Fig_1.m4a");
        } catch (IOException e) {
            e.printStackTrace();
        }

        mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                Toast.makeText(MainActivity.this, "Ready to play!!", Toast.LENGTH_SHORT).show();
                mp.start();
            }
        });
        mediaPlayer.prepareAsync();



//
        seekBar.setMax(mediaPlayer.getDuration());
////        seekBar.getThumb().setColorFilter(Integer.parseInt("Red"), PorterDuff.Mode.MULTIPLY);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if (fromUser)
                {
                    mediaPlayer.seekTo(progress);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                    button.setText("play");
                }
                else
                {
                    mediaPlayer.start();
                    button.setText("Pause");
                }
            }
        });

    }
}