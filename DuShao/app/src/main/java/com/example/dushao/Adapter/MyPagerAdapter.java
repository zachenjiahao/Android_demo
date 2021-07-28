package com.example.dushao.Adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.viewpager.widget.PagerAdapter;

import com.example.dushao.R;
import com.example.dushao.data.Result_0;

import java.util.List;

public class MyPagerAdapter extends PagerAdapter {
    private Context mContext;
    private List<Result_0.DataDTO.WorldlistDTO>  mData;

    public MyPagerAdapter(Context context , List<Result_0.DataDTO.WorldlistDTO>  list) {
        mContext = context;
        mData = list;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View view = View.inflate(mContext, R.layout.page,null);
        TextView name = view.findViewById(R.id.guojia);
        TextView value =view.findViewById(R.id.cquezhen);
        TextView nowvalue = view.findViewById(R.id.now_quezhen);
        TextView deathNum=view.findViewById(R.id.c_death);
        TextView cureNum=view.findViewById(R.id.tol_cur);
        TextView cureadd=view.findViewById(R.id.add_cur);
        TextView deathadd=view.findViewById(R.id.add_death);
        name.setText(mData.get(position).getName());
        value.setText(mData.get(position).getValue());
        nowvalue.setText(mData.get(position).getEconNum());
        deathNum.setText(mData.get(position).getDeathNum());
        deathadd.setText(mData.get(position).getDeathadd());
        cureadd.setText(mData.get(position).getCureadd());
        cureNum.setText(mData.get(position).getCureNum());
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        // super.destroyItem(container,position,object); 这一句要删除，否则报错
        container.removeView((View)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }
}
