package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.RemoteException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class jy1 extends SQLiteOpenHelper {

    /* renamed from: m, reason: collision with root package name */
    private final Context f10746m;

    /* renamed from: n, reason: collision with root package name */
    private final bb3 f10747n;

    public jy1(Context context, bb3 bb3Var) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, ((Integer) k3.w.c().b(ir.O7)).intValue());
        this.f10746m = context;
        this.f10747n = bb3Var;
    }

    static final void U(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.delete("offline_buffered_pings", "gws_query_id = ? AND event_state = ?", new String[]{str, Integer.toString(0)});
    }

    private static void V(SQLiteDatabase sQLiteDatabase, ef0 ef0Var) {
        sQLiteDatabase.beginTransaction();
        try {
            Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
            int count = cursorQuery.getCount();
            String[] strArr = new String[count];
            int i10 = 0;
            while (cursorQuery.moveToNext()) {
                int columnIndex = cursorQuery.getColumnIndex("url");
                if (columnIndex != -1) {
                    strArr[i10] = cursorQuery.getString(columnIndex);
                }
                i10++;
            }
            cursorQuery.close();
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
            sQLiteDatabase.setTransactionSuccessful();
            for (int i11 = 0; i11 < count; i11++) {
                ef0Var.o(strArr[i11]);
            }
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    static /* synthetic */ Void c(ef0 ef0Var, SQLiteDatabase sQLiteDatabase) {
        V(sQLiteDatabase, ef0Var);
        return null;
    }

    static /* synthetic */ void s(SQLiteDatabase sQLiteDatabase, String str, ef0 ef0Var) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_state", (Integer) 1);
        sQLiteDatabase.update("offline_buffered_pings", contentValues, "gws_query_id = ?", new String[]{str});
        V(sQLiteDatabase, ef0Var);
    }

    final /* synthetic */ Void a(ly1 ly1Var, SQLiteDatabase sQLiteDatabase) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(ly1Var.f11864a));
        contentValues.put("gws_query_id", ly1Var.f11865b);
        contentValues.put("url", ly1Var.f11866c);
        contentValues.put("event_state", Integer.valueOf(ly1Var.f11867d - 1));
        sQLiteDatabase.insert("offline_buffered_pings", null, contentValues);
        j3.t.r();
        m3.t0 t0VarR = m3.b2.R(this.f10746m);
        if (t0VarR != null) {
            try {
                t0VarR.zze(l4.b.p1(this.f10746m));
            } catch (RemoteException e5) {
                m3.n1.l("Failed to schedule offline ping sender.", e5);
            }
        }
        return null;
    }

    public final void e(final String str) {
        g(new nr2() { // from class: com.google.android.gms.internal.ads.gy1
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) {
                jy1.U((SQLiteDatabase) obj, str);
                return null;
            }
        });
    }

    public final void f(final ly1 ly1Var) {
        g(new nr2() { // from class: com.google.android.gms.internal.ads.ey1
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) throws IllegalAccessException, InstantiationException, IllegalArgumentException, InvocationTargetException {
                this.f8046a.a(ly1Var, (SQLiteDatabase) obj);
                return null;
            }
        });
    }

    final void g(nr2 nr2Var) {
        qa3.q(this.f10747n.g(new Callable() { // from class: com.google.android.gms.internal.ads.cy1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f7121a.getWritableDatabase();
            }
        }), new iy1(this, nr2Var), this.f10747n);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    final void x(final SQLiteDatabase sQLiteDatabase, final ef0 ef0Var, final String str) {
        this.f10747n.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.dy1
            @Override // java.lang.Runnable
            public final void run() {
                jy1.s(sQLiteDatabase, str, ef0Var);
            }
        });
    }

    public final void y(final ef0 ef0Var, final String str) {
        g(new nr2() { // from class: com.google.android.gms.internal.ads.hy1
            @Override // com.google.android.gms.internal.ads.nr2
            public final Object a(Object obj) {
                this.f9454a.x((SQLiteDatabase) obj, ef0Var, str);
                return null;
            }
        });
    }
}
