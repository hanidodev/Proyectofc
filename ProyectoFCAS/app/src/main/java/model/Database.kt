package model

import ConverterLong
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.Database
import androidx.room.TypeConverters
import android.content.Context

@Database(entities = [Gasto::class], version = 1)
@TypeConverters(ConverterLong::class)
abstract class AppDatabase:RoomDatabase() {
    abstract fun gastoDao():GastoDao

    companion object{
        @Volatile
        private var INSTANCE:AppDatabase? = null

        fun getDatabase(context:Context):AppDatabase{
            return INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}