package com.example.hiltapplication

import timber.log.Timber
import javax.inject.Inject


// @9 Complejicemos un poco más el ejemplo. Agregaremos esta clase Luz que no depende de nadie (constructor vacío)
//como dijimos, inject dice a hilt cómo proporcionar esta clase.
class Luz @Inject constructor() {
    fun tengoLuz(): String {
        Timber.i("called")
        return "Tengo Luz"
    }
}