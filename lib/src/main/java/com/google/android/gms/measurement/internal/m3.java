package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class m3 extends x3 {

    /* renamed from: c, reason: collision with root package name */
    private final l3 f20172c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f20173d;

    m3(w4 w4Var) {
        super(w4Var);
        Context contextA = this.f20269a.a();
        this.f20269a.y();
        this.f20172c = new l3(this, contextA, "google_app_measurement_local.db");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0116 A[PHI: r8
  0x0116: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:55:0x00e6, B:70:0x0114] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean v(int r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m3.v(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.x3
    protected final boolean l() {
        return false;
    }

    final SQLiteDatabase m() {
        if (this.f20173d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f20172c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f20173d = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0220 A[PHI: r9 r15
  0x0220: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:145:0x020e, B:160:0x023b, B:153:0x021e] A[DONT_GENERATE, DONT_INLINE]
  0x0220: PHI (r15v7 android.database.sqlite.SQLiteDatabase) = 
  (r15v5 android.database.sqlite.SQLiteDatabase)
  (r15v6 android.database.sqlite.SQLiteDatabase)
  (r15v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:145:0x020e, B:160:0x023b, B:153:0x021e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x01f1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x023e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x023e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List n(int r23) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m3.n(int):java.util.List");
    }

    public final void o() {
        int iDelete;
        f();
        try {
            SQLiteDatabase sQLiteDatabaseM = m();
            if (sQLiteDatabaseM == null || (iDelete = sQLiteDatabaseM.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f20269a.b().t().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e5) {
            this.f20269a.b().p().b("Error resetting local analytics data. error", e5);
        }
    }

    public final boolean p() {
        return v(3, new byte[0]);
    }

    final boolean q() {
        Context contextA = this.f20269a.a();
        this.f20269a.y();
        return contextA.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[PHI: r4
  0x0069: PHI (r4v3 int) = (r4v1 int), (r4v1 int), (r4v4 int) binds: [B:29:0x0060, B:35:0x007c, B:32:0x0067] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.f()
            boolean r1 = r10.f20173d
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            boolean r1 = r10.q()
            if (r1 == 0) goto L97
            r1 = 5
            r4 = r1
            r3 = r2
        L14:
            if (r3 >= r1) goto L88
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.m()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            if (r5 != 0) goto L21
            r10.f20173d = r6     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            return r2
        L21:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r8 = 3
            java.lang.String r8 = java.lang.Integer.toString(r8)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r7[r2] = r8     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String r8 = "messages"
            java.lang.String r9 = "type == ?"
            r5.delete(r8, r9, r7)     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3e android.database.sqlite.SQLiteException -> L40 android.database.sqlite.SQLiteFullException -> L42 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.close()
            return r6
        L3e:
            r0 = move-exception
            goto L82
        L40:
            r7 = move-exception
            goto L44
        L42:
            r7 = move-exception
            goto L6d
        L44:
            if (r5 == 0) goto L4f
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L3e
            if (r8 == 0) goto L4f
            r5.endTransaction()     // Catch: java.lang.Throwable -> L3e
        L4f:
            com.google.android.gms.measurement.internal.w4 r8 = r10.f20269a     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.s3 r8 = r8.b()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.q3 r8 = r8.p()     // Catch: java.lang.Throwable -> L3e
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L3e
            r10.f20173d = r6     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L7f
            goto L69
        L61:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L3e
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L3e
            int r4 = r4 + 20
            if (r5 == 0) goto L7f
        L69:
            r5.close()
            goto L7f
        L6d:
            com.google.android.gms.measurement.internal.w4 r8 = r10.f20269a     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.s3 r8 = r8.b()     // Catch: java.lang.Throwable -> L3e
            com.google.android.gms.measurement.internal.q3 r8 = r8.p()     // Catch: java.lang.Throwable -> L3e
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L3e
            r10.f20173d = r6     // Catch: java.lang.Throwable -> L3e
            if (r5 == 0) goto L7f
            goto L69
        L7f:
            int r3 = r3 + 1
            goto L14
        L82:
            if (r5 == 0) goto L87
            r5.close()
        L87:
            throw r0
        L88:
            com.google.android.gms.measurement.internal.w4 r0 = r10.f20269a
            com.google.android.gms.measurement.internal.s3 r0 = r0.b()
            com.google.android.gms.measurement.internal.q3 r0 = r0.u()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m3.r():boolean");
    }

    public final boolean s(d dVar) {
        byte[] bArrC0 = this.f20269a.N().c0(dVar);
        if (bArrC0.length <= 131072) {
            return v(2, bArrC0);
        }
        this.f20269a.b().r().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean t(v vVar) {
        Parcel parcelObtain = Parcel.obtain();
        w.a(vVar, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return v(0, bArrMarshall);
        }
        this.f20269a.b().r().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean u(q9 q9Var) {
        Parcel parcelObtain = Parcel.obtain();
        r9.a(q9Var, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return v(1, bArrMarshall);
        }
        this.f20269a.b().r().a("User property too long for local database. Sending directly to service");
        return false;
    }
}
