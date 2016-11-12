package net.mobileassassin.mobileassassin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static android.R.attr.id;
import static android.R.id.list;

public class GameList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_list);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_game_list, fetchNames());
        ListView listView = (ListView) findViewById(list);
        listView.setAdapter(adapter);
    }
    private String[] fetchNames(){
        String[] a = {"Game 1", "Game 2"};
        return a;
    }




}
