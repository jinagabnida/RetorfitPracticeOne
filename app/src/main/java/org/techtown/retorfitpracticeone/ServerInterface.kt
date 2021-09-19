package org.techtown.retorfitpracticeone

import android.telecom.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ServerInterface {
    @GET("/posts/{id}")
    fun getPosts(@Path("id") id : String) : retrofit2.Call<PostModel>
}