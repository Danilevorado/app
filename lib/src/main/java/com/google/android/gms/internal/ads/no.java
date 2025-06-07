package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class no extends by3 implements kz3 {
    private static final no zzb;
    private int zzd;
    private jo zze;
    private ky3 zzf = by3.u();
    private int zzg;
    private qp zzh;

    static {
        no noVar = new no();
        zzb = noVar;
        by3.B(no.class, noVar);
    }

    private no() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzd", "zze", "zzf", op.class, "zzg", eo.f7921a, "zzh"});
        }
        if (i11 == 3) {
            return new no();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new mo(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
