package s9;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k9.h;

/* loaded from: classes2.dex */
public class b extends SQLiteOpenHelper implements d {

    /* renamed from: n, reason: collision with root package name */
    private static final String f27086n = SQLiteOpenHelper.class.getSimpleName();

    /* renamed from: m, reason: collision with root package name */
    private final Object f27087m;

    public b(Context context) {
        super(context, "inAppDb.db", (SQLiteDatabase.CursorFactory) null, 4);
        this.f27087m = new Object();
    }

    private q9.b a(Cursor cursor) {
        return new q9.b(cursor.getString(cursor.getColumnIndex("code")), cursor.getString(cursor.getColumnIndex("url")), "", cursor.getLong(cursor.getColumnIndex("updated")), q9.a.b(cursor.getString(cursor.getColumnIndex("layout"))), null, cursor.getInt(cursor.getColumnIndex("required")) == 1, cursor.getInt(cursor.getColumnIndex("priority")), cursor.getString(cursor.getColumnIndex("businessCase")), cursor.getString(cursor.getColumnIndex("gdpr")));
    }

    private q9.b e(SQLiteDatabase sQLiteDatabase, q9.b bVar) {
        q9.b bVarG = g(bVar.l(), sQLiteDatabase);
        if (bVarG != null && bVarG.equals(bVar)) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", bVar.s());
        contentValues.put("updated", Long.valueOf(bVar.r()));
        contentValues.put("layout", bVar.o().d());
        contentValues.put("priority", Integer.valueOf(bVar.p()));
        contentValues.put("required", Integer.valueOf(bVar.v() ? 1 : 0));
        contentValues.put("businessCase", bVar.k());
        contentValues.put("gdpr", bVar.m());
        if (sQLiteDatabase.updateWithOnConflict("inApps", contentValues, "code= ?", new String[]{bVar.l()}, 4) == 0) {
            contentValues.put("code", bVar.l());
            if (sQLiteDatabase.insert("inApps", null, contentValues) == 0) {
                h.x("InAppRetrieverWorker", "Not stored " + bVar.l());
                return null;
            }
        }
        return bVarG;
    }

    private q9.b g(String str, SQLiteDatabase sQLiteDatabase) {
        Cursor cursorQuery = sQLiteDatabase.query("inApps", null, "code = ?", k9.a.a(str), null, null, null);
        try {
            if (cursorQuery.moveToFirst()) {
                return a(cursorQuery);
            }
            cursorQuery.close();
            return null;
        } finally {
            cursorQuery.close();
        }
    }

    @Override // s9.d
    public q9.b c(String str) {
        q9.b bVarG;
        if (str == null || TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f27087m) {
            try {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                try {
                    bVarG = g(str, writableDatabase);
                } finally {
                    writableDatabase.close();
                }
            } catch (Exception e5) {
                h.n("Can't download resource from db with code: " + str, e5);
                return null;
            }
        }
        return bVarG;
    }

    @Override // s9.d
    public List f(List list) {
        SQLiteDatabase writableDatabase;
        if (list == null || list.size() == 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this.f27087m) {
            try {
                writableDatabase = getWritableDatabase();
                writableDatabase.beginTransaction();
            } catch (Exception e5) {
                h.n("Can't update inApp database", e5);
            }
            try {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    q9.b bVarE = e(writableDatabase, (q9.b) it.next());
                    if (bVarE != null) {
                        arrayList.add(bVarE.l());
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                writableDatabase.close();
                throw th;
            }
        }
        return arrayList;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL(String.format("create table %s (", "inApps") + String.format("%s text primary key, ", "code") + String.format("%s text, ", "url") + String.format("%s text, ", "folder") + String.format("%s text, ", "layout") + String.format("%s integer, ", "updated") + String.format("%s integer default 0, ", "priority") + String.format("%s integer default 0, ", "required") + String.format("%s text, ", "businessCase") + String.format("%s text", "gdpr") + ");");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) throws SQLException {
        if (i10 != i11) {
            String str = String.format("ALTER TABLE %s ADD COLUMN ", "inApps");
            if (i10 < 2 && i11 >= 2) {
                sQLiteDatabase.execSQL(String.format(str + "%s INTEGER DEFAULT 0;", "priority"));
                sQLiteDatabase.execSQL(String.format(str + "%s INTEGER default 0;", "required"));
            }
            if (i10 < 3 && i11 >= 3) {
                sQLiteDatabase.execSQL(String.format(str + "%s TEXT;", "gdpr"));
            }
            if (i10 >= 4 || i11 < 4) {
                return;
            }
            sQLiteDatabase.execSQL(String.format(str + "%s TEXT;", "businessCase"));
        }
    }
}
