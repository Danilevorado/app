package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;

/* loaded from: classes.dex */
public final class un extends by3 implements kz3 {
    private static final un zzb;
    private int zzd;
    private String zze = "";
    private ky3 zzf = by3.u();
    private int zzg = AdError.NETWORK_ERROR_CODE;
    private int zzh = AdError.NETWORK_ERROR_CODE;
    private int zzi = AdError.NETWORK_ERROR_CODE;

    static {
        un unVar = new un();
        zzb = unVar;
        by3.B(un.class, unVar);
    }

    private un() {
    }

    public static un L() {
        return zzb;
    }

    static /* synthetic */ void M(un unVar, String str) {
        str.getClass();
        unVar.zzd |= 1;
        unVar.zze = str;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            fy3 fy3Var = eo.f7921a;
            return by3.y(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzd", "zze", "zzf", qn.class, "zzg", fy3Var, "zzh", fy3Var, "zzi", fy3Var});
        }
        if (i11 == 3) {
            return new un();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new tn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
