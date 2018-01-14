package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

import java.util.List;

/**
 * Created by jhancock2010 on 1/13/18.
 */

public class ListItemClickListener implements OnItemClickListener {

    public ListItemClickListener(MediaPlayer mediaPlayer, Context context, List<Word> words) {
        this.mediaPlayer = mediaPlayer;
        this.context = context;
        this.words = words;
    }

    MediaPlayer mediaPlayer;
    Context context;
    List<Word> words;

    private MediaPlayer.OnCompletionListener completionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();
        }
    };

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Log.d("numbers", "onCreate.onItemClick");
        releaseMediaPlayer();
        mediaPlayer = MediaPlayer.create(context,
                words.get(i).getSoundId());
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(this.completionListener);
    }
    public void releaseMediaPlayer() {

        Log.d("releaseMediaPlayer", "mediaPlayer == " + mediaPlayer);

        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mediaPlayer = null;
        }
    }

}
