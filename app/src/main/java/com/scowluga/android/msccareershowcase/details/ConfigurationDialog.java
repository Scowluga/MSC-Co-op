package com.scowluga.android.msccareershowcase.details;

import android.app.AlertDialog;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.scowluga.android.msccareershowcase.R;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by robertlu on 2017-05-06.
 */

public class ConfigurationDialog extends DialogFragment {

    static List<Step> steps;
    int count;

    static ImageView image;
    static TextView title;
    static TextView description;

    public ConfigurationDialog() {
        // Empty constructor is required for DialogFragment
        // Make sure not to add arguments to the constructor
        // Use `newInstance` instead as shown below
    }

    public static ConfigurationDialog newInstance() {
        ConfigurationDialog frag = new ConfigurationDialog();
        Bundle args = new Bundle();
        frag.setArguments(args);
        return frag;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment4_configuration, container);

        initialize(v);

        Button next = (Button)v.findViewById(R.id.config_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 4) {
                    dismiss();
                } else {
                    count ++;
                    setupConfig(v, count);
                }

            }
        });

        Button back = (Button)v.findViewById(R.id.config_back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (count == 0) {
                    dismiss();
                } else {
                    count --;
                    setupConfig(v, count);
                }

            }
        });

        return v;
    }

    private static void setupConfig(View v, int index) {
        Step temp = steps.get(index);
        image.setImageDrawable(v.getResources().getDrawable(temp.image));
        title.setText(temp.title);
        description.setText(temp.description);
    }


    private void initialize(View v) {
        Step one = new Step(R.drawable.config1, "Step 1: Pick Up ", "After the order is made, and the devices have arrived, the order is ready to be installed, and is picked up from the warehouse. ");
        Step two = new Step(R.drawable.config2, "Step 2: Setup", "The computer is plugged in and powered on, and the software + devices are prepared to be installed.");
        Step three = new Step(R.drawable.config3, "Step 3: Configuration", "A combination of windows updates, system updates, and software installations configure the computer to optimal state for ease of use. This is the longest step, and can take up to 3 days.");
        Step four = new Step(R.drawable.config4, "Step 4: Check", "All software, serial numbers, and devices are checked for problems/malfunctions.");
        Step five = new Step(R.drawable.config5, "Step 5: Distribute", "The order is packed up, and ready to start benefiting the life of someone in need.");

        steps = new ArrayList<>(Arrays.asList(one, two, three, four, five));
        count = 0;
        image = (ImageView) v.findViewById(R.id.config_img);
        title = (TextView) v.findViewById(R.id.config_title);
        description = (TextView) v.findViewById(R.id.config_description);

        setupConfig(v, count);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }


}
