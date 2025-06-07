package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mt3 extends by3 implements kz3 {
    private static final mt3 zzb;
    private String zzd = "";

    static {
        mt3 mt3Var = new mt3();
        zzb = mt3Var;
        by3.B(mt3.class, mt3Var);
    }

    private mt3() {
    }

    public static mt3 L() {
        return zzb;
    }

    public static mt3 M(ww3 ww3Var, qx3 qx3Var) {
        return (mt3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new mt3();
        }
        kt3 kt3Var = null;
        if (i11 == 4) {
            return new lt3(kt3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final String N() {
        return this.zzd;
    }
}
