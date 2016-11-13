package net.mobileassassin.mobileassassin;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.games.Games;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.iid.FirebaseInstanceId;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeScreen extends AppCompatActivity {
    public TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        String answer = "";
        try {
            answer = new SendfeedbackJob().urlTester();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, answer, Toast.LENGTH_LONG);


    }

    class SendfeedbackJob extends AsyncTask<String, Void, String> {

        protected String urlTester() throws IOException {
            String url = "http://ec2-35-163-67-211.us-west-2.compute.amazonaws.com/";
            String charset = "UTF-8";
            String param1 = FirebaseInstanceId.getInstance().getToken();
            String param2 = "";

            String query = String.format("token?=%s",
                    URLEncoder.encode(param1, charset));

            URLConnection connection = new URL(url).openConnection();
            connection.setDoOutput(true); // Triggers POST.
            connection.setRequestProperty("Accept-Charset", charset);
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=" + charset);

            try (OutputStream output = connection.getOutputStream()) {
                output.write(query.getBytes(charset));
            }

            InputStream response = connection.getInputStream();
            Scanner s = new Scanner(response).useDelimiter("\\A");
            String result = s.hasNext() ? s.next() : "";
            return result;
        }

        @Override
        protected String doInBackground(String... params) {
            return null;
        }

        @Override
        protected void onPostExecute(String message) {
            //process message
        }
    }
}


