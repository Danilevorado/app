package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class aq3 extends by3 implements kz3 {
    private static final aq3 zzb;
    private int zzd;
    private int zze;

    static {
        aq3 aq3Var = new aq3();
        zzb = aq3Var;
        by3.B(aq3.class, aq3Var);
    }

    private aq3() {
    }

    public static zp3 L() {
        return (zp3) zzb.G();
    }

    public static aq3 N(ww3 ww3Var, qx3 qx3Var) {
        return (aq3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzd"});
        }
        if (i11 == 3) {
            return new aq3();
        }
        yp3 yp3Var = null;
        if (i11 == 4) {
            return new zp3(yp3Var);
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
