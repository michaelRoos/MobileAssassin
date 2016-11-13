package net.mobileassassin.mobileassassin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PlayersList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_list);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_players_list,getArray());
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
    }
    private String[] getArray(){
        //Incomplete
        String[] asdf = {"Matthew \"The Noodle\" Mancini", "Mike Roos", "Ben Proto", "Dan Herlihy", "Quinn Verbeke"};
        return asdf;
    }
}
