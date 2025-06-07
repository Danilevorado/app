package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class a6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ long f19753m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ v6 f19754n;

    a6(v6 v6Var, long j10) {
        this.f19754n = v6Var;
        this.f19753m = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19754n.f20269a.F().f19928k.b(this.f19753m);
        this.f19754n.f20269a.b().o().b("Session timeout duration set", Long.valueOf(this.f19753m));
    }
}
