package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lo3 extends by3 implements kz3 {
    private static final lo3 zzb;
    private int zzd;
    private oo3 zze;

    static {
        lo3 lo3Var = new lo3();
        zzb = lo3Var;
        by3.B(lo3.class, lo3Var);
    }

    private lo3() {
    }

    public static ko3 L() {
        return (ko3) zzb.G();
    }

    public static lo3 N(ww3 ww3Var, qx3 qx3Var) {
        return (lo3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void Q(lo3 lo3Var, oo3 oo3Var) {
        oo3Var.getClass();
        lo3Var.zze = oo3Var;
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
            return new lo3();
        }
        jo3 jo3Var = null;
        if (i11 == 4) {
            return new ko3(jo3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final oo3 O() {
        oo3 oo3Var = this.zze;
        return oo3Var == null ? oo3.N() : oo3Var;
    }
}
