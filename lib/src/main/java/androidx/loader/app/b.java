package androidx.loader.app;

import androidx.lifecycle.f0;
import androidx.lifecycle.g0;
import androidx.lifecycle.h0;
import androidx.lifecycle.j0;
import androidx.lifecycle.n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import q.h;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: a, reason: collision with root package name */
    private final n f3184a;

    /* renamed from: b, reason: collision with root package name */
    private final a f3185b;

    static class a extends f0 {

        /* renamed from: f, reason: collision with root package name */
        private static final g0.b f3186f = new C0050a();

        /* renamed from: d, reason: collision with root package name */
        private h f3187d = new h();

        /* renamed from: e, reason: collision with root package name */
        private boolean f3188e = false;

        /* renamed from: androidx.loader.app.b$a$a, reason: collision with other inner class name */
        static class C0050a implements g0.b {
            C0050a() {
            }

            @Override // androidx.lifecycle.g0.b
            public f0 a(Class cls) {
                return new a();
            }

            @Override // androidx.lifecycle.g0.b
            public /* synthetic */ f0 b(Class cls, n0.a aVar) {
                return h0.b(this, cls, aVar);
            }
        }

        a() {
        }

        static a g(j0 j0Var) {
            return (a) new g0(j0Var, f3186f).a(a.class);
        }

        @Override // androidx.lifecycle.f0
        protected void d() {
            super.d();
            if (this.f3187d.m() <= 0) {
                this.f3187d.b();
            } else {
                a5.a.a(this.f3187d.r(0));
                throw null;
            }
        }

        public void f(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f3187d.m() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("    ");
                if (this.f3187d.m() <= 0) {
                    return;
                }
                a5.a.a(this.f3187d.r(0));
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(this.f3187d.j(0));
                printWriter.print(": ");
                throw null;
            }
        }

        void h() {
            if (this.f3187d.m() <= 0) {
                return;
            }
            a5.a.a(this.f3187d.r(0));
            throw null;
        }
    }

    b(n nVar, j0 j0Var) {
        this.f3184a = nVar;
        this.f3185b = a.g(j0Var);
    }

    @Override // androidx.loader.app.a
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f3185b.f(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f3185b.h();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("LoaderManager{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" in ");
        androidx.core.util.b.a(this.f3184a, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
