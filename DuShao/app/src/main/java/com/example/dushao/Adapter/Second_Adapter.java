package com.example.dushao.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dushao.R;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Second_Adapter extends RecyclerView.Adapter<Second_Adapter.Holder> {

    private JsonObject jsonObject;
    private Activity mActivity;
    private ArrayList<Map.Entry<String, JsonElement>> list;
    public Second_Adapter(JsonObject jsonObject, Activity activity) {
        this.jsonObject = jsonObject;
        Set<Map.Entry< String, JsonElement>> set = jsonObject.entrySet();
//        Map.Entry<String,JsonElement>[] array= (Map.Entry<String,JsonElement>[]) set.toArray();
        list = new ArrayList<>();
        for (Map.Entry<String, JsonElement> t:set){
            list.add(t);
        }
//        list.addAll(Arrays.asList(array));
        this.mActivity = activity;
    }

    class Holder extends RecyclerView.ViewHolder {
        TextView htx;
        View item_view;

        public Holder(View view) {
            super(view);
            item_view = view;
            htx = view.findViewById(R.id.tv_second);
        }

    }

    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_text, parent, false);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.htx.setText(list.get(position).getKey() +": " + list.get(position).getValue().getAsString());
    }


    @Override
    public int getItemCount() {
        return list.size();
    }
}
