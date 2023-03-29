package com.example.artbooktesting.model

import com.google.gson.annotations.SerializedName

data class ImageResult(
    val comments : Int,
    val downloads : Int,
    val favorites : Int,
    val id : Int,
    val imageHeight : Int,
    val imageSize : Int,
    val imageWidth : Int,
    val largeImageURL : String,
    val likes : Int,
    val pageUrl : String,
    val previewHeight : Int,
    val previewURL : String,
    val previewWidth : Int,
    val tags : Int,
    val type : Int,
    val user : String,
    @SerializedName("user_id")
    val userId : Int,
    val userImageURL : String,
    val views : Int,
    val webFormatHeight : Int,
    val webFormatURL : String,
    val webFormatWidth : Int
)
