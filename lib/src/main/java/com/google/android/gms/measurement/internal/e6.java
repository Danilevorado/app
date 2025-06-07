package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class e6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Bundle f19882m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f19883n;

    e6(v6 v6Var, Bundle bundle) {
        this.f19883n = v6Var;
        this.f19882m = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v6 v6Var = this.f19883n;
        Bundle bundle = this.f19882m;
        v6Var.f();
        v6Var.g();
        e4.p.l(bundle);
        String string = bundle.getString("name");
        String string2 = bundle.getString("origin");
        e4.p.f(string);
        e4.p.f(string2);
        e4.p.l(bundle.get("value"));
        if (!v6Var.f20269a.m()) {
            v6Var.f20269a.b().t().a("Conditional property not set since app measurement is disabled");
            return;
        }
        q9 q9Var = new q9(string, bundle.getLong("triggered_timestamp"), bundle.get("value"), string2);
        try {
            v vVarW0 = v6Var.f20269a.N().w0(bundle.getString("app_id"), bundle.getString("triggered_event_name"), bundle.getBundle("triggered_event_params"), string2, 0L, true, true);
            v6Var.f20269a.L().q(new d(bundle.getString("app_id"), string2, q9Var, bundle.getLong("creation_timestamp"), false, bundle.getString("trigger_event_name"), v6Var.f20269a.N().w0(bundle.getString("app_id"), bundle.getString("timed_out_event_name"), bundle.getBundle("timed_out_event_params"), string2, 0L, true, true), bundle.getLong("trigger_timeout"), vVarW0, bundle.getLong("time_to_live"), v6Var.f20269a.N().w0(bundle.getString("app_id"), bundle.getString("expired_event_name"), bundle.getBundle("expired_event_params"), string2, 0L, true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
