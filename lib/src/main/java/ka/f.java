package ka;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes2.dex */
public class f extends SQLiteOpenHelper {

    /* renamed from: n, reason: collision with root package name */
    private static final String f24921n = n9.b.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    private final Object f24922m;

    public interface a {
        void a(n9.b bVar);
    }

    public f(Context context) {
        super(context, "localNotification.db", (SQLiteDatabase.CursorFactory) null, 2);
        this.f24922m = new Object();
    }

    private ContentValues V(n9.b bVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("requestId", Integer.valueOf(bVar.d()));
        contentValues.put("notificationId", Integer.valueOf(bVar.b()));
        contentValues.put("notificationTag", bVar.c());
        contentValues.put("triggerAtMilles", Long.valueOf(bVar.e()));
        contentValues.put("bundle", k9.b.f(bVar.a()).toString());
        return contentValues;
    }

    private void X(int i10, String str) {
        String str2;
        StringBuilder sb2;
        synchronized (this.f24922m) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                int iDelete = writableDatabase.delete(str, "requestId=" + i10, null);
                k9.h.g("delete notification " + iDelete + " by requestID:" + i10);
                if (iDelete > 0) {
                    str2 = f24921n;
                    sb2 = new StringBuilder();
                    sb2.append("success remove local notification by ");
                    sb2.append(i10);
                } else {
                    str2 = f24921n;
                    sb2 = new StringBuilder();
                    sb2.append("fail remove local notification by ");
                    sb2.append(i10);
                }
                k9.h.v(str2, sb2.toString());
                writableDatabase.close();
            } finally {
            }
        }
    }

    private long Y(SQLiteDatabase sQLiteDatabase) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "localNotificationShown");
    }

    private void Z(SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("localNotificationShown", null, null, null, null, null, "requestId");
        if (cursorQuery.moveToFirst()) {
            sQLiteDatabase.delete("localNotificationShown", "requestId=?", new String[]{cursorQuery.getString(cursorQuery.getColumnIndex("requestId"))});
        }
    }

    private n9.b c(Cursor cursor) {
        return new n9.b(cursor.getInt(cursor.getColumnIndex("requestId")), cursor.getInt(cursor.getColumnIndex("notificationId")), cursor.getString(cursor.getColumnIndex("notificationTag")), cursor.getLong(cursor.getColumnIndex("triggerAtMilles")), k9.b.i(cursor.getString(cursor.getColumnIndex("bundle"))));
    }

    private void f(int i10, ContentValues contentValues, SQLiteDatabase sQLiteDatabase, String str) {
        String string = Integer.toString(i10);
        if (sQLiteDatabase.updateWithOnConflict(str, contentValues, "requestId= ?", new String[]{string}, 4) == 0 && sQLiteDatabase.insert(str, null, contentValues) == 0) {
            k9.h.x("notification", "Not stored " + string);
        }
    }

    private void g(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", "nextRequestId") + String.format("%s INTEGER primary key ", "value") + ");");
    }

    private void s(SQLiteDatabase sQLiteDatabase, String str) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", str) + String.format("%s INTEGER primary key, ", "requestId") + String.format("%s INTEGER, ", "notificationId") + String.format("%s INTEGER, ", "triggerAtMilles") + String.format("%s TEXT, ", "notificationTag") + String.format("%s TEXT ", "bundle") + ");");
    }

    private void x(String str, a aVar) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f24922m) {
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e5) {
                k9.h.n("Can't get NotificationList: ", e5);
            }
            try {
                Cursor cursorQuery = writableDatabase.query(str, null, null, null, null, null, null);
                while (cursorQuery.moveToNext()) {
                    try {
                        aVar.a(c(cursorQuery));
                    } finally {
                    }
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
    }

    public void U(n9.b bVar) {
        SQLiteDatabase writableDatabase;
        ContentValues contentValuesV = V(bVar);
        synchronized (this.f24922m) {
            int iD = bVar.d();
            try {
                writableDatabase = getWritableDatabase();
            } catch (Exception e5) {
                k9.h.n("Can't update preference value:" + iD, e5);
            }
            try {
                f(iD, contentValuesV, writableDatabase, "localNotificationShown");
                if (Y(writableDatabase) > 10) {
                    Z(writableDatabase);
                }
                if (writableDatabase != null) {
                    writableDatabase.close();
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

    public void W(int i10) {
        X(i10, "localNotificationShown");
    }

    public n9.b a(int i10, String str) {
        SQLiteDatabase writableDatabase;
        Cursor cursorQuery;
        String string = Integer.toString(i10);
        synchronized (this.f24922m) {
            try {
                writableDatabase = getWritableDatabase();
                try {
                    cursorQuery = writableDatabase.query("localNotificationShown", null, "notificationId = ? AND notificationTag = ?", k9.a.a(string, str), null, null, null);
                    try {
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
                k9.h.n("Can't get Notification: ", e5);
            }
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                writableDatabase.close();
                return null;
            }
            n9.b bVarC = c(cursorQuery);
            cursorQuery.close();
            writableDatabase.close();
            return bVarC;
        }
    }

    public void e(int i10) {
        X(i10, "localNotification");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        g(sQLiteDatabase);
        s(sQLiteDatabase, "localNotification");
        s(sQLiteDatabase, "localNotificationShown");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    public void y(a aVar) {
        x("localNotification", aVar);
    }
}
