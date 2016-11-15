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
    private String[] anArray = new String[25];
    anArray[0] = '1. Because of your tinnitus, is it difficult for you to concentrate?';
    anArray[1] = '2. Does the loudness of your tinnitus make it difficult for you to hear people?';
    anArray[2] = '3. Does your tinnitus make you angry?';
    anArray[3] = '4. Does your tinnitus make you feel confused?';
    anArray[4] = '5. Because of your tinnitus, do you feel desperate?';
    anArray[5] = '6. Do you complain a great deal about your tinnitus?';
    anArray[6] = '7. Because of your tinnitus, do you have trouble falling to sleep at night?';
    anArray[7] = '8. Do you feel as though you cannot escape your tinnitus?';
    anArray[8] = '9. Does your tinnitus interfere with your ability to enjoy your social activities\n(such as going out to dinner, to the movies)?';
    anArray[9] = '10. Because of your tinnitus, do you feel frustrated?';
    anArray[10] = '11. Because of your tinnitus, do you feel that you have a terrible disease?';
    anArray[11] = '12. Does your tinnitus make it difficult for you to enjoy life?';
    anArray[12] = '13. Does your tinnitus interfere with your job or household responsibilities?';
    anArray[13] = '14. Because of your tinnitus, do you find that you are often irritable?';
    anArray[14] = '15. Because of your tinnitus, is it difficult for you to read?';
    anArray[15] = '16. Does your tinnitus make you upset?';
    anArray[16] = '17. Do you feel that your tinnitus problem has placed stress on your relationships with members of your family and friends?';
    anArray[17] = '18. Do you find it difficult to focus your attention away from your tinnitus and on other things?';
    anArray[18] = '19. Do you feel that you have no control over your tinnitus?';
    anArray[19] = '20. Because of your tinnitus, do you often feel tired?';
    anArray[20] = '21. Because of your tinnitus, do you feel depressed?';
    anArray[21] = '22. Does your tinnitus make you feel anxious?';
    anArray[22] = '23. Do you feel that you can no longer cope with your tinnitus?';
    anArray[23] = '24. Does your tinnitus get worse when you are under stress?';
    anArray[24] = '25. Does your tinnitus make you feel insecure?';
    public PostSurvey1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_survey1);
        btn = (Button) findViewById(R.id.button);
        txtViewq = (TextView) findViewById(R.id.question);
        txtViewtotal = (TextView) findViewById(R.id.textView2);
        txtViewtotal.setEnabled(true);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total += tempint;
                counter++;
                txtViewq.setText(anArray[counter]);
                tempint = 0;
            }

    }

    @Override
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
                    tempint = 1;
                }
                break;
            case R.id.radioButton2:
                if (checked) {
                    tempint = 2;
                }
                break;
            case R.id.radioButton3:
                if (checked) {
                    tempint = 3;
                }
                break;
        }
    }
}
