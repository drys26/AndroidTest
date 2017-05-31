package com.example.nexusbond.sampleapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.widget.ArrayAdapter;

import com.example.nexusbond.sampleapp.models.YoutubeData;

/**
 * Created by nexusbond on 31/05/2017.
 */

public class YoutubeDataAdapter extends ArrayAdapter<YoutubeData> {

    public YoutubeDataAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull YoutubeData[] objects) {
        super(context, resource, objects);
    }


}
