package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
final class i9 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f20074m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f20075n = "_err";

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ Bundle f20076o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ k9 f20077p;

    i9(k9 k9Var, String str, String str2, Bundle bundle) {
        this.f20077p = k9Var;
        this.f20074m = str;
        this.f20076o = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20077p.f20138a.i((v) e4.p.l(this.f20077p.f20138a.h0().w0(this.f20074m, this.f20075n, this.f20076o, "auto", this.f20077p.f20138a.d().a(), false, true)), this.f20074m);
    }
}
