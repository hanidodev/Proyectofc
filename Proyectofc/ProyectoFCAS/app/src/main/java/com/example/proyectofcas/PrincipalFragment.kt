package com.example.proyectofcas

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import com.example.proyectofcas.databinding.FragmentPrincipalBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import model.AppDatabase
import model.GastoDao

class PrincipalFragment : Fragment() {

    private val pruebas:String = ""

    private var _bindingPrincipal:FragmentPrincipalBinding? = null
    private val bindingPrincipal:FragmentPrincipalBinding
        get() = _bindingPrincipal!!

    override fun onDestroyView() {
        super.onDestroyView()
        _bindingPrincipal = null
    }

    private lateinit var gastoDao: GastoDao

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _bindingPrincipal = FragmentPrincipalBinding.inflate(inflater, container, false)
        val view = bindingPrincipal.root

        //obtenemos la base de datos
        val db = AppDatabase.getDatabase(requireContext())
        gastoDao = db.gastoDao()

        val buttonStart = view.findViewById<Button>(R.id.button_gastos)

        buttonStart.setOnClickListener{
            view.findNavController().navigate(R.id.action_principalFragment_to_gastosFragment)
        }

        val buttonAddGasto = view.findViewById<Button>(R.id.button_add_gasto)

        buttonAddGasto.setOnClickListener{
            view.findNavController().navigate(R.id.action_principalFragment_to_addGastoFragment)
        }

        //borrado de todos los registros de la tabla gastos en la base de datos
        val buttonBorrar = bindingPrincipal.buttonBorrar
        buttonBorrar.setOnClickListener{
            CoroutineScope(Dispatchers.IO).launch {
                try {
                    gastoDao.deleteAll()
                    // Verificar si la inserción fue exitosa
                    CoroutineScope(Dispatchers.Main).launch {
                        Toast.makeText(requireContext(), "BD borrada con éxito", Toast.LENGTH_SHORT).show()
                    }
                } catch (e: Exception) {
                    // Manejar la excepción y mostrar un mensaje en el hilo principal
                    CoroutineScope(Dispatchers.Main).launch {
                        Toast.makeText(requireContext(), "Error al borrar la BD: ${e.message}", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }

        return view
    }

}