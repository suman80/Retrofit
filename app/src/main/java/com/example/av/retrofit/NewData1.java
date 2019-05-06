package com.example.av.retrofit;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface NewData1 {
    public static String BASE_URL1 = "https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>> getHeroes();
}
