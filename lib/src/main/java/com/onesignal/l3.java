package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.onesignal.e3;
import java.util.ArrayList;

/* loaded from: classes.dex */
class l3 extends SQLiteOpenHelper implements k3 {

    /* renamed from: p, reason: collision with root package name */
    private static l3 f22104p;

    /* renamed from: m, reason: collision with root package name */
    private static final Object f22101m = new Object();

    /* renamed from: n, reason: collision with root package name */
    protected static final String[] f22102n = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* renamed from: o, reason: collision with root package name */
    private static r1 f22103o = new q1();

    /* renamed from: q, reason: collision with root package name */
    private static j7.i f22105q = new j7.i();

    l3(Context context) {
        super(context, "OneSignal.db", (SQLiteDatabase.CursorFactory) null, s());
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018 A[Catch: all -> 0x000b, LOOP:0: B:21:0x0005->B:17:0x0018, LOOP_END, TryCatch #2 {all -> 0x000b, blocks: (B:5:0x0005, B:6:0x0009, B:15:0x0013, B:17:0x0018, B:18:0x001f), top: B:21:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.database.sqlite.SQLiteDatabase U() {
        /*
            r5 = this;
            java.lang.Object r0 = com.onesignal.l3.f22101m
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L5:
            android.database.sqlite.SQLiteDatabase r1 = r5.y()     // Catch: java.lang.Throwable -> Lb android.database.sqlite.SQLiteDatabaseLockedException -> Ld android.database.sqlite.SQLiteCantOpenDatabaseException -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            goto L20
        Ld:
            r3 = move-exception
            goto L10
        Lf:
            r3 = move-exception
        L10:
            if (r1 != 0) goto L13
            r1 = r3
        L13:
            int r2 = r2 + 1
            r3 = 5
            if (r2 >= r3) goto L1f
            int r3 = r2 * 400
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lb
            android.os.SystemClock.sleep(r3)     // Catch: java.lang.Throwable -> Lb
            goto L5
        L1f:
            throw r1     // Catch: java.lang.Throwable -> Lb
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.l3.U():android.database.sqlite.SQLiteDatabase");
    }

    private void W(SQLiteDatabase sQLiteDatabase, int i10) throws SQLException {
        if (i10 < 2) {
            a0(sQLiteDatabase);
        }
        if (i10 < 3) {
            b0(sQLiteDatabase);
        }
        if (i10 < 4) {
            c0(sQLiteDatabase);
        }
        if (i10 < 5) {
            d0(sQLiteDatabase);
        }
        if (i10 == 5) {
            Z(sQLiteDatabase);
        }
        if (i10 < 7) {
            e0(sQLiteDatabase);
        }
        if (i10 < 8) {
            f0(sQLiteDatabase);
        }
    }

    static StringBuilder X() {
        long jB = e3.B0().b() / 1000;
        StringBuilder sb2 = new StringBuilder("created_time > " + (jB - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (e3.p0().l()) {
            sb2.append(" AND expire_time > " + jB);
        }
        return sb2;
    }

    private static void Y(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e5) {
            e5.printStackTrace();
        }
    }

    private static void Z(SQLiteDatabase sQLiteDatabase) throws SQLException {
        f22105q.b(sQLiteDatabase);
    }

    private static void a0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        Y(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        Y(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    private static void b0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        Y(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        Y(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        Y(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    private static void c0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        Y(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    private static void d0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        Y(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        Z(sQLiteDatabase);
    }

    private static void e0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        Y(sQLiteDatabase, "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
    }

    private void f0(SQLiteDatabase sQLiteDatabase) throws SQLException {
        f22105q.c(sQLiteDatabase);
        f22105q.a(sQLiteDatabase);
    }

    private static int s() {
        return 8;
    }

    public static l3 x(Context context) {
        if (f22104p == null) {
            synchronized (f22101m) {
                if (f22104p == null) {
                    f22104p = new l3(context.getApplicationContext());
                }
            }
        }
        return f22104p;
    }

    private SQLiteDatabase y() {
        SQLiteDatabase writableDatabase;
        synchronized (f22101m) {
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } catch (SQLiteCantOpenDatabaseException e5) {
                    throw e5;
                } catch (SQLiteDatabaseLockedException e10) {
                    throw e10;
                }
            } finally {
            }
        }
        return writableDatabase;
    }

    public void V(String str, String str2, ContentValues contentValues) {
        r1 r1Var;
        String str3;
        r1 r1Var2;
        String str4;
        synchronized (f22101m) {
            SQLiteDatabase sQLiteDatabaseU = U();
            try {
                try {
                    try {
                        sQLiteDatabaseU.beginTransaction();
                        sQLiteDatabaseU.insertOrThrow(str, str2, contentValues);
                        sQLiteDatabaseU.setTransactionSuccessful();
                        try {
                            sQLiteDatabaseU.endTransaction();
                        } catch (SQLiteException e5) {
                            e = e5;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                        } catch (IllegalStateException e10) {
                            e = e10;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                        }
                    } catch (SQLiteException e11) {
                        f22103o.d("Error inserting or throw on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e11);
                        if (sQLiteDatabaseU != null) {
                            try {
                                try {
                                    sQLiteDatabaseU.endTransaction();
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    r1Var = f22103o;
                                    str3 = "Error closing transaction! ";
                                    r1Var.d(str3, e);
                                }
                            } catch (IllegalStateException e13) {
                                e = e13;
                                r1Var = f22103o;
                                str3 = "Error closing transaction! ";
                                r1Var.d(str3, e);
                            }
                        }
                    }
                } catch (IllegalStateException e14) {
                    f22103o.d("Error under inserting or throw transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e14);
                    if (sQLiteDatabaseU != null) {
                        try {
                            try {
                                sQLiteDatabaseU.endTransaction();
                            } catch (IllegalStateException e15) {
                                e = e15;
                                r1Var = f22103o;
                                str3 = "Error closing transaction! ";
                                r1Var.d(str3, e);
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                        }
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseU != null) {
                    try {
                        try {
                            sQLiteDatabaseU.endTransaction();
                        } catch (IllegalStateException e17) {
                            e = e17;
                            r1Var2 = f22103o;
                            str4 = "Error closing transaction! ";
                            r1Var2.d(str4, e);
                            throw th;
                        }
                    } catch (SQLiteException e18) {
                        e = e18;
                        r1Var2 = f22103o;
                        str4 = "Error closing transaction! ";
                        r1Var2.d(str4, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // com.onesignal.k3
    public Cursor a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Cursor cursorQuery;
        synchronized (f22101m) {
            cursorQuery = U().query(str, strArr, str2, strArr2, str3, str4, str5);
        }
        return cursorQuery;
    }

    @Override // com.onesignal.k3
    public void c(String str, String str2, String[] strArr) {
        r1 r1Var;
        String str3;
        r1 r1Var2;
        String str4;
        synchronized (f22101m) {
            SQLiteDatabase sQLiteDatabaseU = U();
            try {
                try {
                    try {
                        sQLiteDatabaseU.beginTransaction();
                        sQLiteDatabaseU.delete(str, str2, strArr);
                        sQLiteDatabaseU.setTransactionSuccessful();
                        try {
                            sQLiteDatabaseU.endTransaction();
                        } catch (SQLiteException e5) {
                            e = e5;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                        } catch (IllegalStateException e10) {
                            e = e10;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                        }
                    } catch (SQLiteException e11) {
                        f22103o.d("Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e11);
                        if (sQLiteDatabaseU != null) {
                            try {
                                try {
                                    sQLiteDatabaseU.endTransaction();
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    r1Var = f22103o;
                                    str3 = "Error closing transaction! ";
                                    r1Var.d(str3, e);
                                }
                            } catch (IllegalStateException e13) {
                                e = e13;
                                r1Var = f22103o;
                                str3 = "Error closing transaction! ";
                                r1Var.d(str3, e);
                            }
                        }
                    }
                } catch (IllegalStateException e14) {
                    f22103o.d("Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e14);
                    if (sQLiteDatabaseU != null) {
                        try {
                            try {
                                sQLiteDatabaseU.endTransaction();
                            } catch (IllegalStateException e15) {
                                e = e15;
                                r1Var = f22103o;
                                str3 = "Error closing transaction! ";
                                r1Var.d(str3, e);
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                        }
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseU != null) {
                    try {
                        try {
                            sQLiteDatabaseU.endTransaction();
                        } catch (IllegalStateException e17) {
                            e = e17;
                            r1Var2 = f22103o;
                            str4 = "Error closing transaction! ";
                            r1Var2.d(str4, e);
                            throw th;
                        }
                    } catch (SQLiteException e18) {
                        e = e18;
                        r1Var2 = f22103o;
                        str4 = "Error closing transaction! ";
                        r1Var2.d(str4, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // com.onesignal.k3
    public void e(String str, String str2, ContentValues contentValues) {
        r1 r1Var;
        String str3;
        r1 r1Var2;
        String str4;
        synchronized (f22101m) {
            SQLiteDatabase sQLiteDatabaseU = U();
            try {
                try {
                    try {
                        sQLiteDatabaseU.beginTransaction();
                        sQLiteDatabaseU.insert(str, str2, contentValues);
                        sQLiteDatabaseU.setTransactionSuccessful();
                        try {
                            sQLiteDatabaseU.endTransaction();
                        } catch (SQLiteException e5) {
                            e = e5;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                        } catch (IllegalStateException e10) {
                            e = e10;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                        }
                    } catch (SQLiteException e11) {
                        f22103o.d("Error inserting on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e11);
                        if (sQLiteDatabaseU != null) {
                            try {
                                try {
                                    sQLiteDatabaseU.endTransaction();
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    r1Var = f22103o;
                                    str3 = "Error closing transaction! ";
                                    r1Var.d(str3, e);
                                }
                            } catch (IllegalStateException e13) {
                                e = e13;
                                r1Var = f22103o;
                                str3 = "Error closing transaction! ";
                                r1Var.d(str3, e);
                            }
                        }
                    }
                } catch (IllegalStateException e14) {
                    f22103o.d("Error under inserting transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e14);
                    if (sQLiteDatabaseU != null) {
                        try {
                            try {
                                sQLiteDatabaseU.endTransaction();
                            } catch (IllegalStateException e15) {
                                e = e15;
                                r1Var = f22103o;
                                str3 = "Error closing transaction! ";
                                r1Var.d(str3, e);
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                        }
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseU != null) {
                    try {
                        try {
                            sQLiteDatabaseU.endTransaction();
                        } catch (IllegalStateException e17) {
                            e = e17;
                            r1Var2 = f22103o;
                            str4 = "Error closing transaction! ";
                            r1Var2.d(str4, e);
                            throw th;
                        }
                    } catch (SQLiteException e18) {
                        e = e18;
                        r1Var2 = f22103o;
                        str4 = "Error closing transaction! ";
                        r1Var2.d(str4, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
    }

    @Override // com.onesignal.k3
    public int f(String str, ContentValues contentValues, String str2, String[] strArr) {
        r1 r1Var;
        String str3;
        r1 r1Var2;
        String str4;
        int iUpdate = 0;
        if (contentValues == null || contentValues.toString().isEmpty()) {
            return 0;
        }
        synchronized (f22101m) {
            SQLiteDatabase sQLiteDatabaseU = U();
            try {
                try {
                    try {
                        sQLiteDatabaseU.beginTransaction();
                        iUpdate = sQLiteDatabaseU.update(str, contentValues, str2, strArr);
                        sQLiteDatabaseU.setTransactionSuccessful();
                        try {
                            sQLiteDatabaseU.endTransaction();
                        } catch (SQLiteException e5) {
                            e = e5;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                            return iUpdate;
                        } catch (IllegalStateException e10) {
                            e = e10;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                            return iUpdate;
                        }
                    } catch (SQLiteException e11) {
                        f22103o.d("Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e11);
                        if (sQLiteDatabaseU != null) {
                            try {
                                try {
                                    sQLiteDatabaseU.endTransaction();
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    r1Var = f22103o;
                                    str3 = "Error closing transaction! ";
                                    r1Var.d(str3, e);
                                    return iUpdate;
                                }
                            } catch (IllegalStateException e13) {
                                e = e13;
                                r1Var = f22103o;
                                str3 = "Error closing transaction! ";
                                r1Var.d(str3, e);
                                return iUpdate;
                            }
                        }
                    }
                } catch (IllegalStateException e14) {
                    f22103o.d("Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e14);
                    if (sQLiteDatabaseU != null) {
                        try {
                            try {
                                sQLiteDatabaseU.endTransaction();
                            } catch (IllegalStateException e15) {
                                e = e15;
                                r1Var = f22103o;
                                str3 = "Error closing transaction! ";
                                r1Var.d(str3, e);
                                return iUpdate;
                            }
                        } catch (SQLiteException e16) {
                            e = e16;
                            r1Var = f22103o;
                            str3 = "Error closing transaction! ";
                            r1Var.d(str3, e);
                            return iUpdate;
                        }
                    }
                }
            } catch (Throwable th) {
                if (sQLiteDatabaseU != null) {
                    try {
                        try {
                            sQLiteDatabaseU.endTransaction();
                        } catch (IllegalStateException e17) {
                            e = e17;
                            r1Var2 = f22103o;
                            str4 = "Error closing transaction! ";
                            r1Var2.d(str4, e);
                            throw th;
                        }
                    } catch (SQLiteException e18) {
                        e = e18;
                        r1Var2 = f22103o;
                        str4 = "Error closing transaction! ";
                        r1Var2.d(str4, e);
                        throw th;
                    }
                }
                throw th;
            }
        }
        return iUpdate;
    }

    @Override // com.onesignal.k3
    public Cursor g(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        Cursor cursorQuery;
        synchronized (f22101m) {
            cursorQuery = U().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        return cursorQuery;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f22101m) {
            sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
            sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
            sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
            for (String str : f22102n) {
                sQLiteDatabase.execSQL(str);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        e3.a(e3.z.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        synchronized (f22101m) {
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
            try {
                ArrayList<String> arrayList = new ArrayList(cursorRawQuery.getCount());
                while (cursorRawQuery.moveToNext()) {
                    arrayList.add(cursorRawQuery.getString(0));
                }
                for (String str : arrayList) {
                    if (!str.startsWith("sqlite_")) {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
                cursorRawQuery.close();
                onCreate(sQLiteDatabase);
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        e3.a(e3.z.DEBUG, "OneSignal Database onUpgrade from: " + i10 + " to: " + i11);
        synchronized (f22101m) {
            try {
                W(sQLiteDatabase, i10);
            } catch (SQLiteException e5) {
                e3.b(e3.z.ERROR, "Error in upgrade, migration may have already run! Skipping!", e5);
            }
        }
    }
}
