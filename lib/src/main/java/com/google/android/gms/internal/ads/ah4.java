package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ah4 extends h11 {

    /* renamed from: f, reason: collision with root package name */
    private final v30 f6093f;

    public ah4(v30 v30Var) {
        this.f6093f = v30Var;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final int a(Object obj) {
        return obj == zg4.f18585i ? 0 : -1;
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
        ey0Var.k(z10 ? 0 : null, z10 ? zg4.f18585i : null, 0, -9223372036854775807L, 0L, k61.f10845d, true);
        return ey0Var;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final g01 e(int i10, g01 g01Var, long j10) {
        g01Var.a(g01.f8518o, this.f6093f, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
        g01Var.f8539j = true;
        return g01Var;
    }

    @Override // com.google.android.gms.internal.ads.h11
    public final Object f(int i10) {
        return zg4.f18585i;
    }
}
