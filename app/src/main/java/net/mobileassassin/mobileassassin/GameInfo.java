package net.mobileassassin.mobileassassin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class GameInfo extends AppCompatActivity {
    private String game;//to be implemented once we have database functionality
    private String player;
    public static String EXTRA_MESSAGE;
    public static String PLAYER;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_info);
        Intent intent = getIntent();
        game = intent.getStringExtra(GameList.EXTRA_MESSAGE);
        player = "me";

    }
    public void playersClick(View v){
        Intent intent = new Intent(this, PlayersList.class);
        startActivity(intent);
    }
    public void mapClick(View v){
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
    public void killClick(View v){
        Intent intent  = new Intent(this, KillConfirm.class);
        startActivity(intent);
    }


}
