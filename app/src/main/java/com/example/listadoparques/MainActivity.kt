package com.example.listadoparques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadoparques.adapter.ParqueAdapter
import com.example.listadoparques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager= LinearLayoutManager(this)
        binding.recycler.adapter=ParqueAdapter(ParqueProvider.listaparque)

    }
}