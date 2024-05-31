package com.iesam.ex_22_23_psp_marzo.data.remote

import com.iesam.ex_22_23_psp_marzo.domain.Animal
import com.iesam.ex_22_23_psp_marzo.domain.AnimalType

fun AdoptionsApiModel.toModel():Animal{
    return Animal(
        this.id,
        this.name,
        this.description,
        this.breed,
        this.sex,
        this.dateBorn,
        this.size,
        this.urlImage,
        this.type.toModel(),
        this.gallery,
        this.shortDescription,
        this.urlSource
    )
}

fun AnimalTypeApiModel.toModel(): AnimalType{
    return AnimalType(
        this.id,
        this.name
    )
}