package com.example.proyectofcas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment


class GastosFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_gastos, container, false)

        // Referencias a los elementos del layout
        rootView.findViewById<LinearLayout>(R.id.primaryMenuContainer)
        val menuCasa = rootView.findViewById<TextView>(R.id.menuCasa)
        val vistaCasa = rootView.findViewById<LinearLayout>(R.id.vistaCasa)
        //Sumenú de casa
            val menuSuministros = rootView.findViewById<TextView>(R.id.menuCasaSuministros)
            val vistaSuministros = rootView.findViewById<LinearLayout>(R.id.vistaCasaSuministros)
        val menuCompras = rootView.findViewById<TextView>(R.id.menuCompras)
        val vistaCompras = rootView.findViewById<LinearLayout>(R.id.vistaCompras)
        val menuVehiculo = rootView.findViewById<TextView>(R.id.menuVehiculo)
        val vistaVehiculo = rootView.findViewById<LinearLayout>(R.id.vistaVehiculo)
        val menuSeguros = rootView.findViewById<TextView>(R.id.menuSeguros)
        val vistaSeguros = rootView.findViewById<LinearLayout>(R.id.vistaSeguros)
        val menuOcio = rootView.findViewById<TextView>(R.id.menuOcio)
        val vistaOcio = rootView.findViewById<LinearLayout>(R.id.vistaOcio)
        val menuSalud = rootView.findViewById<TextView>(R.id.menuSalud)
        val vistaSalud = rootView.findViewById<LinearLayout>(R.id.vistaSalud)
        val menuEducacion = rootView.findViewById<TextView>(R.id.menuEducacion)
        val vistaEducacion = rootView.findViewById<LinearLayout>(R.id.vistaEducacion)
        val menuSuscripciones = rootView.findViewById<TextView>(R.id.menuSuscripciones)
        val vistaSuscripciones = rootView.findViewById<LinearLayout>(R.id.vistaSuscripciones)
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

        return rootView
    }

}