package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class sn extends by3 implements kz3 {
    private static final sn zzb;
    private int zzd;
    private String zze = "";
    private ky3 zzf = by3.u();
    private int zzg;

    static {
        sn snVar = new sn();
        zzb = snVar;
        by3.B(sn.class, snVar);
    }

    private sn() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzd", "zze", "zzf", qn.class, "zzg", eo.f7921a});
        }
        if (i11 == 3) {
            return new sn();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new rn(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
