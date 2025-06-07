package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ar3 extends by3 implements kz3 {
    private static final ar3 zzb;
    private int zzd;
    private dr3 zze;
    private ww3 zzf = ww3.f17284n;

    static {
        ar3 ar3Var = new ar3();
        zzb = ar3Var;
        by3.B(ar3.class, ar3Var);
    }

    private ar3() {
    }

    public static zq3 L() {
        return (zq3) zzb.G();
    }

    public static ar3 N(ww3 ww3Var, qx3 qx3Var) {
        return (ar3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void R(ar3 ar3Var, dr3 dr3Var) {
        dr3Var.getClass();
        ar3Var.zze = dr3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new ar3();
        }
        yq3 yq3Var = null;
        if (i11 == 4) {
            return new zq3(yq3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final dr3 O() {
        dr3 dr3Var = this.zze;
        return dr3Var == null ? dr3.O() : dr3Var;
    }

    public final ww3 P() {
        return this.zzf;
    }
}
