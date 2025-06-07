package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class mp extends by3 implements kz3 {
    private static final mp zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        mp mpVar = new mp();
        zzb = mpVar;
        by3.B(mp.class, mpVar);
    }

    private mp() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new mp();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new lp(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
