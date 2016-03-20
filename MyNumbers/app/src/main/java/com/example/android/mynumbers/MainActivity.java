package com.example.android.mynumbers;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    MediaPlayer play;
    MediaPlayer begin;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        play = MediaPlayer.create(this, R.raw.numbers);
        begin=MediaPlayer.create(this, R.raw.sonata);

        Button one = (Button) findViewById(R.id.one);
        one.setOnClickListener(new View.OnClickListener()
        {
            public void onClick (View v)
            {
                Intent i = new Intent(MainActivity.this, One.class);
                startActivity(i);
            }

        });

        Button two = (Button) findViewById(R.id.two);
        two.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent i = new Intent(MainActivity.this, Two.class);
                startActivity(i);
            }

        } );

        Button three = (Button) findViewById(R.id.three);
        three.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
            Intent i = new Intent(MainActivity.this, Three.class);
                startActivity(i);
            }

        } );

        Button four = (Button) findViewById(R.id.four);
        four.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v)
            {
                Intent i = new Intent(MainActivity.this, Four.class);
                startActivity(i);
            }
        });
        Button five = (Button) findViewById(R.id.five);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Five.class);
                startActivity(i);
            }
        });


        Button six = (Button) findViewById(R.id.six);
        six.setOnClickListener(new View.OnClickListener()

        {@Override
         public void onClick (View v)
            {
                Intent i = new Intent(MainActivity.this, Six.class);
                startActivity(i);
            }
        });


        Button seven = (Button) findViewById(R.id.seven);
        seven.setOnClickListener(new View.OnClickListener()
        {@Override
         public void onClick (View v)
            {
                Intent i = new Intent(MainActivity.this, Seven.class);
                startActivity(i);
            }});


        Button eight = (Button) findViewById(R.id.eight);
        eight.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v)
            {
                Intent i = new Intent(MainActivity.this, Eight.class);
                startActivity(i);
            }
        });


        Button nine = (Button) findViewById(R.id.nine);
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, Nine.class);
                startActivity(i);
            }
        });


        Button ten = (Button) findViewById(R.id.ten);
        ten.setOnClickListener(new View.OnClickListener()
        {
            @Override

            public void onClick (View v)
            {
                Intent i = new Intent(MainActivity.this, Ten.class);
                startActivity(i);
            }
        });


    }

    public void PlaySong(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        play.start();
        Toast.makeText(context, "Thank You For Using NumberS Application",duration).show();
    }

    public void PlaySound(View view) {
        begin.start();
    }
}