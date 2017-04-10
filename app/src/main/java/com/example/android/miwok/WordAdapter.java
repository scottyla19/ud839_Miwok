package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by swlaforest on 4/9/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {
    private int mColorId;
    public WordAdapter(@NonNull Context context, @LayoutRes int resource, ArrayList<Word> words, int colorId) {
        super(context, resource, words);
        mColorId = colorId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokView = (TextView) listItemView.findViewById(R.id.list_item_miwok);

        miwokView.setText(currentWord.getMiwokWord());
        TextView englishView = (TextView) listItemView.findViewById(R.id.list_item_english);

        englishView.setText(currentWord.getEnglishWord());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_item_img);
        if (currentWord.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(currentWord.getImg());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
