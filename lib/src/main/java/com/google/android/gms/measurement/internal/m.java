package com.google.android.gms.measurement.internal;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* loaded from: classes.dex */
public abstract class m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079 A[Catch: SQLiteException -> 0x00d5, TryCatch #3 {SQLiteException -> 0x00d5, blocks: (B:20:0x0044, B:22:0x006a, B:24:0x0079, B:26:0x0081, B:27:0x0084, B:28:0x00a2, B:30:0x00a5, B:32:0x00a8, B:34:0x00b0, B:35:0x00b7, B:36:0x00ba, B:38:0x00c0, B:41:0x00d1, B:42:0x00d4, B:21:0x0063), top: B:59:0x0044, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[Catch: SQLiteException -> 0x00d5, LOOP:1: B:30:0x00a5->B:35:0x00b7, LOOP_START, PHI: r12
  0x00a5: PHI (r12v1 int) = (r12v0 int), (r12v2 int) binds: [B:29:0x00a3, B:35:0x00b7] A[DONT_GENERATE, DONT_INLINE], TryCatch #3 {SQLiteException -> 0x00d5, blocks: (B:20:0x0044, B:22:0x006a, B:24:0x0079, B:26:0x0081, B:27:0x0084, B:28:0x00a2, B:30:0x00a5, B:32:0x00a8, B:34:0x00b0, B:35:0x00b7, B:36:0x00ba, B:38:0x00c0, B:41:0x00d1, B:42:0x00d4, B:21:0x0063), top: B:59:0x0044, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0 A[Catch: SQLiteException -> 0x00d5, TryCatch #3 {SQLiteException -> 0x00d5, blocks: (B:20:0x0044, B:22:0x006a, B:24:0x0079, B:26:0x0081, B:27:0x0084, B:28:0x00a2, B:30:0x00a5, B:32:0x00a8, B:34:0x00b0, B:35:0x00b7, B:36:0x00ba, B:38:0x00c0, B:41:0x00d1, B:42:0x00d4, B:21:0x0063), top: B:59:0x0044, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void a(com.google.android.gms.measurement.internal.s3 r14, android.database.sqlite.SQLiteDatabase r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String[] r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.m.a(com.google.android.gms.measurement.internal.s3, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    static void b(s3 s3Var, SQLiteDatabase sQLiteDatabase) {
        if (s3Var == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            s3Var.u().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            s3Var.u().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            s3Var.u().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        s3Var.u().a("Failed to turn on database write permission for owner");
    }
}
