package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
final class b6 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    final /* synthetic */ String f19787m;

    /* renamed from: n, reason: collision with root package name */
    final /* synthetic */ String f19788n;

    /* renamed from: o, reason: collision with root package name */
    final /* synthetic */ long f19789o;

    /* renamed from: p, reason: collision with root package name */
    final /* synthetic */ Bundle f19790p;

    /* renamed from: q, reason: collision with root package name */
    final /* synthetic */ boolean f19791q;

    /* renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f19792r;

    /* renamed from: s, reason: collision with root package name */
    final /* synthetic */ boolean f19793s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ String f19794t;

    /* renamed from: u, reason: collision with root package name */
    final /* synthetic */ v6 f19795u;

    b6(v6 v6Var, String str, String str2, long j10, Bundle bundle, boolean z10, boolean z11, boolean z12, String str3) {
        this.f19795u = v6Var;
        this.f19787m = str;
        this.f19788n = str2;
        this.f19789o = j10;
        this.f19790p = bundle;
        this.f19791q = z10;
        this.f19792r = z11;
        this.f19793s = z12;
        this.f19794t = str3;
    }

    @Override // java.lang.Runnable
    public final void run() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.f19795u.u(this.f19787m, this.f19788n, this.f19789o, this.f19790p, this.f19791q, this.f19792r, this.f19793s, this.f19794t);
    }
}
