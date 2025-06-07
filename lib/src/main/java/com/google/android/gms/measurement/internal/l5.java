package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class l5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f20155a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ o5 f20156b;

    l5(o5 o5Var, String str) {
        this.f20156b = o5Var;
        this.f20155a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f20156b.f20244m.c();
        return this.f20156b.f20244m.W().c0(this.f20155a);
    }
}
