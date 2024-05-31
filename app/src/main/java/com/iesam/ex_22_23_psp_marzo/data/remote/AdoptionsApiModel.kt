package com.iesam.ex_22_23_psp_marzo.data.remote

import com.google.gson.annotations.SerializedName

data class AdoptionsApiModel (
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("description")val description: String,
    @SerializedName("breed") val breed: String,
    @SerializedName("sex") val sex: String,
    @SerializedName("date_born") val dateBorn: String,
    @SerializedName("size")val size:String,
    @SerializedName("url_image") val urlImage: String,
    @SerializedName("type")val type: AnimalTypeApiModel,
    @SerializedName("gallery")val gallery: List<String>,
    @SerializedName("short_description")val shortDescription: String,
    @SerializedName("url_source")val urlSource: String
)

data class AnimalTypeApiModel(
    @SerializedName("id") val id: Int,
    @SerializedName("name")val name: String
)