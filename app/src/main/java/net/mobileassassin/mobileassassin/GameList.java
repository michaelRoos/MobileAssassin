/**UNFINISHED**/

package net.mobileassassin.mobileassassin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import static android.R.attr.id;
import static android.R.id.list;

public class GameList extends AppCompatActivity {
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
        String[] asdf = {"Game 1", "Game 2"};
        return asdf;
    }
    public void myClickHandler(View v)
    {
        LinearLayout vwParentRow = (LinearLayout)v.getParent();
        TextView child = (TextView)((LinearLayout)vwParentRow.getChildAt(0)).getChildAt(0);
        Button btnChild = (Button)((LinearLayout)vwParentRow.getChildAt(1)).getChildAt(0);
        btnChild.setText("Pressed");
        vwParentRow.refreshDrawableState();
    }




}
