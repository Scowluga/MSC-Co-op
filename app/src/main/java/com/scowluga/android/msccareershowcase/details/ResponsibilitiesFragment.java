package com.scowluga.android.msccareershowcase.details;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scowluga.android.msccareershowcase.MainActivity;
import com.scowluga.android.msccareershowcase.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ResponsibilitiesFragment extends Fragment {


    public ResponsibilitiesFragment() {
        // Required empty public constructor
    }

    public static ResponsibilitiesFragment newInstance() {
        
        Bundle args = new Bundle();
        
        ResponsibilitiesFragment fragment = new ResponsibilitiesFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment3_responsibilities, container, false);


        // Button saying "Configuration walk through!" 

        return v;
    }
    @Override
    public void onResume() {
        MainActivity.toolbar.setTitle("Responsibilities");
        super.onResume();
    }

}
