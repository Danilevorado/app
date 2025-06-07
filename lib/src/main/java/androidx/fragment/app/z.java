package androidx.fragment.app;

import android.app.Application;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.g0;
import androidx.lifecycle.j;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;

/* loaded from: classes.dex */
class z implements androidx.lifecycle.i, t0.e, k0 {

    /* renamed from: m, reason: collision with root package name */
    private final Fragment f3054m;

    /* renamed from: n, reason: collision with root package name */
    private final j0 f3055n;

    /* renamed from: o, reason: collision with root package name */
    private g0.b f3056o;

    /* renamed from: p, reason: collision with root package name */
    private androidx.lifecycle.o f3057p = null;

    /* renamed from: q, reason: collision with root package name */
    private t0.d f3058q = null;

    z(Fragment fragment, j0 j0Var) {
        this.f3054m = fragment;
        this.f3055n = j0Var;
    }

    void a(j.b bVar) {
        this.f3057p.h(bVar);
    }

    @Override // t0.e
    public t0.c c() {
        d();
        return this.f3058q.b();
    }

    void d() {
        if (this.f3057p == null) {
            this.f3057p = new androidx.lifecycle.o(this);
            this.f3058q = t0.d.a(this);
        }
    }

    boolean e() {
        return this.f3057p != null;
    }

    void f(Bundle bundle) {
        this.f3058q.d(bundle);
    }

    void g(Bundle bundle) {
        this.f3058q.e(bundle);
    }

    void h(j.c cVar) {
        this.f3057p.o(cVar);
    }

    @Override // androidx.lifecycle.i
    public g0.b l() {
        g0.b bVarL = this.f3054m.l();
        if (!bVarL.equals(this.f3054m.f2667h0)) {
            this.f3056o = bVarL;
            return bVarL;
        }
        if (this.f3056o == null) {
            Application application = null;
            Object applicationContext = this.f3054m.t1().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f3056o = new androidx.lifecycle.c0(application, this, this.f3054m.t());
        }
        return this.f3056o;
    }

    @Override // androidx.lifecycle.i
    public /* synthetic */ n0.a m() {
        return androidx.lifecycle.h.a(this);
    }

    @Override // androidx.lifecycle.k0
    public j0 r() {
        d();
        return this.f3055n;
    }

    @Override // androidx.lifecycle.n
    public androidx.lifecycle.j s() {
        d();
        return this.f3057p;
    }
}
