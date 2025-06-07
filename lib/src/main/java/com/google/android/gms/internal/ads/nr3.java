package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nr3 extends by3 implements kz3 {
    private static final nr3 zzb;
    private int zzd;
    private tr3 zze;
    private ww3 zzf = ww3.f17284n;

    static {
        nr3 nr3Var = new nr3();
        zzb = nr3Var;
        by3.B(nr3.class, nr3Var);
    }

    private nr3() {
    }

    public static mr3 L() {
        return (mr3) zzb.G();
    }

    public static nr3 N() {
        return zzb;
    }

    public static nr3 O(ww3 ww3Var, qx3 qx3Var) {
        return (nr3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void S(nr3 nr3Var, tr3 tr3Var) {
        tr3Var.getClass();
        nr3Var.zze = tr3Var;
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
            return new nr3();
        }
        lr3 lr3Var = null;
        if (i11 == 4) {
            return new mr3(lr3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final tr3 P() {
        tr3 tr3Var = this.zze;
        return tr3Var == null ? tr3.N() : tr3Var;
    }

    public final ww3 Q() {
        return this.zzf;
    }
}
