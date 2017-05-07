package com.scowluga.android.msccareershowcase.other;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scowluga.android.msccareershowcase.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AdditionalFragment extends Fragment {


    public AdditionalFragment() {
        // Required empty public constructor
    }

    public static AdditionalFragment newInstance() {
        
        Bundle args = new Bundle();
        
        AdditionalFragment fragment = new AdditionalFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment6_additional, container, false);
    }

}
