package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static android.content.Context.*;

public class RecAdpter extends RecyclerView.Adapter<RecAdpter.MyViewHolder> {
    String[] adpnames;
    String[] adpnumbers;
    int[] adpcImages;
    Context context;
    public RecAdpter(MainActivity mainActivity, String[] names,
                     String[] numbers, int[] images) {
        context=mainActivity;
        adpcImages=images;
        adpnames=names;
        adpnumbers=numbers;
    }

    @NonNull
    @Override
    public RecAdpter.MyViewHolder onCreateViewHolder
            (@NonNull ViewGroup parent,int viewType) {
        LayoutInflater inflater=
                (LayoutInflater)
                        context.getSystemService(LAYOUT_INFLATER_SERVICE);
        View view=inflater.inflate(R.layout.custom,null);

        return new MyViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecAdpter.MyViewHolder holder,
                                 int position) {
        holder.tv1.setText(adpnames[position]);
        holder.tv2.setText(adpnumbers[position]);
        holder.iv.setImageResource(adpcImages[position]);
        holder.iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "hello", Toast.LENGTH_SHORT).show();
            }
        });
    }
    @Override
    public int getItemCount() {
        return adpcImages.length;
    }
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tv1,tv2;
        ImageView iv;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv1=itemView.findViewById(R.id.textView);
            tv2=itemView.findViewById(R.id.textView2);
            iv=itemView.findViewById(R.id.imageView);
        }
    }
}
