package model

import androidx.lifecycle.LiveData

class GastoRepository(private val gastoDao: GastoDao) {

    //private val conceptosCasa = listOf("Casa", "Agua", "Electricidad", "Gas", "Telecomunicaciones", "Otros casa", "Hipoteca", "Alquiler", "Comunidad")

    fun getLast12Gastos(): LiveData<List<Gasto>> {
        return gastoDao.getLast12Gastos()
    }

    fun getGastosByConcept(conceptos:List<String>):LiveData<List<Gasto>>{
        return gastoDao.getGastosByConcept(conceptos)
    }

    suspend fun insertGasto(gasto:Gasto){
        gastoDao.insertGasto(gasto)
    }

    suspend fun deleteGasto(gasto:Gasto){
        gastoDao.deleteGasto(gasto)
    }

    suspend fun deleteAll(){
        gastoDao.deleteAll()
    }

}