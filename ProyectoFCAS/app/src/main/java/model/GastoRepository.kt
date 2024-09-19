package model

import androidx.lifecycle.LiveData

class GastoRepository(private val gastoDao: GastoDao) {

    fun getLast12Gastos(): LiveData<List<Gasto>> {
        return gastoDao.getLast12Gastos()
    }

    suspend fun insertGasto(gasto:Gasto){
        gastoDao.insertGasto(gasto)
    }

    suspend fun deleteGasto(gasto:Gasto){
        gastoDao.deleteGasto(gasto)
    }

}