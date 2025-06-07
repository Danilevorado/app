package b9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class f extends SQLiteOpenHelper {

    /* renamed from: m, reason: collision with root package name */
    protected final z7.i f4567m;

    /* renamed from: n, reason: collision with root package name */
    private final Object f4568n;

    /* renamed from: o, reason: collision with root package name */
    private final String f4569o;

    /* renamed from: p, reason: collision with root package name */
    private final String f4570p;

    public f(Context context, z7.i iVar, String str, int i10, String str2, String str3) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        this.f4568n = new Object();
        this.f4567m = iVar;
        this.f4569o = str2;
        this.f4570p = str3;
    }

    private g e(Cursor cursor) {
        String string = cursor.getString(cursor.getColumnIndex("requestId"));
        String string2 = cursor.getString(cursor.getColumnIndex("method"));
        String string3 = cursor.getString(cursor.getColumnIndex("body"));
        JSONObject jSONObject = new JSONObject();
        if (string3 != null) {
            try {
                jSONObject = new JSONObject(string3);
            } catch (JSONException e5) {
                k9.h.n("Can't parse body of request: ", e5);
            }
        }
        return new g(string, string2, jSONObject);
    }

    private ContentValues s(d dVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("requestId", this.f4567m.a());
        contentValues.put("method", dVar.g());
        try {
            contentValues.put("body", dVar.b().toString());
        } catch (InterruptedException | JSONException e5) {
            k9.h.m(this.f4570p, "not valid body request:", e5);
        }
        return contentValues;
    }

    public long a(d dVar) {
        long jInsert;
        synchronized (this.f4568n) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    jInsert = writableDatabase.insert(this.f4569o, null, s(dVar));
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
                k9.h.m(this.f4570p, "error add request", e5);
                return -1L;
            }
        }
        return jInsert;
    }

    public g c(long j10) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f4568n) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e5) {
                k9.h.m(this.f4570p, "Can't get cached request: ", e5);
            }
            try {
                Cursor cursorQuery = writableDatabase.query(this.f4569o, null, "rowid = ?", k9.a.a(String.valueOf(j10)), null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        writableDatabase.close();
                        return null;
                    }
                    g gVarE = e(cursorQuery);
                    cursorQuery.close();
                    writableDatabase.close();
                    return gVarE;
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
    }

    public void f() {
        synchronized (this.f4568n) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                writableDatabase.execSQL("delete from " + this.f4569o);
                writableDatabase.close();
            } finally {
            }
        }
    }

    public void g(String str) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f4568n) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e5) {
                k9.h.m(this.f4570p, String.format("Can't remove cached request by key %s: ", str), e5);
            }
            try {
                writableDatabase.delete(this.f4569o, "requestId=?", new String[]{str});
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

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (%s TEXT primary key, %s TEXT, %s TEXT)", this.f4569o, "requestId", "method", "body"));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
