package model;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LiveData;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GastoDao_Impl implements GastoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Gasto> __insertionAdapterOfGasto;

  private final EntityDeletionOrUpdateAdapter<Gasto> __deletionAdapterOfGasto;

  public GastoDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGasto = new EntityInsertionAdapter<Gasto>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT OR ABORT INTO `gastos` (`id`,`cantidad`,`concepto`,`fecha`) VALUES (nullif(?, 0),?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Gasto entity) {
        statement.bindLong(1, entity.getId());
        statement.bindDouble(2, entity.getCantidad());
        if (entity.getConcepto() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getConcepto());
        }
        statement.bindLong(4, entity.getFecha());
      }
    };
    this.__deletionAdapterOfGasto = new EntityDeletionOrUpdateAdapter<Gasto>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `gastos` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @NonNull final Gasto entity) {
        statement.bindLong(1, entity.getId());
      }
    };
  }

  @Override
  public Object insertGasto(final Gasto gasto, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGasto.insert(gasto);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object deleteGasto(final Gasto gasto, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGasto.handle(gasto);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public LiveData<List<Gasto>> getLast12Gastos() {
    final String _sql = "SELECT * FROM gastos ORDER BY fecha DESC LIMIT 12";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[] {"gastos"}, false, new Callable<List<Gasto>>() {
      @Override
      @Nullable
      public List<Gasto> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfCantidad = CursorUtil.getColumnIndexOrThrow(_cursor, "cantidad");
          final int _cursorIndexOfConcepto = CursorUtil.getColumnIndexOrThrow(_cursor, "concepto");
          final int _cursorIndexOfFecha = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha");
          final List<Gasto> _result = new ArrayList<Gasto>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final Gasto _item;
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            final double _tmpCantidad;
            _tmpCantidad = _cursor.getDouble(_cursorIndexOfCantidad);
            final String _tmpConcepto;
            if (_cursor.isNull(_cursorIndexOfConcepto)) {
              _tmpConcepto = null;
            } else {
              _tmpConcepto = _cursor.getString(_cursorIndexOfConcepto);
            }
            final long _tmpFecha;
            _tmpFecha = _cursor.getLong(_cursorIndexOfFecha);
            _item = new Gasto(_tmpId,_tmpCantidad,_tmpConcepto,_tmpFecha);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
