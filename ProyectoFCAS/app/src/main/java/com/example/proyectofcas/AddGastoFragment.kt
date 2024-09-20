package com.example.proyectofcas

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import com.example.proyectofcas.databinding.FragmentAddGastoBinding
import java.time.LocalDate
import java.time.ZoneId
import android.view.View as View

class AddGastoFragment : Fragment() {

    private var _bindingAddGasto:FragmentAddGastoBinding? = null
    private val bindingAddGasto:FragmentAddGastoBinding
        get() = _bindingAddGasto!!

    override fun onDestroyView() {
        super.onDestroyView()
        _bindingAddGasto = null
    }

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //val view = inflater.inflate(R.layout.fragment_add_gasto, container, false)
        _bindingAddGasto = FragmentAddGastoBinding.inflate(inflater, container, false)
        val view = bindingAddGasto.root

        val fechaDia = bindingAddGasto.addGastoDatePicker.dayOfMonth
        val fechaMes = bindingAddGasto.addGastoDatePicker.month
        val fechaAno = bindingAddGasto.addGastoDatePicker.year
        val fechaCompleta = LocalDate.of(fechaAno, fechaMes, fechaDia)
        val fechaGasto = fechaCompleta.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()

        val conceptoGasto = bindingAddGasto.spinnerAddGasto.selectedItem
        val cantidadGasto = bindingAddGasto.addGastoCantidad.text




        return view
    }

}