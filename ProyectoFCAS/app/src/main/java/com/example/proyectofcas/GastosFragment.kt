package com.example.proyectofcas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.proyectofcas.databinding.FragmentGastosBinding


class GastosFragment : Fragment() {

    //viewBinding
    private var _bindingGastos:FragmentGastosBinding? = null
    private val bindingGastos:FragmentGastosBinding
        get() = _bindingGastos!!

    override fun onDestroyView() {
        super.onDestroyView()
        _bindingGastos = null
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        //val rootView = inflater.inflate(R.layout.fragment_gastos, container, false)
        _bindingGastos = FragmentGastosBinding.inflate(inflater, container, false)
        val rootview = bindingGastos.root

        // Referencias a los elementos del layout
        //rootView.findViewById<LinearLayout>(R.id.primaryMenuContainer)
        val menuCasa = bindingGastos.menuCasa
        val vistaCasa = bindingGastos.vistaCasa
        //Sumenú de casa
            val menuSuministros = bindingGastos.menuCasaSuministros
            val vistaSuministros = bindingGastos.vistaCasaSuministros
        val menuCompras = bindingGastos.menuCompras
        val vistaCompras = bindingGastos.vistaCompras
        val menuVehiculo = bindingGastos.menuVehiculo
        val vistaVehiculo = bindingGastos.vistaVehiculo
        val menuSeguros = bindingGastos.menuSeguros
        val vistaSeguros = bindingGastos.vistaSeguros
        val menuOcio = bindingGastos.menuOcio
        val vistaOcio = bindingGastos.vistaOcio
        val menuSalud = bindingGastos.menuSalud
        val vistaSalud = bindingGastos.vistaSalud
        val menuEducacion = bindingGastos.menuEducacion
        val vistaEducacion = bindingGastos.vistaEducacion
        val menuSuscripciones = bindingGastos.menuSuscripciones
        val vistaSuscripciones = bindingGastos.vistaSuscripciones
        //vistaCasa, vistaSuministros, vistaCompras, vistaVehiculo, vistaSeguros, vistaOcio, vistaSalud, vistaEducacion, vistaSuscripciones

        // Función para alternar la visibilidad de los menús
        fun toggleSubMenu(clickedSubMenu: LinearLayout, vararg otherSubMenus: LinearLayout) {
            // Si el submenú seleccionado está oculto, mostrarlo
            if (clickedSubMenu.visibility == View.GONE) {
                clickedSubMenu.visibility = View.VISIBLE

                // Ocultar todos los otros submenús
                otherSubMenus.forEach { it.visibility = View.GONE }
            } else {
                // Si el submenú seleccionado ya está visible, ocultarlo
                clickedSubMenu.visibility = View.GONE
            }
        }

        // Configuración de los listeners para los elementos del primer nivel
        menuCasa.setOnClickListener {
            toggleSubMenu(vistaCasa, vistaSuministros, vistaCompras, vistaVehiculo, vistaSeguros, vistaOcio, vistaSalud, vistaEducacion, vistaSuscripciones)
            //view.findNavController().navigate(R.id.action_welcomeFragment_to_principalFragment) )
        }

        menuCasa.setOnLongClickListener{
            rootview.findNavController().navigate(R.id.action_gastosFragment_to_gastos1nivelFragment)

            true
        }

        menuSuministros.setOnClickListener {
            toggleSubMenu(vistaSuministros, vistaCompras, vistaVehiculo, vistaSeguros, vistaOcio, vistaSalud, vistaEducacion, vistaSuscripciones)
        }

        menuCompras.setOnClickListener {
            toggleSubMenu(vistaCompras, vistaCasa, vistaSuministros, vistaVehiculo, vistaSeguros, vistaOcio, vistaSalud, vistaEducacion, vistaSuscripciones)
        }

        menuVehiculo.setOnClickListener {
            toggleSubMenu(vistaVehiculo, vistaCasa, vistaSuministros, vistaCompras, vistaSeguros, vistaOcio, vistaSalud, vistaEducacion, vistaSuscripciones)
        }

        menuSeguros.setOnClickListener {
            toggleSubMenu(vistaSeguros, vistaCasa, vistaSuministros, vistaCompras, vistaVehiculo, vistaOcio, vistaSalud, vistaEducacion, vistaSuscripciones)
        }

        menuOcio.setOnClickListener {
            toggleSubMenu(vistaOcio, vistaCasa, vistaSuministros, vistaCompras, vistaVehiculo, vistaSeguros, vistaSalud, vistaEducacion, vistaSuscripciones)
        }

        menuSalud.setOnClickListener {
            toggleSubMenu(vistaSalud, vistaCasa, vistaSuministros, vistaCompras, vistaVehiculo, vistaSeguros, vistaOcio, vistaEducacion, vistaSuscripciones)
        }

        menuEducacion.setOnClickListener {
            toggleSubMenu(vistaEducacion, vistaCasa, vistaSuministros, vistaCompras, vistaVehiculo, vistaSeguros, vistaOcio, vistaSalud, vistaSuscripciones)
        }

        menuSuscripciones.setOnClickListener {
            toggleSubMenu(vistaSuscripciones, vistaCasa, vistaSuministros, vistaCompras, vistaVehiculo, vistaSeguros, vistaOcio, vistaSalud, vistaEducacion)
        }

        return rootview
    }

}