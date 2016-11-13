package net.mobileassassin.mobileassassin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class GameInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_info);

        Intent intent = getIntent();
        String message = intent.getStringExtra(GameList.EXTRA_MESSAGE);
        Button viewPlayers = (Button)findViewById(R.id.view_players_button);
        Button viewMap = (Button)findViewById(R.id.view_map_button);
        viewPlayers.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });
        viewMap.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

    }


}
