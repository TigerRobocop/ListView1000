package com.training.lsouza.listview1000;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends android.app.ListActivity {

    List<Item> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  setContentView(R.layout.activity_list);

        Intent intent = getIntent();
        int ctItems = intent.getIntExtra("COUNT", 1);

        mList = listItemsBuilder(ctItems);

        setListAdapter(new ThousandsAdapter(this, mList));

        Toast.makeText(this, "List Count: " + ctItems, Toast.LENGTH_LONG).show();

            }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        TextView txt = (TextView)v.findViewById(R.id.textView_name);
        String name =  txt.getText().toString();
        Toast.makeText(this, "Item clicked: " + name, Toast.LENGTH_LONG).show();
    }

    private List<Item> listItemsBuilder(int ctItems) {
        List<Item> retorno = new ArrayList<>();

        for (int i = 1; i <= ctItems; i++) {
            Item item = new Item(i + "", "Item #" + i);

            retorno.add(item);
        }


        return retorno;
    }

}
