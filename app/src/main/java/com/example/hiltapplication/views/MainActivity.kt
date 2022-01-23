package com.example.hiltapplication.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltapplication.Ordenador
import com.example.hiltapplication.R
import dagger.hilt.android.AndroidEntryPoint
import timber.log.Timber
import javax.inject.Inject

// @6 con @AndroidEntryPoint definimos que esta clase será un componente de Hilt,
// es importante saber que si queremos que un fragment sea un entrypoint deberemos anotar su activity como entry point.
// Esto porque el fragment depende de su activity.
// con AndroidEntryPoint decimos que esta activity recibe dependencias externas, sólo puede recibir dependencias de sus respectivos parents.
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
//     @8 Y luego de eso ya agregaremos una inyección de campo, con esto solicitamos a hilt una instancia de ordenador.
// @12 es interesante ver cómo ordenador se llama de la misma forma, ahora ordenador depende de cable, el cual depende de luz.
// sin embargo el método de llamado no ha cambiado. Aquí es donde brilla Hilt. Iniciamos una dependencia que tiene una alta jerarquía de dependencias
// (mentira es pequeña, pero imagina que es grande), de una manera resumida
    @Inject lateinit var ordenador: Ordenador

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.i(ordenador.tengoOrdenador())
    }
}