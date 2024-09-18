package model

import androidx.lifecycle.LiveData

class GastoRepository(private val gastoDao: GastoDao) {

    fun getLast12Gastos(): LiveData<List<Gasto>> {
        return gastoDao.getLast12Gastos()
    }
    /* TODO definir las siguientes queries en GastoDao
    fun insert(gasto:Gasto){
        gastoDao.insert(gasto)
    }

    fun delete(gasto:Gasto){
        gastoDao.delete(gasto)
    }
    */

}