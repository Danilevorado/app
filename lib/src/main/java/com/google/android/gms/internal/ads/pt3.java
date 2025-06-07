package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class pt3 extends by3 implements kz3 {
    private static final pt3 zzb;
    private int zzd;
    private st3 zze;

    static {
        pt3 pt3Var = new pt3();
        zzb = pt3Var;
        by3.B(pt3.class, pt3Var);
    }

    private pt3() {
    }

    public static ot3 L() {
        return (ot3) zzb.G();
    }

    public static pt3 N(ww3 ww3Var, qx3 qx3Var) {
        return (pt3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void Q(pt3 pt3Var, st3 st3Var) {
        st3Var.getClass();
        pt3Var.zze = st3Var;
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
            return new pt3();
        }
        nt3 nt3Var = null;
        if (i11 == 4) {
            return new ot3(nt3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final st3 O() {
        st3 st3Var = this.zze;
        return st3Var == null ? st3.M() : st3Var;
    }
}
