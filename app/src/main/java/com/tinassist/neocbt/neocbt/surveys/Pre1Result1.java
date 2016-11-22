package com.tinassist.neocbt.neocbt.surveys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tinassist.neocbt.neocbt.R;

/**
 * Created by novap on 11/21/2016.
 */

public class Pre1Result1 extends Fragment {
    public Pre1Result1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.pre1_result1, container, false);
        // Inflate the layout for this fragment
        return v;
    }
}
