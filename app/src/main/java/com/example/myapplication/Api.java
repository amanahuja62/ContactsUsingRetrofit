package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;


public interface Api {

    String BASE_URL = "https://api.androidhive.info/";

    @GET("contacts")
    Call<People> getPeople();

}
