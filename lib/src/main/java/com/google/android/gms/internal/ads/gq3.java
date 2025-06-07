package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class gq3 extends by3 implements kz3 {
    private static final gq3 zzb;
    private int zzd;
    private int zze;

    static {
        gq3 gq3Var = new gq3();
        zzb = gq3Var;
        by3.B(gq3.class, gq3Var);
    }

    private gq3() {
    }

    public static fq3 L() {
        return (fq3) zzb.G();
    }

    public static gq3 N(ww3 ww3Var, qx3 qx3Var) {
        return (gq3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new gq3();
        }
        eq3 eq3Var = null;
        if (i11 == 4) {
            return new fq3(eq3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }
}
