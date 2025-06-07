package com.google.android.gms.internal.ads;

import android.net.Uri;

/* loaded from: classes.dex */
public final class cj4 extends h11 {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f6940k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private static final v30 f6941l;

    /* renamed from: f, reason: collision with root package name */
    private final long f6942f;

    /* renamed from: g, reason: collision with root package name */
    private final long f6943g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f6944h;

    /* renamed from: i, reason: collision with root package name */
    private final v30 f6945i;

    /* renamed from: j, reason: collision with root package name */
    private final fu f6946j;

    static {
        rg rgVar = new rg();
        rgVar.a("SinglePeriodTimeline");
        rgVar.b(Uri.EMPTY);
        f6941l = rgVar.c();
    }

    public cj4(long j10, long j11, long j12, long j13, long j14, long j15, long j16, boolean z10, boolean z11, boolean z12, Object obj, v30 v30Var, fu fuVar) {
        this.f6942f = j13;
        this.f6943g = j14;
        this.f6944h = z10;
        this.f6945i = v30Var;
        this.f6946j = fuVar;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int a(Object obj) {
        return f6940k.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int b() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int c() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final ey0 d(int i10, ey0 ey0Var, boolean z10) {
        gt1.a(i10, 0, 1);
        ey0Var.k(null, z10 ? f6940k : null, 0, this.f6942f, 0L, k61.f10845d, false);
        return ey0Var;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final g01 e(int i10, g01 g01Var, long j10) {
        gt1.a(i10, 0, 1);
        g01Var.a(g01.f8518o, this.f6945i, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.f6944h, false, this.f6946j, 0L, this.f6943g, 0, 0, 0L);
        return g01Var;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final Object f(int i10) {
        gt1.a(i10, 0, 1);
        return f6940k;
    }
}
