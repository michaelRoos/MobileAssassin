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
        String[] names = fetchNames();
        String[] mobileArray = new String[names.length+1];
        mobileArray[0] = "Game Name";
        for(int i = 1; i<mobileArray.length; i++){
            mobileArray[i] = names[i-1];
        }
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_game_list, mobileArray);
        ListView listView = (ListView) findViewById(list);
        listView.setAdapter(adapter);
    }
    private String[] fetchNames(){
        String[] a = {"Game 1", "Game 2"};
        return a;
    }




}
