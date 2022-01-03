package com.example.uas_musik.retrofit;

import com.example.uas_musik.model.TokenResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiEndPoint {
    @POST("login")
    @FormUrlEncoded
    Call<TokenResponse> login(@Field("email") String email, @Field("password") String password);

}
