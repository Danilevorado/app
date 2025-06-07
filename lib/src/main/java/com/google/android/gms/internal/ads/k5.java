package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class k5 implements h5 {

    /* renamed from: a, reason: collision with root package name */
    private final jm2 f10816a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10817b;

    /* renamed from: c, reason: collision with root package name */
    private final int f10818c;

    /* renamed from: d, reason: collision with root package name */
    private int f10819d;

    /* renamed from: e, reason: collision with root package name */
    private int f10820e;

    public k5(c5 c5Var) {
        jm2 jm2Var = c5Var.f6776b;
        this.f10816a = jm2Var;
        jm2Var.f(12);
        this.f10818c = jm2Var.v() & 255;
        this.f10817b = jm2Var.v();
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int a() {
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int b() {
        return this.f10817b;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int d() {
        int i10 = this.f10818c;
        if (i10 == 8) {
            return this.f10816a.s();
        }
        if (i10 == 16) {
            return this.f10816a.w();
        }
        int i11 = this.f10819d;
        this.f10819d = i11 + 1;
        if (i11 % 2 != 0) {
            return this.f10820e & 15;
        }
        int iS = this.f10816a.s();
        this.f10820e = iS;
        return (iS & 240) >> 4;
    }
}
