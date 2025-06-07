package v0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import u0.h;

/* loaded from: classes.dex */
class d implements h {

    /* renamed from: m, reason: collision with root package name */
    private final Context f27785m;

    /* renamed from: n, reason: collision with root package name */
    private final String f27786n;

    /* renamed from: o, reason: collision with root package name */
    private final h.a f27787o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f27788p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f27789q;

    /* renamed from: r, reason: collision with root package name */
    private final Object f27790r = new Object();

    /* renamed from: s, reason: collision with root package name */
    private b f27791s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f27792t;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27793a;

        static {
            int[] iArr = new int[b.c.values().length];
            f27793a = iArr;
            try {
                iArr[b.c.ON_CONFIGURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27793a[b.c.ON_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27793a[b.c.ON_UPGRADE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27793a[b.c.ON_DOWNGRADE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27793a[b.c.ON_OPEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static class b extends SQLiteOpenHelper {

        /* renamed from: m, reason: collision with root package name */
        final v0.c[] f27794m;

        /* renamed from: n, reason: collision with root package name */
        final Context f27795n;

        /* renamed from: o, reason: collision with root package name */
        final h.a f27796o;

        /* renamed from: p, reason: collision with root package name */
        final boolean f27797p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f27798q;

        /* renamed from: r, reason: collision with root package name */
        private final w0.a f27799r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f27800s;

        class a implements DatabaseErrorHandler {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ h.a f27801a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ v0.c[] f27802b;

            a(h.a aVar, v0.c[] cVarArr) {
                this.f27801a = aVar;
                this.f27802b = cVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f27801a.c(b.e(this.f27802b, sQLiteDatabase));
            }
        }

        /* renamed from: v0.d$b$b, reason: collision with other inner class name */
        private static final class C0196b extends RuntimeException {

            /* renamed from: m, reason: collision with root package name */
            private final c f27803m;

            /* renamed from: n, reason: collision with root package name */
            private final Throwable f27804n;

            C0196b(c cVar, Throwable th) {
                super(th);
                this.f27803m = cVar;
                this.f27804n = th;
            }

            public c a() {
                return this.f27803m;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f27804n;
            }
        }

        enum c {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        b(Context context, String str, v0.c[] cVarArr, h.a aVar, boolean z10) {
            super(context, str, null, aVar.f27527a, new a(aVar, cVarArr));
            this.f27795n = context;
            this.f27796o = aVar;
            this.f27794m = cVarArr;
            this.f27797p = z10;
            this.f27799r = new w0.a(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
        }

        static v0.c e(v0.c[] cVarArr, SQLiteDatabase sQLiteDatabase) {
            v0.c cVar = cVarArr[0];
            if (cVar == null || !cVar.e(sQLiteDatabase)) {
                cVarArr[0] = new v0.c(sQLiteDatabase);
            }
            return cVarArr[0];
        }

        private SQLiteDatabase f(boolean z10) {
            return z10 ? super.getWritableDatabase() : super.getReadableDatabase();
        }

        private SQLiteDatabase g(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            if (databaseName != null && (parentFile = this.f27795n.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return f(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return f(z10);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof C0196b) {
                        C0196b c0196b = th;
                        Throwable cause = c0196b.getCause();
                        int i10 = a.f27793a[c0196b.a().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
                            w0.b.a(cause);
                        }
                        if (!(cause instanceof SQLiteException)) {
                            w0.b.a(cause);
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f27797p) {
                        w0.b.a(th);
                    }
                    this.f27795n.deleteDatabase(databaseName);
                    try {
                        return f(z10);
                    } catch (C0196b e5) {
                        w0.b.a(e5.getCause());
                        return null;
                    }
                }
            }
        }

        u0.g a(boolean z10) {
            u0.g gVarC;
            try {
                this.f27799r.c((this.f27800s || getDatabaseName() == null) ? false : true);
                this.f27798q = false;
                SQLiteDatabase sQLiteDatabaseG = g(z10);
                if (this.f27798q) {
                    close();
                    gVarC = a(z10);
                } else {
                    gVarC = c(sQLiteDatabaseG);
                }
                return gVarC;
            } finally {
                this.f27799r.d();
            }
        }

        v0.c c(SQLiteDatabase sQLiteDatabase) {
            return e(this.f27794m, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                this.f27799r.b();
                super.close();
                this.f27794m[0] = null;
                this.f27800s = false;
            } finally {
                this.f27799r.d();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            try {
                this.f27796o.b(c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C0196b(c.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            try {
                this.f27796o.d(c(sQLiteDatabase));
            } catch (Throwable th) {
                throw new C0196b(c.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f27798q = true;
            try {
                this.f27796o.e(c(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new C0196b(c.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (!this.f27798q) {
                try {
                    this.f27796o.f(c(sQLiteDatabase));
                } catch (Throwable th) {
                    throw new C0196b(c.ON_OPEN, th);
                }
            }
            this.f27800s = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            this.f27798q = true;
            try {
                this.f27796o.g(c(sQLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new C0196b(c.ON_UPGRADE, th);
            }
        }
    }

    d(Context context, String str, h.a aVar, boolean z10, boolean z11) {
        this.f27785m = context;
        this.f27786n = str;
        this.f27787o = aVar;
        this.f27788p = z10;
        this.f27789q = z11;
    }

    private b a() {
        b bVar;
        synchronized (this.f27790r) {
            if (this.f27791s == null) {
                c[] cVarArr = new c[1];
                if (this.f27786n == null || !this.f27788p) {
                    this.f27791s = new b(this.f27785m, this.f27786n, cVarArr, this.f27787o, this.f27789q);
                } else {
                    this.f27791s = new b(this.f27785m, new File(u0.d.a(this.f27785m), this.f27786n).getAbsolutePath(), cVarArr, this.f27787o, this.f27789q);
                }
                u0.b.d(this.f27791s, this.f27792t);
            }
            bVar = this.f27791s;
        }
        return bVar;
    }

    @Override // u0.h
    public u0.g P() {
        return a().a(true);
    }

    @Override // u0.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // u0.h
    public String getDatabaseName() {
        return this.f27786n;
    }

    @Override // u0.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        synchronized (this.f27790r) {
            b bVar = this.f27791s;
            if (bVar != null) {
                u0.b.d(bVar, z10);
            }
            this.f27792t = z10;
        }
    }
}
