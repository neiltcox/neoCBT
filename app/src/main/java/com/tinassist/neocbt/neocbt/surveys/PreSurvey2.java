package com.tinassist.neocbt.neocbt.surveys;

import android.os.Bundle;
import android.support.v4.app.Fragment;
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
    private int total = 0;
    private int counter = 0;
    private int tempint = 0;
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
        btn = (Button) btn.findViewById(R.id.button10);
        txtViewq = (TextView) txtViewq.findViewById(R.id.question2);
        txtViewq.setEnabled(true);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total += tempint;
                counter++;
                if (counter < 17)
                {
                    txtViewq.setText(anArray[counter]);
                    tempint = 0;
                }
                //else
                //{
                //
                //}
            }
        });
        return inflater.inflate(R.layout.pre_survey2, container, false);
    }
    public void selectOption(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton11:
                if (checked) {
                    tempint = 1;
                }
                break;
            case R.id.radioButton12:
                if (checked) {
                    tempint = 2;
                }
                break;
            case R.id.radioButton13:
                if (checked) {
                    tempint = 3;
                }
                break;
            case R.id.radioButton14:
                if (checked) {
                    tempint = 4;
                }
                break;
            case R.id.radioButton15:
                if (checked){
                    tempint = 5;
                }
                break;
        }
    }
}