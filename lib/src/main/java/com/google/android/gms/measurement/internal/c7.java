package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class c7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ a7 f19822m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ a7 f19823n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ long f19824o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ boolean f19825p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ h7 f19826q;

    c7(h7 h7Var, a7 a7Var, a7 a7Var2, long j10, boolean z10) {
        this.f19826q = h7Var;
        this.f19822m = a7Var;
        this.f19823n = a7Var2;
        this.f19824o = j10;
        this.f19825p = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19826q.n(this.f19822m, this.f19823n, this.f19824o, this.f19825p, null);
    }
}
