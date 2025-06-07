package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class c5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19813a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f19814b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f19815c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o5 f19816d;

    c5(o5 o5Var, String str, String str2, String str3) {
        this.f19816d = o5Var;
        this.f19813a = str;
        this.f19814b = str2;
        this.f19815c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f19816d.f20244m.c();
        return this.f19816d.f20244m.W().a0(this.f19813a, this.f19814b, this.f19815c);
    }
}
