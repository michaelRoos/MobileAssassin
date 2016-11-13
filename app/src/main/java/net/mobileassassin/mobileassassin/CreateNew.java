package net.mobileassassin.mobileassassin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

public class CreateNew extends AppCompatActivity {
    Spinner s1;
    Spinner s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new);
        s1 = (Spinner) findViewById(R.id.hours_spinner_1);
        s2 = (Spinner) findViewById(R.id.hours_spinner_2);
        s1.setClickable(false);
        s2.setClickable(false);
        Switch s = (Switch) findViewById(R.id.switch1);
        s.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b) {
                    s1.setClickable(true);
                    s2.setClickable(true);
                    s1.setAlpha(1f);
                    s2.setAlpha(1f);
                } else {
                    s1.setClickable(false);
                    s2.setClickable(false);
                    s1.setAlpha(.5f);
                    s2.setAlpha(.5f);
                }
            }
        });
        }


}




