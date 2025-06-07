package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class p6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ Boolean f20270m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f20271n;

    p6(v6 v6Var, Boolean bool) {
        this.f20271n = v6Var;
        this.f20270m = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20271n.O(this.f20270m, true);
    }
}
