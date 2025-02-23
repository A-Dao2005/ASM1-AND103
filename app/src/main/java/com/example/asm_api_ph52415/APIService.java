package com.example.asm_api_ph52415;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface APIService {
    String DOMAIN = "http://192.168.1.9:3000/";
    @GET("/api/list")
    Call<List<CarModel>> getCars();
    @POST("/api/create")
    Call<List<CarModel>> createCars(@Body CarModel xe);
    @DELETE("/api/delete/{id}")
    Call<List<CarModel>> delete(@Path("id") String id);
    @PUT("/api/update")
    Call<List<CarModel>> update(@Path("id") CarModel car);

}
