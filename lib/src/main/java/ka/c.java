package ka;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import n9.j;

/* loaded from: classes2.dex */
public class c extends SQLiteOpenHelper implements j {

    /* renamed from: n, reason: collision with root package name */
    private static final String f24885n = "PushBundleStorageImpl";

    /* renamed from: m, reason: collision with root package name */
    private final Object f24886m;

    public c(Context context) {
        super(context, "pushBundleDb.db", (SQLiteDatabase.CursorFactory) null, 5);
        this.f24886m = new Object();
    }

    private long U(ContentValues contentValues, String str) {
        long jInsertWithOnConflict;
        synchronized (this.f24886m) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    jInsertWithOnConflict = writableDatabase.insertWithOnConflict(str, null, contentValues, 5);
                    if (jInsertWithOnConflict == -1) {
                        k9.h.x(f24885n, "Push bundle with message was not stored.");
                        throw new Exception();
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
                k9.h.n("Error occurred while storing push bundle", e5);
                throw e5;
            }
        }
        return jInsertWithOnConflict;
    }

    private Bundle V(long j10, String str) {
        Bundle bundleW;
        synchronized (this.f24886m) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    Cursor cursorQuery = writableDatabase.query(str, null, "rowid = ?", new String[]{Long.toString(j10)}, null, null, null);
                    try {
                        if (!cursorQuery.moveToFirst()) {
                            k9.h.k("Can't get push bundle with id: " + j10);
                            throw new Exception();
                        }
                        bundleW = W(cursorQuery);
                        cursorQuery.close();
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
            } catch (Exception e5) {
                k9.h.n("Can't get push bundle with id: " + j10, e5);
                throw e5;
            }
        }
        return bundleW;
    }

    private Bundle W(Cursor cursor) {
        return k9.b.i(cursor.getString(cursor.getColumnIndex("push_bundle_json")));
    }

    private void X(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", "groupPushBundles") + g0() + ", " + d0() + ", " + f0() + ");");
    }

    private ContentValues Y(Bundle bundle) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("push_bundle_json", k9.b.f(bundle).toString());
        return contentValues;
    }

    private ContentValues Z(Bundle bundle, int i10, String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("push_bundle_json", k9.b.f(bundle).toString());
        contentValues.put("notification_id", Integer.valueOf(i10));
        contentValues.put("group_id", str);
        return contentValues;
    }

    private List a0(String str) {
        ArrayList arrayList;
        synchronized (this.f24886m) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    Cursor cursorQuery = writableDatabase.query(str, null, null, null, null, null, null);
                    try {
                        arrayList = new ArrayList();
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(W(cursorQuery));
                        }
                        cursorQuery.close();
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
            } catch (Exception e5) {
                k9.h.n("Can't get group push bundles", e5);
                throw e5;
            }
        }
        return arrayList;
    }

    private void b0(long j10, String str) {
        synchronized (this.f24886m) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                if (writableDatabase.delete(str, "rowid=" + j10, null) <= 0) {
                    k9.h.v(f24885n, "failed to remove push bundle with id: " + j10);
                }
                writableDatabase.close();
            } finally {
            }
        }
    }

    private void c0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", "pushBundles") + g0() + ", " + d0() + ");");
    }

    private String d0() {
        return String.format("%s TEXT ", "group_id");
    }

    private void e0(String str) {
        synchronized (this.f24886m) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                if (writableDatabase.delete(str, null, null) <= 0) {
                    k9.h.v(f24885n, "failed to remove group push bundles");
                }
                writableDatabase.close();
            } finally {
            }
        }
    }

    private String f0() {
        return String.format("%s INTEGER ", "notification_id");
    }

    private String g0() {
        return String.format("%s TEXT ", "push_bundle_json");
    }

    @Override // n9.j
    public List a() {
        return a0("groupPushBundles");
    }

    @Override // n9.j
    public r9.a c(String str) {
        r9.a aVar;
        synchronized (this.f24886m) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    Cursor cursorQuery = writableDatabase.query("groupPushBundles", new String[]{"notification_id", "push_bundle_json", "group_id", "rowid"}, "group_id = ?", new String[]{str}, null, null, null);
                    try {
                        if (!cursorQuery.moveToLast()) {
                            throw new Exception();
                        }
                        aVar = new r9.a(cursorQuery.getInt(cursorQuery.getColumnIndex("notification_id")), cursorQuery.getLong(cursorQuery.getColumnIndex("rowid")), W(cursorQuery));
                        cursorQuery.close();
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
            } catch (Exception e5) {
                k9.h.n("Failed to obtain the last status bar notification", e5);
                throw e5;
            }
        }
        return aVar;
    }

    @Override // n9.j
    public void e() {
        e0("groupPushBundles");
    }

    @Override // n9.j
    public void f(long j10) {
        b0(j10, "pushBundles");
    }

    @Override // n9.j
    public void g(long j10) {
        b0(j10, "groupPushBundles");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        c0(sQLiteDatabase);
        X(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.setVersion(i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS pushBundles");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS groupPushBundles");
        c0(sQLiteDatabase);
        X(sQLiteDatabase);
    }

    @Override // n9.j
    public long s(Bundle bundle) {
        return U(Y(bundle), "pushBundles");
    }

    @Override // n9.j
    public Bundle x(long j10) {
        return V(j10, "pushBundles");
    }

    @Override // n9.j
    public long y(Bundle bundle, int i10, String str) {
        return U(Z(bundle, i10, str), "groupPushBundles");
    }
}
