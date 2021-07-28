package com.example.dushao.myinterface;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface Api {

    @GET("https://interface.sina.cn/news/wap/fymap2020_data.d.json")
    public Call<ResponseBody> getCrime_info();
    @GET("https://jbzz.market.alicloudapi.com/kgraph/medical_kg/disease_symptoms/v1?")
    public Call<ResponseBody> getIllness(@Query("PAGE_NUM") int pagenum,@Query("STRING") String string,@Header("Authorization") String str);
}
