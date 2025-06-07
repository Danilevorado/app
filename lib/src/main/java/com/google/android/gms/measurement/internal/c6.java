package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class c6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f19817m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f19818n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Object f19819o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ long f19820p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ v6 f19821q;

    c6(v6 v6Var, String str, String str2, Object obj, long j10) {
        this.f19821q = v6Var;
        this.f19817m = str;
        this.f19818n = str2;
        this.f19819o = obj;
        this.f19820p = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19821q.M(this.f19817m, this.f19818n, this.f19819o, this.f19820p);
    }
}
