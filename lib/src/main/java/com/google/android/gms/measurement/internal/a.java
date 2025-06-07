package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class a implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f19736m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f19737n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ a2 f19738o;

    a(a2 a2Var, String str, long j10) {
        this.f19738o = a2Var;
        this.f19736m = str;
        this.f19737n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a2.g(this.f19738o, this.f19736m, this.f19737n);
    }
}
