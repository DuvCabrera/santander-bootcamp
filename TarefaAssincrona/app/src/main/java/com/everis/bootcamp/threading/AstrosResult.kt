package com.everis.bootcamp.threading

import com.google.gson.annotations.SerializedName

data class AstrosResult(
    @SerializedName("number") val number:Int,
    @SerializedName("message") val message: String,
    @SerializedName("people") val people: List<AstrosPeople>
)