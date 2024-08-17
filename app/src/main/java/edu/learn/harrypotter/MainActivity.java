package edu.learn.harrypotter;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import edu.learn.harrypotterapp.R;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    // gridview variable
    private GridView gridview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridview = findViewById(R.id.home);







//DO THIS ONLY IF YOU WANT TO PLAY BACKGROUND MUSIC and when app is completely built;
        mediaPlayer = MediaPlayer.create(this, R.raw.harry_potter_theme);
        mediaPlayer.setLooping(true); // Optional: to loop the music
        mediaPlayer.start();

//TODO CREATE A GRIDVIEW IN LAYOUT

        //TODO create a basic griDviiew with 6 items i.e
        // All Characters, Hogwarts Students, Hogwarts Staff, Houses, Spells, Quiz
        String[] items = {
                "All Characters",
                "Hogwarts Students",
                "Hogwarts Staff",
                "Houses",
                "Spells",
                "Quiz"
        };

        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(
                        MainActivity.this,
                        R.layout.item_basic_grid,
                        R.id.text,
                        items
                );

        gridview.setAdapter(adapter);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                switch (position){
                    case 0:
                        intent =
                                new Intent(MainActivity.this,
                                       CharacterActivity.class);
                        startActivity(intent);
                        break;


                    case 1:
                        intent =
                                new Intent(MainActivity.this,
                                       StudentActivity.class);
                        startActivity(intent);
                        break;


                    case 2:
                        intent =
                                new Intent(MainActivity.this,
                                        StaffActivity.class);
                        startActivity(intent);
                        break;


                    case 3:
                        intent =
                                new Intent(MainActivity.this,
                                        HousesActivity.class);
                        startActivity(intent);

                        break;


                    case 4:
                        intent =
                                new Intent(MainActivity.this,
                                            SpellActivity.class);
                        startActivity(intent);
                        break;

                    case 5:

                        intent =
                                new Intent(MainActivity.this,
                                     QuizActivity.class);
                        startActivity(intent);
                        break;

                }
            }
        });

        // at gridview.SETONITEMLISTENER will go to 6 different activiteies i.e

        // CharacterActivity.class
        //StudentActivity.class
        //StaffActivity.class
        //HousesActivity.class
        //SpellActivity.class
        //QuizActivity


        //  gridView = findViewById(R.id.homeGridView);

    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
