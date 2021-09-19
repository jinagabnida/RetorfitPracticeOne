package org.techtown.retorfitpracticeone

import com.google.gson.annotations.SerializedName

data class PostModel(
    @SerializedName("userId")
    val USERID : Int,
    val id : Int,
    val title : String,
    val body : String
)
