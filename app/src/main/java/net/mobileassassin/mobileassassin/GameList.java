/**UNFINISHED**/

package net.mobileassassin.mobileassassin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class GameList extends AppCompatActivity {
    public static String EXTRA_MESSAGE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, getArray());
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }

    private String[] getArray(){
        //Incomplete
        String[] asdf = {"Game 1", "Game 2", "Game 3", "Game 4", "Game 5", "Game 6", "Game 7", "Game 8", "Game 9", "Game 10"};
        return asdf;
    }
    public void myClickHandler(View v)
    {
        TextView textView=(TextView)v;
        Intent intent = new Intent(this, GameInfo.class);
        String gameName = (String)textView.getText();
        intent.putExtra(EXTRA_MESSAGE, gameName);
        startActivity(intent);
    }
}
