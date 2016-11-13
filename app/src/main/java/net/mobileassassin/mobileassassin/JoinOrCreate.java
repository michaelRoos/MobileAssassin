package net.mobileassassin.mobileassassin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JoinOrCreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_or_create);
    }
    public void joinExisting(View v){
        Intent intent = new Intent(this, JoinExisting.class);
        startActivity(intent);
        finish();
    }
    public void makeNew(View v){
        Intent intent = new Intent(this, CreateNew.class);
        startActivity(intent);
        finish();
    }


}
