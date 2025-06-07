package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class yo3 extends by3 implements kz3 {
    private static final yo3 zzb;
    private int zzd;
    private ep3 zze;
    private ww3 zzf = ww3.f17284n;

    static {
        yo3 yo3Var = new yo3();
        zzb = yo3Var;
        by3.B(yo3.class, yo3Var);
    }

    private yo3() {
    }

    public static xo3 L() {
        return (xo3) zzb.G();
    }

    public static yo3 N() {
        return zzb;
    }

    public static yo3 O(ww3 ww3Var, qx3 qx3Var) {
        return (yo3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void S(yo3 yo3Var, ep3 ep3Var) {
        ep3Var.getClass();
        yo3Var.zze = ep3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new yo3();
        }
        wo3 wo3Var = null;
        if (i11 == 4) {
            return new xo3(wo3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final ep3 P() {
        ep3 ep3Var = this.zze;
        return ep3Var == null ? ep3.N() : ep3Var;
    }

    public final ww3 Q() {
        return this.zzf;
    }
}
