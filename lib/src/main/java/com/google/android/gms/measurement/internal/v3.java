package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes.dex */
final class v3 implements Runnable {

    /* renamed from: m, reason: collision with root package name */
    private final u3 f20467m;

    /* renamed from: n, reason: collision with root package name */
    private final int f20468n;

    /* renamed from: o, reason: collision with root package name */
    private final Throwable f20469o;

    /* renamed from: p, reason: collision with root package name */
    private final byte[] f20470p;

    /* renamed from: q, reason: collision with root package name */
    private final String f20471q;

    /* renamed from: r, reason: collision with root package name */
    private final Map f20472r;

    /* synthetic */ v3(String str, u3 u3Var, int i10, Throwable th, byte[] bArr, Map map, x4.h hVar) {
        e4.p.l(u3Var);
        this.f20467m = u3Var;
        this.f20468n = i10;
        this.f20469o = th;
        this.f20470p = bArr;
        this.f20471q = str;
        this.f20472r = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20467m.a(this.f20471q, this.f20468n, this.f20469o, this.f20470p, this.f20472r);
    }
}
