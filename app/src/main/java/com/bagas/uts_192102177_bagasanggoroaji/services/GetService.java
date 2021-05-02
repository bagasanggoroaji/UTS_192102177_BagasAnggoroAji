package com.bagas.uts_192102177_bagasanggoroaji.services;

import com.bagas.uts_192102177_bagasanggoroaji.module.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetService {
    @GET("/users")
    Call<List<User>> getUsersList();
}
