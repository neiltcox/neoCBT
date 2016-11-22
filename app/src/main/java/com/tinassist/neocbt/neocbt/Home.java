package com.tinassist.neocbt.neocbt;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tinassist.neocbt.neocbt.week1.W1P1;
import com.tinassist.neocbt.neocbt.week1.W1P2;

/**
 * Created by novap on 11/12/2016.
 */

public class Home extends Fragment {


    public Home() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.home, container, false);
    }
}