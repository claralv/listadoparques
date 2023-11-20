package com.example.listadoparques.adapter

import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.listadoparques.Parque
import com.example.listadoparques.databinding.ParqueCardBinding

class ParqueViewHolder(view: View):RecyclerView.ViewHolder(view) {
    val binding= ParqueCardBinding.bind(view)
    fun render(ModeloParque:Parque) {
        binding.nombreParque.text=ModeloParque.nombre
        binding.descripcionParque.text=ModeloParque.descripcion
        Glide.with(binding.imagenParque.context).load(ModeloParque.imagen).into(binding.imagenParque)

    }
}