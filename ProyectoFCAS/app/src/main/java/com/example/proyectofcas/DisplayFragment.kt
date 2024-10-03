package com.example.proyectofcas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.proyectofcas.databinding.FragmentDisplayBinding
import model.AppViewModel

class DisplayFragment : Fragment() {

    private var _bindingDisplay:FragmentDisplayBinding? = null
    private val bindingDisplay:FragmentDisplayBinding
        get() = _bindingDisplay!!

    override fun onDestroyView() {
        super.onDestroyView()
        _bindingDisplay = null
    }

    private lateinit var appViewModel:AppViewModel
    private lateinit var adapter:GastoAdapter
    private lateinit var recyclerView:RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_display, container, false)
        _bindingDisplay = FragmentDisplayBinding.inflate(inflater, container, false)
        val view = bindingDisplay.root

        //inicializar el viewModel compartido en el activity
        appViewModel = ViewModelProvider(requireActivity())[AppViewModel::class.java]

        //configuración del reciclerView
        recyclerView = bindingDisplay.recyclerView
        adapter = GastoAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        //observar los gastos a mostrar (12 últimos)
        appViewModel.allGastosCasa.observe(viewLifecycleOwner) { gastos ->
            gastos?.let {
                //actualiza los datos en el reciclerView
                adapter.submitList(it)
            }
        }

        return view
    }

}