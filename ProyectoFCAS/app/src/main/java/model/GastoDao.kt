package model

import androidx.lifecycle.LiveData
import androidx.room.Dao
//import androidx.room.Insert
import androidx.room.Query

@Dao
interface GastoDao {
    @Query("SELECT * FROM gastos ORDER BY fecha DESC LIMIT 12")
    fun getLast12Gastos(): LiveData<List<Gasto>>

    /*
    @Insert
    suspend fun insertGasto(gasto:Gasto)
     */
}