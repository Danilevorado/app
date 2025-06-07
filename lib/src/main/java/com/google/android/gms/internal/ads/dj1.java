package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dj1 implements vy {

    /* renamed from: m, reason: collision with root package name */
    private final t21 f7338m;

    /* renamed from: n, reason: collision with root package name */
    private final na0 f7339n;

    /* renamed from: o, reason: collision with root package name */
    private final String f7340o;

    /* renamed from: p, reason: collision with root package name */
    private final String f7341p;

    public dj1(t21 t21Var, hn2 hn2Var) {
        this.f7338m = t21Var;
        this.f7339n = hn2Var.f9260m;
        this.f7340o = hn2Var.f9256k;
        this.f7341p = hn2Var.f9258l;
    }

    @Override // com.google.android.gms.internal.ads.vy
    public final void M(na0 na0Var) {
        int i10;
        String str;
        na0 na0Var2 = this.f7339n;
        if (na0Var2 != null) {
            na0Var = na0Var2;
        }
        if (na0Var != null) {
            str = na0Var.f12555m;
            i10 = na0Var.f12556n;
        } else {
            i10 = 1;
            str = "";
        }
        this.f7338m.r0(new x90(str, i10), this.f7340o, this.f7341p);
    }

    @Override // com.google.android.gms.internal.ads.vy
    public final void b() {
        this.f7338m.c();
    }

    @Override // com.google.android.gms.internal.ads.vy
    public final void d() {
        this.f7338m.e();
    }
}
