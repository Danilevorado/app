package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class g6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f19943m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f19944n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f19945o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ v6 f19946p;

    g6(v6 v6Var, AtomicReference atomicReference, String str, String str2, String str3) {
        this.f19946p = v6Var;
        this.f19943m = atomicReference;
        this.f19944n = str2;
        this.f19945o = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19946p.f20269a.L().U(this.f19943m, null, this.f19944n, this.f19945o);
    }
}
