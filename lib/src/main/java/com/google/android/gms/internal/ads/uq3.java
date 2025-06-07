package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class uq3 extends by3 implements kz3 {
    private static final uq3 zzb;
    private xq3 zzd;

    static {
        uq3 uq3Var = new uq3();
        zzb = uq3Var;
        by3.B(uq3.class, uq3Var);
    }

    private uq3() {
    }

    public static tq3 K() {
        return (tq3) zzb.G();
    }

    public static uq3 M(ww3 ww3Var, qx3 qx3Var) {
        return (uq3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void O(uq3 uq3Var, xq3 xq3Var) {
        xq3Var.getClass();
        uq3Var.zzd = xq3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zzd"});
        }
        if (i11 == 3) {
            return new uq3();
        }
        sq3 sq3Var = null;
        if (i11 == 4) {
            return new tq3(sq3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final xq3 N() {
        xq3 xq3Var = this.zzd;
        return xq3Var == null ? xq3.N() : xq3Var;
    }
}
