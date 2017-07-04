package com.example.lantimat.kamaztestapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by lantimat on 04.07.17.
 */

public class AddLatitudeFragment extends Fragment {

    public AddLatitudeFragment() {
    }


    public static AddLatitudeFragment newInstance() {
        AddLatitudeFragment fragment = new AddLatitudeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_add_lat, container, false);
        //TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        return rootView;
    }
}
