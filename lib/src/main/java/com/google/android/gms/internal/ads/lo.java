package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lo extends by3 implements kz3 {
    private static final lo zzb;
    private int zzd;
    private int zze;
    private gy3 zzf = by3.r();

    static {
        lo loVar = new lo();
        zzb = loVar;
        by3.B(lo.class, loVar);
    }

    private lo() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzd", "zze", eo.f7921a, "zzf"});
        }
        if (i11 == 3) {
            return new lo();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new ko(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
