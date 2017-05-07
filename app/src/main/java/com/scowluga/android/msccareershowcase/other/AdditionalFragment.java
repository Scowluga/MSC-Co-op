package com.scowluga.android.msccareershowcase.other;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.scowluga.android.msccareershowcase.MainActivity;
import com.scowluga.android.msccareershowcase.R;
import com.scowluga.android.msccareershowcase.details.ConfigurationDialog;

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
        View v = inflater.inflate(R.layout.fragment6_additional, container, false);

        Button button = (Button)v.findViewById(R.id.additional_show);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ConfigurationDialog cd = ConfigurationDialog.newInstance(1);
                cd.show(getFragmentManager(), "TAGFRAGMENT");
            }
        });


        return v;
    }
    @Override
    public void onResume() {
        MainActivity.toolbar.setTitle("Additional");
        super.onResume();
    }
}
