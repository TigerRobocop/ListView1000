package com.training.lsouza.listview1000;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

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
    }


    private List<Item> listItemsBuilder(int ctItems){
        List<Item> retorno = new ArrayList<>();

        for(int i = 1; i <= ctItems; i++){
            Item item = new Item(i + "", "Item #"+ i);

            retorno.add(item);
        }


        return retorno;
    }

}
