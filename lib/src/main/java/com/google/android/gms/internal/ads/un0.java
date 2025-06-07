package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class un0 {

    /* renamed from: a, reason: collision with root package name */
    private final e2 f16408a = new e2();

    public final un0 a(int i10) {
        this.f16408a.a(i10);
        return this;
    }

    public final un0 b(wp0 wp0Var) {
        e2 e2Var = this.f16408a;
        g4 g4Var = wp0Var.f17231a;
        for (int i10 = 0; i10 < g4Var.b(); i10++) {
            e2Var.a(g4Var.a(i10));
        }
        return this;
    }

    public final un0 c(int... iArr) {
        e2 e2Var = this.f16408a;
        for (int i10 = 0; i10 < 21; i10++) {
            e2Var.a(iArr[i10]);
        }
        return this;
    }

    public final un0 d(int i10, boolean z10) {
        e2 e2Var = this.f16408a;
        if (z10) {
            e2Var.a(i10);
        }
        return this;
    }

    public final wp0 e() {
        return new wp0(this.f16408a.b(), null);
    }
}
