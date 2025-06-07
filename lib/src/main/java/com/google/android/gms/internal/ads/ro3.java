package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ro3 extends by3 implements kz3 {
    private static final ro3 zzb;
    private int zzd;
    private yo3 zze;
    private nr3 zzf;

    static {
        ro3 ro3Var = new ro3();
        zzb = ro3Var;
        by3.B(ro3.class, ro3Var);
    }

    private ro3() {
    }

    public static qo3 L() {
        return (qo3) zzb.G();
    }

    public static ro3 N(ww3 ww3Var, qx3 qx3Var) {
        return (ro3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void R(ro3 ro3Var, yo3 yo3Var) {
        yo3Var.getClass();
        ro3Var.zze = yo3Var;
    }

    static /* synthetic */ void S(ro3 ro3Var, nr3 nr3Var) {
        nr3Var.getClass();
        ro3Var.zzf = nr3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new ro3();
        }
        po3 po3Var = null;
        if (i11 == 4) {
            return new qo3(po3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final yo3 O() {
        yo3 yo3Var = this.zze;
        return yo3Var == null ? yo3.N() : yo3Var;
    }

    public final nr3 P() {
        nr3 nr3Var = this.zzf;
        return nr3Var == null ? nr3.N() : nr3Var;
    }
}
