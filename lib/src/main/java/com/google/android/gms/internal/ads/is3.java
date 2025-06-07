package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class is3 extends by3 implements kz3 {
    private static final is3 zzb;
    private int zzd;
    private cs3 zze;
    private ww3 zzf = ww3.f17284n;

    static {
        is3 is3Var = new is3();
        zzb = is3Var;
        by3.B(is3.class, is3Var);
    }

    private is3() {
    }

    public static hs3 M() {
        return (hs3) zzb.G();
    }

    public static is3 O() {
        return zzb;
    }

    public static is3 P(ww3 ww3Var, qx3 qx3Var) {
        return (is3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void S(is3 is3Var, cs3 cs3Var) {
        cs3Var.getClass();
        is3Var.zze = cs3Var;
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
            return new is3();
        }
        gs3 gs3Var = null;
        if (i11 == 4) {
            return new hs3(gs3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final cs3 L() {
        cs3 cs3Var = this.zze;
        return cs3Var == null ? cs3.M() : cs3Var;
    }

    public final ww3 Q() {
        return this.zzf;
    }

    public final boolean U() {
        return this.zze != null;
    }
}
