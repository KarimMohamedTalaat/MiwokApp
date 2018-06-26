package com.example.karim.miwokapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter <Word> {


    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView englishText = convertView.findViewById(R.id.english_translation);
        englishText.setText(currentWord.getmEnglishWord());

        TextView miwokText = convertView.findViewById(R.id.miwok_translation);
        miwokText.setText(currentWord.getmMiwokWord());

        ImageView imageView = convertView.findViewById(R.id.image00);
        imageView.setImageResource(currentWord.getmImageResourceId());

        return convertView;

    }


}
