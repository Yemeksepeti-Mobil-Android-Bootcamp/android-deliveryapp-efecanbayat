package com.efecanbayat.deliveryapp.data.entity.restaurant

import com.google.gson.annotations.SerializedName

data class RestaurantResponse(
    @SerializedName("data")
    val data: Restaurant,
    @SerializedName("success")
    val success: Boolean
)
