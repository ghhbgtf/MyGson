package com.example.atlas.mygson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.alibaba.fastjson.JSON;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.atlas.mygson.com.example.atlas.mygson.bean.Book;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getData();
    }

    private void getData() {
        String stringURL = "http://api.douban.com/v2/book/1220562";
        StringRequest stringRequest = new StringRequest(
                stringURL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        System.out.println(s);
                        Log.v("test", s);
                        dealData(s);

                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError volleyError) {

                    }
                });

        Volley.newRequestQueue(this).add(stringRequest);
    }

    private void dealData(String result) {
//        Gson gson = new Gson();
//        Book book = gson.fromJson(result, Book.class);
//        Log.v("show something", book.getTitle() + "\n" + book.getPublisher() + "\n" + book.getSummary() + "\n" + book.getTags().size());
        Book book = JSON.parseObject(result, Book.class);
        Log.v("show something", book.getTitle() + "\n" + book.getPublisher() + "\n" + book.getSummary() + "\n" );

    }
}
