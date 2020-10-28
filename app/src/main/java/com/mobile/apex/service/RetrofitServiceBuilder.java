package com.mobile.apex.service;

import org.jetbrains.annotations.NotNull;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class RetrofitServiceBuilder {
    public static final String BASE_URL = "https://questions.aloc.ng/api/";

    private static final Retrofit.Builder builder
            = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create());


    private static final Retrofit retrofit = builder.build();

    public static <T>T buildService(@NotNull Class <T> service){
        return retrofit.create(service);
    }
}