package n9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class w extends SQLiteOpenHelper implements v {

    /* renamed from: n, reason: collision with root package name */
    private static final String f25663n = v.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    private final Object f25664m;

    public w(Context context) {
        super(context, "SummaryNotificationIds.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f25664m = new Object();
    }

    private String U() {
        return String.format("%s TEXT ", "group_id");
    }

    private String a() {
        return String.format("%s INTEGER ", "pushwoosh_id");
    }

    private String e(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("group_id"));
    }

    private void x(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", "summaryNotificationIds") + U() + ", " + a() + "UNIQUE );");
    }

    private int y(Cursor cursor) {
        return cursor.getInt(cursor.getColumnIndexOrThrow("pushwoosh_id"));
    }

    @Override // n9.v
    public int c(String str) {
        int iY;
        synchronized (this.f25664m) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    try {
                        writableDatabase.beginTransaction();
                        try {
                            Cursor cursorQuery = writableDatabase.query("summaryNotificationIds", null, "group_id = ?", new String[]{str}, null, null, null);
                            try {
                                if (!cursorQuery.moveToFirst()) {
                                    k9.h.k("Can't get StatusBarNotification with group id: " + str);
                                    throw new s7.a("Can't get StatusBarNotification with group id: " + str);
                                }
                                writableDatabase.setTransactionSuccessful();
                                iY = y(cursorQuery);
                                cursorQuery.close();
                                writableDatabase.close();
                            } finally {
                            }
                        } finally {
                            writableDatabase.endTransaction();
                        }
                    } finally {
                        writableDatabase.close();
                    }
                } catch (Throwable th) {
                    if (writableDatabase != null) {
                        try {
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (s7.a e5) {
                throw e5;
            } catch (Exception e10) {
                k9.h.n("Can't get StatusBarNotification with group id: " + str, e10);
                throw new s7.a("Can't get StatusBarNotification with group id: " + str);
            }
        }
        return iY;
    }

    @Override // n9.v
    public void f(List list) {
        SQLiteDatabase writableDatabase;
        synchronized (this.f25664m) {
            try {
                try {
                    writableDatabase = getWritableDatabase();
                    try {
                        writableDatabase.beginTransaction();
                        try {
                            writableDatabase.execSQL("delete from summaryNotificationIds");
                            writableDatabase.setTransactionSuccessful();
                            writableDatabase.close();
                            if (list != null) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    Pair pair = (Pair) it.next();
                                    s((String) pair.first, ((Integer) pair.second).intValue());
                                }
                            }
                        } finally {
                            writableDatabase.endTransaction();
                        }
                    } finally {
                        writableDatabase.close();
                    }
                } catch (Exception e5) {
                    k9.h.l(f25663n, "Failed to update notification storage: " + e5.getMessage());
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // n9.v
    public String g(int i10) {
        String strE;
        synchronized (this.f25664m) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    try {
                        writableDatabase.beginTransaction();
                        try {
                            Cursor cursorQuery = writableDatabase.query("summaryNotificationIds", null, "pushwoosh_id = ?", new String[]{Integer.toString(i10)}, null, null, null);
                            try {
                                if (!cursorQuery.moveToFirst()) {
                                    k9.h.k("Can't get group with notification id: " + i10);
                                    throw new s7.b("Can't get group with notification id: " + i10);
                                }
                                writableDatabase.setTransactionSuccessful();
                                strE = e(cursorQuery);
                                cursorQuery.close();
                                writableDatabase.close();
                            } finally {
                            }
                        } finally {
                            writableDatabase.endTransaction();
                        }
                    } finally {
                        writableDatabase.close();
                    }
                } catch (Throwable th) {
                    if (writableDatabase != null) {
                        try {
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (s7.b e5) {
                throw e5;
            } catch (Exception e10) {
                k9.h.n("Can't get group with notification id: " + i10, e10);
                throw new s7.b("Can't get group with notification id: " + i10);
            }
        }
        return strE;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        x(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS summaryNotificationIds");
        x(sQLiteDatabase);
    }

    @Override // n9.v
    public int remove(String str) {
        SQLiteDatabase writableDatabase;
        int iC = c(str);
        synchronized (this.f25664m) {
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } catch (Exception e5) {
                    k9.h.l(f25663n, "Failed to remove notification ids pair :" + e5.getMessage());
                }
                try {
                    writableDatabase.beginTransaction();
                    try {
                        if (writableDatabase.delete("summaryNotificationIds", "group_id=" + str, null) <= 0) {
                            k9.h.v(f25663n, "failed to remove notification ids pair for id: " + str);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.close();
                    } finally {
                        writableDatabase.endTransaction();
                    }
                } finally {
                    writableDatabase.close();
                }
            } catch (Throwable th) {
                if (writableDatabase != null) {
                    try {
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        return iC;
    }

    @Override // n9.v
    public void s(String str, int i10) {
        SQLiteDatabase writableDatabase;
        ContentValues contentValues = new ContentValues();
        contentValues.put("group_id", str);
        contentValues.put("pushwoosh_id", Integer.valueOf(i10));
        synchronized (this.f25664m) {
            try {
                writableDatabase = getWritableDatabase();
                try {
                    try {
                        writableDatabase.beginTransaction();
                        try {
                        } finally {
                            writableDatabase.endTransaction();
                        }
                    } finally {
                        writableDatabase.close();
                    }
                } catch (Throwable th) {
                    if (writableDatabase != null) {
                        try {
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            } catch (Exception e5) {
                k9.h.n("Error occurred while storing notification IDs", e5);
            }
            if (writableDatabase.insertWithOnConflict("summaryNotificationIds", null, contentValues, 5) == -1) {
                k9.h.x(f25663n, "Notification IDs pair was not stored.");
                throw new Exception();
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.close();
        }
    }
}
