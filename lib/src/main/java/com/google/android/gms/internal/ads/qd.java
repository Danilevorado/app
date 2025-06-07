package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class qd extends by3 implements kz3 {
    private static final qd zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = AdError.NETWORK_ERROR_CODE;

    static {
        qd qdVar = new qd();
        zzb = qdVar;
        by3.B(qd.class, qdVar);
    }

    private qd() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf", be.f6435a});
        }
        if (i11 == 3) {
            return new qd();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new pd(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
