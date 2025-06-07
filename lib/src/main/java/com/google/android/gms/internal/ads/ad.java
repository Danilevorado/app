package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ad extends by3 implements kz3 {
    private static final ad zzb;
    private int zzd;
    private int zze;

    static {
        ad adVar = new ad();
        zzb = adVar;
        by3.B(ad.class, adVar);
    }

    private ad() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", ed.f7713a});
        }
        if (i11 == 3) {
            return new ad();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new zc(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
