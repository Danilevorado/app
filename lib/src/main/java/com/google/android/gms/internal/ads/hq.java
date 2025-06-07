package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class hq extends by3 implements kz3 {
    private static final hq zzb;
    private int zzd;
    private int zze = AdError.NETWORK_ERROR_CODE;
    private zp zzf;
    private qp zzg;

    static {
        hq hqVar = new hq();
        zzb = hqVar;
        by3.B(hq.class, hqVar);
    }

    private hq() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", eo.f7921a, "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new hq();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new gq(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
