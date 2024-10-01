package com.example.proyectofcas

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.lifecycle.lifecycleScope
import com.example.proyectofcas.databinding.FragmentAddGastoBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import model.AppDatabase
import model.Gasto
import model.GastoDao
import java.time.LocalDate
import java.time.ZoneId
import android.view.View as View

class AddGastoFragment : Fragment() {

    private var _bindingAddGasto:FragmentAddGastoBinding? = null
    private val bindingAddGasto:FragmentAddGastoBinding
        get() = _bindingAddGasto!!

    private lateinit var gastoDao:GastoDao

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
        _bindingAddGasto = FragmentAddGastoBinding.inflate(inflater, container, false)
        val view = bindingAddGasto.root

        //referencia al datePicker
        val datePk = bindingAddGasto.addGastoDatePicker
        //guardamos fecha actual para posteriores reinicios
        val actualDay = datePk.dayOfMonth
        val actualMonth = datePk.month
        val actualYear = datePk.year

        //declaracion de los spinners de concepto
        val spinnerConcepto = bindingAddGasto.spinnerAddGasto
        val spinnerOtrosGastos = bindingAddGasto.spinnerAddGastoOtros

        //evento para activar/desactivar el segundo spinner dependiendo de valor escogido del primero
        spinnerConcepto.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View?, position: Int, id: Long) {
                val selectedItem = parent.getItemAtPosition(position).toString()

                // Activar o desactivar el SpinnerOtrosGastos según el valor seleccionado
                if (selectedItem == "Otros gastos") {
                    spinnerOtrosGastos.isEnabled = true
                } else {
                    spinnerOtrosGastos.isEnabled = false
                }
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Deshabilitar el Spinner B si no hay selección
                spinnerOtrosGastos.isEnabled = false
            }
        }

        //obtenemos la base de datos
        val db = AppDatabase.getDatabase(requireContext())
        gastoDao = db.gastoDao()

            bindingAddGasto.buttonAddInsert.setOnClickListener {

                //referencia al textView de la cantidad
                val cantidadGasto = bindingAddGasto.addGastoCantidad
                val cantidad = cantidadGasto.text.toString().toDoubleOrNull() ?: 0.0

                val conceptoAsignado = spinnerConcepto.selectedItem.toString()
                if(conceptoAsignado == "Seleccionar concepto"){
                    Toast.makeText(requireContext(), "Por favor, selecciona un concepto de la lista", Toast.LENGTH_SHORT).show()
                }else{
                    if(cantidad <= 0){
                        Toast.makeText(requireContext(), "La cantidad ha de ser mayor de 0", Toast.LENGTH_SHORT).show()
                    }else{

                        val fechaDia = bindingAddGasto.addGastoDatePicker.dayOfMonth
                        val fechaMes = bindingAddGasto.addGastoDatePicker.month + 1
                        val fechaAno = bindingAddGasto.addGastoDatePicker.year
                        val fechaCompleta = LocalDate.of(fechaAno, fechaMes, fechaDia)
                        val fechaGasto = fechaCompleta.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli()

                        val conceptoGasto: String
                        if (spinnerOtrosGastos.isEnabled) conceptoGasto =
                            spinnerOtrosGastos.selectedItem.toString() else conceptoGasto =
                            spinnerConcepto.selectedItem.toString()

                        val gastoInsert = Gasto(concepto = conceptoGasto, cantidad = cantidad, fecha = fechaGasto)

                        viewLifecycleOwner.lifecycleScope.launch(Dispatchers.IO) {
                            try {
                                gastoDao.insertGasto(gastoInsert)
                                // Verificar si la inserción fue exitosa
                                CoroutineScope(Dispatchers.Main).launch {

                                    Toast.makeText(requireContext(), "Gasto insertado con éxito", Toast.LENGTH_SHORT).show()

                                    spinnerConcepto.setSelection(0)
                                    spinnerOtrosGastos.setSelection(0)
                                    bindingAddGasto.addGastoDatePicker.updateDate(actualYear, actualMonth, actualDay)
                                    bindingAddGasto.addGastoCantidad.setText("0.0")
                                }
                            } catch (e: Exception) {
                                // Manejar la excepción y mostrar un mensaje en el hilo principal
                                CoroutineScope(Dispatchers.Main).launch {
                                    Toast.makeText(requireContext(), "Error al insertar el gasto: ${e.message}", Toast.LENGTH_LONG).show()
                                }
                            }
                        }
                    }
                }
            }
        return view
    }
}