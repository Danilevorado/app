package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class jq extends by3 implements kz3 {
    private static final jq zzb;
    private int zzd;
    private int zze = AdError.NETWORK_ERROR_CODE;
    private zp zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private long zzj;

    static {
        jq jqVar = new jq();
        zzb = jqVar;
        by3.B(jq.class, jqVar);
    }

    private jq() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzd", "zze", eo.f7921a, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i11 == 3) {
            return new jq();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new iq(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
