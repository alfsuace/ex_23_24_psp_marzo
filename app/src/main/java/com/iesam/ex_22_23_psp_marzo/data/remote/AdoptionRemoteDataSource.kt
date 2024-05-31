package com.iesam.ex_22_23_psp_marzo.data.remote

import com.iesam.ex_22_23_psp_marzo.domain.Animal
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class AdoptionRemoteDataSource {

    /**
     * Ejercicio 1.
     */
    private val api = Retrofit.Builder().baseUrl("https://huellas.sitehub.es/api/v1/").addConverterFactory(
        GsonConverterFactory.create()).build()
        .create(ApiResponse::class.java)
    suspend fun getAdoptions(): List<Animal> {
        return api.getAdoptions().body()!!.map {
            it.toModel()
        }
    }

}