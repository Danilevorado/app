package com.google.android.gms.internal.ads;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class rx1 {
    public static int a(SQLiteDatabase sQLiteDatabase, int i10) {
        int i11 = 0;
        if (i10 == 2) {
            return 0;
        }
        Cursor cursorH = h(sQLiteDatabase, i10);
        if (cursorH.getCount() > 0) {
            cursorH.moveToNext();
            i11 = cursorH.getInt(cursorH.getColumnIndexOrThrow("value"));
        }
        cursorH.close();
        return i11;
    }

    public static long b(SQLiteDatabase sQLiteDatabase, int i10) {
        long j10;
        Cursor cursorH = h(sQLiteDatabase, 2);
        if (cursorH.getCount() > 0) {
            cursorH.moveToNext();
            j10 = cursorH.getLong(cursorH.getColumnIndexOrThrow("value"));
        } else {
            j10 = 0;
        }
        cursorH.close();
        return j10;
    }

    public static ArrayList c(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = sQLiteDatabase.query("offline_signal_contents", new String[]{"serialized_proto_data"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(bp.U(cursorQuery.getBlob(cursorQuery.getColumnIndexOrThrow("serialized_proto_data"))));
            } catch (ny3 e5) {
                ze0.d("Unable to deserialize proto from offline signals database:");
                ze0.d(e5.getMessage());
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public static void d(SQLiteDatabase sQLiteDatabase, long j10, byte[] bArr) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(j10));
        contentValues.put("serialized_proto_data", bArr);
        if (sQLiteDatabase.update("offline_signal_contents", contentValues, "timestamp = ?", new String[]{String.valueOf(j10)}) == 0) {
            sQLiteDatabase.insert("offline_signal_contents", null, contentValues);
        }
    }

    public static void e(SQLiteDatabase sQLiteDatabase) {
        i(sQLiteDatabase, "failed_requests", 0);
        i(sQLiteDatabase, "total_requests", 0);
        i(sQLiteDatabase, "completed_requests", 0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", "last_successful_request_time");
        contentValues.put("value", (Long) 0L);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    public static void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("offline_signal_contents", null, null);
        j(sQLiteDatabase, "failed_requests", 0);
        j(sQLiteDatabase, "total_requests", 0);
        j(sQLiteDatabase, "completed_requests", 0);
    }

    public static void g(SQLiteDatabase sQLiteDatabase, boolean z10, boolean z11) throws SQLException {
        String str;
        if (z11) {
            sQLiteDatabase.execSQL(String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "completed_requests"));
            if (z10) {
                return;
            } else {
                str = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "failed_requests");
            }
        } else {
            str = String.format("UPDATE offline_signal_statistics SET value = value+1 WHERE statistic_name = '%s'", "total_requests");
        }
        sQLiteDatabase.execSQL(str);
    }

    private static Cursor h(SQLiteDatabase sQLiteDatabase, int i10) {
        String[] strArr = {"value"};
        String[] strArr2 = new String[1];
        if (i10 == 0) {
            strArr2[0] = "failed_requests";
        } else if (i10 == 1) {
            strArr2[0] = "total_requests";
        } else if (i10 != 2) {
            strArr2[0] = "completed_requests";
        } else {
            strArr2[0] = "last_successful_request_time";
        }
        return sQLiteDatabase.query("offline_signal_statistics", strArr, "statistic_name = ?", strArr2, null, null, null);
    }

    private static void i(SQLiteDatabase sQLiteDatabase, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("statistic_name", str);
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.insert("offline_signal_statistics", null, contentValues);
    }

    private static void j(SQLiteDatabase sQLiteDatabase, String str, int i10) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("value", (Integer) 0);
        sQLiteDatabase.update("offline_signal_statistics", contentValues, "statistic_name = ?", new String[]{str});
    }
}
