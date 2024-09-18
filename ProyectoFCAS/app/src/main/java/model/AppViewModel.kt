package model

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
/*
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
 */

class AppViewModel(application: Application): AndroidViewModel(application) {
    private val repository:GastoRepository
    val last12Gastos:LiveData<List<Gasto>>

    init{
        val gastoDao = AppDatabase.getDatabase(application).gastoDao()
        repository = GastoRepository(gastoDao)
        last12Gastos = repository.getLast12Gastos()
    }

    /* TODO implementar las funciones en el repository, después de implementar las queries en GastoDao
    fun insert(gasto:Gasto) = viewModelScope.launch {
        repository.insert(gasto)
    }

    fun delete(gasto:Gasto) = viewModelScope.launch {
        repository.delete(gasto)
    }

    fun getLast12Gastos():LiveData<List<Gasto>>{
        return repository.getLast12Gastos()
    }
     */
}