package com.example.dushao.ui.login;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.dushao.R;
import com.example.dushao.ui.main.MainActivity;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.cache.CacheInterceptor;

public class LoginActivity extends AppCompatActivity {
    private AppCompatButton btn_login;
    private Button btn_register;

    private TextInputEditText tie_account;
    private TextInputEditText tie_password;
    private final ObjectMapper mapper = new ObjectMapper();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initEvent();
    }
    private void initView(){
        btn_login = findViewById(R.id.btn_login_login);
        btn_register = findViewById(R.id.btn_register);
        tie_account = findViewById(R.id.tie_login_account);
        tie_password = findViewById(R.id.tie_login_password);
    }
    private void initEvent(){
        load();
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                save();
                System.out.println(123);
                try {
                    login();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save();
                try {
                    regiter();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void load(){
        SharedPreferences sp = getSharedPreferences("account",MODE_PRIVATE);
        tie_account.setText(sp.getString("account",""));
        tie_password.setText(sp.getString("password",""));
    }
    private void save(){
        SharedPreferences.Editor spe = getSharedPreferences("account",MODE_PRIVATE).edit();
        spe.putString("account",tie_account.getText().toString());
        spe.putString("password",tie_password.getText().toString());
        spe.apply();
    }
    private void login() throws IOException {
        Intent intent = new Intent(LoginActivity.this, MainActivity.class);

        String acc = String.valueOf(tie_account.getText());
        String pwd = String.valueOf(tie_password.getText());
        int flag=0;
        /*OkHttpClient client = new OkHttpClient();*/
        OkHttpClient client = new OkHttpClient().newBuilder().connectTimeout(50000, TimeUnit.MILLISECONDS)
                .readTimeout(50000, TimeUnit.MILLISECONDS)
                .build();
        new Thread(new Runnable() {
            @Override
            public void run() {
                RequestBody requestBody =new FormBody.Builder().add("acc", acc).add("pwd",pwd).build();
                Request request = new Request.Builder().url("http://192.168.25.1:8080/123/login").post(requestBody).build();
                try {
                    Response response = null;
                    try {
                        response = client.newCall(request).execute();
                        if (response.body().string().equals("success")) {
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {
                                    startActivity(intent);
                                }
                            });
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } finally {
                }
            }}).start();}
    private void regiter() throws IOException {
        String acc = String.valueOf(tie_account.getText());
        String pwd = String.valueOf(tie_password.getText());
        /*OkHttpClient client = new OkHttpClient();*/
        OkHttpClient client = new OkHttpClient().newBuilder().connectTimeout(50000, TimeUnit.MILLISECONDS)
                .readTimeout(50000, TimeUnit.MILLISECONDS)
                .build();
        new Thread(new Runnable() {
            @Override
            public void run() {
                RequestBody requestBody =new FormBody.Builder().add("acc", acc).add("pwd",pwd).build();
                Request request = new Request.Builder().url("http://192.168.25.1:8080/123/signIn").post(requestBody).build();
                try {
                    Response response = client.newCall(request).execute();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }
}
