package com.example.hiltapplication

import timber.log.Timber
import javax.inject.Inject

// @7 Creaermos una clase mock llamada ordenador para generar una serie de dependencias y cómo agregarlas.

// Con @Inject antes del constructor le decimos a hilt cómo proveer la clase Ordenador cuando sea solicitada.
//class Ordenador @Inject constructor() {
//    fun tengoOrdenador(): String {
//        Timber.i("tengoOrdenador called")
//        return "Tengo una clase Ordenador"
//    }
//}
// @11 ahora cambian las cosas un poco, ya que usamos ordenador, que depende de cable y este otro depende de luz, simplementa cambiamos el constructor
class Ordenador @Inject constructor(private val cable: Cable) {
    fun tengoOrdenador(): String {
        Timber.i("called")
        return "${cable.tengoElectricidad()} y mi ordenador funciona"
    }
}