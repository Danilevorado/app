package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes.dex */
final class b5 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f19783a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f19784b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f19785c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ o5 f19786d;

    b5(o5 o5Var, String str, String str2, String str3) {
        this.f19786d = o5Var;
        this.f19783a = str;
        this.f19784b = str2;
        this.f19785c = str3;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.f19786d.f20244m.c();
        return this.f19786d.f20244m.W().d0(this.f19783a, this.f19784b, this.f19785c);
    }
}
