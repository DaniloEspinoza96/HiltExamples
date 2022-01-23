package com.example.hiltapplication

import timber.log.Timber
import javax.inject.Inject

// @10 Y ahora agregaremos un cable, que depende de luz.
// Ahora hacemos un uso más interesante de inject, con esto le decimos a hilt cómo proporcionar la clase Cable.
// Para proporcionar cable, necesitará iniciarla con una instancia de la clase Luz. Luz ya la tenemos creada y hilt ya sabe como proveerla.
// Sin embargo aquí no la estaremos inyectando con una inyección de campo. Simplemente la estamos trayendo.
class Cable @Inject constructor(private val luz: Luz) {
    fun tengoElectricidad(): String {
        Timber.i("called")
        return "${luz.tengoLuz()}, electricidad"
    }
}