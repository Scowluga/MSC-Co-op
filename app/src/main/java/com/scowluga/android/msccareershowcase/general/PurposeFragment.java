package com.scowluga.android.msccareershowcase.general;


import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.scowluga.android.msccareershowcase.MainActivity;
import com.scowluga.android.msccareershowcase.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PurposeFragment extends Fragment {


    public PurposeFragment() {
        // Required empty public constructor
    }

    public static PurposeFragment newInstance() {
        
        Bundle args = new Bundle();

        PurposeFragment fragment = new PurposeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment2_purpose, container, false);

        Button products = (Button)v.findViewById(R.id.purpose_products);
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://microscience.on.ca/products/"));
                startActivity(browserIntent);
            }
        });


        Button button = (Button)v.findViewById(R.id.purpose_chart);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                Dialog builder = new Dialog(getContext());
//                builder.requestWindowFeature(Window.FEATURE_NO_TITLE);
//                builder.getWindow().setBackgroundDrawable(
//                        new ColorDrawable(android.graphics.Color.TRANSPARENT));
//                builder.setCancelable(true);
//
//                builder.setContentView(inflater.inflate(R.layout.fragment2_purpose_image, null));
//
//                builder.show();

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://drive.google.com/file/d/0B29FBxVkiwjNcE54M3VsT1dDVE0/view?usp=sharing"));
                startActivity(browserIntent);
            }
        });

        return v;
    }

    @Override
    public void onResume() {
        MainActivity.toolbar.setTitle("Purpose");
        super.onResume();
    }
}
