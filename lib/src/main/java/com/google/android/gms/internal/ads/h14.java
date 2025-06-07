package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class h14 extends by3 implements kz3 {
    private static final h14 zzb;
    private int zzd;
    private int zze;
    private long zzf;
    private ww3 zzg = ww3.f17284n;

    static {
        h14 h14Var = new h14();
        zzb = h14Var;
        by3.B(h14.class, h14Var);
    }

    private h14() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", g14.f8580a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new h14();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new f14(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
