package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class st3 extends by3 implements kz3 {
    private static final st3 zzb;
    private String zzd = "";
    private ss3 zze;

    static {
        st3 st3Var = new st3();
        zzb = st3Var;
        by3.B(st3.class, st3Var);
    }

    private st3() {
    }

    public static st3 M() {
        return zzb;
    }

    public static st3 N(ww3 ww3Var, qx3 qx3Var) {
        return (st3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new st3();
        }
        qt3 qt3Var = null;
        if (i11 == 4) {
            return new rt3(qt3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final ss3 K() {
        ss3 ss3Var = this.zze;
        return ss3Var == null ? ss3.M() : ss3Var;
    }

    public final String O() {
        return this.zzd;
    }

    public final boolean P() {
        return this.zze != null;
    }
}
