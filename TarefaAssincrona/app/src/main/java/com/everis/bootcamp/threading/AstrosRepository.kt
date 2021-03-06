package com.everis.bootcamp.threading

import com.google.gson.Gson
import com.google.gson.JsonArray
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.ResponseBody

class AstrosRepository {
    fun loadData() : List<AstrosPeople>? {
        val client = OkHttpClient()
        val request = Request.Builder()
            .url("http://api.open-notify.org/astros.json")
            .build()
        val response = client.newCall(request).execute()
        val result = parseJsonToResult(response.body.toString())
        return result.people
    }

    fun parseJsonToResult(json: String?) = Gson().fromJson(json, AstrosResult::class.java)

}