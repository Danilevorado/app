package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xp3 extends by3 implements kz3 {
    private static final xp3 zzb;
    private int zzd;
    private ww3 zze = ww3.f17284n;

    static {
        xp3 xp3Var = new xp3();
        zzb = xp3Var;
        by3.B(xp3.class, xp3Var);
    }

    private xp3() {
    }

    public static vp3 L() {
        return (vp3) zzb.G();
    }

    public static xp3 N(ww3 ww3Var, qx3 qx3Var) {
        return (xp3) by3.o(zzb, ww3Var, qx3Var);
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new xp3();
        }
        up3 up3Var = null;
        if (i11 == 4) {
            return new vp3(up3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zzd;
    }

    public final ww3 O() {
        return this.zze;
    }
}
