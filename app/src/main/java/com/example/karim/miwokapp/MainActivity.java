package com.example.karim.miwokapp;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list_view);

        final ArrayList <Word> numbersArrayList = new ArrayList<>();

        numbersArrayList.add(new Word("one", "lutti", R.drawable.number_one, R.raw.number_one));
        numbersArrayList.add(new Word("two", "otiiko", R.drawable.number_two,R.raw.number_two));
        numbersArrayList.add(new Word("three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        numbersArrayList.add(new Word("four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        numbersArrayList.add(new Word("five", "massokka", R.drawable.number_five, R.raw.number_five));
        numbersArrayList.add(new Word("six", "temmokka", R.drawable.number_six, R.raw.number_six));
        numbersArrayList.add(new Word("seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numbersArrayList.add(new Word("eight", "kawinta", R.drawable.number_eight, R.raw.number_eight));
        numbersArrayList.add(new Word("nine", "wo’e", R.drawable.number_nine, R.raw.number_nine));
        numbersArrayList.add(new Word("ten", "na’aacha", R.drawable.number_ten, R.raw.number_ten));


        WordAdapter adapter = new WordAdapter(this, numbersArrayList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = numbersArrayList.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(MainActivity.this,word.getmAudioResourceId());
                mediaPlayer.start();
            }
        });

    }
}
