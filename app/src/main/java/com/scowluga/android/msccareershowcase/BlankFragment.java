package com.scowluga.android.msccareershowcase;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {

    private static String name;

    public BlankFragment() {
        // Required empty public constructor
    }

    public static BlankFragment newInstance(String title) {

        name = title;

        Bundle args = new Bundle();

        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_blank, container, false);

        TextView tv = (TextView)v.findViewById(R.id.blank_text);
        tv.setText(name);

        return v;
    }

}
