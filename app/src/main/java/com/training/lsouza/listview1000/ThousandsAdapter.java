package com.training.lsouza.listview1000;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Livia on 04/09/2015.
 */
public class ThousandsAdapter extends ArrayAdapter<Item> {
    public ThousandsAdapter(Context context, List<Item> objects) {
        super(context, 0, objects);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //return super.getView(position, convertView, parent);

        ViewHolder mVH;


        if (convertView == null){
            convertView = LayoutInflater.from(
                    getContext()).inflate(R.layout.item_layout, null);

            mVH = new ViewHolder();
            mVH.txtId = (TextView)convertView.findViewById(R.id.textView_id);
            mVH.txtName = (TextView) convertView.findViewById(R.id.textView_name);

            convertView.setTag(mVH);

            Log.v("LIV", "Item created: " + position);
        }else{
            mVH = (ViewHolder)convertView.getTag();
            Log.v("LIV", "Item recycled: " + position);
        }

        Item item = getItem(position);

        if (item != null){
            mVH.txtId.setText(item.id);
            mVH.txtName.setText(item.name);
        }

        return convertView;
    }
}


class ViewHolder {
    TextView txtId;
    TextView txtName;
}
