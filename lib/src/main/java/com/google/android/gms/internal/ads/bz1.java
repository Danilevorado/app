package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class bz1 implements az1 {

    /* renamed from: a, reason: collision with root package name */
    public final az1 f6721a;

    /* renamed from: b, reason: collision with root package name */
    private final w23 f6722b;

    public bz1(az1 az1Var, w23 w23Var) {
        this.f6721a = az1Var;
        this.f6722b = w23Var;
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final ab3 a(un2 un2Var, hn2 hn2Var) {
        return qa3.l(this.f6721a.a(un2Var, hn2Var), this.f6722b, of0.f13186a);
    }

    @Override // com.google.android.gms.internal.ads.az1
    public final boolean b(un2 un2Var, hn2 hn2Var) {
        return this.f6721a.b(un2Var, hn2Var);
    }
}
