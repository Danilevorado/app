package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class kc extends by3 implements kz3 {
    private static final kc zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        kc kcVar = new kc();
        zzb = kcVar;
        by3.B(kc.class, kcVar);
    }

    private kc() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i11 == 3) {
            return new kc();
        }
        hc hcVar = null;
        if (i11 == 4) {
            return new jc(hcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
