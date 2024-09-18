import androidx.room.TypeConverter
import java.util.Date


class ConverterLong {
    @TypeConverter
    fun timestampToDate(timestamp:Long?): Date?{
        return timestamp?.let{Date(it)}
    }

    @TypeConverter
    fun dateToTimestamp(date:Date?):Long?{
        return date?.time
    }
}