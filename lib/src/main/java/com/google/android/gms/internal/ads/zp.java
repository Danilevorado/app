package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zp extends by3 implements kz3 {
    private static final zp zzb;
    private int zzd;
    private int zze;

    static {
        zp zpVar = new zp();
        zzb = zpVar;
        by3.B(zp.class, zpVar);
    }

    private zp() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzd", "zze", yp.f18244a});
        }
        if (i11 == 3) {
            return new zp();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new xp(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
