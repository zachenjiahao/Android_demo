package com.example.dushao.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.dushao.R;
import com.example.dushao.ui.login.LoginActivity;


public class Fragment_3 extends Fragment {
    private Button zx;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_3,null);
        zx=view.findViewById(R.id.zhuxiao);


        Intent intent = new Intent(this.getActivity(), LoginActivity.class);
        zx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(intent);
            }
        });
        return view;
    }
}