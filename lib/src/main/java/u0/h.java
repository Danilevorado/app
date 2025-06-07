package u0;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public interface h extends Closeable {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f27527a;

        public a(int i10) {
            this.f27527a = i10;
        }

        private void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                u0.b.a(new File(str));
            } catch (Exception e5) {
                Log.w("SupportSQLite", "delete failed: ", e5);
            }
        }

        public void b(g gVar) {
        }

        public void c(g gVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + gVar.z());
            if (!gVar.m()) {
                a(gVar.z());
                return;
            }
            List listN = null;
            try {
                try {
                    listN = gVar.n();
                } finally {
                    if (listN != null) {
                        Iterator it = listN.iterator();
                        while (it.hasNext()) {
                            a((String) ((Pair) it.next()).second);
                        }
                    } else {
                        a(gVar.z());
                    }
                }
            } catch (SQLiteException unused) {
            }
            try {
                gVar.close();
            } catch (IOException unused2) {
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g gVar) {
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f27528a;

        /* renamed from: b, reason: collision with root package name */
        public final String f27529b;

        /* renamed from: c, reason: collision with root package name */
        public final a f27530c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f27531d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f27532e;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            Context f27533a;

            /* renamed from: b, reason: collision with root package name */
            String f27534b;

            /* renamed from: c, reason: collision with root package name */
            a f27535c;

            /* renamed from: d, reason: collision with root package name */
            boolean f27536d;

            /* renamed from: e, reason: collision with root package name */
            boolean f27537e;

            a(Context context) {
                this.f27533a = context;
            }

            public a a(boolean z10) {
                this.f27537e = z10;
                return this;
            }

            public b b() {
                if (this.f27535c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f27533a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f27536d && TextUtils.isEmpty(this.f27534b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f27533a, this.f27534b, this.f27535c, this.f27536d, this.f27537e);
            }

            public a c(a aVar) {
                this.f27535c = aVar;
                return this;
            }

            public a d(String str) {
                this.f27534b = str;
                return this;
            }

            public a e(boolean z10) {
                this.f27536d = z10;
                return this;
            }
        }

        b(Context context, String str, a aVar, boolean z10, boolean z11) {
            this.f27528a = context;
            this.f27529b = str;
            this.f27530c = aVar;
            this.f27531d = z10;
            this.f27532e = z11;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    public interface c {
        h a(b bVar);
    }

    g P();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
