package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class nd extends by3 implements kz3 {
    private static final nd zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        nd ndVar = new nd();
        zzb = ndVar;
        by3.B(nd.class, ndVar);
    }

    private nd() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", cd.f6877a, "zzf"});
        }
        if (i11 == 3) {
            return new nd();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new md(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
