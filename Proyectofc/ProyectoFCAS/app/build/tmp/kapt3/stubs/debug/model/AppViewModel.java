package model;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\bJ\u000e\u0010=\u001a\u00020;2\u0006\u0010<\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\nR\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\nR\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\nR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001eR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001eR\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001eR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001eR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001eR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001eR\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u001d\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\nR\u001a\u00101\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u000e\u00106\u001a\u000207X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lmodel/AppViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allGastosCasa", "Landroidx/lifecycle/LiveData;", "", "Lmodel/Gasto;", "getAllGastosCasa", "()Landroidx/lifecycle/LiveData;", "allGastosCompras", "getAllGastosCompras", "allGastosEducacion", "getAllGastosEducacion", "allGastosOcio", "getAllGastosOcio", "allGastosSalud", "getAllGastosSalud", "allGastosSeguros", "getAllGastosSeguros", "allGastosSuministros", "getAllGastosSuministros", "allGastosSuscripciones", "getAllGastosSuscripciones", "allGastosVehiculo", "getAllGastosVehiculo", "conceptosCasa", "", "getConceptosCasa", "()Ljava/util/List;", "conceptosCompras", "getConceptosCompras", "conceptosEducacion", "getConceptosEducacion", "conceptosOcio", "getConceptosOcio", "conceptosSalud", "getConceptosSalud", "conceptosSeguros", "getConceptosSeguros", "conceptosSuministros", "getConceptosSuministros", "conceptosSuscripciones", "getConceptosSuscripciones", "conceptosVehiculo", "getConceptosVehiculo", "last12Gastos", "getLast12Gastos", "mostrarGastos", "getMostrarGastos", "()Ljava/lang/String;", "setMostrarGastos", "(Ljava/lang/String;)V", "repository", "Lmodel/GastoRepository;", "deleteAll", "", "deleteGasto", "Lkotlinx/coroutines/Job;", "gasto", "insertGasto", "app_debug"})
public final class AppViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private java.lang.String mostrarGastos = "";
    @org.jetbrains.annotations.NotNull
    private final model.GastoRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> last12Gastos = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> conceptosCasa = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> conceptosSuministros = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> conceptosCompras = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> conceptosVehiculo = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> conceptosSeguros = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> conceptosOcio = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> conceptosSalud = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> conceptosEducacion = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> conceptosSuscripciones = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> allGastosCasa = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> allGastosSuministros = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> allGastosCompras = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> allGastosVehiculo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> allGastosSeguros = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> allGastosOcio = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> allGastosSalud = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> allGastosEducacion = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> allGastosSuscripciones = null;
    
    public AppViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMostrarGastos() {
        return null;
    }
    
    public final void setMostrarGastos(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getLast12Gastos() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getConceptosCasa() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getConceptosSuministros() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getConceptosCompras() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getConceptosVehiculo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getConceptosSeguros() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getConceptosOcio() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getConceptosSalud() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getConceptosEducacion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getConceptosSuscripciones() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getAllGastosCasa() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getAllGastosSuministros() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getAllGastosCompras() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getAllGastosVehiculo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getAllGastosSeguros() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getAllGastosOcio() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getAllGastosSalud() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getAllGastosEducacion() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<model.Gasto>> getAllGastosSuscripciones() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job insertGasto(@org.jetbrains.annotations.NotNull
    model.Gasto gasto) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job deleteGasto(@org.jetbrains.annotations.NotNull
    model.Gasto gasto) {
        return null;
    }
    
    public final void deleteAll() {
    }
}