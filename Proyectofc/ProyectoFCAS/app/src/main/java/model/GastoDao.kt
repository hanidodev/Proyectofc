package model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface GastoDao {

    @Query("SELECT * FROM gastos ORDER BY fecha DESC LIMIT 12")
    fun getLast12Gastos(): LiveData<List<Gasto>>

    @Query("SELECT * FROM gastos WHERE concepto IN (:conceptos) ORDER BY fecha DESC LIMIT 12")
    fun getGastosByConcept(conceptos:List<String>):LiveData<List<Gasto>>

    @Insert
    suspend fun insertGasto(gasto:Gasto)

    @Delete
    suspend fun deleteGasto(gasto:Gasto)

    @Query("DELETE FROM gastos")
    suspend fun deleteAll()

}