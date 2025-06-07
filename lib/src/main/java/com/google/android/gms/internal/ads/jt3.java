package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class jt3 extends by3 implements kz3 {
    private static final jt3 zzb;
    private int zzd;
    private mt3 zze;

    static {
        jt3 jt3Var = new jt3();
        zzb = jt3Var;
        by3.B(jt3.class, jt3Var);
    }

    private jt3() {
    }

    public static it3 L() {
        return (it3) zzb.G();
    }

    public static jt3 N(ww3 ww3Var, qx3 qx3Var) {
        return (jt3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void Q(jt3 jt3Var, mt3 mt3Var) {
        mt3Var.getClass();
        jt3Var.zze = mt3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new jt3();
        }
        ht3 ht3Var = null;
        if (i11 == 4) {
            return new it3(ht3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final mt3 O() {
        mt3 mt3Var = this.zze;
        return mt3Var == null ? mt3.L() : mt3Var;
    }
}
