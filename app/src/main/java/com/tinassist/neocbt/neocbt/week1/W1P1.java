package com.tinassist.neocbt.neocbt.week1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tinassist.neocbt.neocbt.R;

/**
 * Created by novap on 11/12/2016.
 */

public class W1P1 extends Fragment {

    //Fragment nextFragment = new W1P2();

    public W1P1() {

    }

    public Fragment getNextFragment(){
        return new W1P2();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.w1p1, container, false);
    }
}