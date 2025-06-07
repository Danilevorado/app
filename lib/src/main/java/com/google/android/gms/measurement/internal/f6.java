package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class f6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Bundle f19901m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f19902n;

    f6(v6 v6Var, Bundle bundle) {
        this.f19902n = v6Var;
        this.f19901m = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v6 v6Var = this.f19902n;
        Bundle bundle = this.f19901m;
        v6Var.f();
        v6Var.g();
        e4.p.l(bundle);
        String strF = e4.p.f(bundle.getString("name"));
        if (!v6Var.f20269a.m()) {
            v6Var.f20269a.b().t().a("Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            v6Var.f20269a.L().q(new d(bundle.getString("app_id"), "", new q9(strF, 0L, null, ""), bundle.getLong("creation_timestamp"), bundle.getBoolean("active"), bundle.getString("trigger_event_name"), null, bundle.getLong("trigger_timeout"), null, bundle.getLong("time_to_live"), v6Var.f20269a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), "", bundle.getLong("creation_timestamp"), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
