package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class y implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f20577m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ long f20578n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ a2 f20579o;

    y(a2 a2Var, String str, long j10) {
        this.f20579o = a2Var;
        this.f20577m = str;
        this.f20578n = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a2.h(this.f20579o, this.f20577m, this.f20578n);
    }
}
