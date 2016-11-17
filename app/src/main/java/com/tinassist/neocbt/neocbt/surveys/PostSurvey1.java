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

public class PostSurvey1 extends Fragment {

    Button btn;
    TextView txtViewq;
    TextView txtViewtotal;
    private int total = 0;
    private int counter = 0;
    private int tempint = 0;
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
    public PostSurvey1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(android.R.layout.post_survey1);
        btn = (Button) findViewById(R.id.button);
        txtViewq = (TextView) findViewById(R.id.question);
        txtViewtotal = (TextView) findViewById(R.id.textView2);
        txtViewtotal.setEnabled(true);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total += tempint;
                counter++;
                if (counter < 25)
                {
                    txtViewq.setText(anArray[counter]);
                    tempint = 0;
                }
                else
                {

                    if (total
                }
            }
        }
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.post_survey1, container, false);
    };

    public void selectOption(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.radioButton:
                if (checked) {
                    tempint = 4;
                }
                break;
            case R.id.radioButton2:
                if (checked) {
                    tempint = 2;
                }
                break;
            case R.id.radioButton3:
                if (checked) {
                    tempint = 0;
                }
                break;
        }
    }
}
