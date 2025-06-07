package androidx.room;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import u0.h;

/* loaded from: classes.dex */
public class j0 extends h.a {

    /* renamed from: b, reason: collision with root package name */
    private j f3720b;

    /* renamed from: c, reason: collision with root package name */
    private final a f3721c;

    /* renamed from: d, reason: collision with root package name */
    private final String f3722d;

    /* renamed from: e, reason: collision with root package name */
    private final String f3723e;

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f3724a;

        public a(int i10) {
            this.f3724a = i10;
        }

        protected abstract void a(u0.g gVar);

        protected abstract void b(u0.g gVar);

        protected abstract void c(u0.g gVar);

        protected abstract void d(u0.g gVar);

        protected abstract void e(u0.g gVar);

        protected abstract void f(u0.g gVar);

        protected abstract b g(u0.g gVar);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f3725a;

        /* renamed from: b, reason: collision with root package name */
        public final String f3726b;

        public b(boolean z10, String str) {
            this.f3725a = z10;
            this.f3726b = str;
        }
    }

    public j0(j jVar, a aVar, String str, String str2) {
        super(aVar.f3724a);
        this.f3720b = jVar;
        this.f3721c = aVar;
        this.f3722d = str;
        this.f3723e = str2;
    }

    private void h(u0.g gVar) {
        if (!k(gVar)) {
            b bVarG = this.f3721c.g(gVar);
            if (bVarG.f3725a) {
                this.f3721c.e(gVar);
                l(gVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f3726b);
            }
        }
        Cursor cursorR = gVar.r(new u0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorR.moveToFirst() ? cursorR.getString(0) : null;
            cursorR.close();
            if (!this.f3722d.equals(string) && !this.f3723e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorR.close();
            throw th;
        }
    }

    private void i(u0.g gVar) {
        gVar.p("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    private static boolean j(u0.g gVar) {
        Cursor cursorS = gVar.S("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = false;
            if (cursorS.moveToFirst()) {
                if (cursorS.getInt(0) == 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            cursorS.close();
        }
    }

    private static boolean k(u0.g gVar) {
        Cursor cursorS = gVar.S("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = false;
            if (cursorS.moveToFirst()) {
                if (cursorS.getInt(0) != 0) {
                    z10 = true;
                }
            }
            return z10;
        } finally {
            cursorS.close();
        }
    }

    private void l(u0.g gVar) {
        i(gVar);
        gVar.p(q0.k.a(this.f3722d));
    }

    @Override // u0.h.a
    public void b(u0.g gVar) {
        super.b(gVar);
    }

    @Override // u0.h.a
    public void d(u0.g gVar) {
        boolean zJ = j(gVar);
        this.f3721c.a(gVar);
        if (!zJ) {
            b bVarG = this.f3721c.g(gVar);
            if (!bVarG.f3725a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f3726b);
            }
        }
        l(gVar);
        this.f3721c.c(gVar);
    }

    @Override // u0.h.a
    public void e(u0.g gVar, int i10, int i11) {
        g(gVar, i10, i11);
    }

    @Override // u0.h.a
    public void f(u0.g gVar) {
        super.f(gVar);
        h(gVar);
        this.f3721c.d(gVar);
        this.f3720b = null;
    }

    @Override // u0.h.a
    public void g(u0.g gVar, int i10, int i11) {
        boolean z10;
        List listC;
        j jVar = this.f3720b;
        if (jVar == null || (listC = jVar.f3704d.c(i10, i11)) == null) {
            z10 = false;
        } else {
            this.f3721c.f(gVar);
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                ((r0.b) it.next()).a(gVar);
            }
            b bVarG = this.f3721c.g(gVar);
            if (!bVarG.f3725a) {
                throw new IllegalStateException("Migration didn't properly handle: " + bVarG.f3726b);
            }
            this.f3721c.e(gVar);
            l(gVar);
            z10 = true;
        }
        if (z10) {
            return;
        }
        j jVar2 = this.f3720b;
        if (jVar2 != null && !jVar2.a(i10, i11)) {
            this.f3721c.b(gVar);
            this.f3721c.a(gVar);
            return;
        }
        throw new IllegalStateException("A migration from " + i10 + " to " + i11 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
    }
}
