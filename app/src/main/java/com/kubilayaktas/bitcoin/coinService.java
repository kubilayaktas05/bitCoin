package com.kubilayaktas.bitcoin;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

/**
 * Created by MSI on 24.07.2018 at 10:29.
 */
public interface coinService {
    @GET("users/{user}/repos")
    Call<List<CryptoCoin>> listCoin();
}
