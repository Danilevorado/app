package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.api.a;
import e4.c;
import java.util.Set;

/* loaded from: classes.dex */
final class p0 implements c.InterfaceC0124c, d4.b0 {

    /* renamed from: a, reason: collision with root package name */
    private final a.f f5789a;

    /* renamed from: b, reason: collision with root package name */
    private final d4.b f5790b;

    /* renamed from: c, reason: collision with root package name */
    private e4.j f5791c = null;

    /* renamed from: d, reason: collision with root package name */
    private Set f5792d = null;

    /* renamed from: e, reason: collision with root package name */
    private boolean f5793e = false;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ c f5794f;

    public p0(c cVar, a.f fVar, d4.b bVar) {
        this.f5794f = cVar;
        this.f5789a = fVar;
        this.f5790b = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        e4.j jVar;
        if (!this.f5793e || (jVar = this.f5791c) == null) {
            return;
        }
        this.f5789a.p(jVar, this.f5792d);
    }

    @Override // e4.c.InterfaceC0124c
    public final void a(b4.b bVar) {
        this.f5794f.f5667z.post(new o0(this, bVar));
    }

    @Override // d4.b0
    public final void b(b4.b bVar) {
        m0 m0Var = (m0) this.f5794f.f5663v.get(this.f5790b);
        if (m0Var != null) {
            m0Var.G(bVar);
        }
    }

    @Override // d4.b0
    public final void c(e4.j jVar, Set set) {
        if (jVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new b4.b(4));
        } else {
            this.f5791c = jVar;
            this.f5792d = set;
            i();
        }
    }

    @Override // d4.b0
    public final void d(int i10) {
        m0 m0Var = (m0) this.f5794f.f5663v.get(this.f5790b);
        if (m0Var != null) {
            if (m0Var.f5774u) {
                m0Var.G(new b4.b(17));
            } else {
                m0Var.C(i10);
            }
        }
    }
}
