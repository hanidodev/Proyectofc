package model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AppViewModel(application: Application): AndroidViewModel(application) {

    var mostrarGastos: String = ""

    private val repository:GastoRepository
    val last12Gastos:LiveData<List<Gasto>>

    init{
        val gastoDao = AppDatabase.getDatabase(application).gastoDao()
        repository = GastoRepository(gastoDao)
        last12Gastos = repository.getLast12Gastos()
    }
    val conceptosCasa = listOf("Casa", "Agua", "Electricidad", "Gas", "Telecomunicaciones", "Otros Casa", "Hipoteca", "Alquiler", "Comunidad")
    val conceptosSuministros = listOf("Agua", "Electricidad", "Gas", "Telecomunicaciones")
    val conceptosCompras = listOf("Supermercado", "Ropa y complementos", "Otros Compras")
    val conceptosVehiculo = listOf("Combustible", "Mantenimiento de vehículo", "Otros Vehículos")
    val conceptosSeguros = listOf("Seguro de coche", "Seguro de casa", "seguro de vida", "Otros Seguros")
    val conceptosOcio = listOf("Restauración", "Eventos", "Otros Ocio")
    val conceptosSalud = listOf("Médico", "Farmacia", "Otros Salud")
    val conceptosEducacion = listOf("Colegio", "Cursos", "Otros Educación")
    val conceptosSuscripciones = listOf("Suscripción mensual", "Suscripción anual", "Otros Suscripciones")

    val allGastosCasa = repository.getGastosByConcept(conceptosCasa)
    val allGastosSuministros = repository.getGastosByConcept(conceptosSuministros)
    val allGastosCompras = repository.getGastosByConcept(conceptosCompras)
    val allGastosVehiculo = repository.getGastosByConcept(conceptosVehiculo)
    val allGastosSeguros = repository.getGastosByConcept(conceptosSeguros)
    val allGastosOcio = repository.getGastosByConcept(conceptosOcio)
    val allGastosSalud = repository.getGastosByConcept(conceptosSalud)
    val allGastosEducacion = repository.getGastosByConcept(conceptosEducacion)
    val allGastosSuscripciones = repository.getGastosByConcept(conceptosSuscripciones)

    fun insertGasto(gasto:Gasto) = viewModelScope.launch {
        repository.insertGasto(gasto)
    }

    fun deleteGasto(gasto:Gasto) = viewModelScope.launch {
        repository.deleteGasto(gasto)
    }

    fun deleteAll(){
        viewModelScope.launch {
            repository.deleteAll()
        }
    }

}