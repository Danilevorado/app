package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class z24 extends by3 implements kz3 {
    private static final z24 zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        z24 z24Var = new z24();
        zzb = z24Var;
        by3.B(z24.class, z24Var);
    }

    private z24() {
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
            return new z24();
        }
        c14 c14Var = null;
        if (i11 == 4) {
            return new y24(c14Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zzb;
    }
}
