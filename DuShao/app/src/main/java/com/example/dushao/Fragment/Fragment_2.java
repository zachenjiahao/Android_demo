package com.example.dushao.Fragment;

import android.app.Fragment;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.dushao.R;
import com.example.dushao.data.Internet;
import com.google.gson.JsonObject;

import java.util.Set;


public class Fragment_2 extends Fragment {

RecyclerView recyclerView ;
TextView textView;
ImageView button;
JsonObject jsonObject = null;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_2,null);
        textView=view.findViewById(R.id.search_bar_1);
        button = view.findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)  {
                try {
                    new Thread(new Runnable() {
                        @Override
                        public void run() {

                            try {
                                jsonObject = Internet.illness_info(textView.getText().toString());
                                Set<String> set = jsonObject.keySet();
                                getActivity().runOnUiThread(new Runnable() {
                                    @Override
                                    public void run() {
                                        TextView textView_1 = view.findViewById(R.id.illness_info);
                                        textView_1.setText(jsonObject.toString());
                                    }
                                });

                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }).start();


                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        });
        return view;
    }
}