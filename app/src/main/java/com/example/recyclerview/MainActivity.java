package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    String Names[]={"AAAAnbhgfdertggffd","BBBB","CCCC","DDD"};
    String Numbers[]={"112","1213324243424","343","334"};
    int Images[]={R.mipmap.aaa,R.mipmap.bbb,R.mipmap.ccc,R.mipmap.ddd};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.rec);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager
                (MainActivity.this,LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(new RecAdpter(MainActivity.this,
                Names,Numbers,Images));
    }
}
