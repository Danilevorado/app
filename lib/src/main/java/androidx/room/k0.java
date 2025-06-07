package androidx.room;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
class k0 implements u0.h, k {

    /* renamed from: m, reason: collision with root package name */
    private final Context f3727m;

    /* renamed from: n, reason: collision with root package name */
    private final String f3728n;

    /* renamed from: o, reason: collision with root package name */
    private final File f3729o;

    /* renamed from: p, reason: collision with root package name */
    private final Callable f3730p;

    /* renamed from: q, reason: collision with root package name */
    private final int f3731q;

    /* renamed from: r, reason: collision with root package name */
    private final u0.h f3732r;

    /* renamed from: s, reason: collision with root package name */
    private j f3733s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f3734t;

    k0(Context context, String str, File file, Callable callable, int i10, u0.h hVar) {
        this.f3727m = context;
        this.f3728n = str;
        this.f3729o = file;
        this.f3730p = callable;
        this.f3731q = i10;
        this.f3732r = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(java.io.File r5, boolean r6) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = r4.f3728n
            if (r0 == 0) goto L15
            android.content.Context r0 = r4.f3727m
            android.content.res.AssetManager r0 = r0.getAssets()
            java.lang.String r1 = r4.f3728n
            java.io.InputStream r0 = r0.open(r1)
        L10:
            java.nio.channels.ReadableByteChannel r0 = java.nio.channels.Channels.newChannel(r0)
            goto L30
        L15:
            java.io.File r0 = r4.f3729o
            if (r0 == 0) goto L25
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.File r1 = r4.f3729o
            r0.<init>(r1)
            java.nio.channels.FileChannel r0 = r0.getChannel()
            goto L30
        L25:
            java.util.concurrent.Callable r0 = r4.f3730p
            if (r0 == 0) goto Lba
            java.lang.Object r0 = r0.call()     // Catch: java.lang.Exception -> Lb1
            java.io.InputStream r0 = (java.io.InputStream) r0     // Catch: java.lang.Exception -> Lb1
            goto L10
        L30:
            android.content.Context r1 = r4.f3727m
            java.io.File r1 = r1.getCacheDir()
            java.lang.String r2 = "room-copy-helper"
            java.lang.String r3 = ".tmp"
            java.io.File r1 = java.io.File.createTempFile(r2, r3, r1)
            r1.deleteOnExit()
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r1)
            java.nio.channels.FileChannel r2 = r2.getChannel()
            s0.d.a(r0, r2)
            java.io.File r0 = r5.getParentFile()
            if (r0 == 0) goto L7b
            boolean r2 = r0.exists()
            if (r2 != 0) goto L7b
            boolean r0 = r0.mkdirs()
            if (r0 == 0) goto L60
            goto L7b
        L60:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to create directories for "
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        L7b:
            r4.e(r1, r6)
            boolean r6 = r1.renameTo(r5)
            if (r6 == 0) goto L85
            return
        L85:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to move intermediate file ("
            r0.append(r2)
            java.lang.String r1 = r1.getAbsolutePath()
            r0.append(r1)
            java.lang.String r1 = ") to destination ("
            r0.append(r1)
            java.lang.String r5 = r5.getAbsolutePath()
            r0.append(r5)
            java.lang.String r5 = ")."
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            r6.<init>(r5)
            throw r6
        Lb1:
            r5 = move-exception
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "inputStreamCallable exception on call"
            r6.<init>(r0, r5)
            throw r6
        Lba:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "copyFromAssetPath, copyFromFile and copyFromInputStream are all null!"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.k0.c(java.io.File, boolean):void");
    }

    private void e(File file, boolean z10) {
        j jVar = this.f3733s;
        if (jVar != null) {
            Objects.requireNonNull(jVar);
        }
    }

    private void g(boolean z10) {
        String databaseName = getDatabaseName();
        File databasePath = this.f3727m.getDatabasePath(databaseName);
        j jVar = this.f3733s;
        s0.a aVar = new s0.a(databaseName, this.f3727m.getFilesDir(), jVar == null || jVar.f3712l);
        try {
            aVar.b();
            if (!databasePath.exists()) {
                try {
                    c(databasePath, z10);
                    aVar.c();
                    return;
                } catch (IOException e5) {
                    throw new RuntimeException("Unable to copy database file.", e5);
                }
            }
            if (this.f3733s == null) {
                aVar.c();
                return;
            }
            try {
                int iE = s0.c.e(databasePath);
                int i10 = this.f3731q;
                if (iE == i10) {
                    aVar.c();
                    return;
                }
                if (this.f3733s.a(iE, i10)) {
                    aVar.c();
                    return;
                }
                if (this.f3727m.deleteDatabase(databaseName)) {
                    try {
                        c(databasePath, z10);
                    } catch (IOException e10) {
                        Log.w("ROOM", "Unable to copy database file.", e10);
                    }
                } else {
                    Log.w("ROOM", "Failed to delete database file (" + databaseName + ") for a copy destructive migration.");
                }
                aVar.c();
                return;
            } catch (IOException e11) {
                Log.w("ROOM", "Unable to read database version.", e11);
                aVar.c();
                return;
            }
        } catch (Throwable th) {
            aVar.c();
            throw th;
        }
        aVar.c();
        throw th;
    }

    @Override // u0.h
    public synchronized u0.g P() {
        if (!this.f3734t) {
            g(true);
            this.f3734t = true;
        }
        return this.f3732r.P();
    }

    @Override // androidx.room.k
    public u0.h a() {
        return this.f3732r;
    }

    @Override // u0.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f3732r.close();
        this.f3734t = false;
    }

    void f(j jVar) {
        this.f3733s = jVar;
    }

    @Override // u0.h
    public String getDatabaseName() {
        return this.f3732r.getDatabaseName();
    }

    @Override // u0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f3732r.setWriteAheadLoggingEnabled(z10);
    }
}
