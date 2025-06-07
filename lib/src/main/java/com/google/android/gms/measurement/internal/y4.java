package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class y4 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ d f20583m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ z9 f20584n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ o5 f20585o;

    y4(o5 o5Var, d dVar, z9 z9Var) {
        this.f20585o = o5Var;
        this.f20583m = dVar;
        this.f20584n = z9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20585o.f20244m.c();
        if (this.f20583m.f19840o.f() == null) {
            this.f20585o.f20244m.r(this.f20583m, this.f20584n);
        } else {
            this.f20585o.f20244m.y(this.f20583m, this.f20584n);
        }
    }
}
