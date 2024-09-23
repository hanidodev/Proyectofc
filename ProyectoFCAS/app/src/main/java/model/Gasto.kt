package model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "gastos")
data class Gasto(
    @PrimaryKey(autoGenerate = true) val id:Long = 0,
    val cantidad:Double,
    val concepto:String,
    val fecha:Long
    )
