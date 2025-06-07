package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class tp3 extends by3 implements kz3 {
    private static final tp3 zzb;
    private int zzd;
    private int zze;

    static {
        tp3 tp3Var = new tp3();
        zzb = tp3Var;
        by3.B(tp3.class, tp3Var);
    }

    private tp3() {
    }

    public static sp3 L() {
        return (sp3) zzb.G();
    }

    public static tp3 N(ww3 ww3Var, qx3 qx3Var) {
        return (tp3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new tp3();
        }
        rp3 rp3Var = null;
        if (i11 == 4) {
            return new sp3(rp3Var);
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
