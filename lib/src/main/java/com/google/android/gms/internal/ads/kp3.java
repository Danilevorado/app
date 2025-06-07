package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kp3 extends by3 implements kz3 {
    private static final kp3 zzb;
    private np3 zzd;
    private int zze;

    static {
        kp3 kp3Var = new kp3();
        zzb = kp3Var;
        by3.B(kp3.class, kp3Var);
    }

    private kp3() {
    }

    public static jp3 L() {
        return (jp3) zzb.G();
    }

    public static kp3 N(ww3 ww3Var, qx3 qx3Var) {
        return (kp3) by3.o(zzb, ww3Var, qx3Var);
    }

    static /* synthetic */ void P(kp3 kp3Var, np3 np3Var) {
        np3Var.getClass();
        kp3Var.zzd = np3Var;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        if (i11 == 3) {
            return new kp3();
        }
        ip3 ip3Var = null;
        if (i11 == 4) {
            return new jp3(ip3Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final int K() {
        return this.zze;
    }

    public final np3 O() {
        np3 np3Var = this.zzd;
        return np3Var == null ? np3.N() : np3Var;
    }
}
