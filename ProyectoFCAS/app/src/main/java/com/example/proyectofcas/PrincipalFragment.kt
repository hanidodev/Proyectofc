package com.example.proyectofcas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class PrincipalFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_principal, container, false)

        val buttonStart = view.findViewById<Button>(R.id.button_gastos)

        buttonStart.setOnClickListener{
            view.findNavController().navigate(R.id.action_principalFragment_to_gastosFragment)
        }

        val buttonAddGasto = view.findViewById<Button>(R.id.button_add_gasto)

        return view
    }

}