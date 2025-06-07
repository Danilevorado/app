package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class co extends by3 implements kz3 {
    private static final co zzb;
    private int zzd;
    private int zze;
    private sp zzf;
    private String zzg = "";
    private String zzh = "";

    static {
        co coVar = new co();
        zzb = coVar;
        by3.B(co.class, coVar);
    }

    private co() {
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzd", "zze", bo.f6560a, "zzf", "zzg", "zzh"});
        }
        if (i11 == 3) {
            return new co();
        }
        wm wmVar = null;
        if (i11 == 4) {
            return new ao(wmVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
