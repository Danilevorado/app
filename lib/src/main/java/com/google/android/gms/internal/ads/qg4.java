package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class qg4 implements zi4 {

    /* renamed from: m, reason: collision with root package name */
    protected final zi4[] f14311m;

    public qg4(zi4[] zi4VarArr) {
        this.f14311m = zi4VarArr;
    }

    @Override // com.google.android.gms.internal.ads.zi4
    public final void a(long j10) {
        for (zi4 zi4Var : this.f14311m) {
            zi4Var.a(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zi4
    public final long b() {
        long jMin = Long.MAX_VALUE;
        for (zi4 zi4Var : this.f14311m) {
            long jB = zi4Var.b();
            if (jB != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jB);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zi4
    public final boolean c(long j10) {
        boolean zC;
        boolean z10 = false;
        do {
            long jD = d();
            if (jD == Long.MIN_VALUE) {
                break;
            }
            zC = false;
            for (zi4 zi4Var : this.f14311m) {
                long jD2 = zi4Var.d();
                boolean z11 = jD2 != Long.MIN_VALUE && jD2 <= j10;
                if (jD2 == jD || z11) {
                    zC |= zi4Var.c(j10);
                }
            }
            z10 |= zC;
        } while (zC);
        return z10;
    }

    @Override // com.google.android.gms.internal.ads.zi4
    public final long d() {
        long jMin = Long.MAX_VALUE;
        for (zi4 zi4Var : this.f14311m) {
            long jD = zi4Var.d();
            if (jD != Long.MIN_VALUE) {
                jMin = Math.min(jMin, jD);
            }
        }
        if (jMin == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return jMin;
    }

    @Override // com.google.android.gms.internal.ads.zi4
    public final boolean o() {
        for (zi4 zi4Var : this.f14311m) {
            if (zi4Var.o()) {
                return true;
            }
        }
        return false;
    }
}
