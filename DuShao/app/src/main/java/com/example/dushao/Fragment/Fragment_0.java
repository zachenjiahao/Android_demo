package com.example.dushao.Fragment;

import android.app.Activity;
import android.app.Fragment;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.example.dushao.R;
import com.example.dushao.data.Internet;
import com.example.dushao.data.Result_0;
import com.example.dushao.Adapter.MyPagerAdapter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.stx.xhb.xbanner.XBanner;
import com.stx.xhb.xbanner.transformers.Transformer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import static android.content.Context.MODE_PRIVATE;


public class Fragment_0 extends Fragment {
private XBanner xBanner ;
private TextView time,quezhen,zhiyu,siwang,chengshi,shuru;
public  String old_time,new_time;
private Activity mActivity;
private int flag =0;
    String test;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         View view = inflater.inflate(R.layout.fragment_0,null);

         init(view);
         lunbo();
         /*setVp(view);*/
         if(flag!=1)
         total_data(mActivity);
         else
             load_data();
         setVp(view);
        return view;
    }
    private void lunbo(){
        final List<String> imgUrl = new ArrayList<>();
        imgUrl.add("https://ss0.bdstatic.com/70cFuHSh_Q1YnxGkpoWK1HF6hhy/it/u=2272510089,234667939&fm=26&gp=0.jpg");
        imgUrl.add("https://ss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3230506519,3487318343&fm=26&gp=0.jpg");
        imgUrl.add("https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=914787622,1894822817&fm=26&gp=0.jpg");
        xBanner.setData(imgUrl,null);
        xBanner.setmAdapter(new XBanner.XBannerAdapter() {
            @Override
            public void loadBanner(XBanner banner, Object model, View view, int position) {
                Glide.with(getActivity()).load(imgUrl.get(position)).into((ImageView) view);
            }
        });
        xBanner.setPageChangeDuration(1000);
        xBanner.setPageTransformer(Transformer.Cube);
    }

public void init(View view){
        mActivity = getActivity();
    xBanner = view.findViewById(R.id.xbanner_view);
    time = view.findViewById(R.id.time);
    quezhen = view.findViewById(R.id.leiji_quezhen);
    siwang = view.findViewById(R.id.leiji_siwang);
    zhiyu = view.findViewById(R.id.leiji_zhiyu);
    shuru = view.findViewById(R.id.shuru);
    chengshi= view.findViewById(R.id.bingli_chengshi);
    SharedPreferences sp_1 = mActivity.getSharedPreferences("m",MODE_PRIVATE);
    Date date = new Date();
    old_time = sp_1.getString("sold_time","");
    new_time = date.getMonth()+": "+date.getDate();
    if(Objects.equals(old_time, new_time))
    flag = 1;
    else{
    final SharedPreferences.Editor editor = mActivity.getSharedPreferences("m",MODE_PRIVATE).edit();
    editor.putString("sold_time",new_time);
    editor.commit();
     test = sp_1.getString("sold_time","");
    }
    return;
}
public void total_data(Activity mActivity){

    new Thread(new Runnable() {
        @Override
        public void run() {
            try {
                try {
                    Result_0 info = Internet.crime_info();
                    mActivity.runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            time.setText(info.getData().getMtime());
                            quezhen.setText(info.getData().getGntotal());
                            siwang.setText(info.getData().getDeathtotal());
                            zhiyu.setText(info.getData().getCuretotal());
                            shuru.setText(info.getData().getJwsrNum());
                            chengshi.setText(info.getData().getSustotal());
                        }
                    });
                    List nameList = info.getData().getWorldlist();
                    Gson gson =new Gson();
                    String jsonstr = gson.toJson(nameList);
                     final SharedPreferences.Editor editor = mActivity.getSharedPreferences("mr",MODE_PRIVATE).edit();
                     editor.putString("stime",time.getText().toString());
                    editor.putString("squezhen",quezhen.getText().toString());
                    editor.putString("ssiwang",siwang.getText().toString());
                    editor.putString("szhiyu",zhiyu.getText().toString());
                    editor.putString("sshuru",shuru.getText().toString());
                    editor.putString("schengshi",chengshi.getText().toString());
                    editor.putString("slist",jsonstr);
                    editor.commit();
                    System.out.println("success");
                } catch (Exception e) {
                    e.printStackTrace();

                }
            } finally {
                System.out.println("ok");
            }
        }}).start();
    System.out.println("false");
}
private void load_data(){
    SharedPreferences sp = mActivity.getSharedPreferences("mr",MODE_PRIVATE);
    time.setText(sp.getString("stime",""));
    quezhen.setText(sp.getString("squezhen",""));
    siwang.setText(sp.getString("ssiwang",""));
    zhiyu.setText(sp.getString("szhiyu",""));
    shuru.setText(sp.getString("sshuru",""));
    chengshi.setText(sp.getString("schengshi",""));
    return;
}
    private void setVp(View view) {
        SharedPreferences sp_1 = mActivity.getSharedPreferences("mr",MODE_PRIVATE);
        String s =sp_1.getString("slist","");
        Gson gson = new Gson();
        List<Result_0.DataDTO.WorldlistDTO>  list =gson.fromJson(s,new TypeToken<List<Result_0.DataDTO.WorldlistDTO>>(){}.getType());
        ViewPager vp = (ViewPager) view.findViewById(R.id.vp);
        vp.setAdapter(new MyPagerAdapter(view.getContext(),list));
    }



}
