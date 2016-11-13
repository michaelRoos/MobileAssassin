package net.mobileassassin.mobileassassin;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);



        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        String text = user.getEmail();
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
