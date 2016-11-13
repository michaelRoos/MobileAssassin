package net.mobileassassin.mobileassassin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class KillConfirm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kill_confirm);
    }
    public void confirm(View v){
        //send a push notification to the killer that the kill was successful, and assign the
        //other player a new target
        finish();
    }
    public void deny(View v){
        //send a push notification to the killer that the request to kill was denied
        finish();
    }
}
