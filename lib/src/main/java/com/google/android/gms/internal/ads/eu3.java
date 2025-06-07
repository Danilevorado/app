package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class eu3 extends by3 implements kz3 {
    private static final eu3 zzb;
    private int zzd;

    static {
        eu3 eu3Var = new eu3();
        zzb = eu3Var;
        by3.B(eu3.class, eu3Var);
    }

    private eu3() {
    }

    public static eu3 L() {
        return zzb;
    }

    public static eu3 M(ww3 ww3Var, qx3 qx3Var) {
        return (eu3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new eu3();
        }
        cu3 cu3Var = null;
        if (i11 == 4) {
            return new du3(cu3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
