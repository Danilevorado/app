package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zr3 extends by3 implements kz3 {
    private static final zr3 zzb;
    private cs3 zzd;

    static {
        zr3 zr3Var = new zr3();
        zzb = zr3Var;
        by3.B(zr3.class, zr3Var);
    }

    private zr3() {
    }

    public static yr3 K() {
        return (yr3) zzb.G();
    }

    public static zr3 M(ww3 ww3Var, qx3 qx3Var) {
        return (zr3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void O(zr3 zr3Var, cs3 cs3Var) {
        cs3Var.getClass();
        zr3Var.zzd = cs3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new zr3();
        }
        wr3 wr3Var = null;
        if (i11 == 4) {
            return new yr3(wr3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final cs3 N() {
        cs3 cs3Var = this.zzd;
        return cs3Var == null ? cs3.M() : cs3Var;
    }
}
