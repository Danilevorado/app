package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* loaded from: classes.dex */
public class di1 implements k3.a, xw, l3.t, zw, l3.e0 {

    /* renamed from: m, reason: collision with root package name */
    private k3.a f7324m;

    /* renamed from: n, reason: collision with root package name */
    private xw f7325n;

    /* renamed from: o, reason: collision with root package name */
    private l3.t f7326o;

    /* renamed from: p, reason: collision with root package name */
    private zw f7327p;

    /* renamed from: q, reason: collision with root package name */
    private l3.e0 f7328q;

    @Override // com.google.android.gms.internal.ads.zw
    public final synchronized void A(String str, String str2) {
        zw zwVar = this.f7327p;
        if (zwVar != null) {
            zwVar.A(str, str2);
        }
    }

    @Override // l3.t
    public final synchronized void C(int i10) {
        l3.t tVar = this.f7326o;
        if (tVar != null) {
            tVar.C(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.xw
    public final synchronized void D(String str, Bundle bundle) {
        xw xwVar = this.f7325n;
        if (xwVar != null) {
            xwVar.D(str, bundle);
        }
    }

    @Override // l3.t
    public final synchronized void L0() {
        l3.t tVar = this.f7326o;
        if (tVar != null) {
            tVar.L0();
        }
    }

    @Override // k3.a
    public final synchronized void O() {
        k3.a aVar = this.f7324m;
        if (aVar != null) {
            aVar.O();
        }
    }

    protected final synchronized void a(k3.a aVar, xw xwVar, l3.t tVar, zw zwVar, l3.e0 e0Var) {
        this.f7324m = aVar;
        this.f7325n = xwVar;
        this.f7326o = tVar;
        this.f7327p = zwVar;
        this.f7328q = e0Var;
    }

    @Override // l3.t
    public final synchronized void b() {
        l3.t tVar = this.f7326o;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // l3.t
    public final synchronized void c() {
        l3.t tVar = this.f7326o;
        if (tVar != null) {
            tVar.c();
        }
    }

    @Override // l3.e0
    public final synchronized void h() {
        l3.e0 e0Var = this.f7328q;
        if (e0Var != null) {
            e0Var.h();
        }
    }

    @Override // l3.t
    public final synchronized void w0() {
        l3.t tVar = this.f7326o;
        if (tVar != null) {
            tVar.w0();
        }
    }

    @Override // l3.t
    public final synchronized void x4() {
        l3.t tVar = this.f7326o;
        if (tVar != null) {
            tVar.x4();
        }
    }
}
