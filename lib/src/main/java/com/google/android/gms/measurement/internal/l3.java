package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* loaded from: classes.dex */
final class l3 extends SQLiteOpenHelper {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ m3 f20152m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l3(m3 m3Var, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f20152m = m3Var;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e5) {
            throw e5;
        } catch (SQLiteException unused) {
            this.f20152m.f20269a.b().p().a("Opening the local database failed, dropping and recreating it");
            this.f20152m.f20269a.y();
            if (!this.f20152m.f20269a.a().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f20152m.f20269a.b().p().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e10) {
                this.f20152m.f20269a.b().p().b("Failed to open local database. Events will bypass local storage", e10);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        m.b(this.f20152m.f20269a.b(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        m.a(this.f20152m.f20269a.b(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
