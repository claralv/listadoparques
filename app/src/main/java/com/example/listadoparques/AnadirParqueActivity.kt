package com.example.listadoparques

import android.os.Bundle
import android.util.Log
import com.example.listadoparques.databinding.ActivityAnadirParqueBinding

class AnadirParqueActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAnadirParqueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val TAG="info"
        binding.btnGuardar.setOnClickListener {
            //Para los checkbox
            if (binding.zonamascotas.isChecked)
                Log.d(TAG," Las actvidades del parque son: ${binding.zonamascotas.text}")

            //Para el spinner:
            Log.d(TAG,"La hora de apertura es ${binding.SpinnerOpeningTime.selectedItem}")
            //val miDialogo = MiDialogFragment()
            //miDialogo.show(supportFragmentManager, "MiDialogo")

        }


    }
}