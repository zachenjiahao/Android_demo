package com.example.dushao.util;

import com.example.dushao.myinterface.Api;
import com.google.gson.Gson;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Connection {
    private static Retrofit sRetrofit;
    private static Api iApi;
    static {
        sRetrofit =new Retrofit.Builder().baseUrl("http://10.0.2.2").addConverterFactory(GsonConverterFactory.create()).build();
        iApi = sRetrofit.create(Api.class);
    }
    public static Api getiApi() {
        return iApi;
    }
}
