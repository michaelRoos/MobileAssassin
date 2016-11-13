package net.mobileassassin.mobileassassin;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class GameInfo extends AppCompatActivity {
    private String game;//to be implemented once we have database functionality
    private String player;
    public static String EXTRA_MESSAGE;
    public static String PLAYER;
    final Context context = this;
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
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                context);
        alertDialogBuilder.setTitle("Assassination Confirmation");
        String message = "Are you sure that you have assassinated "+((TextView)(findViewById(R.id.target_ans))).getText()+"?";
        alertDialogBuilder
                .setMessage(message)
                .setCancelable(false)
                .setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        CharSequence text = "Confirmation message sent";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }
                })
                .setNegativeButton("No",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}


