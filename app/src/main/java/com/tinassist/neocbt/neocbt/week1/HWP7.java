package com.tinassist.neocbt.neocbt.week1;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.SeekBar;

import com.tinassist.neocbt.neocbt.R;

/**
 * Created by Kevin on 11/21/2016.
 */


public class HWP7 extends Fragment{


    private MediaPlayer mySound;
    private SeekBar mySeekbar;
    Handler handler = new Handler();

    public HWP7() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.w1hwp7, container, false);
        mySound = MediaPlayer.create(getActivity(), R.raw.weekoneaudio);
        mySeekbar = (SeekBar)v.findViewById(R.id.seekBar5);
        mySeekbar.setOnSeekBarChangeListener(seekBarOnSeekChangeListener);
        mySeekbar.setMax(mySound.getDuration());
        Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(btnListener);
        Button button3 = (Button) v.findViewById(R.id.button3);
        button3.setOnClickListener(btnListener);
        update();
        
        // Inflate the layout for this fragment
        return v;
    }

    private View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button:
                    playpauseAudio(v);
                    break;
                case R.id.button3:
                    restartAudio(v);
                    break;
            }
        }
    };

    Runnable run = new Runnable() {
        @Override
        public void run() {
            update();
        }
    };

    public void update() {
        mySeekbar.setProgress(mySound.getCurrentPosition());
        handler.postDelayed(run, 1000);//Loops every second
    }

    SeekBar.OnSeekBarChangeListener seekBarOnSeekChangeListener = new SeekBar.OnSeekBarChangeListener() {

        @Override
        public void onStopTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onStartTrackingTouch(SeekBar seekBar) {
            // TODO Auto-generated method stub

        }

        @Override
        public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
            if (fromUser) {
                mySound.seekTo(progress);
                seekBar.setProgress(progress);
            }
        }
    };

    public void playpauseAudio(View view) {
        if (mySound.isPlaying()) {
            mySound.pause();
        }
        else {
            mySound.start();
        }
    }

    public void restartAudio(View view) {
        if (mySound.isPlaying()) {
            mySound.pause();
            mySound.seekTo(0);
            mySeekbar.setProgress(0);
            mySound.start();
        }
    }

    @Override
    //Stops audio from playing and Runnable run from crashing when app is closed.
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(run);
        mySound.release();
    }


}