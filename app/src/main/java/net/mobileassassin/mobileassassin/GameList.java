/**UNFINISHED**/

package net.mobileassassin.mobileassassin;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
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
        FloatingActionButton myFab = (FloatingActionButton)  listView.findViewById(R.id.myFAB);
    }

    @Override
    protected void onResume(){
        super.onResume();
        setContentView(R.layout.activity_game_list);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_listview, getArray());
        ListView listView = (ListView) findViewById(R.id.mobile_list);
        listView.setAdapter(adapter);
        FloatingActionButton myFab = (FloatingActionButton)  listView.findViewById(R.id.myFAB);
    }

    private String[] getArray(){
        //Incomplete
        String[] asdf = {"Game 1", "Game 2"};
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
    private String[] lenCorrect(){
        String[] ary = getArray();
        String[] result = new String[ary.length];
        for(int i = 0; i<ary.length; i++){
            String a = " ";
            for(int j=0; j<(30-ary[i].length())/2; j++){
                a+=a;
            }
            result[i] = (a+ary[i]+a);
        }
        return result;
    }
    public void fabClick(View v){
        Intent intent = new Intent(this, JoinOrCreate.class);
        startActivity(intent);
    }
}
