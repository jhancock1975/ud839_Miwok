package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jhancock2010 on 1/7/18.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(@NonNull Context context, @NonNull List<Word> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Word} object located at this position in the list
        Word currentWord = getItem(position);



        // Find the TextView in the list_item.xml layout with the english word
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.english);
        englishTextView.setBackgroundColor(currentWord.getBgColor());
        // Get the version name from the current Word object and
        // set this text on the English TextView
        englishTextView.setText(currentWord.getEnglish());

        // Find the TextView in the list_item.xml layout with the ID miwok
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok);
        // Get the version number from the current word object and
        // set this text on the Miwok TextView
        miwokTextView.setBackgroundColor(currentWord.getBgColor());
        miwokTextView.setText(currentWord.getMiwok());

        if (currentWord.getImgResId() != null) {
            // Find the ImageView in the list_item.xml layout with the ID list_item_icon
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            Log.d(this.getClass().getSimpleName() + ".getView::",
                    "currentWord.getImgResId() == " + currentWord.getImgResId());

            iconView.setImageResource(currentWord.getImgResId());
            iconView.setVisibility(View.VISIBLE);
        } else {
            ImageView iconView = (ImageView) listItemView.findViewById(R.id.list_item_icon);
            // Get the image resource ID from the current AndroidFlavor object and
            // set the image to iconView
            Log.d(this.getClass().getSimpleName() + ".getView::",
                    "currentWord.getImgResId() == " + currentWord.getImgResId());
            iconView.setVisibility(View.GONE);
        }

        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}
