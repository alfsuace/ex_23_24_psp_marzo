package com.iesam.ex_22_23_psp_marzo.data.remote

import retrofit2.Response
import retrofit2.http.GET

interface ApiResponse {
    @GET("adoptions.json")
    suspend fun getAdoptions(): Response<List<AdoptionsApiModel>>
}