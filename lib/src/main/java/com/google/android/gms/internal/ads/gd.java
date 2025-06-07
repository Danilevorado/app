package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class gd extends by3 implements kz3 {
    private static final gd zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private int zzg = AdError.NETWORK_ERROR_CODE;

    static {
        gd gdVar = new gd();
        zzb = gdVar;
        by3.B(gd.class, gdVar);
    }

    private gd() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            fy3 fy3Var = be.f6435a;
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{"zzd", "zze", "zzf", fy3Var, "zzg", fy3Var});
        }
        if (i11 == 3) {
            return new gd();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new fd(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
