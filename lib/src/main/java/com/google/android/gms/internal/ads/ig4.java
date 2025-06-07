package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class ig4 implements jh4 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f9734a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private final HashSet f9735b = new HashSet(1);

    /* renamed from: c, reason: collision with root package name */
    private final qh4 f9736c = new qh4();

    /* renamed from: d, reason: collision with root package name */
    private final fe4 f9737d = new fe4();

    /* renamed from: e, reason: collision with root package name */
    private Looper f9738e;

    /* renamed from: f, reason: collision with root package name */
    private h11 f9739f;

    /* renamed from: g, reason: collision with root package name */
    private xb4 f9740g;

    @Override // com.google.android.gms.internal.ads.jh4
    public final void b(ge4 ge4Var) {
        this.f9737d.c(ge4Var);
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void c(ih4 ih4Var) {
        boolean z10 = !this.f9735b.isEmpty();
        this.f9735b.remove(ih4Var);
        if (z10 && this.f9735b.isEmpty()) {
            q();
        }
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void e(ih4 ih4Var) {
        this.f9734a.remove(ih4Var);
        if (!this.f9734a.isEmpty()) {
            c(ih4Var);
            return;
        }
        this.f9738e = null;
        this.f9739f = null;
        this.f9740g = null;
        this.f9735b.clear();
        v();
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void f(Handler handler, rh4 rh4Var) {
        Objects.requireNonNull(rh4Var);
        this.f9736c.b(handler, rh4Var);
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public /* synthetic */ h11 g0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void h(Handler handler, ge4 ge4Var) {
        Objects.requireNonNull(ge4Var);
        this.f9737d.b(handler, ge4Var);
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void i(ih4 ih4Var) {
        Objects.requireNonNull(this.f9738e);
        boolean zIsEmpty = this.f9735b.isEmpty();
        this.f9735b.add(ih4Var);
        if (zIsEmpty) {
            r();
        }
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void j(ih4 ih4Var, wy3 wy3Var, xb4 xb4Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f9738e;
        boolean z10 = true;
        if (looper != null && looper != looperMyLooper) {
            z10 = false;
        }
        gt1.d(z10);
        this.f9740g = xb4Var;
        h11 h11Var = this.f9739f;
        this.f9734a.add(ih4Var);
        if (this.f9738e == null) {
            this.f9738e = looperMyLooper;
            this.f9735b.add(ih4Var);
            s(wy3Var);
        } else if (h11Var != null) {
            i(ih4Var);
            ih4Var.a(this, h11Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public final void k(rh4 rh4Var) {
        this.f9736c.m(rh4Var);
    }

    protected final xb4 l() {
        xb4 xb4Var = this.f9740g;
        gt1.b(xb4Var);
        return xb4Var;
    }

    protected final fe4 m(hh4 hh4Var) {
        return this.f9737d.a(0, hh4Var);
    }

    protected final fe4 n(int i10, hh4 hh4Var) {
        return this.f9737d.a(0, hh4Var);
    }

    protected final qh4 o(hh4 hh4Var) {
        return this.f9736c.a(0, hh4Var, 0L);
    }

    protected final qh4 p(int i10, hh4 hh4Var, long j10) {
        return this.f9736c.a(0, hh4Var, 0L);
    }

    protected void q() {
    }

    protected void r() {
    }

    protected abstract void s(wy3 wy3Var);

    protected final void t(h11 h11Var) {
        this.f9739f = h11Var;
        ArrayList arrayList = this.f9734a;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((ih4) arrayList.get(i10)).a(this, h11Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.jh4
    public /* synthetic */ boolean u() {
        return true;
    }

    protected abstract void v();

    protected final boolean w() {
        return !this.f9735b.isEmpty();
    }
}
