package j7;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;

/* loaded from: classes.dex */
public final class i {
    public final void a(SQLiteDatabase sQLiteDatabase) throws SQLException {
        rb.h.e(sQLiteDatabase, "db");
        String strJ = rb.h.j("_id,name", ",notification_id");
        String strJ2 = rb.h.j("_id,name", ",channel_influence_id");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                sQLiteDatabase.execSQL("INSERT INTO cached_unique_outcome(" + strJ2 + ") SELECT " + strJ + " FROM cached_unique_outcome_notification;");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("UPDATE cached_unique_outcome SET channel_type = '");
                sb2.append(h7.b.NOTIFICATION);
                sb2.append("';");
                sQLiteDatabase.execSQL(sb2.toString());
                sQLiteDatabase.execSQL("DROP TABLE cached_unique_outcome_notification;");
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void b(SQLiteDatabase sQLiteDatabase) throws SQLException {
        rb.h.e(sQLiteDatabase, "db");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                sQLiteDatabase.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                sQLiteDatabase.execSQL("DROP TABLE outcome;");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                sQLiteDatabase.execSQL("DROP TABLE outcome_backup;");
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }

    public final void c(SQLiteDatabase sQLiteDatabase) throws SQLException {
        rb.h.e(sQLiteDatabase, "db");
        String strJ = rb.h.j("_id,name,timestamp,notification_ids,weight", ",session");
        String strJ2 = rb.h.j("_id,name,timestamp,notification_ids,weight", ",notification_influence_type");
        try {
            try {
                sQLiteDatabase.execSQL("BEGIN TRANSACTION;");
                sQLiteDatabase.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("INSERT INTO outcome(" + strJ2 + ") SELECT " + strJ + " FROM outcome_aux;");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DROP TABLE ");
                sb2.append("outcome_aux");
                sb2.append(';');
                sQLiteDatabase.execSQL(sb2.toString());
            } catch (SQLiteException e5) {
                e5.printStackTrace();
            }
        } finally {
            sQLiteDatabase.execSQL("COMMIT;");
        }
    }
}
