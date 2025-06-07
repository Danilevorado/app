package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.zb;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
final class l extends c9 {

    /* renamed from: f, reason: collision with root package name */
    private static final String[] f20139f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g, reason: collision with root package name */
    private static final String[] f20140g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h, reason: collision with root package name */
    private static final String[] f20141h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    private static final String[] f20142i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f20143j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f20144k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l, reason: collision with root package name */
    private static final String[] f20145l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m, reason: collision with root package name */
    private static final String[] f20146m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d, reason: collision with root package name */
    private final k f20147d;

    /* renamed from: e, reason: collision with root package name */
    private final y8 f20148e;

    l(n9 n9Var) {
        super(n9Var);
        this.f20148e = new y8(this.f20269a.d());
        this.f20269a.y();
        this.f20147d = new k(this, this.f20269a.a(), "google_app_measurement.db");
    }

    static final void H(ContentValues contentValues, String str, Object obj) {
        e4.p.f("value");
        e4.p.l(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    private final long I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = P().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e5) {
                this.f20269a.b().p().c("Database error", str, e5);
                throw e5;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    private final long K(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = P().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j10;
                }
                long j11 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e5) {
                this.f20269a.b().p().c("Database error", str, e5);
                throw e5;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0227: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x0227 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final void G(String str, long j10, long j11, l9 l9Var) throws Throwable {
        ?? IsEmpty;
        Cursor cursor;
        Cursor cursorRawQuery;
        String string;
        int i10;
        String str2;
        String[] strArr;
        e4.p.l(l9Var);
        f();
        g();
        Cursor cursor2 = null;
        string = null;
        string = null;
        String string2 = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseP = P();
                IsEmpty = TextUtils.isEmpty(null);
                try {
                    if (IsEmpty != 0) {
                        cursorRawQuery = sQLiteDatabaseP.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j11 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string2 = cursorRawQuery.getString(0);
                            string = cursorRawQuery.getString(1);
                            cursorRawQuery.close();
                        }
                    } else {
                        cursorRawQuery = sQLiteDatabaseP.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j11 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j11 != -1 ? new String[]{null, String.valueOf(j11)} : new String[]{null});
                        if (!cursorRawQuery.moveToFirst()) {
                            cursorRawQuery.close();
                            return;
                        } else {
                            string = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                        }
                    }
                    Cursor cursor3 = cursorRawQuery;
                    String str3 = string;
                    try {
                        Cursor cursorQuery = sQLiteDatabaseP.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, str3}, null, null, "rowid", "2");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                this.f20269a.b().p().b("Raw event metadata record is missing. appId", s3.y(string2));
                                cursorQuery.close();
                                return;
                            }
                            try {
                                try {
                                    com.google.android.gms.internal.measurement.u4 u4Var = (com.google.android.gms.internal.measurement.u4) ((com.google.android.gms.internal.measurement.t4) p9.C(com.google.android.gms.internal.measurement.u4.K1(), cursorQuery.getBlob(0))).k();
                                    if (cursorQuery.moveToNext()) {
                                        this.f20269a.b().u().b("Get multiple raw event metadata records, expected one. appId", s3.y(string2));
                                    }
                                    cursorQuery.close();
                                    e4.p.l(u4Var);
                                    l9Var.f20164a = u4Var;
                                    if (j11 != -1) {
                                        i10 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{string2, str3, String.valueOf(j11)};
                                    } else {
                                        i10 = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{string2, str3};
                                    }
                                    Cursor cursorQuery2 = sQLiteDatabaseP.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                                    if (!cursorQuery2.moveToFirst()) {
                                        this.f20269a.b().u().b("Raw event data disappeared while in transaction. appId", s3.y(string2));
                                        cursorQuery2.close();
                                        return;
                                    }
                                    do {
                                        long j12 = cursorQuery2.getLong(0);
                                        try {
                                            com.google.android.gms.internal.measurement.i4 i4Var = (com.google.android.gms.internal.measurement.i4) p9.C(com.google.android.gms.internal.measurement.j4.z(), cursorQuery2.getBlob(3));
                                            i4Var.A(cursorQuery2.getString(i10));
                                            i4Var.E(cursorQuery2.getLong(2));
                                            if (!l9Var.a(j12, (com.google.android.gms.internal.measurement.j4) i4Var.k())) {
                                                cursorQuery2.close();
                                                return;
                                            }
                                        } catch (IOException e5) {
                                            this.f20269a.b().p().c("Data loss. Failed to merge raw event. appId", s3.y(string2), e5);
                                        }
                                    } while (cursorQuery2.moveToNext());
                                    cursorQuery2.close();
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    IsEmpty = str3;
                                    this.f20269a.b().p().c("Data loss. Error selecting raw event. appId", s3.y(string2), e);
                                    if (IsEmpty != 0) {
                                        IsEmpty.close();
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = str3;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (IOException e11) {
                                this.f20269a.b().p().c("Data loss. Failed to merge raw event metadata. appId", s3.y(string2), e11);
                                cursorQuery.close();
                            }
                        } catch (SQLiteException e12) {
                            e = e12;
                            str3 = cursorQuery;
                        } catch (Throwable th2) {
                            th = th2;
                            str3 = cursorQuery;
                        }
                    } catch (SQLiteException e13) {
                        e = e13;
                        IsEmpty = cursor3;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e14) {
                    e = e14;
                }
            } catch (SQLiteException e15) {
                e = e15;
                IsEmpty = 0;
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            cursor2 = cursor;
        }
    }

    public final int J(String str, String str2) {
        e4.p.f(str);
        e4.p.f(str2);
        f();
        g();
        try {
            return P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e5) {
            this.f20269a.b().p().d("Error deleting conditional property", s3.y(str), this.f20269a.D().f(str2), e5);
            return 0;
        }
    }

    protected final long L(String str, String str2) {
        long jK;
        SQLiteException e5;
        ContentValues contentValues;
        e4.p.f(str);
        e4.p.f("first_open_count");
        f();
        g();
        SQLiteDatabase sQLiteDatabaseP = P();
        sQLiteDatabaseP.beginTransaction();
        try {
            try {
                jK = K("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jK == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseP.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f20269a.b().p().c("Failed to insert column (got -1). appId", s3.y(str), "first_open_count");
                        return -1L;
                    }
                    jK = 0;
                }
                try {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jK));
                } catch (SQLiteException e10) {
                    e5 = e10;
                    this.f20269a.b().p().d("Error inserting column. appId", s3.y(str), "first_open_count", e5);
                    return jK;
                }
            } finally {
                sQLiteDatabaseP.endTransaction();
            }
        } catch (SQLiteException e11) {
            jK = 0;
            e5 = e11;
        }
        if (sQLiteDatabaseP.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
            this.f20269a.b().p().c("Failed to update column (got 0). appId", s3.y(str), "first_open_count");
            return -1L;
        }
        sQLiteDatabaseP.setTransactionSuccessful();
        return jK;
    }

    public final long M() {
        return K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    public final long N() {
        return K("select max(timestamp) from raw_events", null, 0L);
    }

    public final long O(String str) {
        e4.p.f(str);
        return K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    final SQLiteDatabase P() {
        f();
        try {
            return this.f20147d.getWritableDatabase();
        } catch (SQLiteException e5) {
            this.f20269a.b().u().b("Error opening database", e5);
            throw e5;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle Q(java.lang.String r8) throws java.lang.Throwable {
        /*
            r7 = this;
            r7.f()
            r7.g()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.P()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.w4 r8 = r7.f20269a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.s3 r8 = r8.b()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.q3 r8 = r8.t()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.i4 r3 = com.google.android.gms.internal.measurement.j4.z()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.x9 r2 = com.google.android.gms.measurement.internal.p9.C(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.i4 r2 = (com.google.android.gms.internal.measurement.i4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.u8 r2 = r2.k()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.j4 r2 = (com.google.android.gms.internal.measurement.j4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.n9 r8 = r7.f19803b     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.g0()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.D()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.n4 r3 = (com.google.android.gms.internal.measurement.n4) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.B()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.O()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.v()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.P()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.w()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.S()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.C()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.Q()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.y()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.w4 r3 = r7.f20269a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.s3 r3 = r3.b()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.q3 r3 = r3.p()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.s3.y(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            com.google.android.gms.measurement.internal.w4 r2 = r7.f20269a     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.s3 r2 = r2.b()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.q3 r2 = r2.p()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.b(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01eb: MOVE (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:51:0x01eb */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.s5 R(java.lang.String r35) {
        /*
            Method dump skipped, instructions count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.R(java.lang.String):com.google.android.gms.measurement.internal.s5");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.d S(java.lang.String r31, java.lang.String r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.d");
    }

    public final j T(long j10, String str, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return U(j10, str, 1L, false, false, z12, false, z14);
    }

    public final j U(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        e4.p.f(str);
        f();
        g();
        String[] strArr = {str};
        j jVar = new j();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseP = P();
                Cursor cursorQuery = sQLiteDatabaseP.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    this.f20269a.b().u().b("Not updating daily counts, app is not known. appId", s3.y(str));
                    cursorQuery.close();
                    return jVar;
                }
                if (cursorQuery.getLong(0) == j10) {
                    jVar.f20079b = cursorQuery.getLong(1);
                    jVar.f20078a = cursorQuery.getLong(2);
                    jVar.f20080c = cursorQuery.getLong(3);
                    jVar.f20081d = cursorQuery.getLong(4);
                    jVar.f20082e = cursorQuery.getLong(5);
                }
                if (z10) {
                    jVar.f20079b += j11;
                }
                if (z11) {
                    jVar.f20078a += j11;
                }
                if (z12) {
                    jVar.f20080c += j11;
                }
                if (z13) {
                    jVar.f20081d += j11;
                }
                if (z14) {
                    jVar.f20082e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(jVar.f20078a));
                contentValues.put("daily_events_count", Long.valueOf(jVar.f20079b));
                contentValues.put("daily_conversions_count", Long.valueOf(jVar.f20080c));
                contentValues.put("daily_error_events_count", Long.valueOf(jVar.f20081d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(jVar.f20082e));
                sQLiteDatabaseP.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return jVar;
            } catch (SQLiteException e5) {
                this.f20269a.b().p().c("Error updating daily counts. appId", s3.y(str), e5);
                if (0 != 0) {
                    cursor.close();
                }
                return jVar;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.r V(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.r");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.s9 X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            e4.p.f(r20)
            e4.p.f(r21)
            r19.f()
            r19.g()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.P()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.Y(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.s9 r0 = new com.google.android.gms.measurement.internal.s9     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            com.google.android.gms.measurement.internal.w4 r2 = r1.f20269a     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.s3 r2 = r2.b()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.q3 r2 = r2.p()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.s3.y(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.b(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            com.google.android.gms.measurement.internal.w4 r2 = r1.f20269a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.s3 r2 = r2.b()     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.q3 r2 = r2.p()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.s3.y(r20)     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.w4 r5 = r1.f20269a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.n3 r5 = r5.D()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.f(r9)     // Catch: java.lang.Throwable -> La2
            r2.d(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.s9");
    }

    final Object Y(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        if (type == 0) {
            this.f20269a.b().p().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type != 4) {
            this.f20269a.b().p().b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        this.f20269a.b().p().a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String Z() throws java.lang.Throwable {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.w4 r3 = r6.f20269a     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.s3 r3 = r3.b()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.q3 r3 = r3.p()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.Z():java.lang.String");
    }

    public final List a0(String str, String str2, String str3) {
        e4.p.f(str);
        f();
        g();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return b0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
    
        r2 = r27.f20269a.b().p();
        r27.f20269a.y();
        r2.b("Read more than the max allowed conditional properties, ignoring extra", java.lang.Integer.valueOf(com.facebook.ads.AdError.NETWORK_ERROR_CODE));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List b0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.b0(java.lang.String, java.lang.String[]):java.util.List");
    }

    public final List c0(String str) {
        e4.p.f(str);
        f();
        g();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                this.f20269a.y();
                cursorQuery = P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursorQuery.getLong(2);
                    Object objY = Y(cursorQuery, 3);
                    if (objY == null) {
                        this.f20269a.b().p().b("Read invalid user property value, ignoring it. appId", s3.y(str));
                    } else {
                        arrayList.add(new s9(str, str2, string, j10, objY));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e5) {
                this.f20269a.b().p().c("Error querying user properties. appId", s3.y(str), e5);
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a7, code lost:
    
        r0 = r17.f20269a.b().p();
        r17.f20269a.y();
        r0.b("Read more than the max allowed user properties, ignoring excess", java.lang.Integer.valueOf(com.facebook.ads.AdError.NETWORK_ERROR_CODE));
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0124 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List d0(java.lang.String r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    public final void e0() {
        g();
        P().beginTransaction();
    }

    public final void f0() {
        g();
        P().endTransaction();
    }

    final void g0(List list) throws SQLException {
        f();
        g();
        e4.p.l(list);
        e4.p.n(list.size());
        if (s()) {
            String str = "(" + TextUtils.join(",", list) + ")";
            if (I("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                this.f20269a.b().u().a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                P().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e5) {
                this.f20269a.b().p().b("Error incrementing retry count. error", e5);
            }
        }
    }

    final void h0() {
        f();
        g();
        if (s()) {
            long jA = this.f19803b.e0().f20133e.a();
            long jB = this.f20269a.d().b();
            long jAbs = Math.abs(jB - jA);
            this.f20269a.y();
            if (jAbs > ((Long) i3.f20053z.a(null)).longValue()) {
                this.f19803b.e0().f20133e.b(jB);
                f();
                g();
                if (s()) {
                    SQLiteDatabase sQLiteDatabaseP = P();
                    this.f20269a.y();
                    int iDelete = sQLiteDatabaseP.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f20269a.d().a()), String.valueOf(h.g())});
                    if (iDelete > 0) {
                        this.f20269a.b().t().b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.c9
    protected final boolean j() {
        return false;
    }

    public final void k(String str, String str2) {
        e4.p.f(str);
        e4.p.f(str2);
        f();
        g();
        try {
            P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e5) {
            this.f20269a.b().p().d("Error deleting user property. appId", s3.y(str), this.f20269a.D().f(str2), e5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0334, code lost:
    
        if (r3.F() == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0336, code lost:
    
        r0 = java.lang.Boolean.valueOf(r3.D());
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x033f, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0340, code lost:
    
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0354, code lost:
    
        if (P().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0356, code lost:
    
        r23.f20269a.b().p().b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.s3.y(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x036a, code lost:
    
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x036e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x036f, code lost:
    
        r3 = r23.f20269a.b().p();
        r4 = "Error storing property filter. appId";
        r7 = com.google.android.gms.measurement.internal.s3.y(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0381, code lost:
    
        g();
        f();
        e4.p.f(r24);
        r0 = P();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03b8, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0187, code lost:
    
        r0.c(r7, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018b, code lost:
    
        r11 = r0.C().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0197, code lost:
    
        if (r11.hasNext() == false) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a3, code lost:
    
        if (((com.google.android.gms.internal.measurement.i3) r11.next()).E() != false) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a5, code lost:
    
        r0 = r23.f20269a.b().u();
        r7 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
        r8 = com.google.android.gms.measurement.internal.s3.y(r24);
        r10 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ba, code lost:
    
        r11 = r0.B().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d0, code lost:
    
        if (r11.hasNext() == false) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01d2, code lost:
    
        r12 = (com.google.android.gms.internal.measurement.z2) r11.next();
        g();
        f();
        e4.p.f(r24);
        e4.p.l(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ec, code lost:
    
        if (r12.B().isEmpty() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ee, code lost:
    
        r0 = r23.f20269a.b().u();
        r8 = com.google.android.gms.measurement.internal.s3.y(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0206, code lost:
    
        if (r12.J() == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0208, code lost:
    
        r20 = java.lang.Integer.valueOf(r12.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0213, code lost:
    
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0215, code lost:
    
        r0.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0220, code lost:
    
        r3 = r12.e();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r24);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0239, code lost:
    
        if (r12.J() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x023b, code lost:
    
        r8 = java.lang.Integer.valueOf(r12.w());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0244, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0245, code lost:
    
        r4.put("filter_id", r8);
        r4.put("event_name", r12.B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0255, code lost:
    
        if (r12.K() == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0257, code lost:
    
        r8 = java.lang.Boolean.valueOf(r12.H());
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0260, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0261, code lost:
    
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0275, code lost:
    
        if (P().insertWithOnConflict("event_filters", null, r4, 5) != (-1)) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0277, code lost:
    
        r23.f20269a.b().p().b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.s3.y(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x028a, code lost:
    
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0290, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0291, code lost:
    
        r3 = r23.f20269a.b().p();
        r4 = "Error storing event filter. appId";
        r7 = com.google.android.gms.measurement.internal.s3.y(r24);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x02a1, code lost:
    
        r3.c(r4, r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02a6, code lost:
    
        r21 = r4;
        r0 = r0.C().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02b4, code lost:
    
        if (r0.hasNext() == false) goto L172;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02b6, code lost:
    
        r3 = (com.google.android.gms.internal.measurement.i3) r0.next();
        g();
        f();
        e4.p.f(r24);
        e4.p.l(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02d0, code lost:
    
        if (r3.z().isEmpty() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02d2, code lost:
    
        r0 = r23.f20269a.b().u();
        r7 = com.google.android.gms.measurement.internal.s3.y(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02ea, code lost:
    
        if (r3.E() == false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02ec, code lost:
    
        r3 = java.lang.Integer.valueOf(r3.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x02f5, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x02f6, code lost:
    
        r0.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x02ff, code lost:
    
        r4 = r3.e();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0316, code lost:
    
        if (r3.E() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0318, code lost:
    
        r12 = java.lang.Integer.valueOf(r3.v());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0321, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0322, code lost:
    
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.z());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final void l(java.lang.String r24, java.util.List r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1196
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.l.l(java.lang.String, java.util.List):void");
    }

    public final void m() {
        g();
        P().setTransactionSuccessful();
    }

    public final void n(s5 s5Var) {
        e4.p.l(s5Var);
        f();
        g();
        String strD0 = s5Var.d0();
        e4.p.l(strD0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strD0);
        contentValues.put("app_instance_id", s5Var.e0());
        contentValues.put("gmp_app_id", s5Var.i0());
        contentValues.put("resettable_device_id_hash", s5Var.a());
        contentValues.put("last_bundle_index", Long.valueOf(s5Var.Y()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(s5Var.Z()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(s5Var.X()));
        contentValues.put("app_version", s5Var.g0());
        contentValues.put("app_store", s5Var.f0());
        contentValues.put("gmp_version", Long.valueOf(s5Var.W()));
        contentValues.put("dev_cert_hash", Long.valueOf(s5Var.T()));
        contentValues.put("measurement_enabled", Boolean.valueOf(s5Var.J()));
        contentValues.put("day", Long.valueOf(s5Var.S()));
        contentValues.put("daily_public_events_count", Long.valueOf(s5Var.Q()));
        contentValues.put("daily_events_count", Long.valueOf(s5Var.P()));
        contentValues.put("daily_conversions_count", Long.valueOf(s5Var.N()));
        contentValues.put("config_fetched_time", Long.valueOf(s5Var.M()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(s5Var.V()));
        contentValues.put("app_version_int", Long.valueOf(s5Var.L()));
        contentValues.put("firebase_instance_id", s5Var.h0());
        contentValues.put("daily_error_events_count", Long.valueOf(s5Var.O()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(s5Var.R()));
        contentValues.put("health_monitor_sample", s5Var.j0());
        s5Var.A();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(s5Var.I()));
        contentValues.put("admob_app_id", s5Var.b0());
        contentValues.put("dynamite_version", Long.valueOf(s5Var.U()));
        contentValues.put("session_stitching_token", s5Var.b());
        List listC = s5Var.c();
        if (listC != null) {
            if (listC.isEmpty()) {
                this.f20269a.b().u().b("Safelisted events should not be an empty list. appId", strD0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", listC));
            }
        }
        zb.c();
        if (this.f20269a.y().A(null, i3.f20038r0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseP = P();
            if (sQLiteDatabaseP.update("apps", contentValues, "app_id = ?", new String[]{strD0}) == 0 && sQLiteDatabaseP.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f20269a.b().p().b("Failed to insert/update app (got -1). appId", s3.y(strD0));
            }
        } catch (SQLiteException e5) {
            this.f20269a.b().p().c("Error storing app. appId", s3.y(strD0), e5);
        }
    }

    public final void o(r rVar) {
        e4.p.l(rVar);
        f();
        g();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", rVar.f20320a);
        contentValues.put("name", rVar.f20321b);
        contentValues.put("lifetime_count", Long.valueOf(rVar.f20322c));
        contentValues.put("current_bundle_count", Long.valueOf(rVar.f20323d));
        contentValues.put("last_fire_timestamp", Long.valueOf(rVar.f20325f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(rVar.f20326g));
        contentValues.put("last_bundled_day", rVar.f20327h);
        contentValues.put("last_sampled_complex_event_id", rVar.f20328i);
        contentValues.put("last_sampling_rate", rVar.f20329j);
        contentValues.put("current_session_count", Long.valueOf(rVar.f20324e));
        Boolean bool = rVar.f20330k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f20269a.b().p().b("Failed to insert/update event aggregates (got -1). appId", s3.y(rVar.f20320a));
            }
        } catch (SQLiteException e5) {
            this.f20269a.b().p().c("Error storing event aggregates. appId", s3.y(rVar.f20320a), e5);
        }
    }

    public final boolean p() {
        return I("select count(1) > 0 from raw_events", null) != 0;
    }

    public final boolean q() {
        return I("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    public final boolean r() {
        return I("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    protected final boolean s() {
        Context contextA = this.f20269a.a();
        this.f20269a.y();
        return contextA.getDatabasePath("google_app_measurement.db").exists();
    }

    public final boolean t(String str, Long l10, long j10, com.google.android.gms.internal.measurement.j4 j4Var) {
        f();
        g();
        e4.p.l(j4Var);
        e4.p.f(str);
        e4.p.l(l10);
        byte[] bArrE = j4Var.e();
        this.f20269a.b().t().c("Saving complex main event, appId, data size", this.f20269a.D().d(str), Integer.valueOf(bArrE.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrE);
        try {
            if (P().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            this.f20269a.b().p().b("Failed to insert complex main event (got -1). appId", s3.y(str));
            return false;
        } catch (SQLiteException e5) {
            this.f20269a.b().p().c("Error storing complex main event. appId", s3.y(str), e5);
            return false;
        }
    }

    public final boolean u(d dVar) {
        e4.p.l(dVar);
        f();
        g();
        String str = dVar.f19838m;
        e4.p.l(str);
        if (X(str, dVar.f19840o.f20314n) == null) {
            long jI = I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f20269a.y();
            if (jI >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", dVar.f19839n);
        contentValues.put("name", dVar.f19840o.f20314n);
        H(contentValues, "value", e4.p.l(dVar.f19840o.f()));
        contentValues.put("active", Boolean.valueOf(dVar.f19842q));
        contentValues.put("trigger_event_name", dVar.f19843r);
        contentValues.put("trigger_timeout", Long.valueOf(dVar.f19845t));
        contentValues.put("timed_out_event", this.f20269a.N().c0(dVar.f19844s));
        contentValues.put("creation_timestamp", Long.valueOf(dVar.f19841p));
        contentValues.put("triggered_event", this.f20269a.N().c0(dVar.f19846u));
        contentValues.put("triggered_timestamp", Long.valueOf(dVar.f19840o.f20315o));
        contentValues.put("time_to_live", Long.valueOf(dVar.f19847v));
        contentValues.put("expired_event", this.f20269a.N().c0(dVar.f19848w));
        try {
            if (P().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f20269a.b().p().b("Failed to insert/update conditional user property (got -1)", s3.y(str));
            }
        } catch (SQLiteException e5) {
            this.f20269a.b().p().c("Error storing conditional user property", s3.y(str), e5);
        }
        return true;
    }

    public final boolean v(s9 s9Var) {
        e4.p.l(s9Var);
        f();
        g();
        if (X(s9Var.f20401a, s9Var.f20403c) == null) {
            if (u9.X(s9Var.f20403c)) {
                if (I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{s9Var.f20401a}) >= this.f20269a.y().n(s9Var.f20401a, i3.H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(s9Var.f20403c)) {
                long jI = I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{s9Var.f20401a, s9Var.f20402b});
                this.f20269a.y();
                if (jI >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s9Var.f20401a);
        contentValues.put("origin", s9Var.f20402b);
        contentValues.put("name", s9Var.f20403c);
        contentValues.put("set_timestamp", Long.valueOf(s9Var.f20404d));
        H(contentValues, "value", s9Var.f20405e);
        try {
            if (P().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f20269a.b().p().b("Failed to insert/update user property (got -1). appId", s3.y(s9Var.f20401a));
            }
        } catch (SQLiteException e5) {
            this.f20269a.b().p().c("Error storing user property. appId", s3.y(s9Var.f20401a), e5);
        }
        return true;
    }
}
