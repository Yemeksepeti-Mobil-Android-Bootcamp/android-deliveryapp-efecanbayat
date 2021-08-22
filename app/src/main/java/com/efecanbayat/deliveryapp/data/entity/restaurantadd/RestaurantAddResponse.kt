package com.efecanbayat.deliveryapp.data.entity.restaurantadd

import com.google.gson.annotations.SerializedName

data class RestaurantAddResponse(
    @SerializedName("message")
    val message: Message,
    @SerializedName("success")
    val success: Boolean
)
