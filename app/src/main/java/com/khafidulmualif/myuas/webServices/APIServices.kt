package com.khafidulmualif.myuas.webServices

import com.khafidulmualif.myuas.models.User
import com.khafidulmualif.myuas.response.WrappedResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface APIServices {

    @FormUrlEncoded
    @POST("")
    fun login (
        @Field("") username : String,
        @Field("") password : String
    ):Call<WrappedResponse<User>>

    @FormUrlEncoded
    @POST("")
    fun register (
        @Field("") name : String,
        @Field("") username : String,
        @Field("") password : String
    ):Call<WrappedResponse<User>>


}