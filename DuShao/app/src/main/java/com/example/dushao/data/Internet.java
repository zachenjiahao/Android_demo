package com.example.dushao.data;

import com.example.dushao.myinterface.Api;
import com.example.dushao.util.Connection;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

public class Internet {

    public static Result_0 crime_info() throws Exception {
        Result_0 info = null;
        Api api = Connection.getiApi();
        Call<ResponseBody> request = api.getCrime_info();
        request.timeout().timeout(5, TimeUnit.SECONDS);
        Response<ResponseBody> result = request.execute();
        if (result.code() != HttpsURLConnection.HTTP_OK || result.body() == null)
            throw new Exception("连接失败");
        ResponseBody body = result.body();
        String jsonResult = body.string();
        System.out.println(jsonResult);
        info = new Gson().fromJson(jsonResult, Result_0.class);
        System.out.println(info.getData().getAdd_daily().getAdddeath_new());
        return info;
    }

    public static JsonObject illness_info(String string) throws Exception {

        Api api = Connection.getiApi();
        Call<ResponseBody> request = api.getIllness(1, string, "APPCODE 921fc4fecf2c467e9858292aee4e44f5");
        Response<ResponseBody> result = request.execute();//这里有问题
        if (result.code() != HttpsURLConnection.HTTP_OK || result.body() == null)
            throw new Exception("连接失败");
        ResponseBody body = result.body();
        String jsonResult = body.string();
        Gson gson = new Gson();
        JsonElement jsonElement = gson.fromJson(jsonResult, JsonElement.class);
        JsonObject jsonObject = jsonElement.getAsJsonObject();
        System.out.println(jsonObject);
        return jsonObject;
    }
}
