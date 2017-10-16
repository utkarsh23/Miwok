package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by root on 2/10/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    private int mbackgroundColor;

    public WordAdapter(Context context, ArrayList<Word> words, int backgroundResourceId) {
        super(context, 0, words);
        mbackgroundColor = backgroundResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.custom_numbers_item, parent, false
            );
        }
        Word currentWord = this.getItem(position);

        TextView miwokText = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        miwokText.setText(currentWord.getMiwokWord());

        TextView englishText = (TextView) listItemView.findViewById(R.id.english_text_view);
        englishText.setText(currentWord.getDefaultWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_view);
        if (currentWord.isImageViewVisible()) {
            imageView.setImageResource(currentWord.getImgResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else {
            imageView.setVisibility(View.GONE);
        }

        RelativeLayout relativeLayout = (RelativeLayout) listItemView.findViewById(R.id.contentLayout);
        relativeLayout.setBackgroundResource(mbackgroundColor);

        ImageView playBtnView = (ImageView) listItemView.findViewById(R.id.playBtn);
        playBtnView.setBackgroundResource(mbackgroundColor);

        return listItemView;
    }
}
