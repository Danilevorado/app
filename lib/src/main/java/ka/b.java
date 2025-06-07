package ka;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import android.text.TextUtils;
import ga.b;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class b extends SQLiteOpenHelper implements n9.h {

    /* renamed from: n, reason: collision with root package name */
    private static final String f24883n = n9.b.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    private final Object f24884m;

    public b(Context context) {
        super(context, "lockScreenRichMediaResources.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f24884m = new Object();
    }

    private Uri U(Cursor cursor) {
        return Uri.parse(cursor.getString(cursor.getColumnIndex("remoteUrl")));
    }

    private void V(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", "lockScreenRemoteUrls") + String.format("%s TEXT ", "remoteUrl") + ");");
    }

    private ga.b W(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("richMedia"));
        return new b.C0137b().c(string).g(cursor.getString(cursor.getColumnIndex("sound"))).e(true).f();
    }

    private void X(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", "lockScreenResources") + String.format("%s TEXT , ", "richMedia") + String.format("%s TEXT ", "sound") + ");");
    }

    private ContentValues x(String str) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("remoteUrl", str);
        return contentValues;
    }

    private ContentValues y(String str, String str2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("richMedia", str);
        contentValues.put("sound", str2);
        return contentValues;
    }

    @Override // n9.h
    public void a() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f24884m) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e5) {
                k9.h.n("Can't clear resources", e5);
            }
            try {
                writableDatabase.execSQL("delete from lockScreenResources");
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
        }
    }

    @Override // n9.h
    public void c() {
        SQLiteDatabase writableDatabase;
        synchronized (this.f24884m) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e5) {
                k9.h.n("Can't clear remote urls", e5);
            }
            try {
                writableDatabase.execSQL("delete from lockScreenRemoteUrls");
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
        }
    }

    @Override // n9.h
    public List e() {
        SQLiteDatabase writableDatabase;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f24884m) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e5) {
                k9.h.n("Can't get cached resources: ", e5);
            }
            try {
                Cursor cursorQuery = writableDatabase.query("lockScreenRemoteUrls", null, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        arrayList.add(U(cursorQuery));
                    } finally {
                    }
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                cursorQuery.close();
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
        }
        return arrayList;
    }

    @Override // n9.h
    public List f() {
        SQLiteDatabase writableDatabase;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f24884m) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e5) {
                k9.h.n("Can't get cached resources: ", e5);
            }
            try {
                Cursor cursorQuery = writableDatabase.query("lockScreenResources", null, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        arrayList.add(W(cursorQuery));
                    } finally {
                    }
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                cursorQuery.close();
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
        }
        return arrayList;
    }

    @Override // n9.h
    public void g(w9.d dVar) {
        synchronized (this.f24884m) {
            String strE = g8.e.E(dVar.v());
            String strO = dVar.o();
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    if (writableDatabase.insertWithOnConflict("lockScreenResources", null, y(strE, strO), 5) == -1) {
                        k9.h.x(f24883n, "Rich media " + strE + " was not stored.");
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
        X(sQLiteDatabase);
        V(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS lockScreenResources");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS lockScreenRemoteUrls");
        X(sQLiteDatabase);
        V(sQLiteDatabase);
    }

    @Override // n9.h
    public void s(Uri uri) {
        synchronized (this.f24884m) {
            String string = uri.toString();
            if (TextUtils.isEmpty(string)) {
                k9.h.x(f24883n, "Remote url is empty.");
                return;
            }
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    if (writableDatabase.insertWithOnConflict("lockScreenRemoteUrls", null, x(string), 5) == -1) {
                        k9.h.x(f24883n, "Remote url " + string + " was not stored.");
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
                k9.h.n("Can't cache remote url: " + string, e5);
            }
        }
    }
}
