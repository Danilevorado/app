package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.os.Bundle;

/* loaded from: classes.dex */
final class l2 extends k2 {

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ Bundle f19056q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ Activity f19057r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ t2 f19058s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l2(t2 t2Var, Bundle bundle, Activity activity) {
        super(t2Var.f19316m, true);
        this.f19058s = t2Var;
        this.f19056q = bundle;
        this.f19057r = activity;
    }

    @Override // com.google.android.gms.internal.measurement.k2
    final void a() {
        Bundle bundle;
        if (this.f19056q != null) {
            bundle = new Bundle();
            if (this.f19056q.containsKey("com.google.app_measurement.screen_service")) {
                Object obj = this.f19056q.get("com.google.app_measurement.screen_service");
                if (obj instanceof Bundle) {
                    bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                }
            }
        } else {
            bundle = null;
        }
        ((f1) e4.p.l(this.f19058s.f19316m.f19340i)).onActivityCreated(l4.b.p1(this.f19057r), bundle, this.f19044n);
    }
}
