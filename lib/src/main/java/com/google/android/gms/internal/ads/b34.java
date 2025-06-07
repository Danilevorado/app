package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class b34 extends by3 implements kz3 {
    private static final b34 zzb;
    private int zzd;
    private int zze;
    private int zzh;
    private String zzf = "";
    private gy3 zzg = by3.r();
    private ky3 zzi = by3.u();
    private ww3 zzj = ww3.f17284n;

    static {
        b34 b34Var = new b34();
        zzb = b34Var;
        by3.B(b34.class, b34Var);
    }

    private b34() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", z24.class, "zzj"});
        }
        if (i11 == 3) {
            return new b34();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new a34(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
