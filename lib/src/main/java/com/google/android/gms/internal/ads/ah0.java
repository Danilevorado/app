package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class ah0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f6082a;

    /* renamed from: b, reason: collision with root package name */
    private final lh0 f6083b;

    /* renamed from: c, reason: collision with root package name */
    private final ViewGroup f6084c;

    /* renamed from: d, reason: collision with root package name */
    private zg0 f6085d;

    public ah0(Context context, ViewGroup viewGroup, nk0 nk0Var) {
        this.f6082a = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f6084c = viewGroup;
        this.f6083b = nk0Var;
        this.f6085d = null;
    }

    public final zg0 a() {
        return this.f6085d;
    }

    public final Integer b() {
        zg0 zg0Var = this.f6085d;
        if (zg0Var != null) {
            return zg0Var.u();
        }
        return null;
    }

    public final void c(int i10, int i11, int i12, int i13) {
        e4.p.e("The underlay may only be modified from the UI thread.");
        zg0 zg0Var = this.f6085d;
        if (zg0Var != null) {
            zg0Var.n(i10, i11, i12, i13);
        }
    }

    public final void d(int i10, int i11, int i12, int i13, int i14, boolean z10, kh0 kh0Var) {
        if (this.f6085d != null) {
            return;
        }
        sr.a(this.f6083b.n().a(), this.f6083b.k(), "vpr2");
        Context context = this.f6082a;
        lh0 lh0Var = this.f6083b;
        zg0 zg0Var = new zg0(context, lh0Var, i14, z10, lh0Var.n().a(), kh0Var);
        this.f6085d = zg0Var;
        this.f6084c.addView(zg0Var, 0, new ViewGroup.LayoutParams(-1, -1));
        this.f6085d.n(i10, i11, i12, i13);
        this.f6083b.A(false);
    }

    public final void e() {
        e4.p.e("onDestroy must be called from the UI thread.");
        zg0 zg0Var = this.f6085d;
        if (zg0Var != null) {
            zg0Var.y();
            this.f6084c.removeView(this.f6085d);
            this.f6085d = null;
        }
    }

    public final void f() {
        e4.p.e("onPause must be called from the UI thread.");
        zg0 zg0Var = this.f6085d;
        if (zg0Var != null) {
            zg0Var.E();
        }
    }

    public final void g(int i10) {
        zg0 zg0Var = this.f6085d;
        if (zg0Var != null) {
            zg0Var.j(i10);
        }
    }
}
