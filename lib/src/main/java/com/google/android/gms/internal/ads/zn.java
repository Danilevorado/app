package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class zn extends by3 implements kz3 {
    private static final zn zzb;
    private int zzd;
    private qp zzf;
    private int zzg;
    private sp zzh;
    private int zzi;
    private String zze = "";
    private int zzj = AdError.NETWORK_ERROR_CODE;
    private int zzk = AdError.NETWORK_ERROR_CODE;
    private int zzl = AdError.NETWORK_ERROR_CODE;

    static {
        zn znVar = new zn();
        zzb = znVar;
        by3.B(zn.class, znVar);
    }

    private zn() {
    }

    public static zn L() {
        return zzb;
    }

    static /* synthetic */ void M(zn znVar, String str) {
        znVar.zzd |= 1;
        znVar.zze = str;
    }

    static /* synthetic */ void N(zn znVar, sp spVar) {
        spVar.getClass();
        znVar.zzh = spVar;
        znVar.zzd |= 8;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            fy3 fy3Var = eo.f7921a;
            return by3.y(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", fy3Var, "zzk", fy3Var, "zzl", fy3Var});
        }
        if (i11 == 3) {
            return new zn();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new xn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
