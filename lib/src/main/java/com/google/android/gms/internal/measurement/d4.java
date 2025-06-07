package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class d4 extends u8 implements z9 {
    private static final d4 zza;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";
    private String zzl = "";

    static {
        d4 d4Var = new d4();
        zza = d4Var;
        u8.n(d4.class, d4Var);
    }

    private d4() {
    }

    @Override // com.google.android.gms.internal.measurement.u8
    protected final Object u(int i10, Object obj, Object obj2) {
        int i11 = i10 - 1;
        if (i11 == 0) {
            return (byte) 1;
        }
        if (i11 == 2) {
            return u8.m(zza, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i11 == 3) {
            return new d4();
        }
        a4 a4Var = null;
        if (i11 == 4) {
            return new c4(a4Var);
        }
        if (i11 != 5) {
            return null;
        }
        return zza;
    }
}
