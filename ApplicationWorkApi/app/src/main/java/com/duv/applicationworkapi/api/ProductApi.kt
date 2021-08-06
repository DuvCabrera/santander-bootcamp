package com.duv.applicationworkapi.api

import android.telecom.Call
import com.duv.applicationworkapi.model.Product
import retrofit2.http.GET

interface ProductApi {
    @GET("getdata.php")
    fun getProductApi(): Call<List<Product>>
}