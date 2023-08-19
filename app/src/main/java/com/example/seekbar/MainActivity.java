package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView txtSeek;
SeekBar SeekB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtSeek=findViewById(R.id.txt1);
        SeekB=findViewById(R.id.seekB);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            SeekB.setMin(1000);
        }
        SeekB.setMax(10000);
        SeekB.setProgress(1000);

        txtSeek.setText(String.valueOf(SeekB.getProgress()));

        SeekB.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                txtSeek.setText(String.valueOf(progress));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}