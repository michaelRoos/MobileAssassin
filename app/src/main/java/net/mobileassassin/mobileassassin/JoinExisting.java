package net.mobileassassin.mobileassassin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class JoinExisting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_existing);
    }
    public void join(View v) {
        EditText e = (EditText) findViewById(R.id.code_text);
        String code = e.getText().toString();
        //use this code to add this player to the game in the database
        finish();
    }
}
