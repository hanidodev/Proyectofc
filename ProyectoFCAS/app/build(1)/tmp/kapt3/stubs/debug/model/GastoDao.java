package model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t0\bH\'J\u0019\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lmodel/GastoDao;", "", "deleteGasto", "", "gasto", "Lmodel/Gasto;", "(Lmodel/Gasto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLast12Gastos", "Landroidx/lifecycle/LiveData;", "", "insertGasto", "app_debug"})
@androidx.room.Dao
public abstract interface GastoDao {
    
    @androidx.room.Query(value = "SELECT * FROM gastos ORDER BY fecha DESC LIMIT 12")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getLast12Gastos();
    
    @androidx.room.Insert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object insertGasto(@org.jetbrains.annotations.NotNull
    model.Gasto gasto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteGasto(@org.jetbrains.annotations.NotNull
    model.Gasto gasto, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}