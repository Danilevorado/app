package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class j5 implements h5 {

    /* renamed from: a, reason: collision with root package name */
    private final int f10297a;

    /* renamed from: b, reason: collision with root package name */
    private final int f10298b;

    /* renamed from: c, reason: collision with root package name */
    private final jm2 f10299c;

    public j5(c5 c5Var, k9 k9Var) {
        jm2 jm2Var = c5Var.f6776b;
        this.f10299c = jm2Var;
        jm2Var.f(12);
        int iV = jm2Var.v();
        if ("audio/raw".equals(k9Var.f10898l)) {
            int iS = sv2.s(k9Var.A, k9Var.f10911y);
            if (iV == 0 || iV % iS != 0) {
                ad2.e("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iS + ", stsz sample size: " + iV);
                iV = iS;
            }
        }
        this.f10297a = iV == 0 ? -1 : iV;
        this.f10298b = jm2Var.v();
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int a() {
        return this.f10297a;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int b() {
        return this.f10298b;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final int d() {
        int i10 = this.f10297a;
        return i10 == -1 ? this.f10299c.v() : i10;
    }
}
