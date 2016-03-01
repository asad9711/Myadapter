package com.example.asad.myadapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

/**
 * Created by Asad on 01-03-2016.
 */
public class CAdapter extends BaseAdapter {

    int images[];Context context;
    CAdapter(Context c,int images[])
    {
        this.images=images;
  context=c;

}
    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row=inflater.inflate(R.layout.each_row,parent,false);
        ImageView imageView= (ImageView) row.findViewById(R.id.imageView);
        imageView.setImageResource(images[position]);

        return row;



    }
}
