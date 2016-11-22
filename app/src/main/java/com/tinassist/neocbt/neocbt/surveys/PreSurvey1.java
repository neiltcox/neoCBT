package com.tinassist.neocbt.neocbt.surveys;

import android.os.Bundle;
import android.provider.MediaStore;
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

public class PreSurvey1 extends Fragment {

    Button btn;
    TextView txtViewq;
    RadioButton rdo1;
    RadioButton rdo2;
    RadioButton rdo3;

    public int total1 = 0;
    public int counter1 = 0;
    public int tempint1 = 0;
    private String[] anArray = {"1. Because of your tinnitus, is it difficult for you to concentrate?",
            "2. Does the loudness of your tinnitus make it difficult for you to hear people?",
            "3. Does your tinnitus make you angry?",
            "4. Does your tinnitus make you feel confused?",
            "5. Because of your tinnitus, do you feel desperate?",
            "6. Do you complain a great deal about your tinnitus?",
            "7. Because of your tinnitus, do you have trouble falling to sleep at night?",
            "8. Do you feel as though you cannot escape your tinnitus?",
            "9. Does your tinnitus interfere with your ability to enjoy your social activities (such as going out to dinner, to the movies)?",
            "10. Because of your tinnitus, do you feel frustrated?",
            "11. Because of your tinnitus, do you feel that you have a terrible disease?",
            "12. Does your tinnitus make it difficult for you to enjoy life?",
            "13. Does your tinnitus interfere with your job or household responsibilities?",
            "14. Because of your tinnitus, do you find that you are often irritable?",
            "15. Because of your tinnitus, is it difficult for you to read?",
            "16. Does your tinnitus make you upset?",
            "17. Do you feel that your tinnitus problem has placed stress on your relationships with members of your family and friends?",
            "18. Do you find it difficult to focus your attention away from your tinnitus and on other things?",
            "19. Do you feel that you have no control over your tinnitus?",
            "20. Because of your tinnitus, do you often feel tired?",
            "21. Because of your tinnitus, do you feel depressed?",
            "22. Does your tinnitus make you feel anxious?",
            "23. Do you feel that you can no longer cope with your tinnitus?",
            "24. Does your tinnitus get worse when you are under stress?",
            "25. Does your tinnitus make you feel insecure?"};
    private String[] results = {"You rsponsese put you in the slight to mild tinnitus handicapped group. " +
            "This is the lowerst level of handicap based on this survey. Our program will help you learn " +
            "how to mask your tinnitus by environmental sounds and easily forget it with your activities.",
            "Your responses put you in the moderately tinnitus handicapped group. Your tinnitus might " +
                    "interfere with your well being and daily life. Our program will help you learn techniques " +
                    "to manage your tinnitues and take your attention away from it.",
            "Your responses put you in the severly tinnitus handicapped group. Your tinnitus is always " +
                    "heard, leads to disturbed sleep patterns and can interfere with daily activities. We recommend " +
                    "that you see a therapist in this regard. Our program will help you learn techniques " +
                    "to manage your tinnitus and take your attention away from it. However, it cannot replace " +
                    "the help of a therapist."};
    public PreSurvey1() {
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
        View v = inflater.inflate(R.layout.post_survey1, container, false);
        btn = (Button) v.findViewById(R.id.button);
        btn.setOnClickListener(btnListener);
        rdo1 = (RadioButton) v.findViewById(R.id.radioButton);
        rdo1.setOnClickListener(btnListener);
        rdo2 = (RadioButton) v.findViewById(R.id.radioButton2);
        rdo2.setOnClickListener(btnListener);
        rdo3 = (RadioButton) v.findViewById(R.id.radioButton3);
        rdo3.setOnClickListener(btnListener);

        txtViewq = (TextView) v.findViewById(R.id.question);
        txtViewq.setEnabled(true);
        return v;
    };

    public View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View v){
            switch(v.getId()) {
                case R.id.button:
                    if (counter1 < 25)
                    {
                        txtViewq.setText(anArray[counter1]);
                        total1 += tempint1;
                        tempint1 = 0;
                        counter1++;
                    }
                    else
                    {
                        if (total1 < 37)
                        {
                            //link to pre1result1
                        }
                        else if (total1 < 57)
                        {
                            //link to pre1result2
                        }
                        else
                        {
                            //link to pre1result3
                        }
                    }
                    break;
                case R.id.radioButton:
                    tempint1 = 4;
                    break;
                case R.id.radioButton2:
                    tempint1 = 2;
                    break;
                case R.id.radioButton3:
                    tempint1 = 0;
                    break;
            }
        }
    };
}
