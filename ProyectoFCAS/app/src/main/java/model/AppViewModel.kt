package model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class AppViewModel(application: Application): AndroidViewModel(application) {
    private val repository:GastoRepository
    val last12Gastos:LiveData<List<Gasto>>

    init{
        val gastoDao = AppDatabase.getDatabase(application).gastoDao()
        repository = GastoRepository(gastoDao)
        last12Gastos = repository.getLast12Gastos()
    }
    val conceptosCasa = listOf("Casa", "Agua", "Electricidad", "Gas", "Telecomunicaciones", "Otros casa", "Hipoteca", "Alquiler", "Comunidad")
    val allGastosCasa = repository.getGastosByConcept(conceptosCasa)

    //Método genérico que recibe una lista de conceptos y devuelve un livedata
    fun getGastosByConcept(conceptos:List<String>){
        repository.getGastosByConcept(conceptos)
    }

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