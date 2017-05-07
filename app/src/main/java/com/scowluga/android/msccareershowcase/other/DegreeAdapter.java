package com.scowluga.android.msccareershowcase.other;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.scowluga.android.msccareershowcase.R;

import java.util.List;

/**
 * Created by robertlu on 2017-05-07.
 */

public class DegreeAdapter extends RecyclerView.Adapter<DegreeAdapter.ViewHolder> {


    public static List<Degree> degrees;
    public static Context context;

    public DegreeAdapter(List<Degree> degreeList, Context c) {
        this.degrees = degreeList;
        this.context = c;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.fragment5_degree_row, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Degree degree = degrees.get(position);

        // Set item views based on your views and data model
        TextView t = holder.titleTv;
        t.setText(degree.title);

        TextView u = holder.universityTv;
        u.setText(degree.university);

        TextView l = holder.lengthTv;
        l.setText(degree.length);

        TextView r = holder.requiredTv;
        r.setText(degree.required);

        TextView c = holder.costTv;
        c.setText(degree.cost);

    }

    @Override
    public int getItemCount() {
        return degrees.size();
    }

    String title; // Bachelor of Computer Science (Faculty of Mathematics)
    String university; // University of Waterloo
    String length; // 5 Year Program
    String required; // Adv Fx, Calc, Eng
    String cost; // 11 800


    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTv;
        public TextView universityTv;
        public TextView lengthTv;
        public TextView requiredTv;
        public TextView costTv;


        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            titleTv = (TextView) itemView.findViewById(R.id.career_degree_title);
            universityTv = (TextView) itemView.findViewById(R.id.career_degree_university);
            lengthTv = (TextView) itemView.findViewById(R.id.career_degree_length);
            requiredTv = (TextView) itemView.findViewById(R.id.career_degree_required);
            costTv = (TextView) itemView.findViewById(R.id.career_degree_cost);
        }
    }
}
