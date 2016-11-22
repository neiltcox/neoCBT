package com.tinassist.neocbt.neocbt.surveys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.tinassist.neocbt.neocbt.R;

/**
 * Created by novap on 11/14/2016.
 */

public class PreSurvey2 extends Fragment {

    Button btn;
    TextView txtViewq;
    RadioButton rdo11;
    RadioButton rdo12;
    RadioButton rdo13;
    RadioButton rdo14;
    RadioButton rdo15;

    Fragment nextFragment1 = new Pre2Result1();
    Fragment nextFragment2 = new Pre2Result2();
    Fragment nextFragment3 = new Pre2Result3();

    public int total2 = 0;
    public int counter2 = 0;
    public int tempint2 = 0;
    private String[] anArray = {"1.Repeated, disturbing memories, thoughts, or images of a stressful experience from the past?",
    "2. Repeated, disturbing dreams of a stressful experience from the past?",
    "3. Suddenly acting or feeling as if a stressful experience were happening again (as if you were reliving it)?",
    "4. Feeling very upset when something reminded you of a stressful experience from the past?",
    "5. Having physical reactions (e.g., heart pounding, trouble breathing, or sweating) when something reminded you of a stressful experience from the past?",
    "6. Avoid thinking about or talking about a stressful experience from the past or avoid having feelings related to it?",
    "7. Avoid activities or situations because they remind you of a stressful experience from the past?",
    "8. Trouble remembering important parts of a stressful experience from the past?",
    "9. Loss of interest in things that you used to enjoy?",
    "10. Feeling distant or cut off from other people?",
    "11. Feeling emotionally numb or being unable to have loving feelings for those close to you?",
    "12. Feeling as if your future will somehow be cut short?",
    "13. Trouble falling or staying asleep?",
    "14. Feeling irritable or having angry outbursts?",
    "15. Having difficulty concentrating?",
    "16. Being “super alert” or watchful on guard?",
    "17. Feeling jumpy or easily startled?"};
    public PreSurvey2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.pre_survey2, container, false);
        btn = (Button) btn.findViewById(R.id.button10);
        btn = (Button) v.findViewById(R.id.button);
        btn.setOnClickListener(btnListener);
        rdo11 = (RadioButton) v.findViewById(R.id.radioButton11);
        rdo11.setOnClickListener(btnListener);
        rdo12 = (RadioButton) v.findViewById(R.id.radioButton12);
        rdo12.setOnClickListener(btnListener);
        rdo13 = (RadioButton) v.findViewById(R.id.radioButton13);
        rdo13.setOnClickListener(btnListener);
        rdo14 = (RadioButton) v.findViewById(R.id.radioButton14);
        rdo14.setOnClickListener(btnListener);
        rdo15 = (RadioButton) v.findViewById(R.id.radioButton15);
        txtViewq = (TextView) txtViewq.findViewById(R.id.question2);
        txtViewq.setEnabled(true);
        return v;
    }

    public View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v){
            switch(v.getId()) {
                case R.id.button:
                    counter2++;
                    if (counter2 < 17)
                    {
                        txtViewq.setText(anArray[counter2]);
                        total2 += tempint2;
                        tempint2 = 0;
                        counter2++;
                    }
                    else
                    {
                        if (total2 < 30)
                        {
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                            transaction.replace(R.id.frame_container, nextFragment1, "CURRENT_FRAGMENT");
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else if (total2 < 45)
                        {
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                            transaction.replace(R.id.frame_container, nextFragment2, "CURRENT_FRAGMENT");
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                        else
                        {
                            FragmentManager fragmentManager = getFragmentManager();
                            FragmentTransaction transaction = fragmentManager.beginTransaction();
                            transaction.setCustomAnimations(R.anim.enter, R.anim.exit, R.anim.pop_enter, R.anim.pop_exit);
                            transaction.replace(R.id.frame_container, nextFragment3, "CURRENT_FRAGMENT");
                            transaction.addToBackStack(null);
                            transaction.commit();
                        }
                    }
                    break;
                case R.id.radioButton11:
                    tempint2 = 1;
                    break;
                case R.id.radioButton12:
                    tempint2 = 2;
                    break;
                case R.id.radioButton13:
                    tempint2 = 3;
                    break;
                case R.id.radioButton14:
                    tempint2 = 4;
                    break;
                case R.id.radioButton15:
                    tempint2 = 5;
                    break;
            }
        }
    };
}