package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.d;

/* loaded from: classes.dex */
public final class z0 extends u0 {

    /* renamed from: c, reason: collision with root package name */
    public final d.a f5850c;

    public z0(d.a aVar, b5.j jVar) {
        super(4, jVar);
        this.f5850c = aVar;
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final /* bridge */ /* synthetic */ void d(j jVar, boolean z10) {
    }

    @Override // d4.w
    public final boolean f(m0 m0Var) {
        a5.a.a(m0Var.u().get(this.f5850c));
        return false;
    }

    @Override // d4.w
    public final b4.d[] g(m0 m0Var) {
        a5.a.a(m0Var.u().get(this.f5850c));
        return null;
    }

    @Override // com.google.android.gms.common.api.internal.u0
    public final void h(m0 m0Var) {
        a5.a.a(m0Var.u().remove(this.f5850c));
        this.f5816b.e(Boolean.FALSE);
    }
}
