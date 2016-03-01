package com.example.asad.myadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("asd","inside oncreate");
        setContentView(R.layout.activity_main);
        int images[]={R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo,
                R.drawable.photo,R.drawable.photo,R.drawable.photo,R.drawable.photo};
        lv= (ListView) findViewById(R.id.listView);
         lv.setAdapter(new CAdapter(this,images));
    }

}
