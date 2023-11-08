package com.example.listadoparques.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.listadoparques.Parque
import com.example.listadoparques.ParqueProvider.Companion.listaparque
import com.example.listadoparques.R

class ParqueAdapter(private var listaparque:List<Parque>):RecyclerView.Adapter<ParqueViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParqueViewHolder {
        val layout=LayoutInflater
            .from(parent.context)
            .inflate(R.layout.parque_card,parent,false)
        return ParqueViewHolder(layout)
    }

    override fun onBindViewHolder(holder: ParqueViewHolder, position: Int) {
        val item= listaparque[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return listaparque.size
         }

    fun actualizarParques(listaparque: List<Parque>) {
        this.listaparque = listaparque
        notifyDataSetChanged()
    }
}

