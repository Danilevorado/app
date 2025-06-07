package com.google.android.gms.common.api.internal;

import android.util.Log;

/* loaded from: classes.dex */
final class o0 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ b4.b f5784m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ p0 f5785n;

    o0(p0 p0Var, b4.b bVar) {
        this.f5785n = p0Var;
        this.f5784m = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p0 p0Var = this.f5785n;
        m0 m0Var = (m0) p0Var.f5794f.f5663v.get(p0Var.f5790b);
        if (m0Var == null) {
            return;
        }
        if (!this.f5784m.y()) {
            m0Var.F(this.f5784m, null);
            return;
        }
        this.f5785n.f5793e = true;
        if (this.f5785n.f5789a.s()) {
            this.f5785n.i();
            return;
        }
        try {
            p0 p0Var2 = this.f5785n;
            p0Var2.f5789a.p(null, p0Var2.f5789a.d());
        } catch (SecurityException e5) {
            Log.e("GoogleApiManager", "Failed to get service from broker. ", e5);
            this.f5785n.f5789a.f("Failed to get service from broker.");
            m0Var.F(new b4.b(10), null);
        }
    }
}
