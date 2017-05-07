package com.scowluga.android.msccareershowcase.other;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.scowluga.android.msccareershowcase.MainActivity;
import com.scowluga.android.msccareershowcase.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class CareerFragment extends Fragment {

    List<Degree> degrees;

    public CareerFragment() {
        // Required empty public constructor
    }

    public static CareerFragment newInstance() {
        
        Bundle args = new Bundle();
        
        CareerFragment fragment = new CareerFragment();
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment5_career, container, false);

        if (container == null) {
            return null;
        }
        initialize();

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recycler_view);
        DegreeAdapter degreeAdapter = new DegreeAdapter(degrees, getContext());
        recyclerView.setAdapter(degreeAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        return v;
    }



//    String name; // Bachelor of Computer Science (Faculty of Mathematics)
//    String university; // University of Waterloo
//    String length; // 5 Year Program
//    String required; // Adv Fx, Calc, Eng
//    int cost; // 11 800


    private void initialize() {
        degrees = new ArrayList<>(Arrays.asList(
                new Degree("Bachelor of Computer Science (Faculty of Mathematics", "University of Waterloo", "5 year program (co-op)", "Adv Fx, Calc, Eng", "$11,800"),
                new Degree("Bachelor of Computer Engineering (Faculty of Engineering)", "University of Waterloo", "5 year program (co-op)", "Adv Fx, Calc, Eng, Chem, Physics", "$14,080"),
                new Degree("Bachelof of Technology (Faculty of Engineering", "McMaster University", "4 year program", "4U Math, Eng, Chem, Physics", "$9,000")
        ));
    }
    @Override
    public void onResume() {
        MainActivity.toolbar.setTitle("Career");
        super.onResume();
    }
}
