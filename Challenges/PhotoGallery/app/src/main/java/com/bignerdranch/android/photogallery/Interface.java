package com.bignerdranch.android.photogallery;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by ksairamesh on 5/18/17.
 */

public interface Interface {

    //This method is used for "GET"
    @GET
    Call<String> get();

}