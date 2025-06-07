package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class w7 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ z9 f20544m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ boolean f20545n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ v f20546o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ String f20547p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ h8 f20548q;

    w7(h8 h8Var, boolean z10, z9 z9Var, boolean z11, v vVar, String str) {
        this.f20548q = h8Var;
        this.f20544m = z9Var;
        this.f20545n = z11;
        this.f20546o = vVar;
        this.f20547p = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        h8 h8Var = this.f20548q;
        x4.f fVar = h8Var.f19989d;
        if (fVar == null) {
            h8Var.f20269a.b().p().a("Discarding data. Failed to send event to service");
            return;
        }
        e4.p.l(this.f20544m);
        this.f20548q.p(fVar, this.f20545n ? null : this.f20546o, this.f20544m);
        this.f20548q.E();
    }
}
