package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class ee extends by3 implements kz3 {
    private static final ee zzb;
    private int zzd;
    private long zze;
    private String zzf = "";
    private ww3 zzg = ww3.f17284n;

    static {
        ee eeVar = new ee();
        zzb = eeVar;
        by3.B(ee.class, eeVar);
    }

    private ee() {
    }

    public static ee M() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.by3
    protected final Object H(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return by3.y(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i11 == 3) {
            return new ee();
        }
        wc wcVar = null;
        if (i11 == 4) {
            return new de(wcVar);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }

    public final long K() {
        return this.zze;
    }

    public final boolean N() {
        return (this.zzd & 1) != 0;
    }
}
