package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class dq extends by3 implements kz3 {
    private static final dq zzb;
    private int zzd;
    private sp zze;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private zp zzg;
    private qp zzh;

    static {
        dq dqVar = new dq();
        zzb = dqVar;
        by3.B(dq.class, dqVar);
    }

    private dq() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", eo.f7921a, "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new dq();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new cq(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
