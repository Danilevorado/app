package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class d5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19858a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f19859b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f19860c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o5 f19861d;

    d5(o5 o5Var, String str, String str2, String str3) {
        this.f19861d = o5Var;
        this.f19858a = str;
        this.f19859b = str2;
        this.f19860c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f19861d.f20244m.c();
        return this.f19861d.f20244m.W().a0(this.f19858a, this.f19859b, this.f19860c);
    }
}
