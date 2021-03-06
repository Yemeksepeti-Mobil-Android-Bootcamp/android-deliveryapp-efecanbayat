package com.efecanbayat.deliveryapp.ui.restaurantdetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.efecanbayat.deliveryapp.data.ApiRepository
import com.efecanbayat.deliveryapp.data.entity.foodadd.FoodAddRequest
import com.efecanbayat.deliveryapp.data.entity.foodadd.FoodAddResponse
import com.efecanbayat.deliveryapp.data.entity.profile.UserResponse
import com.efecanbayat.deliveryapp.data.entity.restaurant.RestaurantResponse
import com.efecanbayat.deliveryapp.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RestaurantDetailViewModel @Inject constructor(
    var savedStateHandle: SavedStateHandle,
    private var apiRepository: ApiRepository
): ViewModel() {

    fun getRestaurantDetail(restaurantId: String): LiveData<Resource<RestaurantResponse>> {
        return apiRepository.getRestaurantById(restaurantId)
    }

    fun addFood(restaurantId: String,request: FoodAddRequest): LiveData<Resource<FoodAddResponse>> {
        return apiRepository.addFood(restaurantId,request)
    }

    fun getUser(): LiveData<Resource<UserResponse>> {
        return apiRepository.getUser()
    }
}