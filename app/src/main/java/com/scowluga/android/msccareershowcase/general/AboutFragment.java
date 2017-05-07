package com.scowluga.android.msccareershowcase.general;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TabHost;

import com.scowluga.android.msccareershowcase.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class AboutFragment extends Fragment {


    public AboutFragment() {
        // Required empty public constructor
    }


    public static AboutFragment newInstance() {

        Bundle args = new Bundle();

        AboutFragment fragment = new AboutFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment2_about, container, false);

        // Info, Products



        TabHost host = (TabHost)v.findViewById(R.id.about_tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Purpose");
        spec.setContent(R.id.about_tab1);
        spec.setIndicator("Purpose", getResources().getDrawable(R.drawable.accessible));
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Products");
        spec.setContent(R.id.about_tab2);
        spec.setIndicator("Products", getResources().getDrawable(R.drawable.store));
        host.addTab(spec);

        return v;
    }



}
