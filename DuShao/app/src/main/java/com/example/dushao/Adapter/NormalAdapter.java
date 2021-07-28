package com.example.dushao.Adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dushao.R;
import com.example.dushao.ui.main.ContentActivity;
import com.google.android.material.textview.MaterialTextView;

import java.util.ArrayList;

public class NormalAdapter extends RecyclerView.Adapter<NormalAdapter.NormalHolder> {
    private ArrayList<String> list;
    private Activity mActivity;
    public NormalAdapter(ArrayList<String> list,Activity mActivity) {
        this.list = list;
        this.mActivity = mActivity;
    }

    @NonNull
    @Override
    public NormalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text,parent,false);
        return new NormalHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NormalHolder holder, int position) {
        holder.tv.setText(list.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mActivity, ContentActivity.class);
                intent.putExtra("word",list.get(position));
                mActivity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class NormalHolder  extends RecyclerView.ViewHolder{
        MaterialTextView tv;
        View itemView;
        public NormalHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            tv = itemView.findViewById(R.id.tv_normal);
        }
    }
    public void add(String s){
        list.add(s);
        notifyItemInserted(getItemCount());

    }
}
