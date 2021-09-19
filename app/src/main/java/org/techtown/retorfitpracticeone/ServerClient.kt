package org.techtown.retorfitpracticeone

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServerClient {

    private const val baseUrl = "https://jsonplaceholder.typicode.com/"
    /*private var instance : Retrofit? = null

    fun getServerInterface() : ServerInterface = getInstance().create(ServerInterface::class.java)

    private fun getInstance() : Retrofit {
        if(instance == null) {
            instance = Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }
    return instance!!
    }*/
    private val retrofit: Retrofit =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    val service = retrofit.create(ServerInterface::class.java)
}