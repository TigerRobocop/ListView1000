package com.training.lsouza.listview1000;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    EditText mInput;
    Button mBtnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBtnCreate = (Button) findViewById(R.id.btn_createList);
        mInput = (EditText) findViewById(R.id.editText_inputCount);

        mBtnCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = mInput.getText().toString();
                if (input.trim().equals("")){
                    Toast.makeText(MainActivity.this, "Fail", Toast.LENGTH_SHORT).show();
                }else{
                    int ct = Integer.parseInt(input);
                    Intent intent = new Intent(MainActivity.this, ListActivity.class);
                    intent.putExtra("COUNT", ct);

                    startActivity(intent);
                }


            }
        });

       /* mList = listItemsBuilder(100);

        mListView = (ListView)findViewById(R.id.listView);

        mListView.setAdapter(new ThousandsAdapter(MainActivity.this, mList));*/

    }






}
