package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class i5 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ v f20057m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20058n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ o5 f20059o;

    i5(o5 o5Var, v vVar, String str) {
        this.f20059o = o5Var;
        this.f20057m = vVar;
        this.f20058n = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20059o.f20244m.c();
        this.f20059o.f20244m.i(this.f20057m, this.f20058n);
    }
}
