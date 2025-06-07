package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.res.Resources;

/* loaded from: classes.dex */
public final class k extends g1 {

    /* renamed from: r, reason: collision with root package name */
    private final q.b f5759r;

    /* renamed from: s, reason: collision with root package name */
    private final c f5760s;

    k(d4.f fVar, c cVar, b4.e eVar) {
        super(fVar, eVar);
        this.f5759r = new q.b();
        this.f5760s = cVar;
        this.f5639m.a("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, c cVar, d4.b bVar) {
        d4.f fVarC = LifecycleCallback.c(activity);
        k kVar = (k) fVarC.d("ConnectionlessLifecycleHelper", k.class);
        if (kVar == null) {
            kVar = new k(fVarC, cVar, b4.e.p());
        }
        e4.p.m(bVar, "ApiKey cannot be null");
        kVar.f5759r.add(bVar);
        cVar.a(kVar);
    }

    private final void v() {
        if (this.f5759r.isEmpty()) {
            return;
        }
        this.f5760s.a(this);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void h() {
        super.h();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.g1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void j() {
        super.j();
        v();
    }

    @Override // com.google.android.gms.common.api.internal.g1, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void k() {
        super.k();
        this.f5760s.b(this);
    }

    @Override // com.google.android.gms.common.api.internal.g1
    protected final void m(b4.b bVar, int i10) throws Resources.NotFoundException {
        this.f5760s.C(bVar, i10);
    }

    @Override // com.google.android.gms.common.api.internal.g1
    protected final void n() {
        this.f5760s.D();
    }

    final q.b t() {
        return this.f5759r;
    }
}
