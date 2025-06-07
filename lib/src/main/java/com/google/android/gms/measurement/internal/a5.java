package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class a5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19749a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f19750b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f19751c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o5 f19752d;

    a5(o5 o5Var, String str, String str2, String str3) {
        this.f19752d = o5Var;
        this.f19749a = str;
        this.f19750b = str2;
        this.f19751c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f19752d.f20244m.c();
        return this.f19752d.f20244m.W().d0(this.f19749a, this.f19750b, this.f19751c);
    }
}
