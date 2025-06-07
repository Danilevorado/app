package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.Context;

/* loaded from: classes.dex */
final class e8 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ g8 f19886m;

    e8(g8 g8Var) {
        this.f19886m = g8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f19886m.f19950o;
        Context contextA = h8Var.f20269a.a();
        this.f19886m.f19950o.f20269a.x();
        h8.M(h8Var, new ComponentName(contextA, "com.google.android.gms.measurement.AppMeasurementService"));
    }
}
