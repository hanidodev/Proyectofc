package com.example.proyectofcas

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import model.AppViewModel
import model.Gasto

private lateinit var appViewModel:AppViewModel
private lateinit var adapter:GastoAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.fragment_container_view)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //inicializa el reciclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        adapter = GastoAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

        //inicializa el viewModel con ViewModelProvider que permite compartirlo entre los distintos fragmentos
        appViewModel = ViewModelProvider(this).get(AppViewModel::class.java)

        //observación de la base de datos
        appViewModel.last12Gastos.observe(this, Observer {gastos -> gastos?.let{
            adapter.submitList(it)
        }
            //actualiza la UI con los registros (se pueden pasar al fragment correspondiente)
        })

    }
}