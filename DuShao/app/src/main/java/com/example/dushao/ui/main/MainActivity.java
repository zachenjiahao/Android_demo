package com.example.dushao.ui.main;


//import android.app.Fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.app.Fragment;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

//import androidx.fragment.app.Fragment;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dushao.Fragment.Fragment_0;
import com.example.dushao.Fragment.Fragment_1;
import com.example.dushao.Fragment.Fragment_2;
import com.example.dushao.Fragment.Fragment_3;
import com.example.dushao.R;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    public RecyclerView rv_1;
    private BottomNavigationView bnv;
    public static TextView sear_text;
    public static ImageView sear_logo;
    private int i = 0;
    WebView webView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initEvent();
    }

    private void initView() {
        bnv = findViewById(R.id.bnv_main);
        rv_1 = findViewById(R.id.rwr_1);
        sear_text = findViewById(R.id.search_bar);
        sear_logo = findViewById(R.id.search_button_0);
        webView = findViewById(R.id.web_content);

    }

    private void initEvent() {
        initFragment();
        initSearch();
    }

private void initFragment(){
    bnv.setItemIconTintList(null);
    bnv.setOnNavigationItemReselectedListener(null);
    FragmentManager fm = getFragmentManager();//获取Fragment
    bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            FragmentTransaction ft = fm.beginTransaction();
            Fragment f = null;
            switch (item.getItemId()) {
                case R.id.f1:
                    f = new Fragment_0();
                    break;
                case R.id.f2:
                    f = new Fragment_1();
                    break;
                case R.id.f3:
                    f = new Fragment_2();
                    break;
                case R.id.f4:
                    f = new Fragment_3();
                    break;
            }

            ft.replace(R.id.myFragment, f);

            ft.commit();
            return true;
        }
    });
    FragmentTransaction ft = fm.beginTransaction();
    ft.replace(R.id.myFragment, new Fragment_0());

}
private void initSearch(){
        sear_logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sear_text.getText().toString()=="")
                    return;
                else
                {
                    Intent intent = new Intent(MainActivity.this,ContentActivity.class);
                    intent.putExtra("word",sear_text.getText().toString());
                    startActivity(intent);
                }
            }
        });

}

}

