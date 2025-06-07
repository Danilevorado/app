package n9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import ga.b;

/* loaded from: classes2.dex */
public class u extends SQLiteOpenHelper implements t {

    /* renamed from: n, reason: collision with root package name */
    private static final String f25661n = "p";

    /* renamed from: m, reason: collision with root package name */
    private final Object f25662m;

    public u(Context context) {
        super(context, "silentRichMediaStorage.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f25662m = new Object();
    }

    private ContentValues c(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("richMedia", str);
        contentValues.put("sound", str2);
        return contentValues;
    }

    private ga.b e(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("richMedia"));
        return new b.C0137b().c(string).g(cursor.getString(cursor.getColumnIndex("sound"))).e(false).f();
    }

    private void f(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", "resources") + String.format("%s TEXT , ", "richMedia") + String.format("%s TEXT ", "sound") + ");");
    }

    @Override // n9.t
    public ga.b a() {
        ga.b bVarE;
        SQLiteDatabase writableDatabase;
        synchronized (this.f25662m) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e5) {
                k9.h.n("Can't get cached resources: ", e5);
            }
            try {
                Cursor cursorQuery = writableDatabase.query("resources", null, null, null, null, null, null);
                try {
                    bVarE = cursorQuery.moveToLast() ? e(cursorQuery) : null;
                    if (!cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    cursorQuery.close();
                    writableDatabase.execSQL("delete from resources");
                    writableDatabase.close();
                } finally {
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                        writableDatabase.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return bVarE;
    }

    @Override // n9.t
    public void g(w9.d dVar) {
        synchronized (this.f25662m) {
            String strE = g8.e.E(dVar.v());
            String strO = dVar.o();
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    if (writableDatabase.insertWithOnConflict("resources", null, c(strE, strO), 5) == -1) {
                        k9.h.x(f25661n, "Rich media " + strE + " was not stored.");
                    }
                    writableDatabase.close();
                } catch (Throwable th) {
                    if (writableDatabase != null) {
                        try {
                            writableDatabase.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                k9.h.n("Can't cache richMedia resource: " + strE, e5);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        f(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS resources");
        f(sQLiteDatabase);
    }
}
