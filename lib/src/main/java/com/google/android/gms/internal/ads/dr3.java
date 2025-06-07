package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dr3 extends by3 implements kz3 {
    private static final dr3 zzb;
    private int zzd;
    private xq3 zze;
    private ww3 zzf;
    private ww3 zzg;

    static {
        dr3 dr3Var = new dr3();
        zzb = dr3Var;
        by3.B(dr3.class, dr3Var);
    }

    private dr3() {
        ww3 ww3Var = ww3.f17284n;
        this.zzf = ww3Var;
        this.zzg = ww3Var;
    }

    public static cr3 M() {
        return (cr3) zzb.G();
    }

    public static dr3 O() {
        return zzb;
    }

    public static dr3 P(ww3 ww3Var, qx3 qx3Var) {
        return (dr3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void T(dr3 dr3Var, xq3 xq3Var) {
        xq3Var.getClass();
        dr3Var.zze = xq3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new dr3();
        }
        br3 br3Var = null;
        if (i11 == 4) {
            return new cr3(br3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final xq3 L() {
        xq3 xq3Var = this.zze;
        return xq3Var == null ? xq3.N() : xq3Var;
    }

    public final ww3 Q() {
        return this.zzf;
    }

    public final ww3 R() {
        return this.zzg;
    }
}
