package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class b7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Bundle f19796m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ a7 f19797n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ a7 f19798o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ long f19799p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ h7 f19800q;

    b7(h7 h7Var, Bundle bundle, a7 a7Var, a7 a7Var2, long j10) {
        this.f19800q = h7Var;
        this.f19796m = bundle;
        this.f19797n = a7Var;
        this.f19798o = a7Var2;
        this.f19799p = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h7.v(this.f19800q, this.f19796m, this.f19797n, this.f19798o, this.f19799p);
    }
}
