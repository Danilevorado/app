package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zi extends by3 implements kz3 {
    private static final zi zzb;
    private int zzd;
    private cj zze;
    private ww3 zzf;
    private ww3 zzg;

    static {
        zi ziVar = new zi();
        zzb = ziVar;
        by3.B(zi.class, ziVar);
    }

    private zi() {
        ww3 ww3Var = ww3.f17284n;
        this.zzf = ww3Var;
        this.zzg = ww3Var;
    }

    public static zi L(ww3 ww3Var, qx3 qx3Var) {
        return (zi) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new zi();
        }
        xi xiVar = null;
        if (i11 == 4) {
            return new yi(xiVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final cj M() {
        cj cjVar = this.zze;
        return cjVar == null ? cj.P() : cjVar;
    }

    public final ww3 N() {
        return this.zzg;
    }

    public final ww3 O() {
        return this.zzf;
    }
}
