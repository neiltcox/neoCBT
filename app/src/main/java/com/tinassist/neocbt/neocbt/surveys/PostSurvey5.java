package com.tinassist.neocbt.neocbt.surveys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tinassist.neocbt.neocbt.R;

/**
 * Created by novap on 11/14/2016.
 */

public class PostSurvey5 extends Fragment {
    public PostSurvey5() {
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
        return inflater.inflate(R.layout.post_survey5, container, false);
    }
}
