package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class dq3 extends by3 implements kz3 {
    private static final dq3 zzb;
    private int zzd;
    private ww3 zze = ww3.f17284n;

    static {
        dq3 dq3Var = new dq3();
        zzb = dq3Var;
        by3.B(dq3.class, dq3Var);
    }

    private dq3() {
    }

    public static cq3 L() {
        return (cq3) zzb.G();
    }

    public static dq3 N(ww3 ww3Var, qx3 qx3Var) {
        return (dq3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new dq3();
        }
        bq3 bq3Var = null;
        if (i11 == 4) {
            return new cq3(bq3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final ww3 O() {
        return this.zze;
    }
}
