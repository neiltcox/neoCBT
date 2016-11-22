package com.tinassist.neocbt.neocbt.week2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.tinassist.neocbt.neocbt.R;
import com.tinassist.neocbt.neocbt.week1.W1P2;

/**
 * Created by novap on 11/12/2016.
 */

public class W2P1 extends Fragment implements  View.OnClickListener{

    public W2P1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    Fragment nextFragment = new W2P2();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.w2p1, container, false);

        Button button = (Button) v.findViewById(R.id.button);
        button.setOnClickListener(this);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                FragmentManager fragmentManager = getFragmentManager();
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                transaction.replace(R.id.frame_container, nextFragment, "CURRENT_FRAGMENT");
                transaction.addToBackStack(null);
                transaction.commit();
                break;


        }
    }
}
