package com.kubilayaktas.bitcoin;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import retrofit2.Retrofit;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.*;

public class MainActivity extends AppCompatActivity {
    private List<CryptoCoin> ListCoin;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.RecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ListCoin = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.coinmarketcap.com/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        coinService service = retrofit.create(coinService.class);
        Call<List<CryptoCoin>> request = service.listCoin();

        request.enqueue(new Callback<List<CryptoCoin>>() {
            @Override
            public void onResponse(Call<List<CryptoCoin>> call, Response<List<CryptoCoin>> response) {
                for(CryptoCoin c : response.body()){
                    ListCoin.add(c);
                }
            }

            @Override
            public void onFailure(Call<List<CryptoCoin>> call, Throwable t) {
                System.out.println("hata");
            }
        });

        adapter = new MyAdapter(ListCoin, this);
        recyclerView.setAdapter(adapter);
    }
}
