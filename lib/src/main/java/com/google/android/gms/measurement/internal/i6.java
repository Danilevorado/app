package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
final class i6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ AtomicReference f20060m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20061n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ String f20062o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ boolean f20063p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ v6 f20064q;

    i6(v6 v6Var, AtomicReference atomicReference, String str, String str2, String str3, boolean z10) {
        this.f20064q = v6Var;
        this.f20060m = atomicReference;
        this.f20061n = str2;
        this.f20062o = str3;
        this.f20063p = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20064q.f20269a.L().W(this.f20060m, null, this.f20061n, this.f20062o, this.f20063p);
    }
}
