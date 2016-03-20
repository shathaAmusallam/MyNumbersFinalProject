package com.example.android.mynumbers;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Ahmad on 3/20/2016.
 */
public class Three extends AppCompatActivity {
    MediaPlayer begin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.three);
        begin=MediaPlayer.create(this, R.raw.sonata);

        Button back = (Button) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Three.this, MainActivity.class);
                startActivity(i);
            }

        });
    }
    public void PlaySound(View view) {
        begin.start();
    }
}
