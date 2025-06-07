package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class xd extends by3 implements kz3 {
    private static final xd zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private gy3 zzh = by3.r();
    private long zzi;

    static {
        xd xdVar = new xd();
        zzb = xdVar;
        by3.B(xd.class, xdVar);
    }

    private xd() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i11 == 3) {
            return new xd();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new wd(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
