package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class ip extends by3 implements kz3 {
    private static final ip zzb;
    private int zzd;
    private int zze = AdError.NETWORK_ERROR_CODE;
    private int zzf = AdError.NETWORK_ERROR_CODE;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private kp zzo;

    static {
        ip ipVar = new ip();
        zzb = ipVar;
        by3.B(ip.class, ipVar);
    }

    private ip() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            fy3 fy3Var = eo.f7921a;
            return by3.y(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", fy3Var, "zzf", fy3Var, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i11 == 3) {
            return new ip();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new hp(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
