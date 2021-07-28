package com.example.dushao.Fragment;

import android.app.Fragment;
import android.os.Bundle;



import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dushao.R;
import com.example.dushao.Adapter.NormalAdapter;

import java.util.ArrayList;


public class Fragment_1 extends Fragment {
    String[] ks = new String[]{"内科", "呼吸内科", "消化内科", "神经内科", "心血管内科", "肾内科", "血液内科", "免疫科", "内分泌科",
            "普通外科", "神经外科", "心胸外科", "泌尿外科", "心血管外科", "乳腺外科", "肝胆外科", "器官移植", "肛肠外科", "烧伤科", "骨外科",
            "妇产科", "妇科", "产科", "计划生育", "妇幼保健", "男科", "儿科", "儿科综合", "小儿内科", "小儿外科", "新生儿科", "儿童营养保健科", "五官科"
            , "耳鼻喉科", "眼科", "口腔科", "肿瘤科", "肿瘤内科", "肿瘤外科", "肿瘤妇科", "骨肿瘤科", "放疗科", "肿瘤康复科", "肿瘤综合科", "皮肤性病科",
            "皮肤科", "性病科", "中医科", "中医全科", "中医内科", "中医外科", "中医妇科", "中医儿科", "中医保健科", "针灸按摩科", "中医骨伤科", "中医肿瘤科",
            "传染科", "肝病科", "艾滋病科", "结核病", "寄生虫", "精神心理科", "精神科", "心理咨询科", "整形美容科", " 营养科", "生殖中心", "麻醉医学科", "麻醉科",
            "疼痛科", "医学影像科", "核医学科", "放射科", "超声科", "药剂科", "护理科", "体检科", "检验科", "急诊科", "公共卫生与预防科", "全科", "设备科"};

    public RecyclerView rv_1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_1,null);
        rv_1 = root.findViewById(R.id.rwr_1);
        rv_1.setLayoutManager(new LinearLayoutManager(getActivity()));
        NormalAdapter adapter = new NormalAdapter(new ArrayList<>(),getActivity());
        rv_1.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        rv_1.setAdapter(adapter);
        for(String s:ks)
            adapter.add(s);
        return root;
    }
}